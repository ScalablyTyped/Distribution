package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan")
@js.native
object swanNsMembers extends js.Object {
  /**
  	 * 批量添加卡券。
  	 */
  def addCard(options: CardOptions): scala.Unit = js.native
  /**
  	 * 增加 手机联系人
  	 * 调用后，用户可以选择将该表单以“新增联系人”或“添加到已有联系人”的方式
  	 * 写入手机系统通讯录
  	 * 完成手机通讯录联系人和联系方式的增加。
  	 * @version 1.2.0
  	 */
  def addPhoneContact(options: PhoneContact): scala.Unit = js.native
  // #endregion
  // #region 拓展接口
  /**
  	 * 将 ArrayBuffer 数据转成 Base64 字符串
  	 *
  	 */
  def arrayBufferToBase64(arrayBuffer: stdLib.ArrayBuffer): java.lang.String = js.native
  /**
  	 * 提前向用户发起授权请求。
  	 * 调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，
  	 * 但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
  	 */
  def authorize(options: AuthorizeOptions): scala.Unit = js.native
  /**
  	 * 将 Base64 字符串转成 ArrayBuffer 数据
  	 *
  	 */
  def base64ToArrayBuffer(base64: java.lang.String): stdLib.ArrayBuffer = js.native
  /**
  	 * 判断小程序的API，回调，参数，组件等是否在当前版本可用。
  	 * String参数说明：
  	 * 使用 ${API}.${method}.${param}.${options}
  	 * 或者 ${component}.${attribute}.${option}方式来调用
  	 * 例如：
  	 * ${API} 代表 API 名字
  	 * ${method} 代表调用方式，有效值为return, success, object, callback
  	 * ${param} 代表参数或者返回值
  	 * ${options} 代表参数的可选值
  	 * ${component} 代表组件名字
  	 * ${attribute} 代表组件属性
  	 * ${option} 代表组件属性的可选值
  	 */
  def canIUse(api: java.lang.String): scala.Boolean = js.native
  /**
  	 * 返回一个数组，用来描述 canvas 区域隐含的像素数据
  	 * @version 1.9.0
  	 */
  def canvasGetImageData(options: CanvasImageDataOptions): scala.Unit = js.native
  /**
  	 * 将像素数据绘制到画布的方法
  	 * @version 1.9.0
  	 */
  def canvasPutImageData(options: CanvasPutImageDataOptions): scala.Unit = js.native
  /**
  	 * 把当前画布的内容导出生成图片，并返回文件路径
  	 */
  def canvasToTempFilePath(options: stdLib.Partial[CanvasToTempFilePathOptions]): scala.Unit = js.native
  /**
  	 * 调用接口 swan.login 获取 Authorization Code，智能小程序可以使用
  	 * swan.login()接口获取Authorization Code。
  	 */
  def checkSession(options: CheckSessionOption): scala.Unit = js.native
  def chooseAddress(options: ChooseAddressOptions): scala.Unit = js.native
  /**
  	 * 从本地相册选择图片或使用相机拍照。
  	 */
  def chooseImage(options: ChooseImageOptions): scala.Unit = js.native
  /**
  	 * 选择用户的发票抬头。
  	 */
  def chooseInvoiceTitle(options: ChooseInvoiceTitleOptions): scala.Unit = js.native
  /**
  	 * 打开地图选择位置
  	 */
  def chooseLocation(options: ChooseLocationOptions): scala.Unit = js.native
  /**
  	 * 拍摄视频或从手机相册中选视频，返回视频的临时文件路径。
  	 */
  def chooseVideo(options: ChooseVideoOptions): scala.Unit = js.native
  /**
  	 * 清理本地数据缓存。
  	 */
  def clearStorage(): scala.Unit = js.native
  /**
  	 * 同步清理本地数据缓存
  	 */
  def clearStorageSync(): scala.Unit = js.native
  /**
  	 * 断开与低功耗蓝牙设备的连接
  	 * @version 1.1.0
  	 */
  def closeBLEConnection(options: CloseBLEConnectionOptions): scala.Unit = js.native
  /**
  	 * 关闭蓝牙模块。调用该方法将断开所有已建立的链接并释放系统资源
  	 * @version 1.1.0
  	 */
  def closeBluetoothAdapter(options: CloseBluetoothAdapterOptions): scala.Unit = js.native
  /**
  	 * 关闭WebSocket连接。
  	 */
  def closeSocket(): scala.Unit = js.native
  def closeSocket(options: CloseSocketOptions): scala.Unit = js.native
  /**
  	 * 创建一个 WebSocket 连接；
  	 * 一个微信小程序同时只能有一个 WebSocket 连接，
  	 * 如果当前已存在一个 WebSocket 连接，
  	 * 会自动关闭该连接，并重新创建一个 WebSocket 连接。
  	 */
  def connectSocket(options: ConnectSocketOptions): scala.Unit = js.native
  /**
  	 * 连接 Wi-Fi。
  	 * 若已知 Wi-Fi 信息，可以直接利用该接口连接。
  	 * 仅 Android 与 iOS 11 以上版本支持。
  	 * @version 1.6.0
  	 */
  def connectWifi(): scala.Unit = js.native
  def connectWifi(options: ConnectWiFiOptions): scala.Unit = js.native
  /**
  	 * 创建一个动画实例animation。调用实例的方法来描述动画。
  	 * 最后通过动画实例的export方法导出动画数据传递给组件的animation属性。
  	 *
  	 * 注意: export 方法每次调用后会清掉之前的动画操作
  	 */
  def createAnimation(): Animation = js.native
  def createAnimation(options: CreateAnimationOptions): Animation = js.native
  /**
  	 * 低功耗蓝牙接口
  	 * @version 1.1.0
  	 */
  def createBLEConnection(options: CreateBLEConnectionOptions): scala.Unit = js.native
  /**
  	 * 创建并返回 camera 上下文 cameraContext 对象
  	 * cameraContext 与页面的 camera 组件绑定
  	 * 一个页面只能有一个camera，通过它可以操作对应的 <camera/> 组件。
  	 * 在自定义组件下，第一个参数传入组件实例this，以操作组件内 <camera/> 组件
  	 * @version 1.6.0
  	 */
  def createCameraContext(): CameraContext = js.native
  def createCameraContext(instance: js.Any): CameraContext = js.native
  /**
  	 * 创建并返回绘图上下文context对象。
  	 * context只是一个记录方法调用的容器，
  	 * 用于生成记录绘制行为的actions数组。c
  	 * ontext跟<canvas/>不存在对应关系，
  	 * 一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
  	 */
  def createCanvasContext(selector: java.lang.String): CanvasContext = js.native
  /**
  	 * 创建并返回内部 audio 上下文 innerAudioContext 对象。
  	 */
  def createInnerAudioContext(): InnerAudioContext = js.native
  def createIntersectionObserver(context: Component[_, _]): IntersectionObserver = js.native
  def createIntersectionObserver(context: Component[_, _], options: CreateIntersectionObserverOption): IntersectionObserver = js.native
  /**
  	 * 操作对应的 <live-player/> 组件。
  	 * 创建并返回 live-player 上下文 LivePlayerContext 对象。
  	 * 在自定义组件下，第二个参数传入组件实例this，以操作组件内 <live-player/> 组件
  	 * @version 1.7.0
  	 */
  def createLivePlayerContext(id: java.lang.String, instance: js.Any): LivePlayerContext = js.native
  /**
  	 * 创建并返回 map 上下文 mapContext 对象
  	 */
  def createMapContext(mapId: java.lang.String): MapContext = js.native
  /**
  	 * 返回一个SelectorQuery对象实例。
  	 * 可以在这个实例上使用select等方法选择节点，并使用boundingClientRect等方法选择需要查询的信息。
  	 * @version 1.4.0
  	 */
  def createSelectorQuery(): SelectorQuery = js.native
  /**
  	 * 创建并返回 video 上下文 videoContext 对象
  	 * @param videoId video标签id <video  src="{{src}}" id="myVideo" ></video>
  	 */
  def createVideoContext(videoId: java.lang.String): VideoContext = js.native
  /**
  	 * 下载文件资源到本地。客户端直接发起一个 HTTP GET 请求，
  	 * 把下载到的资源根据 type 进行处理，并返回文件的本地临时路径。
  	 */
  def downloadFile(options: DownloadFileOptions): DownloadTask = js.native
  /**
  	 * 绘制画布
  	 */
  def drawCanvas(options: DrawCanvasOptions): scala.Unit = js.native
  /**
  	 * 获取当前账号信息
  	 * @version >= 2.2.2
  	 */
  def getAccountInfoSync(): AccountInfo = js.native
  /**
  	 * 获取蓝牙设备所有 characteristic（特征值）
  	 */
  def getBLEDeviceCharacteristics(options: GetBLEDeviceCharacteristicsOptions): scala.Unit = js.native
  /**
  	 * 获取蓝牙设备所有 service（服务）
  	 */
  def getBLEDeviceServices(options: GetBLEDeviceServicesOptions): scala.Unit = js.native
  /**
  	 * 获取全局唯一的背景音频管理器 backgroundAudioManager。
  	 * @version 1.2.0
  	 */
  def getBackgroundAudioManager(): BackgroundAudioManager = js.native
  /**
  	 * 获取音乐播放状态。
  	 * @deprecated 1.2.0
  	 */
  def getBackgroundAudioPlayerState(options: GetBackgroundAudioPlayerStateOptions): scala.Unit = js.native
  /**
  	 * 获取所有已搜索到的iBeacon设备
  	 * @version 1.2.0
  	 */
  def getBeacons(options: GetBeaconsOptions): scala.Unit = js.native
  /**
  	 * 获取本机蓝牙适配器状态
  	 * @version 1.1.0
  	 */
  def getBluetoothAdapterState(options: GetBluetoothAdapterStateOptions): scala.Unit = js.native
  /**
  	 * 获取所有已发现的蓝牙设备，包括已经和本机处于连接状态的设备
  	 */
  def getBluetoothDevices(options: GetBluetoothDevicesOptions): scala.Unit = js.native
  /**
  	 * 获取系统剪贴板内容
  	 * 微信客户端 6.5.6 版本开始支持
  	 * @version 1.1.0
  	 */
  def getClipboardData(options: BaseOptions[_, _]): scala.Unit = js.native
  /**
  	 * 根据 uuid 获取处于已连接状态的设备
  	 * @version 1.1.0
  	 */
  def getConnectedBluetoothDevices(options: GetConnectedBluetoothDevicesOptions): scala.Unit = js.native
  /**
  	 * 获取已连接中的 Wi-Fi 信息
  	 * @version 1.6.0
  	 */
  def getConnectedWifi(): scala.Unit = js.native
  def getConnectedWifi(options: GetConnectedWifiOptions): scala.Unit = js.native
  def getEnvInfoSync(): EnvInfo = js.native
  /**
  	 * 获取第三方平台自定义的数据字段。
  	 * @version 1.1.0
  	 */
  def getExtConfig(): scala.Unit = js.native
  def getExtConfig(options: GetExtConfigOptions): scala.Unit = js.native
  /**
  	 * 获取第三方平台自定义的数据字段的同步接口。
  	 * @version 1.1.0
  	 */
  def getExtConfigSync(): ExtConfig = js.native
  /**
  	 *  获取文件信息
  	 * @version 1.4.0
  	 */
  def getFileInfo(options: GetFileInfoOptions): scala.Unit = js.native
  /**
  	 * 获取图片信息
  	 */
  def getImageInfo(options: GetImageInfoOptions): scala.Unit = js.native
  /**
  	 * 获取当前的地理位置、速度。
  	 */
  def getLocation(): scala.Unit = js.native
  def getLocation(options: GetLocationOptions): scala.Unit = js.native
  // #region LogManager
  /**
  	 * 获取日志管理器 logManager 对象。logManager提供log、info、warn、debug四个方法写日志到文件，
  	 * 这四个方法接受任意个类型为Object/Array/Number/String的参数，
  	 * 每次调用的参数的总大小不超过100Kb。最多保存5M的日志内容，超过5M后，旧的日志内容会被删除。
  	 * 用户可以通过设置Button组件的open-type为feedback来上传打印的日志。
  	 * 用户上传的日志可以通过登录小程序管理后台后进入左侧菜单“客服反馈”页面获取到。
  	 */
  def getLogManager(): Logger = js.native
  /**
  	 * 获取网络类型。
  	 */
  def getNetworkType(options: GetNetworkTypeOptions): scala.Unit = js.native
  /**
  	 * 获取全局唯一的录音管理器 recorderManager
  	 * @version 1.6.0
  	 */
  def getRecorderManager(): RecorderManager = js.native
  /**
  	 * 获取本地文件的文件信息
  	 */
  def getSavedFileInfo(options: GetSavedFileInfoOptions): scala.Unit = js.native
  /**
  	 * 获取本地已保存的文件列表
  	 */
  def getSavedFileList(options: GetSavedFileListOptions): scala.Unit = js.native
  /**
  	 * 获取屏幕亮度
  	 * @version 1.2.0
  	 */
  def getScreenBrightness(): scala.Unit = js.native
  def getScreenBrightness(options: GetScreenBrightnessOptions): scala.Unit = js.native
  /**
  	 * 获取用户的当前设置。
  	 * 注：返回值中只会出现小程序已经向用户请求过的权限。
  	 * @version 1.2.0
  	 */
  def getSetting(options: OpenSettingOptions): scala.Unit = js.native
  /**
  	 * 获取转发详细信息
  	 * @version 1.1.0
  	 */
  def getShareInfo(): scala.Unit = js.native
  def getShareInfo(options: GetShareInfoOptions): scala.Unit = js.native
  /**
  	 * 从本地缓存中异步获取指定 key 对应的内容。
  	 */
  def getStorage(options: GetStorageOptions): scala.Unit = js.native
  /**
  	 * 异步获取当前storage的相关信息
  	 */
  def getStorageInfo(options: GetStorageInfoOptions): scala.Unit = js.native
  def getStorageInfoSync(): StorageInfo = js.native
  /**
  	 * 从本地缓存中同步获取指定 key 对应的内容。
  	 *
  	 */
  def getStorageSync(key: java.lang.String): js.Any = js.native
  /**
  	 * 获取 swanid。
  	 */
  def getSwanId(opt: SwanIdOptions): scala.Unit = js.native
  /**
  	 * 获取系统信息。
  	 */
  def getSystemInfo(options: GetSystemInfoOptions): scala.Unit = js.native
  def getSystemInfoSync(): SystemInfo = js.native
  def getUpdateManager(): UpdateManager = js.native
  /**
  	 * 获取用户信息，需要先调用 swan.login 接口。
  	 */
  def getUserInfo(options: GetUserInfoOptions): scala.Unit = js.native
  /**
  	 * 请求获取 Wi-Fi 列表
  	 * 在 onGetWifiList 注册的回调中返回 wifiList 数据。
  	 * iOS 将跳转到系统的 Wi-Fi 界面，Android 不会跳转。
  	 * iOS 11.0 及 iOS 11.1 两个版本因系统问题，该方法失效。但在 iOS 11.2 中已修复。
  	 * @version 1.6.0
  	 */
  def getWifiList(): scala.Unit = js.native
  def getWifiList(options: BaseOptions[_, _]): scala.Unit = js.native
  /**
  	 * 收起键盘。
  	 */
  def hideKeyboard(): scala.Unit = js.native
  /**
  	 * 隐藏消息提示框
  	 */
  def hideLoading(): scala.Unit = js.native
  /**
  	 * 隐藏导航条加载动画。
  	 * @version 1.4.3
  	 */
  def hideNavigationBarLoading(): scala.Unit = js.native
  /**
  	 * 隐藏分享按钮
  	 * @version 1.1.0
  	 */
  def hideShareMenu(): scala.Unit = js.native
  def hideShareMenu(options: ShareMenuOptions): scala.Unit = js.native
  /**
  	 * 隐藏 tabBar
  	 * @version 1.9.0
  	 */
  def hideTabBar(options: ShowTabBarOptions): scala.Unit = js.native
  /**
  	 * 隐藏 tabBar 某一项的右上角的红点
  	 * @version 1.9.0
  	 */
  def hideTabBarRedDot(option: TabBarBadgeOptions): scala.Unit = js.native
  def hideToast(): scala.Unit = js.native
  /**
  	 * 获取手百登录状态。手百登录状态 true: 已登录，false: 未登录
  	 */
  def isLoginSync(): scala.Boolean = js.native
  /**
  	 * 提前下载好子包的资源，目录结构配置参考(https://smartprogram.baidu.com/docs/develop/framework/subpackages/)。
  	 */
  def loadSubPackage(options: LoadSubPackageOptions): scala.Unit = js.native
  /**
  	 * 调用接口获取登录凭证（code）进而换取用户登录态信息，
  	 * 包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）。
  	 * 用户数据的加解密通讯需要依赖会话密钥完成。
  	 */
  def login(option: LoginOptions): scala.Unit = js.native
  /**
  	 * 拨打电话
  	 */
  def makePhoneCall(options: MakePhoneCallOptions): scala.Unit = js.native
  /**
  	 * 关闭当前页面，回退前一页面。
  	 */
  def navigateBack(): scala.Unit = js.native
  def navigateBack(options: NavigateBackOptions): scala.Unit = js.native
  /**
  	 * 返回到上一个小程序，只有在当前小程序是被其他小程序打开时可以调用成功
  	 */
  def navigateBackMiniProgram(options: NavigateBackMiniProgramOptions): scala.Unit = js.native
  /**
  	 *  返回上一个小程序
  	 */
  def navigateBackSmartProgram(options: navigateBackSmartProgramOptions): scala.Unit = js.native
  /**
  	 * 保留当前页面，跳转到应用内的某个页面，使用swan.navigateBack可以返回到原页面。
  	 *
  	 * 注意：为了不让用户在使用小程序时造成困扰，
  	 * 我们规定页面路径只能是五层，请尽量避免多层级的交互方式。
  	 */
  def navigateTo(options: NavigateToOptions): scala.Unit = js.native
  /**
  	 * 打开同一公众号下关联的另一个小程序。
  	 */
  def navigateToMiniProgram(options: NavigateToMiniProgramOptions): scala.Unit = js.native
  /**
  	 *  打开另一个小程序。
  	 */
  def navigateToSmartProgram(options: navigateToSmartProgramOptions): scala.Unit = js.native
  /**
  	 * 用于延迟一部分操作到下一个时间片再执行（类似于 setTimeout）。
  	 * @param func
  	 * @version 2.2.3
  	 */
  def nextTick(func: js.Function0[_]): scala.Unit = js.native
  /**
  	 * 启用低功耗蓝牙设备特征值变化时的 notify 功能。
  	 * 注意：必须设备的特征值支持notify才可以成功调用，具体参照 characteristic 的 properties 属性
  	 * 另外，必须先启用notify才能监听到设备 characteristicValueChange 事件
  	 */
  def notifyBLECharacteristicValueChanged(options: NotifyBLECharacteristicValueChanged): scala.Unit = js.native
  /**
  	 * 监听重力感应数据，频率：5次/秒
  	 */
  def onAccelerometerChange(callback: AccelerometerChangeCallback): scala.Unit = js.native
  /**
  	 * 监听低功耗蓝牙设备的特征值变化。必须先启用notify接口才能接收到设备推送的notification。
  	 */
  def onBLECharacteristicValueChange(callback: js.Function1[/* res */ baiduDashAppLib.Anon_CharacteristicIdDeviceId, scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听低功耗蓝牙连接的错误事件，包括设备丢失，连接异常断开等等。
  	 */
  def onBLEConnectionStateChanged(callback: js.Function1[/* res */ baiduDashAppLib.Anon_Connected, scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听音乐暂停。
  	 * @deprecated 1.2.0
  	 */
  def onBackgroundAudioPause(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听音乐播放。
  	 * @deprecated 1.2.0
  	 */
  def onBackgroundAudioPlay(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听音乐停止。
  	 * @deprecated 1.2.0
  	 */
  def onBackgroundAudioStop(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听 iBeacon 服务的状态变化
  	 * @version 1.2.0
  	 */
  def onBeaconServiceChange(): scala.Unit = js.native
  def onBeaconServiceChange(callback: js.Function2[/* available */ scala.Boolean, /* discovering */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听 iBeacon 设备的更新事件
  	 * @version 1.2.0
  	 */
  def onBeaconUpdate(): scala.Unit = js.native
  def onBeaconUpdate(callback: js.Function1[/* beacons */ js.Array[Beacon], scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听蓝牙适配器状态变化事件
  	 * @version 1.1.0
  	 */
  def onBluetoothAdapterStateChange(callback: js.Function1[/* res */ BluetoothAdapterState, scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听寻找到新设备的事件
  	 * @version 1.1.0
  	 */
  def onBluetoothDeviceFound(callback: js.Function1[/* res */ baiduDashAppLib.Anon_Devices, scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听罗盘数据，频率：5次/秒，接口调用后会自动开始监听，可使用swan.stopCompass停止监听。
  	 */
  def onCompassChange(callback: CompassChangeCallback): scala.Unit = js.native
  /**
  	 * 监听在获取到 Wi-Fi 列表数据时的事件，在回调中将返回 wifiList。
  	 * @version 1.6.0
  	 */
  def onGetWifiList(): scala.Unit = js.native
  def onGetWifiList(callback: js.Function1[/* res */ GetWifiListOptions, scala.Unit]): scala.Unit = js.native
  // 内存
  def onMemoryWarning(callback: js.Function1[/* res */ baiduDashAppLib.Anon_Level, scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听网络状态变化。
  	 * 微信客户端 6.5.6 版本开始支持
  	 * @version 1.1.0
  	 */
  def onNetworkStatusChange(callback: js.Function1[/* res */ baiduDashAppLib.Anon_IsConnected, scala.Unit]): scala.Unit = js.native
  /** 监听WebSocket关闭。 */
  def onSocketClose(callback: js.Function1[/* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /** 监听WebSocket错误。 */
  def onSocketError(callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听WebSocket接受到服务器的消息事件。
  	 */
  def onSocketMessage(callback: js.Function1[/* res */ DataResponse, scala.Unit]): scala.Unit = js.native
  /** 监听WebSocket连接打开事件。 */
  def onSocketOpen(callback: js.Function1[/* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听用户主动截屏事件，用户使用系统截屏按键截屏时触发此事件
  	 * @version 1.4.0
  	 */
  def onUserCaptureScreen(): scala.Unit = js.native
  def onUserCaptureScreen(callback: js.Function1[/* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  	 * 监听连接上 Wi-Fi 的事件。
  	 * @version 1.6.0
  	 */
  def onWifiConnected(): scala.Unit = js.native
  def onWifiConnected(callback: js.Function1[/* wifi */ WiFi, scala.Unit]): scala.Unit = js.native
  /**
  	 * 初始化蓝牙适配器
  	 * @version 1.1.0
  	 */
  def openBluetoothAdapter(options: OpenBluetoothAdapterOptions): scala.Unit = js.native
  /**
  	 * 查看微信卡包中的卡券。
  	 *
  	 */
  def openCard(options: OpenCardOptions): scala.Unit = js.native
  /**
  	 * 新开页面打开文档，支持格式：doc, xls, ppt, pdf, docx, xlsx, pptx
  	 */
  def openDocument(options: OpenDocumentOptions): scala.Unit = js.native
  /**
  	 * 使用微信内置地图查看位置
  	 */
  def openLocation(options: OpenLocationOptions): scala.Unit = js.native
  /**
  	 * 调起客户端小程序设置界面，返回用户设置的操作结果。
  	 * 注：设置界面只会出现小程序已经向用户请求过的权限。
  	 * @version 1.1.0
  	 */
  def openSetting(options: OpenSettingOptions): scala.Unit = js.native
  /**
  	 * 调起分享面板。
  	 * bug : 百度App Android 客户端 10.13 以下版本，点击分享
  	 * 面板的取消时,不会执行 fail 回调。
  	 */
  def openShare(options: openShareOptions): scala.Unit = js.native
  def pageScrollTo(options: PageScrollToOptions): scala.Unit = js.native
  /**
  	 * 暂停播放音乐。
  	 * @deprecated 1.2.0
  	 */
  def pauseBackgroundAudio(): scala.Unit = js.native
  def pauseBackgroundAudio(options: PlayBackgroundAudioOptions): scala.Unit = js.native
  /**
  	 * 暂停正在播放的语音。
  	 * 再次调用swan.playVoice播放同一个文件时，会从暂停处开始播放。
  	 * 如果想从头开始播放，需要先调用 swan.stopVoice。
  	 * @deprecated 1.6.0
  	 */
  def pauseVoice(): scala.Unit = js.native
  /**
  	 * 播放音乐，同时只能有一首音乐正在播放。
  	 * @deprecated 1.2.0
  	 */
  def playBackgroundAudio(options: PlayBackgroundAudioOptions): scala.Unit = js.native
  /**
  	 * 开始播放语音，同时只允许一个语音文件正在播放，
  	 * 如果前一个语音文件还没播放完，将中断前一个语音播放。
  	 * @deprecated 1.6.0
  	 */
  def playVoice(options: PlayVoiceOptions): scala.Unit = js.native
  /**
  	 * 预览图片。
  	 */
  def previewImage(options: PreviewImageOptions): scala.Unit = js.native
  /**
  	 * 关闭所有页面，打开到应用内的某个页面。
  	 * @version 1.1.0
  	 */
  def reLaunch(): scala.Unit = js.native
  def reLaunch(options: ReLaunchOptions): scala.Unit = js.native
  /**
  	 * 读取低功耗蓝牙设备的特征值的二进制数据值。
  	 * 注意：必须设备的特征值支持read才可以成功调用，具体参照 characteristic 的 properties 属性
  	 */
  def readBLECharacteristicValue(options: ReadBLECharacteristicValue): scala.Unit = js.native
  /**
  	 * 关闭当前页面，跳转到应用内的某个页面。
  	 */
  def redirectTo(options: RedirectToOptions): scala.Unit = js.native
  /**
  	 * 删除本地存储的文件
  	 */
  def removeSavedFile(options: RemoveSavedFileOptions): scala.Unit = js.native
  def removeStorage(options: RemoveStorageOptions): scala.Unit = js.native
  def removeStorageSync(key: java.lang.String): DataResponse = js.native
  /**
  	 * 移除 tabBar 某一项右上角的文本
  	 * @version 1.9.0
  	 */
  def removeTabBarBadge(options: TabBarBadgeOptions): scala.Unit = js.native
  /**
  	 * 自定义分析数据上报接口。使用前，需要在小程序管理后台自定义分析中新建事件，配置好事件名与字段。
  	 *
  	 * @param eventName 事件名
  	 * @param data 上报的自定义数据
  	 */
  def reportAnalytics(eventName: java.lang.String, data: js.Object): scala.Unit = js.native
  /**
  	 * 自定义业务数据监控上报接口。使用前，需要在小程序管理后台-运维中心-性能监控-业务数据监控中新建监控事件，
  	 * 配置监控描述与告警类型。每一个监控事件对应唯一的监控ID，开发者最多可以创建128个监控事件。
  	 * @param name 监控ID，在小程序管理后台新建数据指标后获得
  	 * @param value 上报数值，经处理后会在小程序管理后台上展示每分钟的上报总量
  	 */
  def reportMonitor(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
  	 * swan.request发起的是https请求。一个微信小程序，同时只能有5个网络请求连接。
  	 */
  def request(options: RequestOptions): RequestTask = js.native
  /**
  	 * 发起微信支付。
  	 */
  def requestPayment(options: RequestPaymentOptions): scala.Unit = js.native
  /**
  	 * 百度收银台。
  	 * @version 1.8.5
  	 */
  def requestPolymerPayment(options: requestPolymerPaymentOptions): scala.Unit = js.native
  /**
  	 * 保存文件到本地。
  	 * 本地文件存储的大小限制为 10M
  	 */
  def saveFile(options: SaveFileOptions): scala.Unit = js.native
  /**
  	 * 保存图片到系统相册。
  	 * 需要用户授权 scope.writePhotosAlbum
  	 * @version 1.2.0
  	 */
  def saveImageToPhotosAlbum(options: SaveImageToPhotosAlbumOptions): scala.Unit = js.native
  /** 保存视频到系统相册。需要用户授权 scope.writePhotosAlbum */
  def saveVideoToPhotosAlbum(options: SaveVideoOptions): scala.Unit = js.native
  /**
  	 * 调起客户端扫码界面，扫码成功后返回对应的结果
  	 */
  def scanCode(options: ScanCodeOptions): scala.Unit = js.native
  /**
  	 * 控制音乐播放进度。
  	 * @deprecated 1.2.0
  	 */
  def seekBackgroundAudio(options: SeekBackgroundAudioOptions): scala.Unit = js.native
  /**
  	 * 通过 WebSocket 连接发送数据，需要先 swan.connectSocket，
  	 * 并在 swan.onSocketOpen 回调之后才能发送。
  	 */
  def sendSocketMessage(options: SendSocketMessageOptions): scala.Unit = js.native
  /**
  	 * 设置系统剪贴板的内容
  	 * 微信客户端 6.5.6 版本开始支持
  	 * @version 1.1.0
  	 */
  def setClipboardData(options: SetClipboardDataOptions): scala.Unit = js.native
  /**
  	 * 动态设置当前页面的标题。此方法为 web 版小程序专用方法，使用前需
  	 * 判断方法是否存在。
  	 */
  def setDocumentTitle(): scala.Unit = js.native
  def setDocumentTitle(options: baiduDashAppLib.Anon_Title): scala.Unit = js.native
  def setEnableDebug(options: EnableDebugOptions): scala.Unit = js.native
  /**
  	 * 设置是否保持常亮状态。
  	 * 仅在当前小程序生效，离开小程序后设置失效。
  	 * @version 1.4.0
  	 */
  def setKeepScreenOn(): scala.Unit = js.native
  def setKeepScreenOn(options: SetKeepScreenOnOptions): scala.Unit = js.native
  /**
  	 * 设置 web 版小程序 description meta 信息。此方法为 web 版小
  	 * 程序专用方法，使用前需判断方法是否存在。
  	 */
  def setMetaDescription(): scala.Unit = js.native
  def setMetaDescription(content: MetaDescription): scala.Unit = js.native
  /**
  	 * 设置 web 版小程序 keywords meta 信息。此方法为 web 版小程序专
  	 * 用方法，使用前需判断方法是否存在。
  	 */
  def setMetaKeywords(): scala.Unit = js.native
  def setMetaKeywords(content: MetaKeywords): scala.Unit = js.native
  /**
  	 * 设置导航颜色
  	 * @version 1.4.3
  	 */
  def setNavigationBarColor(options: SetNavigationBarColorOptions): scala.Unit = js.native
  /**
  	 * 动态设置当前页面的标题。
  	 * @version 1.4.3
  	 */
  def setNavigationBarTitle(options: SetNavigationBarTitleOptions): scala.Unit = js.native
  /**
  	 * 设置屏幕亮度
  	 * @version 1.2.0
  	 */
  def setScreenBrightness(options: SetScreenBrightnessOptions): scala.Unit = js.native
  /**
  	 * 将数据存储在本地缓存中指定的 key 中，
  	 * 会覆盖掉原来该 key 对应的内容，这是一个异步接口。
  	 */
  def setStorage(options: SetStorageOptions): scala.Unit = js.native
  /**
  	 * 将 data 存储在本地缓存中指定的 key 中，
  	 * 会覆盖掉原来该 key 对应的内容，这是一个同步接口。
  	 *
  	 * @param key 本地缓存中的指定的 key
  	 * @param data 需要存储的内容
  	 */
  def setStorageSync(key: java.lang.String, data: js.Any): scala.Unit = js.native
  // 界面-----设置tabBar
  /**
  	 * 为 tabBar 某一项的右上角添加文本
  	 * @version 1.9.0
  	 */
  def setTabBarBadge(options: SetTabBarBadgeOptions): scala.Unit = js.native
  /**
  	 * 动态设置 tabBar 某一项的内容
  	 * @version 1.9.0
  	 */
  def setTabBarItem(options: SetTabBarItemOptions): scala.Unit = js.native
  /**
  	 * 动态设置 tabBar 的整体样式
  	 * @version 1.9.0
  	 */
  def setTabBarStyle(options: SetTabBarStyleOptions): scala.Unit = js.native
  /**
  	 * 动态设置置顶栏文字内容
  	 * 只有当前小程序被置顶时能生效，如果当前小程序没有被置顶，也能调用成功，但是不会立即生效
  	 * 只有在用户将这个小程序置顶后才换上设置的文字内容。
  	 * 注意：调用成功后，需间隔 5s 才能再次调用此接口，如果在 5s 内再次调用此接口，会回调
  	 * fail，errMsg："setTopBarText: fail invoke too frequently"
  	 * @version 1.4.3
  	 */
  def setTopBarText(): scala.Unit = js.native
  def setTopBarText(options: SetTopBarTextOptions): scala.Unit = js.native
  /**
  	 * iOS特有接口 在 onGetWifiList 回调后，利用接口设置 wifiList 中 AP 的相关信息。
  	 * 注意：
  	 * + 该接口只能在 onGetWifiList 回调之后才能调用。
  	 * + 此时客户端会挂起，等待小程序设置 Wi-Fi 信息，请务必尽快调用该接口，若无数据请传入一个空数组。
  	 * + 有可能随着周边 Wi-Fi 列表的刷新，单个流程内收到多次带有存在重复的 Wi-Fi 列表的回调。
  	 * @version 1.6.0
  	 */
  def setWifiList(options: SetWifiListOptions): scala.Unit = js.native
  /**
  	 * 显示操作菜单
  	 */
  def showActionSheet(options: ActionSheetOptions): scala.Unit = js.native
  /**
  	 * 显示 loading 提示框, 需主动调用 swan.hideLoading 才能关闭提示框
  	 */
  def showLoading(options: LoadingOptions): scala.Unit = js.native
  /**
  	 * 显示模态弹窗
  	 */
  def showModal(options: ModalOptions): scala.Unit = js.native
  /**
  	 * 在当前页面显示导航条加载动画。
  	 * @version 1.4.3
  	 */
  def showNavigationBarLoading(): scala.Unit = js.native
  /**
  	 * 显示分享按钮
  	 *
  	 */
  def showShareMenu(): scala.Unit = js.native
  def showShareMenu(options: ShareMenuOptions): scala.Unit = js.native
  /**
  	 * 显示 tabBar
  	 * @version 1.9.0
  	 */
  def showTabBar(options: ShowTabBarOptions): scala.Unit = js.native
  /**
  	 * 显示 tabBar 某一项的右上角的红点
  	 * @version 1.9.0
  	 */
  def showTabBarRedDot(option: TabBarBadgeOptions): scala.Unit = js.native
  /**
  	 * 显示消息提示框
  	 */
  def showToast(options: ToastOptions): scala.Unit = js.native
  /**
  	 * 开始监听加速度数据。
  	 * 微信客户端 6.5.6 版本开始支持
  	 * @version 1.1.0
  	 */
  def startAccelerometer(options: AccelerometerOptions): scala.Unit = js.native
  /**
  	 * 开始搜索附近的iBeacon设备
  	 * @version 1.2.0
  	 */
  def startBeaconDiscovery(options: StartBeaconDiscoveryOptions): scala.Unit = js.native
  /**
  	 * 开始监听罗盘数据。
  	 * 微信客户端 6.5.6 版本开始支持
  	 * @version 1.1.0
  	 */
  def startCompass(): scala.Unit = js.native
  def startCompass(options: CompassOptions): scala.Unit = js.native
  // 页面-----下拉刷新
  /**
  	 * 开始下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致
  	 * @version 1.5.0
  	 */
  def startPullDownRefresh(): scala.Unit = js.native
  def startPullDownRefresh(options: BaseOptions[_, _]): scala.Unit = js.native
  /**
  	 * 开始录音。当主动调用swan.stopRecord，
  	 * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
  	 * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
  	 * 如需持久保存，需在主动调用swan.saveFile，在小程序下次启动时才能访问得到。
  	 * @deprecated 1.6.0
  	 */
  def startRecord(options: StartRecordAudioOptions): scala.Unit = js.native
  // 设备-----Wi-Fi
  /**
  	 * 初始化 Wi-Fi 模块。
  	 * @version 1.6.0
  	 */
  def startWifi(): scala.Unit = js.native
  def startWifi(options: BaseOptions[_, _]): scala.Unit = js.native
  /**
  	 * 停止监听加速度数据。
  	 * 微信客户端 6.5.6 版本开始支持
  	 * @version 1.1.0
  	 */
  def stopAccelerometer(): scala.Unit = js.native
  def stopAccelerometer(options: AccelerometerOptions): scala.Unit = js.native
  /**
  	 * 停止播放音乐。
  	 * @deprecated 1.2.0
  	 */
  def stopBackgroundAudio(): scala.Unit = js.native
  def stopBackgroundAudio(options: PlayBackgroundAudioOptions): scala.Unit = js.native
  /**
  	 * 停止搜索附近的iBeacon设备
  	 * @version 1.2.0
  	 */
  def stopBeaconDiscovery(options: StopBeaconDiscoveryOptions): scala.Unit = js.native
  /**
  	 * 停止搜寻附近的蓝牙外围设备。请在确保找到需要连接的设备后调用该方法停止搜索。
  	 * @version 1.1.0
  	 */
  def stopBluetoothDevicesDiscovery(options: StopBluetoothDevicesDiscoveryOptions): scala.Unit = js.native
  def stopCompass(): scala.Unit = js.native
  def stopCompass(options: CompassOptions): scala.Unit = js.native
  /**
  	 * 停止当前页面下拉刷新
  	 * @version 1.5.0
  	 */
  def stopPullDownRefresh(): scala.Unit = js.native
  def stopPullDownRefresh(options: BaseOptions[_, _]): scala.Unit = js.native
  /**
  	 * 主动调用停止录音。
  	 */
  def stopRecord(): scala.Unit = js.native
  def stopRecord(options: StopRecordAudioOptions): scala.Unit = js.native
  /**
  	 * 结束播放语音。
  	 * @deprecated 1.6.0
  	 */
  def stopVoice(): scala.Unit = js.native
  /**
  	 * 关闭 Wi-Fi 模块。
  	 * @version 1.6.0
  	 */
  def stopWifi(): scala.Unit = js.native
  def stopWifi(options: BaseOptions[_, _]): scala.Unit = js.native
  /**
  	 * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
  	 */
  def switchTab(options: SwitchTabOptions): scala.Unit = js.native
  /**
  	 * 更新转发属性
  	 * @version 1.2.0
  	 */
  def updateShareMenu(): scala.Unit = js.native
  def updateShareMenu(options: UpdateShareMenuOptions): scala.Unit = js.native
  /**
  	 * 将本地资源上传到开发者服务器。
  	 * 如页面通过 swan.chooseImage 等接口获取到一个本地资源的临时文件路径后，
  	 * 可通过此接口将本地资源上传到指定服务器。
  	 * 客户端发起一个 HTTPS POST 请求，
  	 * 其中 Content-Type 为 multipart/form-data 。
  	 */
  def uploadFile(options: UploadFileOptions): UploadTask = js.native
  /**
  	 * swanid有效性校验接口：true表示有效，false表示无效。
  	 */
  def verify(options: verifyOptions): scala.Unit = js.native
  // 设备-----震动
  /**
  	 * 使手机发生较长时间的振动（400ms）
  	 * @version 1.2.0
  	 */
  def vibrateLong(): scala.Unit = js.native
  def vibrateLong(options: BaseOptions[_, _]): scala.Unit = js.native
  /**
  	 * 使手机发生较短时间的振动（15ms）
  	 * @version 1.2.0
  	 */
  def vibrateShort(): scala.Unit = js.native
  def vibrateShort(options: BaseOptions[_, _]): scala.Unit = js.native
  /**
  	 * 向低功耗蓝牙设备特征值中写入二进制数据。
  	 * 注意：必须设备的特征值支持write才可以成功调用，具体参照 characteristic 的 properties 属性
  	 * tips: 并行调用多次读写接口存在读写失败的可能性
  	 */
  def writeBLECharacteristicValue(options: WriteBLECharacteristicValue): scala.Unit = js.native
}

