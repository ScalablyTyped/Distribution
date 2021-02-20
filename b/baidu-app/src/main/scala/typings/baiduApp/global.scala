package typings.baiduApp

import typings.baiduApp.anon.Connected
import typings.baiduApp.anon.DeviceId
import typings.baiduApp.anon.Devices
import typings.baiduApp.anon.IsConnected
import typings.baiduApp.anon.Level
import typings.baiduApp.anon.PartialCanvasToTempFilePa
import typings.baiduApp.anon.Title
import typings.baiduApp.swan.AccelerometerChangeCallback
import typings.baiduApp.swan.AccelerometerOptions
import typings.baiduApp.swan.AccountInfo
import typings.baiduApp.swan.ActionSheetOptions
import typings.baiduApp.swan.Animation
import typings.baiduApp.swan.App
import typings.baiduApp.swan.AppOptions
import typings.baiduApp.swan.AuthorizeOptions
import typings.baiduApp.swan.BackgroundAudioManager
import typings.baiduApp.swan.BaseOptions
import typings.baiduApp.swan.Beacon
import typings.baiduApp.swan.BluetoothAdapterState
import typings.baiduApp.swan.CameraContext
import typings.baiduApp.swan.CanvasContext
import typings.baiduApp.swan.CanvasImageDataOptions
import typings.baiduApp.swan.CanvasPutImageDataOptions
import typings.baiduApp.swan.CardOptions
import typings.baiduApp.swan.CheckSessionOption
import typings.baiduApp.swan.ChooseAddressOptions
import typings.baiduApp.swan.ChooseImageOptions
import typings.baiduApp.swan.ChooseInvoiceTitleOptions
import typings.baiduApp.swan.ChooseLocationOptions
import typings.baiduApp.swan.ChooseVideoOptions
import typings.baiduApp.swan.CloseBLEConnectionOptions
import typings.baiduApp.swan.CloseBluetoothAdapterOptions
import typings.baiduApp.swan.CloseSocketOptions
import typings.baiduApp.swan.CompassChangeCallback
import typings.baiduApp.swan.CompassOptions
import typings.baiduApp.swan.Component
import typings.baiduApp.swan.ConnectSocketOptions
import typings.baiduApp.swan.ConnectWiFiOptions
import typings.baiduApp.swan.CreateAnimationOptions
import typings.baiduApp.swan.CreateBLEConnectionOptions
import typings.baiduApp.swan.CreateIntersectionObserverOption
import typings.baiduApp.swan.DataResponse
import typings.baiduApp.swan.DownloadFileOptions
import typings.baiduApp.swan.DownloadTask
import typings.baiduApp.swan.DrawCanvasOptions
import typings.baiduApp.swan.EnableDebugOptions
import typings.baiduApp.swan.EnvInfo
import typings.baiduApp.swan.ExtConfig
import typings.baiduApp.swan.ExtendedComponent
import typings.baiduApp.swan.GetBLEDeviceCharacteristicsOptions
import typings.baiduApp.swan.GetBLEDeviceServicesOptions
import typings.baiduApp.swan.GetBackgroundAudioPlayerStateOptions
import typings.baiduApp.swan.GetBeaconsOptions
import typings.baiduApp.swan.GetBluetoothAdapterStateOptions
import typings.baiduApp.swan.GetBluetoothDevicesOptions
import typings.baiduApp.swan.GetConnectedBluetoothDevicesOptions
import typings.baiduApp.swan.GetConnectedWifiOptions
import typings.baiduApp.swan.GetExtConfigOptions
import typings.baiduApp.swan.GetFileInfoOptions
import typings.baiduApp.swan.GetImageInfoOptions
import typings.baiduApp.swan.GetLocationOptions
import typings.baiduApp.swan.GetNetworkTypeOptions
import typings.baiduApp.swan.GetSavedFileInfoOptions
import typings.baiduApp.swan.GetSavedFileListOptions
import typings.baiduApp.swan.GetScreenBrightnessOptions
import typings.baiduApp.swan.GetShareInfoOptions
import typings.baiduApp.swan.GetStorageInfoOptions
import typings.baiduApp.swan.GetStorageOptions
import typings.baiduApp.swan.GetSystemInfoOptions
import typings.baiduApp.swan.GetUserInfoOptions
import typings.baiduApp.swan.GetWifiListOptions
import typings.baiduApp.swan.InnerAudioContext
import typings.baiduApp.swan.IntersectionObserver
import typings.baiduApp.swan.LivePlayerContext
import typings.baiduApp.swan.LoadSubPackageOptions
import typings.baiduApp.swan.LoadingOptions
import typings.baiduApp.swan.Logger
import typings.baiduApp.swan.LoginOptions
import typings.baiduApp.swan.MakePhoneCallOptions
import typings.baiduApp.swan.MapContext
import typings.baiduApp.swan.MetaDescription
import typings.baiduApp.swan.MetaKeywords
import typings.baiduApp.swan.ModalOptions
import typings.baiduApp.swan.NavigateBackMiniProgramOptions
import typings.baiduApp.swan.NavigateBackOptions
import typings.baiduApp.swan.NavigateToMiniProgramOptions
import typings.baiduApp.swan.NavigateToOptions
import typings.baiduApp.swan.NotifyBLECharacteristicValueChanged
import typings.baiduApp.swan.OpenBluetoothAdapterOptions
import typings.baiduApp.swan.OpenCardOptions
import typings.baiduApp.swan.OpenDocumentOptions
import typings.baiduApp.swan.OpenLocationOptions
import typings.baiduApp.swan.OpenSettingOptions
import typings.baiduApp.swan.Page
import typings.baiduApp.swan.PageOptions
import typings.baiduApp.swan.PageScrollToOptions
import typings.baiduApp.swan.PhoneContact
import typings.baiduApp.swan.PlayBackgroundAudioOptions
import typings.baiduApp.swan.PlayVoiceOptions
import typings.baiduApp.swan.PreviewImageOptions
import typings.baiduApp.swan.ReLaunchOptions
import typings.baiduApp.swan.ReadBLECharacteristicValue
import typings.baiduApp.swan.RecorderManager
import typings.baiduApp.swan.RedirectToOptions
import typings.baiduApp.swan.RemoveSavedFileOptions
import typings.baiduApp.swan.RemoveStorageOptions
import typings.baiduApp.swan.RequestOptions
import typings.baiduApp.swan.RequestPaymentOptions
import typings.baiduApp.swan.RequestTask
import typings.baiduApp.swan.SaveFileOptions
import typings.baiduApp.swan.SaveImageToPhotosAlbumOptions
import typings.baiduApp.swan.SaveVideoOptions
import typings.baiduApp.swan.ScanCodeOptions
import typings.baiduApp.swan.SeekBackgroundAudioOptions
import typings.baiduApp.swan.SelectorQuery
import typings.baiduApp.swan.SendSocketMessageOptions
import typings.baiduApp.swan.SetClipboardDataOptions
import typings.baiduApp.swan.SetKeepScreenOnOptions
import typings.baiduApp.swan.SetNavigationBarColorOptions
import typings.baiduApp.swan.SetNavigationBarTitleOptions
import typings.baiduApp.swan.SetScreenBrightnessOptions
import typings.baiduApp.swan.SetStorageOptions
import typings.baiduApp.swan.SetTabBarBadgeOptions
import typings.baiduApp.swan.SetTabBarItemOptions
import typings.baiduApp.swan.SetTabBarStyleOptions
import typings.baiduApp.swan.SetTopBarTextOptions
import typings.baiduApp.swan.SetWifiListOptions
import typings.baiduApp.swan.ShareMenuOptions
import typings.baiduApp.swan.ShowTabBarOptions
import typings.baiduApp.swan.StartBeaconDiscoveryOptions
import typings.baiduApp.swan.StartRecordAudioOptions
import typings.baiduApp.swan.StopBeaconDiscoveryOptions
import typings.baiduApp.swan.StopBluetoothDevicesDiscoveryOptions
import typings.baiduApp.swan.StopRecordAudioOptions
import typings.baiduApp.swan.StorageInfo
import typings.baiduApp.swan.SwanIdOptions
import typings.baiduApp.swan.SwitchTabOptions
import typings.baiduApp.swan.SystemInfo
import typings.baiduApp.swan.TabBarBadgeOptions
import typings.baiduApp.swan.ThisTypedComponentOptionsWithRecordProps
import typings.baiduApp.swan.ToastOptions
import typings.baiduApp.swan.UpdateManager
import typings.baiduApp.swan.UpdateShareMenuOptions
import typings.baiduApp.swan.UploadFileOptions
import typings.baiduApp.swan.UploadTask
import typings.baiduApp.swan.VideoContext
import typings.baiduApp.swan.WiFi
import typings.baiduApp.swan.WriteBLECharacteristicValue
import typings.baiduApp.swan.ai.DetectIdentifyOptions
import typings.baiduApp.swan.ai.GeneralIdentifyOptions
import typings.baiduApp.swan.ai.VoiceRecognizerTask
import typings.baiduApp.swan.ai.animalClassifyOptions
import typings.baiduApp.swan.ai.carClassifyOptions
import typings.baiduApp.swan.ai.dishClassifyOptions
import typings.baiduApp.swan.ai.imageAuditOptions
import typings.baiduApp.swan.ai.logoClassifyOptions
import typings.baiduApp.swan.ai.ocrBankCardOptions
import typings.baiduApp.swan.ai.ocrDrivingLicenseOptions
import typings.baiduApp.swan.ai.ocrIdCardOptions
import typings.baiduApp.swan.ai.ocrVehicleLicenseOptions
import typings.baiduApp.swan.ai.plantClassifyOptions
import typings.baiduApp.swan.ai.textReviewOptions
import typings.baiduApp.swan.ai.textToAudioOptions
import typings.baiduApp.swan.navigateBackSmartProgramOptions
import typings.baiduApp.swan.navigateToSmartProgramOptions
import typings.baiduApp.swan.openShareOptions
import typings.baiduApp.swan.requestPolymerPaymentOptions
import typings.baiduApp.swan.verifyOptions
import typings.std.ArrayBuffer
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * App() 函数用来注册一个小程序。
    * 接受一个 object 参数，其指定小程序的生命周期函数等。
    */
  @JSGlobal("App")
  @js.native
  def App[T /* <: AppOptions */](app: T with (ThisType[T with typings.baiduApp.swan.App])): Unit = js.native
  
  /**
    * behaviors 是用于组件间代码共享的特性
    * 类似于一些编程语言中的“mixins”或“traits”
    * 每个 behavior 可以包含一组属性、数据、生命周期函数和方法
    * 组件引用它时，它的属性、数据和方法会被合并到组件中，生命周期函数也会在对应时机被调用
    * 每个组件可以引用多个 behavior
    * behavior 也可以引用其他 behavior
    */
  @JSGlobal("Behavior")
  @js.native
  def Behavior[D, M, P](): ExtendedComponent[Component[D, P], D, M, P] = js.native
  @JSGlobal("Behavior")
  @js.native
  def Behavior[D, M, P](options: ThisTypedComponentOptionsWithRecordProps[Component[D, P], D, M, P]): ExtendedComponent[Component[D, P], D, M, P] = js.native
  
  // #endregion
  // #region Compontent组件
  @JSGlobal("Component")
  @js.native
  def Component[D, M, P](): ExtendedComponent[typings.baiduApp.swan.Component[D, P], D, M, P] = js.native
  @JSGlobal("Component")
  @js.native
  def Component[D, M, P](options: ThisTypedComponentOptionsWithRecordProps[typings.baiduApp.swan.Component[D, P], D, M, P]): ExtendedComponent[typings.baiduApp.swan.Component[D, P], D, M, P] = js.native
  
  // #endregion
  // #region Page
  /**
    * Page() 函数用来注册一个页面。
    * 接受一个 object 参数，其指定页面的初始数据、生命周期函数、事件处理函数等。
    */
  @JSGlobal("Page")
  @js.native
  def Page[T /* <: PageOptions with js.Object */](page: T with (ThisType[T with (typings.baiduApp.swan.Page[js.Object, js.Object])])): Unit = js.native
  
  /**
    * 获取小程序实例
    */
  @JSGlobal("getApp")
  @js.native
  def getApp(): App = js.native
  
  /**
    * getCurrentPages() 函数用于获取当前页面栈的实例，
    * 以数组形式按栈的顺序给出，第一个元素为首页，最后一个元素为当前页面。
    */
  @JSGlobal("getCurrentPages")
  @js.native
  def getCurrentPages(): js.Array[Page[js.Object, js.Object]] = js.native
  
  object swan {
    
    /**
      * 批量添加卡券。
      */
    @JSGlobal("swan.addCard")
    @js.native
    def addCard(options: CardOptions): Unit = js.native
    
    /**
      * 增加 手机联系人
      * 调用后，用户可以选择将该表单以“新增联系人”或“添加到已有联系人”的方式
      * 写入手机系统通讯录
      * 完成手机通讯录联系人和联系方式的增加。
      * @version 1.2.0
      */
    @JSGlobal("swan.addPhoneContact")
    @js.native
    def addPhoneContact(options: PhoneContact): Unit = js.native
    
    /**
      * 在接入AI之前需要使用管理员权限操作详细情况官网
      * https://smartprogram.baidu.com/docs/develop/api/ai/
      */
    // #region AI
    object ai {
      
      /**
        * 通用物体及场景识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图片中的多个物体及场景标签。
        */
      @JSGlobal("swan.ai.advancedGeneralIdentify")
      @js.native
      def advancedGeneralIdentify(options: GeneralIdentifyOptions): Unit = js.native
      
      /**
        * 用于检测和识别图片中的动物信息
        */
      @JSGlobal("swan.ai.animalClassify")
      @js.native
      def animalClassify(options: animalClassifyOptions): Unit = js.native
      
      /**
        * 用于检测一张车辆图片的具体车型，即对于输入的一张图片（可正常解码，且长
        * 宽比适宜），输出图片的车辆品牌及型号、颜色及年份、位置信息。
        */
      @JSGlobal("swan.ai.carClassify")
      @js.native
      def carClassify(options: carClassifyOptions): Unit = js.native
      
      /**
        * 用于菜品识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图
        * 片的菜品名称、卡路里信息、置信度。
        */
      @JSGlobal("swan.ai.dishClassify")
      @js.native
      def dishClassify(options: dishClassifyOptions): Unit = js.native
      
      /**
        * 获取全局唯一的语音识别器voiceRecognizer。
        */
      @JSGlobal("swan.ai.getVoiceRecognizer")
      @js.native
      def getVoiceRecognizer(): VoiceRecognizerTask = js.native
      
      /**
        * 自定义图像审核。
        */
      @JSGlobal("swan.ai.imageAudit")
      @js.native
      def imageAudit(options: imageAuditOptions): Unit = js.native
      
      /**
        * 用于检测和识别图片中的品牌 LOGO 信息
        */
      @JSGlobal("swan.ai.logoClassify")
      @js.native
      def logoClassify(options: logoClassifyOptions): Unit = js.native
      
      /**
        * 用户向服务请求检测图像中的主体位置。
        */
      @JSGlobal("swan.ai.objectDetectIdentify")
      @js.native
      def objectDetectIdentify(options: DetectIdentifyOptions): Unit = js.native
      
      /**
        * 识别银行卡并返回卡号、发卡行和卡片类型。
        */
      @JSGlobal("swan.ai.ocrBankCard")
      @js.native
      def ocrBankCard(options: ocrBankCardOptions): Unit = js.native
      
      /**
        * 对机动车驾驶证所有关键字段进行识别。
        */
      @JSGlobal("swan.ai.ocrDrivingLicense")
      @js.native
      def ocrDrivingLicense(options: ocrDrivingLicenseOptions): Unit = js.native
      
      /**
        * 用户向服务请求识别身份证，身份证识别包括正面和背面。
        */
      @JSGlobal("swan.ai.ocrIdCard")
      @js.native
      def ocrIdCard(options: ocrIdCardOptions): Unit = js.native
      
      /**
        * 对机动车行驶证正本所有关键字段进行识别
        */
      @JSGlobal("swan.ai.ocrVehicleLicense")
      @js.native
      def ocrVehicleLicense(options: ocrVehicleLicenseOptions): Unit = js.native
      
      /**
        * 用于检测和识别图片中的植物信息
        */
      @JSGlobal("swan.ai.plantClassify")
      @js.native
      def plantClassify(options: plantClassifyOptions): Unit = js.native
      
      /**
        * 运用业界领先的深度学习技术，判断一段文本内容是否符合网络发文规范，实现
        * 自动化、智能化的文本审核。
        */
      @JSGlobal("swan.ai.textReview")
      @js.native
      def textReview(options: textReviewOptions): Unit = js.native
      
      /**
        * 将文本转换为可以播放的mp3文件。
        */
      @JSGlobal("swan.ai.textToAudio")
      @js.native
      def textToAudio(options: textToAudioOptions): Unit = js.native
    }
    
    // #endregion
    // #region 拓展接口
    /**
      * 将 ArrayBuffer 数据转成 Base64 字符串
      *
      */
    @JSGlobal("swan.arrayBufferToBase64")
    @js.native
    def arrayBufferToBase64(arrayBuffer: ArrayBuffer): String = js.native
    
    /**
      * 提前向用户发起授权请求。
      * 调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，
      * 但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
      */
    @JSGlobal("swan.authorize")
    @js.native
    def authorize(options: AuthorizeOptions): Unit = js.native
    
    /**
      * 将 Base64 字符串转成 ArrayBuffer 数据
      *
      */
    @JSGlobal("swan.base64ToArrayBuffer")
    @js.native
    def base64ToArrayBuffer(base64: String): ArrayBuffer = js.native
    
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
    @JSGlobal("swan.canIUse")
    @js.native
    def canIUse(api: String): Boolean = js.native
    
    /**
      * 返回一个数组，用来描述 canvas 区域隐含的像素数据
      * @version 1.9.0
      */
    @JSGlobal("swan.canvasGetImageData")
    @js.native
    def canvasGetImageData(options: CanvasImageDataOptions): Unit = js.native
    
    /**
      * 将像素数据绘制到画布的方法
      * @version 1.9.0
      */
    @JSGlobal("swan.canvasPutImageData")
    @js.native
    def canvasPutImageData(options: CanvasPutImageDataOptions): Unit = js.native
    
    /**
      * 把当前画布的内容导出生成图片，并返回文件路径
      */
    @JSGlobal("swan.canvasToTempFilePath")
    @js.native
    def canvasToTempFilePath(options: PartialCanvasToTempFilePa): Unit = js.native
    
    /**
      * 调用接口 swan.login 获取 Authorization Code，智能小程序可以使用
      * swan.login()接口获取Authorization Code。
      */
    @JSGlobal("swan.checkSession")
    @js.native
    def checkSession(options: CheckSessionOption): Unit = js.native
    
    @JSGlobal("swan.chooseAddress")
    @js.native
    def chooseAddress(options: ChooseAddressOptions): Unit = js.native
    
    /**
      * 从本地相册选择图片或使用相机拍照。
      */
    @JSGlobal("swan.chooseImage")
    @js.native
    def chooseImage(options: ChooseImageOptions): Unit = js.native
    
    /**
      * 选择用户的发票抬头。
      */
    @JSGlobal("swan.chooseInvoiceTitle")
    @js.native
    def chooseInvoiceTitle(options: ChooseInvoiceTitleOptions): Unit = js.native
    
    /**
      * 打开地图选择位置
      */
    @JSGlobal("swan.chooseLocation")
    @js.native
    def chooseLocation(options: ChooseLocationOptions): Unit = js.native
    
    /**
      * 拍摄视频或从手机相册中选视频，返回视频的临时文件路径。
      */
    @JSGlobal("swan.chooseVideo")
    @js.native
    def chooseVideo(options: ChooseVideoOptions): Unit = js.native
    
    /**
      * 清理本地数据缓存。
      */
    @JSGlobal("swan.clearStorage")
    @js.native
    def clearStorage(): Unit = js.native
    
    /**
      * 同步清理本地数据缓存
      */
    @JSGlobal("swan.clearStorageSync")
    @js.native
    def clearStorageSync(): Unit = js.native
    
    /**
      * 断开与低功耗蓝牙设备的连接
      * @version 1.1.0
      */
    @JSGlobal("swan.closeBLEConnection")
    @js.native
    def closeBLEConnection(options: CloseBLEConnectionOptions): Unit = js.native
    
    /**
      * 关闭蓝牙模块。调用该方法将断开所有已建立的链接并释放系统资源
      * @version 1.1.0
      */
    @JSGlobal("swan.closeBluetoothAdapter")
    @js.native
    def closeBluetoothAdapter(options: CloseBluetoothAdapterOptions): Unit = js.native
    
    /**
      * 关闭WebSocket连接。
      */
    @JSGlobal("swan.closeSocket")
    @js.native
    def closeSocket(): Unit = js.native
    @JSGlobal("swan.closeSocket")
    @js.native
    def closeSocket(options: CloseSocketOptions): Unit = js.native
    
    /**
      * 创建一个 WebSocket 连接；
      * 一个微信小程序同时只能有一个 WebSocket 连接，
      * 如果当前已存在一个 WebSocket 连接，
      * 会自动关闭该连接，并重新创建一个 WebSocket 连接。
      */
    @JSGlobal("swan.connectSocket")
    @js.native
    def connectSocket(options: ConnectSocketOptions): Unit = js.native
    
    /**
      * 连接 Wi-Fi。
      * 若已知 Wi-Fi 信息，可以直接利用该接口连接。
      * 仅 Android 与 iOS 11 以上版本支持。
      * @version 1.6.0
      */
    @JSGlobal("swan.connectWifi")
    @js.native
    def connectWifi(): Unit = js.native
    @JSGlobal("swan.connectWifi")
    @js.native
    def connectWifi(options: ConnectWiFiOptions): Unit = js.native
    
    /**
      * 创建一个动画实例animation。调用实例的方法来描述动画。
      * 最后通过动画实例的export方法导出动画数据传递给组件的animation属性。
      *
      * 注意: export 方法每次调用后会清掉之前的动画操作
      */
    @JSGlobal("swan.createAnimation")
    @js.native
    def createAnimation(): Animation = js.native
    @JSGlobal("swan.createAnimation")
    @js.native
    def createAnimation(options: CreateAnimationOptions): Animation = js.native
    
    /**
      * 低功耗蓝牙接口
      * @version 1.1.0
      */
    @JSGlobal("swan.createBLEConnection")
    @js.native
    def createBLEConnection(options: CreateBLEConnectionOptions): Unit = js.native
    
    /**
      * 创建并返回 camera 上下文 cameraContext 对象
      * cameraContext 与页面的 camera 组件绑定
      * 一个页面只能有一个camera，通过它可以操作对应的 <camera/> 组件。
      * 在自定义组件下，第一个参数传入组件实例this，以操作组件内 <camera/> 组件
      * @version 1.6.0
      */
    @JSGlobal("swan.createCameraContext")
    @js.native
    def createCameraContext(): CameraContext = js.native
    @JSGlobal("swan.createCameraContext")
    @js.native
    def createCameraContext(instance: js.Any): CameraContext = js.native
    
    /**
      * 创建并返回绘图上下文context对象。
      * context只是一个记录方法调用的容器，
      * 用于生成记录绘制行为的actions数组。c
      * ontext跟<canvas/>不存在对应关系，
      * 一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
      */
    @JSGlobal("swan.createCanvasContext")
    @js.native
    def createCanvasContext(selector: String): CanvasContext = js.native
    
    /**
      * 创建并返回内部 audio 上下文 innerAudioContext 对象。
      */
    @JSGlobal("swan.createInnerAudioContext")
    @js.native
    def createInnerAudioContext(): InnerAudioContext = js.native
    
    @JSGlobal("swan.createIntersectionObserver")
    @js.native
    def createIntersectionObserver(context: Component[_, _]): IntersectionObserver = js.native
    @JSGlobal("swan.createIntersectionObserver")
    @js.native
    def createIntersectionObserver(context: Component[_, _], options: CreateIntersectionObserverOption): IntersectionObserver = js.native
    
    /**
      * 操作对应的 <live-player/> 组件。
      * 创建并返回 live-player 上下文 LivePlayerContext 对象。
      * 在自定义组件下，第二个参数传入组件实例this，以操作组件内 <live-player/> 组件
      * @version 1.7.0
      */
    @JSGlobal("swan.createLivePlayerContext")
    @js.native
    def createLivePlayerContext(id: String, instance: js.Any): LivePlayerContext = js.native
    
    /**
      * 创建并返回 map 上下文 mapContext 对象
      */
    @JSGlobal("swan.createMapContext")
    @js.native
    def createMapContext(mapId: String): MapContext = js.native
    
    /**
      * 返回一个SelectorQuery对象实例。
      * 可以在这个实例上使用select等方法选择节点，并使用boundingClientRect等方法选择需要查询的信息。
      * @version 1.4.0
      */
    @JSGlobal("swan.createSelectorQuery")
    @js.native
    def createSelectorQuery(): SelectorQuery = js.native
    
    /**
      * 创建并返回 video 上下文 videoContext 对象
      * @param videoId video标签id <video  src="{{src}}" id="myVideo" ></video>
      */
    @JSGlobal("swan.createVideoContext")
    @js.native
    def createVideoContext(videoId: String): VideoContext = js.native
    
    /**
      * 下载文件资源到本地。客户端直接发起一个 HTTP GET 请求，
      * 把下载到的资源根据 type 进行处理，并返回文件的本地临时路径。
      */
    @JSGlobal("swan.downloadFile")
    @js.native
    def downloadFile(options: DownloadFileOptions): DownloadTask = js.native
    
    /**
      * 绘制画布
      */
    @JSGlobal("swan.drawCanvas")
    @js.native
    def drawCanvas(options: DrawCanvasOptions): Unit = js.native
    
    /**
      * 获取当前账号信息
      * @version >= 2.2.2
      */
    @JSGlobal("swan.getAccountInfoSync")
    @js.native
    def getAccountInfoSync(): AccountInfo = js.native
    
    /**
      * 获取蓝牙设备所有 characteristic（特征值）
      */
    @JSGlobal("swan.getBLEDeviceCharacteristics")
    @js.native
    def getBLEDeviceCharacteristics(options: GetBLEDeviceCharacteristicsOptions): Unit = js.native
    
    /**
      * 获取蓝牙设备所有 service（服务）
      */
    @JSGlobal("swan.getBLEDeviceServices")
    @js.native
    def getBLEDeviceServices(options: GetBLEDeviceServicesOptions): Unit = js.native
    
    /**
      * 获取全局唯一的背景音频管理器 backgroundAudioManager。
      * @version 1.2.0
      */
    @JSGlobal("swan.getBackgroundAudioManager")
    @js.native
    def getBackgroundAudioManager(): BackgroundAudioManager = js.native
    
    /**
      * 获取音乐播放状态。
      * @deprecated 1.2.0
      */
    @JSGlobal("swan.getBackgroundAudioPlayerState")
    @js.native
    def getBackgroundAudioPlayerState(options: GetBackgroundAudioPlayerStateOptions): Unit = js.native
    
    /**
      * 获取所有已搜索到的iBeacon设备
      * @version 1.2.0
      */
    @JSGlobal("swan.getBeacons")
    @js.native
    def getBeacons(options: GetBeaconsOptions): Unit = js.native
    
    /**
      * 获取本机蓝牙适配器状态
      * @version 1.1.0
      */
    @JSGlobal("swan.getBluetoothAdapterState")
    @js.native
    def getBluetoothAdapterState(options: GetBluetoothAdapterStateOptions): Unit = js.native
    
    /**
      * 获取所有已发现的蓝牙设备，包括已经和本机处于连接状态的设备
      */
    @JSGlobal("swan.getBluetoothDevices")
    @js.native
    def getBluetoothDevices(options: GetBluetoothDevicesOptions): Unit = js.native
    
    /**
      * 获取系统剪贴板内容
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("swan.getClipboardData")
    @js.native
    def getClipboardData(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 根据 uuid 获取处于已连接状态的设备
      * @version 1.1.0
      */
    @JSGlobal("swan.getConnectedBluetoothDevices")
    @js.native
    def getConnectedBluetoothDevices(options: GetConnectedBluetoothDevicesOptions): Unit = js.native
    
    /**
      * 获取已连接中的 Wi-Fi 信息
      * @version 1.6.0
      */
    @JSGlobal("swan.getConnectedWifi")
    @js.native
    def getConnectedWifi(): Unit = js.native
    @JSGlobal("swan.getConnectedWifi")
    @js.native
    def getConnectedWifi(options: GetConnectedWifiOptions): Unit = js.native
    
    @JSGlobal("swan.getEnvInfoSync")
    @js.native
    def getEnvInfoSync(): EnvInfo = js.native
    
    /**
      * 获取第三方平台自定义的数据字段。
      * @version 1.1.0
      */
    @JSGlobal("swan.getExtConfig")
    @js.native
    def getExtConfig(): Unit = js.native
    @JSGlobal("swan.getExtConfig")
    @js.native
    def getExtConfig(options: GetExtConfigOptions): Unit = js.native
    
    /**
      * 获取第三方平台自定义的数据字段的同步接口。
      * @version 1.1.0
      */
    @JSGlobal("swan.getExtConfigSync")
    @js.native
    def getExtConfigSync(): ExtConfig = js.native
    
    /**
      *  获取文件信息
      * @version 1.4.0
      */
    @JSGlobal("swan.getFileInfo")
    @js.native
    def getFileInfo(options: GetFileInfoOptions): Unit = js.native
    
    /**
      * 获取图片信息
      */
    @JSGlobal("swan.getImageInfo")
    @js.native
    def getImageInfo(options: GetImageInfoOptions): Unit = js.native
    
    /**
      * 获取当前的地理位置、速度。
      */
    @JSGlobal("swan.getLocation")
    @js.native
    def getLocation(): Unit = js.native
    @JSGlobal("swan.getLocation")
    @js.native
    def getLocation(options: GetLocationOptions): Unit = js.native
    
    // #region LogManager
    /**
      * 获取日志管理器 logManager 对象。logManager提供log、info、warn、debug四个方法写日志到文件，
      * 这四个方法接受任意个类型为Object/Array/Number/String的参数，
      * 每次调用的参数的总大小不超过100Kb。最多保存5M的日志内容，超过5M后，旧的日志内容会被删除。
      * 用户可以通过设置Button组件的open-type为feedback来上传打印的日志。
      * 用户上传的日志可以通过登录小程序管理后台后进入左侧菜单“客服反馈”页面获取到。
      */
    @JSGlobal("swan.getLogManager")
    @js.native
    def getLogManager(): Logger = js.native
    
    /**
      * 获取网络类型。
      */
    @JSGlobal("swan.getNetworkType")
    @js.native
    def getNetworkType(options: GetNetworkTypeOptions): Unit = js.native
    
    /**
      * 获取全局唯一的录音管理器 recorderManager
      * @version 1.6.0
      */
    @JSGlobal("swan.getRecorderManager")
    @js.native
    def getRecorderManager(): RecorderManager = js.native
    
    /**
      * 获取本地文件的文件信息
      */
    @JSGlobal("swan.getSavedFileInfo")
    @js.native
    def getSavedFileInfo(options: GetSavedFileInfoOptions): Unit = js.native
    
    /**
      * 获取本地已保存的文件列表
      */
    @JSGlobal("swan.getSavedFileList")
    @js.native
    def getSavedFileList(options: GetSavedFileListOptions): Unit = js.native
    
    /**
      * 获取屏幕亮度
      * @version 1.2.0
      */
    @JSGlobal("swan.getScreenBrightness")
    @js.native
    def getScreenBrightness(): Unit = js.native
    @JSGlobal("swan.getScreenBrightness")
    @js.native
    def getScreenBrightness(options: GetScreenBrightnessOptions): Unit = js.native
    
    /**
      * 获取用户的当前设置。
      * 注：返回值中只会出现小程序已经向用户请求过的权限。
      * @version 1.2.0
      */
    @JSGlobal("swan.getSetting")
    @js.native
    def getSetting(options: OpenSettingOptions): Unit = js.native
    
    /**
      * 获取转发详细信息
      * @version 1.1.0
      */
    @JSGlobal("swan.getShareInfo")
    @js.native
    def getShareInfo(): Unit = js.native
    @JSGlobal("swan.getShareInfo")
    @js.native
    def getShareInfo(options: GetShareInfoOptions): Unit = js.native
    
    /**
      * 从本地缓存中异步获取指定 key 对应的内容。
      */
    @JSGlobal("swan.getStorage")
    @js.native
    def getStorage(options: GetStorageOptions): Unit = js.native
    
    /**
      * 异步获取当前storage的相关信息
      */
    @JSGlobal("swan.getStorageInfo")
    @js.native
    def getStorageInfo(options: GetStorageInfoOptions): Unit = js.native
    
    @JSGlobal("swan.getStorageInfoSync")
    @js.native
    def getStorageInfoSync(): StorageInfo = js.native
    
    /**
      * 从本地缓存中同步获取指定 key 对应的内容。
      *
      */
    @JSGlobal("swan.getStorageSync")
    @js.native
    def getStorageSync(key: String): js.Any = js.native
    
    /**
      * 获取 swanid。
      */
    @JSGlobal("swan.getSwanId")
    @js.native
    def getSwanId(opt: SwanIdOptions): Unit = js.native
    
    /**
      * 获取系统信息。
      */
    @JSGlobal("swan.getSystemInfo")
    @js.native
    def getSystemInfo(options: GetSystemInfoOptions): Unit = js.native
    
    @JSGlobal("swan.getSystemInfoSync")
    @js.native
    def getSystemInfoSync(): SystemInfo = js.native
    
    @JSGlobal("swan.getUpdateManager")
    @js.native
    def getUpdateManager(): UpdateManager = js.native
    
    /**
      * 获取用户信息，需要先调用 swan.login 接口。
      */
    @JSGlobal("swan.getUserInfo")
    @js.native
    def getUserInfo(options: GetUserInfoOptions): Unit = js.native
    
    /**
      * 请求获取 Wi-Fi 列表
      * 在 onGetWifiList 注册的回调中返回 wifiList 数据。
      * iOS 将跳转到系统的 Wi-Fi 界面，Android 不会跳转。
      * iOS 11.0 及 iOS 11.1 两个版本因系统问题，该方法失效。但在 iOS 11.2 中已修复。
      * @version 1.6.0
      */
    @JSGlobal("swan.getWifiList")
    @js.native
    def getWifiList(): Unit = js.native
    @JSGlobal("swan.getWifiList")
    @js.native
    def getWifiList(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 收起键盘。
      */
    @JSGlobal("swan.hideKeyboard")
    @js.native
    def hideKeyboard(): Unit = js.native
    
    /**
      * 隐藏消息提示框
      */
    @JSGlobal("swan.hideLoading")
    @js.native
    def hideLoading(): Unit = js.native
    
    /**
      * 隐藏导航条加载动画。
      * @version 1.4.3
      */
    @JSGlobal("swan.hideNavigationBarLoading")
    @js.native
    def hideNavigationBarLoading(): Unit = js.native
    
    /**
      * 隐藏分享按钮
      * @version 1.1.0
      */
    @JSGlobal("swan.hideShareMenu")
    @js.native
    def hideShareMenu(): Unit = js.native
    @JSGlobal("swan.hideShareMenu")
    @js.native
    def hideShareMenu(options: ShareMenuOptions): Unit = js.native
    
    /**
      * 隐藏 tabBar
      * @version 1.9.0
      */
    @JSGlobal("swan.hideTabBar")
    @js.native
    def hideTabBar(options: ShowTabBarOptions): Unit = js.native
    
    /**
      * 隐藏 tabBar 某一项的右上角的红点
      * @version 1.9.0
      */
    @JSGlobal("swan.hideTabBarRedDot")
    @js.native
    def hideTabBarRedDot(option: TabBarBadgeOptions): Unit = js.native
    
    @JSGlobal("swan.hideToast")
    @js.native
    def hideToast(): Unit = js.native
    
    /**
      * 获取手百登录状态。手百登录状态 true: 已登录，false: 未登录
      */
    @JSGlobal("swan.isLoginSync")
    @js.native
    def isLoginSync(): Boolean = js.native
    
    /**
      * 提前下载好子包的资源，目录结构配置参考(https://smartprogram.baidu.com/docs/develop/framework/subpackages/)。
      */
    @JSGlobal("swan.loadSubPackage")
    @js.native
    def loadSubPackage(options: LoadSubPackageOptions): Unit = js.native
    
    /**
      * 调用接口获取登录凭证（code）进而换取用户登录态信息，
      * 包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）。
      * 用户数据的加解密通讯需要依赖会话密钥完成。
      */
    @JSGlobal("swan.login")
    @js.native
    def login(option: LoginOptions): Unit = js.native
    
    /**
      * 拨打电话
      */
    @JSGlobal("swan.makePhoneCall")
    @js.native
    def makePhoneCall(options: MakePhoneCallOptions): Unit = js.native
    
    /**
      * 关闭当前页面，回退前一页面。
      */
    @JSGlobal("swan.navigateBack")
    @js.native
    def navigateBack(): Unit = js.native
    @JSGlobal("swan.navigateBack")
    @js.native
    def navigateBack(options: NavigateBackOptions): Unit = js.native
    
    /**
      * 返回到上一个小程序，只有在当前小程序是被其他小程序打开时可以调用成功
      */
    @JSGlobal("swan.navigateBackMiniProgram")
    @js.native
    def navigateBackMiniProgram(options: NavigateBackMiniProgramOptions): Unit = js.native
    
    /**
      *  返回上一个小程序
      */
    @JSGlobal("swan.navigateBackSmartProgram")
    @js.native
    def navigateBackSmartProgram(options: navigateBackSmartProgramOptions): Unit = js.native
    
    /**
      * 保留当前页面，跳转到应用内的某个页面，使用swan.navigateBack可以返回到原页面。
      *
      * 注意：为了不让用户在使用小程序时造成困扰，
      * 我们规定页面路径只能是五层，请尽量避免多层级的交互方式。
      */
    @JSGlobal("swan.navigateTo")
    @js.native
    def navigateTo(options: NavigateToOptions): Unit = js.native
    
    /**
      * 打开同一公众号下关联的另一个小程序。
      */
    @JSGlobal("swan.navigateToMiniProgram")
    @js.native
    def navigateToMiniProgram(options: NavigateToMiniProgramOptions): Unit = js.native
    
    /**
      *  打开另一个小程序。
      */
    @JSGlobal("swan.navigateToSmartProgram")
    @js.native
    def navigateToSmartProgram(options: navigateToSmartProgramOptions): Unit = js.native
    
    /**
      * 用于延迟一部分操作到下一个时间片再执行（类似于 setTimeout）。
      * @param func
      * @version 2.2.3
      */
    @JSGlobal("swan.nextTick")
    @js.native
    def nextTick(func: js.Function0[_]): Unit = js.native
    
    /**
      * 启用低功耗蓝牙设备特征值变化时的 notify 功能。
      * 注意：必须设备的特征值支持notify才可以成功调用，具体参照 characteristic 的 properties 属性
      * 另外，必须先启用notify才能监听到设备 characteristicValueChange 事件
      */
    @JSGlobal("swan.notifyBLECharacteristicValueChanged")
    @js.native
    def notifyBLECharacteristicValueChanged(options: NotifyBLECharacteristicValueChanged): Unit = js.native
    
    /**
      * 监听重力感应数据，频率：5次/秒
      */
    @JSGlobal("swan.onAccelerometerChange")
    @js.native
    def onAccelerometerChange(callback: AccelerometerChangeCallback): Unit = js.native
    
    /**
      * 监听低功耗蓝牙设备的特征值变化。必须先启用notify接口才能接收到设备推送的notification。
      */
    @JSGlobal("swan.onBLECharacteristicValueChange")
    @js.native
    def onBLECharacteristicValueChange(callback: js.Function1[/* res */ DeviceId, Unit]): Unit = js.native
    
    /**
      * 监听低功耗蓝牙连接的错误事件，包括设备丢失，连接异常断开等等。
      */
    @JSGlobal("swan.onBLEConnectionStateChanged")
    @js.native
    def onBLEConnectionStateChanged(callback: js.Function1[/* res */ Connected, Unit]): Unit = js.native
    
    /**
      * 监听音乐暂停。
      * @deprecated 1.2.0
      */
    @JSGlobal("swan.onBackgroundAudioPause")
    @js.native
    def onBackgroundAudioPause(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听音乐播放。
      * @deprecated 1.2.0
      */
    @JSGlobal("swan.onBackgroundAudioPlay")
    @js.native
    def onBackgroundAudioPlay(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听音乐停止。
      * @deprecated 1.2.0
      */
    @JSGlobal("swan.onBackgroundAudioStop")
    @js.native
    def onBackgroundAudioStop(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听 iBeacon 服务的状态变化
      * @version 1.2.0
      */
    @JSGlobal("swan.onBeaconServiceChange")
    @js.native
    def onBeaconServiceChange(): Unit = js.native
    @JSGlobal("swan.onBeaconServiceChange")
    @js.native
    def onBeaconServiceChange(callback: js.Function2[/* available */ Boolean, /* discovering */ Boolean, Unit]): Unit = js.native
    
    /**
      * 监听 iBeacon 设备的更新事件
      * @version 1.2.0
      */
    @JSGlobal("swan.onBeaconUpdate")
    @js.native
    def onBeaconUpdate(): Unit = js.native
    @JSGlobal("swan.onBeaconUpdate")
    @js.native
    def onBeaconUpdate(callback: js.Function1[/* beacons */ js.Array[Beacon], Unit]): Unit = js.native
    
    /**
      * 监听蓝牙适配器状态变化事件
      * @version 1.1.0
      */
    @JSGlobal("swan.onBluetoothAdapterStateChange")
    @js.native
    def onBluetoothAdapterStateChange(callback: js.Function1[/* res */ BluetoothAdapterState, Unit]): Unit = js.native
    
    /**
      * 监听寻找到新设备的事件
      * @version 1.1.0
      */
    @JSGlobal("swan.onBluetoothDeviceFound")
    @js.native
    def onBluetoothDeviceFound(callback: js.Function1[/* res */ Devices, Unit]): Unit = js.native
    
    /**
      * 监听罗盘数据，频率：5次/秒，接口调用后会自动开始监听，可使用swan.stopCompass停止监听。
      */
    @JSGlobal("swan.onCompassChange")
    @js.native
    def onCompassChange(callback: CompassChangeCallback): Unit = js.native
    
    /**
      * 监听在获取到 Wi-Fi 列表数据时的事件，在回调中将返回 wifiList。
      * @version 1.6.0
      */
    @JSGlobal("swan.onGetWifiList")
    @js.native
    def onGetWifiList(): Unit = js.native
    @JSGlobal("swan.onGetWifiList")
    @js.native
    def onGetWifiList(callback: js.Function1[/* res */ GetWifiListOptions, Unit]): Unit = js.native
    
    // 内存
    @JSGlobal("swan.onMemoryWarning")
    @js.native
    def onMemoryWarning(callback: js.Function1[/* res */ Level, Unit]): Unit = js.native
    
    /**
      * 监听网络状态变化。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("swan.onNetworkStatusChange")
    @js.native
    def onNetworkStatusChange(callback: js.Function1[/* res */ IsConnected, Unit]): Unit = js.native
    
    /** 监听WebSocket关闭。 */
    @JSGlobal("swan.onSocketClose")
    @js.native
    def onSocketClose(callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
    
    /** 监听WebSocket错误。 */
    @JSGlobal("swan.onSocketError")
    @js.native
    def onSocketError(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    /**
      * 监听WebSocket接受到服务器的消息事件。
      */
    @JSGlobal("swan.onSocketMessage")
    @js.native
    def onSocketMessage(callback: js.Function1[/* res */ DataResponse, Unit]): Unit = js.native
    
    /** 监听WebSocket连接打开事件。 */
    @JSGlobal("swan.onSocketOpen")
    @js.native
    def onSocketOpen(callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
    
    /**
      * 监听用户主动截屏事件，用户使用系统截屏按键截屏时触发此事件
      * @version 1.4.0
      */
    @JSGlobal("swan.onUserCaptureScreen")
    @js.native
    def onUserCaptureScreen(): Unit = js.native
    @JSGlobal("swan.onUserCaptureScreen")
    @js.native
    def onUserCaptureScreen(callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
    
    /**
      * 监听连接上 Wi-Fi 的事件。
      * @version 1.6.0
      */
    @JSGlobal("swan.onWifiConnected")
    @js.native
    def onWifiConnected(): Unit = js.native
    @JSGlobal("swan.onWifiConnected")
    @js.native
    def onWifiConnected(callback: js.Function1[/* wifi */ WiFi, Unit]): Unit = js.native
    
    /**
      * 初始化蓝牙适配器
      * @version 1.1.0
      */
    @JSGlobal("swan.openBluetoothAdapter")
    @js.native
    def openBluetoothAdapter(options: OpenBluetoothAdapterOptions): Unit = js.native
    
    /**
      * 查看微信卡包中的卡券。
      *
      */
    @JSGlobal("swan.openCard")
    @js.native
    def openCard(options: OpenCardOptions): Unit = js.native
    
    /**
      * 新开页面打开文档，支持格式：doc, xls, ppt, pdf, docx, xlsx, pptx
      */
    @JSGlobal("swan.openDocument")
    @js.native
    def openDocument(options: OpenDocumentOptions): Unit = js.native
    
    /**
      * 使用微信内置地图查看位置
      */
    @JSGlobal("swan.openLocation")
    @js.native
    def openLocation(options: OpenLocationOptions): Unit = js.native
    
    /**
      * 调起客户端小程序设置界面，返回用户设置的操作结果。
      * 注：设置界面只会出现小程序已经向用户请求过的权限。
      * @version 1.1.0
      */
    @JSGlobal("swan.openSetting")
    @js.native
    def openSetting(options: OpenSettingOptions): Unit = js.native
    
    /**
      * 调起分享面板。
      * bug : 百度App Android 客户端 10.13 以下版本，点击分享
      * 面板的取消时,不会执行 fail 回调。
      */
    @JSGlobal("swan.openShare")
    @js.native
    def openShare(options: openShareOptions): Unit = js.native
    
    @JSGlobal("swan.pageScrollTo")
    @js.native
    def pageScrollTo(options: PageScrollToOptions): Unit = js.native
    
    /**
      * 暂停播放音乐。
      * @deprecated 1.2.0
      */
    @JSGlobal("swan.pauseBackgroundAudio")
    @js.native
    def pauseBackgroundAudio(): Unit = js.native
    @JSGlobal("swan.pauseBackgroundAudio")
    @js.native
    def pauseBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = js.native
    
    /**
      * 暂停正在播放的语音。
      * 再次调用swan.playVoice播放同一个文件时，会从暂停处开始播放。
      * 如果想从头开始播放，需要先调用 swan.stopVoice。
      * @deprecated 1.6.0
      */
    @JSGlobal("swan.pauseVoice")
    @js.native
    def pauseVoice(): Unit = js.native
    
    /**
      * 播放音乐，同时只能有一首音乐正在播放。
      * @deprecated 1.2.0
      */
    @JSGlobal("swan.playBackgroundAudio")
    @js.native
    def playBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = js.native
    
    /**
      * 开始播放语音，同时只允许一个语音文件正在播放，
      * 如果前一个语音文件还没播放完，将中断前一个语音播放。
      * @deprecated 1.6.0
      */
    @JSGlobal("swan.playVoice")
    @js.native
    def playVoice(options: PlayVoiceOptions): Unit = js.native
    
    /**
      * 预览图片。
      */
    @JSGlobal("swan.previewImage")
    @js.native
    def previewImage(options: PreviewImageOptions): Unit = js.native
    
    /**
      * 关闭所有页面，打开到应用内的某个页面。
      * @version 1.1.0
      */
    @JSGlobal("swan.reLaunch")
    @js.native
    def reLaunch(): Unit = js.native
    @JSGlobal("swan.reLaunch")
    @js.native
    def reLaunch(options: ReLaunchOptions): Unit = js.native
    
    /**
      * 读取低功耗蓝牙设备的特征值的二进制数据值。
      * 注意：必须设备的特征值支持read才可以成功调用，具体参照 characteristic 的 properties 属性
      */
    @JSGlobal("swan.readBLECharacteristicValue")
    @js.native
    def readBLECharacteristicValue(options: ReadBLECharacteristicValue): Unit = js.native
    
    /**
      * 关闭当前页面，跳转到应用内的某个页面。
      */
    @JSGlobal("swan.redirectTo")
    @js.native
    def redirectTo(options: RedirectToOptions): Unit = js.native
    
    /**
      * 删除本地存储的文件
      */
    @JSGlobal("swan.removeSavedFile")
    @js.native
    def removeSavedFile(options: RemoveSavedFileOptions): Unit = js.native
    
    @JSGlobal("swan.removeStorage")
    @js.native
    def removeStorage(options: RemoveStorageOptions): Unit = js.native
    
    @JSGlobal("swan.removeStorageSync")
    @js.native
    def removeStorageSync(key: String): DataResponse = js.native
    
    /**
      * 移除 tabBar 某一项右上角的文本
      * @version 1.9.0
      */
    @JSGlobal("swan.removeTabBarBadge")
    @js.native
    def removeTabBarBadge(options: TabBarBadgeOptions): Unit = js.native
    
    /**
      * 自定义分析数据上报接口。使用前，需要在小程序管理后台自定义分析中新建事件，配置好事件名与字段。
      *
      * @param eventName 事件名
      * @param data 上报的自定义数据
      */
    @JSGlobal("swan.reportAnalytics")
    @js.native
    def reportAnalytics(eventName: String, data: js.Object): Unit = js.native
    
    /**
      * 自定义业务数据监控上报接口。使用前，需要在小程序管理后台-运维中心-性能监控-业务数据监控中新建监控事件，
      * 配置监控描述与告警类型。每一个监控事件对应唯一的监控ID，开发者最多可以创建128个监控事件。
      * @param name 监控ID，在小程序管理后台新建数据指标后获得
      * @param value 上报数值，经处理后会在小程序管理后台上展示每分钟的上报总量
      */
    @JSGlobal("swan.reportMonitor")
    @js.native
    def reportMonitor(name: String, value: Double): Unit = js.native
    
    /**
      * swan.request发起的是https请求。一个微信小程序，同时只能有5个网络请求连接。
      */
    @JSGlobal("swan.request")
    @js.native
    def request(options: RequestOptions): RequestTask = js.native
    
    /**
      * 发起微信支付。
      */
    @JSGlobal("swan.requestPayment")
    @js.native
    def requestPayment(options: RequestPaymentOptions): Unit = js.native
    
    /**
      * 百度收银台。
      * @version 1.8.5
      */
    @JSGlobal("swan.requestPolymerPayment")
    @js.native
    def requestPolymerPayment(options: requestPolymerPaymentOptions): Unit = js.native
    
    /**
      * 保存文件到本地。
      * 本地文件存储的大小限制为 10M
      */
    @JSGlobal("swan.saveFile")
    @js.native
    def saveFile(options: SaveFileOptions): Unit = js.native
    
    /**
      * 保存图片到系统相册。
      * 需要用户授权 scope.writePhotosAlbum
      * @version 1.2.0
      */
    @JSGlobal("swan.saveImageToPhotosAlbum")
    @js.native
    def saveImageToPhotosAlbum(options: SaveImageToPhotosAlbumOptions): Unit = js.native
    
    /** 保存视频到系统相册。需要用户授权 scope.writePhotosAlbum */
    @JSGlobal("swan.saveVideoToPhotosAlbum")
    @js.native
    def saveVideoToPhotosAlbum(options: SaveVideoOptions): Unit = js.native
    
    /**
      * 调起客户端扫码界面，扫码成功后返回对应的结果
      */
    @JSGlobal("swan.scanCode")
    @js.native
    def scanCode(options: ScanCodeOptions): Unit = js.native
    
    /**
      * 控制音乐播放进度。
      * @deprecated 1.2.0
      */
    @JSGlobal("swan.seekBackgroundAudio")
    @js.native
    def seekBackgroundAudio(options: SeekBackgroundAudioOptions): Unit = js.native
    
    /**
      * 通过 WebSocket 连接发送数据，需要先 swan.connectSocket，
      * 并在 swan.onSocketOpen 回调之后才能发送。
      */
    @JSGlobal("swan.sendSocketMessage")
    @js.native
    def sendSocketMessage(options: SendSocketMessageOptions): Unit = js.native
    
    /**
      * 设置系统剪贴板的内容
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("swan.setClipboardData")
    @js.native
    def setClipboardData(options: SetClipboardDataOptions): Unit = js.native
    
    /**
      * 动态设置当前页面的标题。此方法为 web 版小程序专用方法，使用前需
      * 判断方法是否存在。
      */
    @JSGlobal("swan.setDocumentTitle")
    @js.native
    def setDocumentTitle(): Unit = js.native
    @JSGlobal("swan.setDocumentTitle")
    @js.native
    def setDocumentTitle(options: Title): Unit = js.native
    
    @JSGlobal("swan.setEnableDebug")
    @js.native
    def setEnableDebug(options: EnableDebugOptions): Unit = js.native
    
    /**
      * 设置是否保持常亮状态。
      * 仅在当前小程序生效，离开小程序后设置失效。
      * @version 1.4.0
      */
    @JSGlobal("swan.setKeepScreenOn")
    @js.native
    def setKeepScreenOn(): Unit = js.native
    @JSGlobal("swan.setKeepScreenOn")
    @js.native
    def setKeepScreenOn(options: SetKeepScreenOnOptions): Unit = js.native
    
    /**
      * 设置 web 版小程序 description meta 信息。此方法为 web 版小
      * 程序专用方法，使用前需判断方法是否存在。
      */
    @JSGlobal("swan.setMetaDescription")
    @js.native
    def setMetaDescription(): Unit = js.native
    @JSGlobal("swan.setMetaDescription")
    @js.native
    def setMetaDescription(content: MetaDescription): Unit = js.native
    
    /**
      * 设置 web 版小程序 keywords meta 信息。此方法为 web 版小程序专
      * 用方法，使用前需判断方法是否存在。
      */
    @JSGlobal("swan.setMetaKeywords")
    @js.native
    def setMetaKeywords(): Unit = js.native
    @JSGlobal("swan.setMetaKeywords")
    @js.native
    def setMetaKeywords(content: MetaKeywords): Unit = js.native
    
    /**
      * 设置导航颜色
      * @version 1.4.3
      */
    @JSGlobal("swan.setNavigationBarColor")
    @js.native
    def setNavigationBarColor(options: SetNavigationBarColorOptions): Unit = js.native
    
    /**
      * 动态设置当前页面的标题。
      * @version 1.4.3
      */
    @JSGlobal("swan.setNavigationBarTitle")
    @js.native
    def setNavigationBarTitle(options: SetNavigationBarTitleOptions): Unit = js.native
    
    /**
      * 设置屏幕亮度
      * @version 1.2.0
      */
    @JSGlobal("swan.setScreenBrightness")
    @js.native
    def setScreenBrightness(options: SetScreenBrightnessOptions): Unit = js.native
    
    /**
      * 将数据存储在本地缓存中指定的 key 中，
      * 会覆盖掉原来该 key 对应的内容，这是一个异步接口。
      */
    @JSGlobal("swan.setStorage")
    @js.native
    def setStorage(options: SetStorageOptions): Unit = js.native
    
    /**
      * 将 data 存储在本地缓存中指定的 key 中，
      * 会覆盖掉原来该 key 对应的内容，这是一个同步接口。
      *
      * @param key 本地缓存中的指定的 key
      * @param data 需要存储的内容
      */
    @JSGlobal("swan.setStorageSync")
    @js.native
    def setStorageSync(key: String, data: js.Any): Unit = js.native
    
    // 界面-----设置tabBar
    /**
      * 为 tabBar 某一项的右上角添加文本
      * @version 1.9.0
      */
    @JSGlobal("swan.setTabBarBadge")
    @js.native
    def setTabBarBadge(options: SetTabBarBadgeOptions): Unit = js.native
    
    /**
      * 动态设置 tabBar 某一项的内容
      * @version 1.9.0
      */
    @JSGlobal("swan.setTabBarItem")
    @js.native
    def setTabBarItem(options: SetTabBarItemOptions): Unit = js.native
    
    /**
      * 动态设置 tabBar 的整体样式
      * @version 1.9.0
      */
    @JSGlobal("swan.setTabBarStyle")
    @js.native
    def setTabBarStyle(options: SetTabBarStyleOptions): Unit = js.native
    
    /**
      * 动态设置置顶栏文字内容
      * 只有当前小程序被置顶时能生效，如果当前小程序没有被置顶，也能调用成功，但是不会立即生效
      * 只有在用户将这个小程序置顶后才换上设置的文字内容。
      * 注意：调用成功后，需间隔 5s 才能再次调用此接口，如果在 5s 内再次调用此接口，会回调
      * fail，errMsg："setTopBarText: fail invoke too frequently"
      * @version 1.4.3
      */
    @JSGlobal("swan.setTopBarText")
    @js.native
    def setTopBarText(): Unit = js.native
    @JSGlobal("swan.setTopBarText")
    @js.native
    def setTopBarText(options: SetTopBarTextOptions): Unit = js.native
    
    /**
      * iOS特有接口 在 onGetWifiList 回调后，利用接口设置 wifiList 中 AP 的相关信息。
      * 注意：
      * + 该接口只能在 onGetWifiList 回调之后才能调用。
      * + 此时客户端会挂起，等待小程序设置 Wi-Fi 信息，请务必尽快调用该接口，若无数据请传入一个空数组。
      * + 有可能随着周边 Wi-Fi 列表的刷新，单个流程内收到多次带有存在重复的 Wi-Fi 列表的回调。
      * @version 1.6.0
      */
    @JSGlobal("swan.setWifiList")
    @js.native
    def setWifiList(options: SetWifiListOptions): Unit = js.native
    
    /**
      * 显示操作菜单
      */
    @JSGlobal("swan.showActionSheet")
    @js.native
    def showActionSheet(options: ActionSheetOptions): Unit = js.native
    
    /**
      * 显示 loading 提示框, 需主动调用 swan.hideLoading 才能关闭提示框
      */
    @JSGlobal("swan.showLoading")
    @js.native
    def showLoading(options: LoadingOptions): Unit = js.native
    
    /**
      * 显示模态弹窗
      */
    @JSGlobal("swan.showModal")
    @js.native
    def showModal(options: ModalOptions): Unit = js.native
    
    /**
      * 在当前页面显示导航条加载动画。
      * @version 1.4.3
      */
    @JSGlobal("swan.showNavigationBarLoading")
    @js.native
    def showNavigationBarLoading(): Unit = js.native
    
    /**
      * 显示分享按钮
      *
      */
    @JSGlobal("swan.showShareMenu")
    @js.native
    def showShareMenu(): Unit = js.native
    @JSGlobal("swan.showShareMenu")
    @js.native
    def showShareMenu(options: ShareMenuOptions): Unit = js.native
    
    /**
      * 显示 tabBar
      * @version 1.9.0
      */
    @JSGlobal("swan.showTabBar")
    @js.native
    def showTabBar(options: ShowTabBarOptions): Unit = js.native
    
    /**
      * 显示 tabBar 某一项的右上角的红点
      * @version 1.9.0
      */
    @JSGlobal("swan.showTabBarRedDot")
    @js.native
    def showTabBarRedDot(option: TabBarBadgeOptions): Unit = js.native
    
    /**
      * 显示消息提示框
      */
    @JSGlobal("swan.showToast")
    @js.native
    def showToast(options: ToastOptions): Unit = js.native
    
    /**
      * 开始监听加速度数据。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("swan.startAccelerometer")
    @js.native
    def startAccelerometer(options: AccelerometerOptions): Unit = js.native
    
    /**
      * 开始搜索附近的iBeacon设备
      * @version 1.2.0
      */
    @JSGlobal("swan.startBeaconDiscovery")
    @js.native
    def startBeaconDiscovery(options: StartBeaconDiscoveryOptions): Unit = js.native
    
    /**
      * 开始监听罗盘数据。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("swan.startCompass")
    @js.native
    def startCompass(): Unit = js.native
    @JSGlobal("swan.startCompass")
    @js.native
    def startCompass(options: CompassOptions): Unit = js.native
    
    // 页面-----下拉刷新
    /**
      * 开始下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致
      * @version 1.5.0
      */
    @JSGlobal("swan.startPullDownRefresh")
    @js.native
    def startPullDownRefresh(): Unit = js.native
    @JSGlobal("swan.startPullDownRefresh")
    @js.native
    def startPullDownRefresh(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 开始录音。当主动调用swan.stopRecord，
      * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
      * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
      * 如需持久保存，需在主动调用swan.saveFile，在小程序下次启动时才能访问得到。
      * @deprecated 1.6.0
      */
    @JSGlobal("swan.startRecord")
    @js.native
    def startRecord(options: StartRecordAudioOptions): Unit = js.native
    
    // 设备-----Wi-Fi
    /**
      * 初始化 Wi-Fi 模块。
      * @version 1.6.0
      */
    @JSGlobal("swan.startWifi")
    @js.native
    def startWifi(): Unit = js.native
    @JSGlobal("swan.startWifi")
    @js.native
    def startWifi(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 停止监听加速度数据。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("swan.stopAccelerometer")
    @js.native
    def stopAccelerometer(): Unit = js.native
    @JSGlobal("swan.stopAccelerometer")
    @js.native
    def stopAccelerometer(options: AccelerometerOptions): Unit = js.native
    
    /**
      * 停止播放音乐。
      * @deprecated 1.2.0
      */
    @JSGlobal("swan.stopBackgroundAudio")
    @js.native
    def stopBackgroundAudio(): Unit = js.native
    @JSGlobal("swan.stopBackgroundAudio")
    @js.native
    def stopBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = js.native
    
    /**
      * 停止搜索附近的iBeacon设备
      * @version 1.2.0
      */
    @JSGlobal("swan.stopBeaconDiscovery")
    @js.native
    def stopBeaconDiscovery(options: StopBeaconDiscoveryOptions): Unit = js.native
    
    /**
      * 停止搜寻附近的蓝牙外围设备。请在确保找到需要连接的设备后调用该方法停止搜索。
      * @version 1.1.0
      */
    @JSGlobal("swan.stopBluetoothDevicesDiscovery")
    @js.native
    def stopBluetoothDevicesDiscovery(options: StopBluetoothDevicesDiscoveryOptions): Unit = js.native
    
    @JSGlobal("swan.stopCompass")
    @js.native
    def stopCompass(): Unit = js.native
    @JSGlobal("swan.stopCompass")
    @js.native
    def stopCompass(options: CompassOptions): Unit = js.native
    
    /**
      * 停止当前页面下拉刷新
      * @version 1.5.0
      */
    @JSGlobal("swan.stopPullDownRefresh")
    @js.native
    def stopPullDownRefresh(): Unit = js.native
    @JSGlobal("swan.stopPullDownRefresh")
    @js.native
    def stopPullDownRefresh(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 主动调用停止录音。
      */
    @JSGlobal("swan.stopRecord")
    @js.native
    def stopRecord(): Unit = js.native
    @JSGlobal("swan.stopRecord")
    @js.native
    def stopRecord(options: StopRecordAudioOptions): Unit = js.native
    
    /**
      * 结束播放语音。
      * @deprecated 1.6.0
      */
    @JSGlobal("swan.stopVoice")
    @js.native
    def stopVoice(): Unit = js.native
    
    /**
      * 关闭 Wi-Fi 模块。
      * @version 1.6.0
      */
    @JSGlobal("swan.stopWifi")
    @js.native
    def stopWifi(): Unit = js.native
    @JSGlobal("swan.stopWifi")
    @js.native
    def stopWifi(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
      */
    @JSGlobal("swan.switchTab")
    @js.native
    def switchTab(options: SwitchTabOptions): Unit = js.native
    
    /**
      * 更新转发属性
      * @version 1.2.0
      */
    @JSGlobal("swan.updateShareMenu")
    @js.native
    def updateShareMenu(): Unit = js.native
    @JSGlobal("swan.updateShareMenu")
    @js.native
    def updateShareMenu(options: UpdateShareMenuOptions): Unit = js.native
    
    /**
      * 将本地资源上传到开发者服务器。
      * 如页面通过 swan.chooseImage 等接口获取到一个本地资源的临时文件路径后，
      * 可通过此接口将本地资源上传到指定服务器。
      * 客户端发起一个 HTTPS POST 请求，
      * 其中 Content-Type 为 multipart/form-data 。
      */
    @JSGlobal("swan.uploadFile")
    @js.native
    def uploadFile(options: UploadFileOptions): UploadTask = js.native
    
    /**
      * swanid有效性校验接口：true表示有效，false表示无效。
      */
    @JSGlobal("swan.verify")
    @js.native
    def verify(options: verifyOptions): Unit = js.native
    
    // 设备-----震动
    /**
      * 使手机发生较长时间的振动（400ms）
      * @version 1.2.0
      */
    @JSGlobal("swan.vibrateLong")
    @js.native
    def vibrateLong(): Unit = js.native
    @JSGlobal("swan.vibrateLong")
    @js.native
    def vibrateLong(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 使手机发生较短时间的振动（15ms）
      * @version 1.2.0
      */
    @JSGlobal("swan.vibrateShort")
    @js.native
    def vibrateShort(): Unit = js.native
    @JSGlobal("swan.vibrateShort")
    @js.native
    def vibrateShort(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 向低功耗蓝牙设备特征值中写入二进制数据。
      * 注意：必须设备的特征值支持write才可以成功调用，具体参照 characteristic 的 properties 属性
      * tips: 并行调用多次读写接口存在读写失败的可能性
      */
    @JSGlobal("swan.writeBLECharacteristicValue")
    @js.native
    def writeBLECharacteristicValue(options: WriteBLECharacteristicValue): Unit = js.native
  }
}
