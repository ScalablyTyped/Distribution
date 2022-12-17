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
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * App() 函数用来注册一个小程序。
    * 接受一个 object 参数，其指定小程序的生命周期函数等。
    */
  inline def App[T /* <: AppOptions */](app: T & (ThisType[T & typings.baiduApp.swan.App])): Unit = js.Dynamic.global.applyDynamic("App")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * behaviors 是用于组件间代码共享的特性
    * 类似于一些编程语言中的“mixins”或“traits”
    * 每个 behavior 可以包含一组属性、数据、生命周期函数和方法
    * 组件引用它时，它的属性、数据和方法会被合并到组件中，生命周期函数也会在对应时机被调用
    * 每个组件可以引用多个 behavior
    * behavior 也可以引用其他 behavior
    */
  inline def Behavior[D, M, P](): ExtendedComponent[Component[D, P], D, M, P] = js.Dynamic.global.applyDynamic("Behavior")().asInstanceOf[ExtendedComponent[Component[D, P], D, M, P]]
  inline def Behavior[D, M, P](options: ThisTypedComponentOptionsWithRecordProps[Component[D, P], D, M, P]): ExtendedComponent[Component[D, P], D, M, P] = js.Dynamic.global.applyDynamic("Behavior")(options.asInstanceOf[js.Any]).asInstanceOf[ExtendedComponent[Component[D, P], D, M, P]]
  
  // #endregion
  // #region Compontent组件
  inline def Component[D, M, P](): ExtendedComponent[typings.baiduApp.swan.Component[D, P], D, M, P] = js.Dynamic.global.applyDynamic("Component")().asInstanceOf[ExtendedComponent[typings.baiduApp.swan.Component[D, P], D, M, P]]
  inline def Component[D, M, P](options: ThisTypedComponentOptionsWithRecordProps[typings.baiduApp.swan.Component[D, P], D, M, P]): ExtendedComponent[typings.baiduApp.swan.Component[D, P], D, M, P] = js.Dynamic.global.applyDynamic("Component")(options.asInstanceOf[js.Any]).asInstanceOf[ExtendedComponent[typings.baiduApp.swan.Component[D, P], D, M, P]]
  
  // #endregion
  // #region Page
  /**
    * Page() 函数用来注册一个页面。
    * 接受一个 object 参数，其指定页面的初始数据、生命周期函数、事件处理函数等。
    */
  inline def Page[T /* <: PageOptions */](page: T & (ThisType[T & (typings.baiduApp.swan.Page[js.Object, js.Object])])): Unit = js.Dynamic.global.applyDynamic("Page")(page.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * 获取小程序实例
    */
  inline def getApp(): App = js.Dynamic.global.applyDynamic("getApp")().asInstanceOf[App]
  
  /**
    * getCurrentPages() 函数用于获取当前页面栈的实例，
    * 以数组形式按栈的顺序给出，第一个元素为首页，最后一个元素为当前页面。
    */
  inline def getCurrentPages(): js.Array[Page[js.Object, js.Object]] = js.Dynamic.global.applyDynamic("getCurrentPages")().asInstanceOf[js.Array[Page[js.Object, js.Object]]]
  
  object swan {
    
    @JSGlobal("swan")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 批量添加卡券。
      */
    inline def addCard(options: CardOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCard")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 增加 手机联系人
      * 调用后，用户可以选择将该表单以“新增联系人”或“添加到已有联系人”的方式
      * 写入手机系统通讯录
      * 完成手机通讯录联系人和联系方式的增加。
      * @version 1.2.0
      */
    inline def addPhoneContact(options: PhoneContact): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPhoneContact")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 在接入AI之前需要使用管理员权限操作详细情况官网
      * https://smartprogram.baidu.com/docs/develop/api/ai/
      */
    // #region AI
    object ai {
      
      @JSGlobal("swan.ai")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * 通用物体及场景识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图片中的多个物体及场景标签。
        */
      inline def advancedGeneralIdentify(options: GeneralIdentifyOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("advancedGeneralIdentify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 用于检测和识别图片中的动物信息
        */
      inline def animalClassify(options: animalClassifyOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("animalClassify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 用于检测一张车辆图片的具体车型，即对于输入的一张图片（可正常解码，且长
        * 宽比适宜），输出图片的车辆品牌及型号、颜色及年份、位置信息。
        */
      inline def carClassify(options: carClassifyOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("carClassify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 用于菜品识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图
        * 片的菜品名称、卡路里信息、置信度。
        */
      inline def dishClassify(options: dishClassifyOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dishClassify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 获取全局唯一的语音识别器voiceRecognizer。
        */
      inline def getVoiceRecognizer(): VoiceRecognizerTask = ^.asInstanceOf[js.Dynamic].applyDynamic("getVoiceRecognizer")().asInstanceOf[VoiceRecognizerTask]
      
      /**
        * 自定义图像审核。
        */
      inline def imageAudit(options: imageAuditOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("imageAudit")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 用于检测和识别图片中的品牌 LOGO 信息
        */
      inline def logoClassify(options: logoClassifyOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoClassify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 用户向服务请求检测图像中的主体位置。
        */
      inline def objectDetectIdentify(options: DetectIdentifyOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("objectDetectIdentify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 识别银行卡并返回卡号、发卡行和卡片类型。
        */
      inline def ocrBankCard(options: ocrBankCardOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ocrBankCard")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 对机动车驾驶证所有关键字段进行识别。
        */
      inline def ocrDrivingLicense(options: ocrDrivingLicenseOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ocrDrivingLicense")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 用户向服务请求识别身份证，身份证识别包括正面和背面。
        */
      inline def ocrIdCard(options: ocrIdCardOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ocrIdCard")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 对机动车行驶证正本所有关键字段进行识别
        */
      inline def ocrVehicleLicense(options: ocrVehicleLicenseOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ocrVehicleLicense")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 用于检测和识别图片中的植物信息
        */
      inline def plantClassify(options: plantClassifyOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plantClassify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 运用业界领先的深度学习技术，判断一段文本内容是否符合网络发文规范，实现
        * 自动化、智能化的文本审核。
        */
      inline def textReview(options: textReviewOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("textReview")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 将文本转换为可以播放的mp3文件。
        */
      inline def textToAudio(options: textToAudioOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("textToAudio")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    // #endregion
    // #region 拓展接口
    /**
      * 将 ArrayBuffer 数据转成 Base64 字符串
      *
      */
    inline def arrayBufferToBase64(arrayBuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToBase64")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * 提前向用户发起授权请求。
      * 调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，
      * 但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
      */
    inline def authorize(options: AuthorizeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 将 Base64 字符串转成 ArrayBuffer 数据
      *
      */
    inline def base64ToArrayBuffer(base64: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("base64ToArrayBuffer")(base64.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
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
    inline def canIUse(api: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canIUse")(api.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * 返回一个数组，用来描述 canvas 区域隐含的像素数据
      * @version 1.9.0
      */
    inline def canvasGetImageData(options: CanvasImageDataOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("canvasGetImageData")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 将像素数据绘制到画布的方法
      * @version 1.9.0
      */
    inline def canvasPutImageData(options: CanvasPutImageDataOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("canvasPutImageData")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 把当前画布的内容导出生成图片，并返回文件路径
      */
    inline def canvasToTempFilePath(options: PartialCanvasToTempFilePa): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("canvasToTempFilePath")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 调用接口 swan.login 获取 Authorization Code，智能小程序可以使用
      * swan.login()接口获取Authorization Code。
      */
    inline def checkSession(options: CheckSessionOption): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSession")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def chooseAddress(options: ChooseAddressOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseAddress")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 从本地相册选择图片或使用相机拍照。
      */
    inline def chooseImage(options: ChooseImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseImage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 选择用户的发票抬头。
      */
    inline def chooseInvoiceTitle(options: ChooseInvoiceTitleOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseInvoiceTitle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开地图选择位置
      */
    inline def chooseLocation(options: ChooseLocationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseLocation")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 拍摄视频或从手机相册中选视频，返回视频的临时文件路径。
      */
    inline def chooseVideo(options: ChooseVideoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseVideo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 清理本地数据缓存。
      */
    inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
    
    /**
      * 同步清理本地数据缓存
      */
    inline def clearStorageSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorageSync")().asInstanceOf[Unit]
    
    /**
      * 断开与低功耗蓝牙设备的连接
      * @version 1.1.0
      */
    inline def closeBLEConnection(options: CloseBLEConnectionOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeBLEConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭蓝牙模块。调用该方法将断开所有已建立的链接并释放系统资源
      * @version 1.1.0
      */
    inline def closeBluetoothAdapter(options: CloseBluetoothAdapterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeBluetoothAdapter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭WebSocket连接。
      */
    inline def closeSocket(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSocket")().asInstanceOf[Unit]
    inline def closeSocket(options: CloseSocketOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSocket")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 创建一个 WebSocket 连接；
      * 一个微信小程序同时只能有一个 WebSocket 连接，
      * 如果当前已存在一个 WebSocket 连接，
      * 会自动关闭该连接，并重新创建一个 WebSocket 连接。
      */
    inline def connectSocket(options: ConnectSocketOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSocket")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 连接 Wi-Fi。
      * 若已知 Wi-Fi 信息，可以直接利用该接口连接。
      * 仅 Android 与 iOS 11 以上版本支持。
      * @version 1.6.0
      */
    inline def connectWifi(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectWifi")().asInstanceOf[Unit]
    inline def connectWifi(options: ConnectWiFiOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectWifi")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 创建一个动画实例animation。调用实例的方法来描述动画。
      * 最后通过动画实例的export方法导出动画数据传递给组件的animation属性。
      *
      * 注意: export 方法每次调用后会清掉之前的动画操作
      */
    inline def createAnimation(): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")().asInstanceOf[Animation]
    inline def createAnimation(options: CreateAnimationOptions): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(options.asInstanceOf[js.Any]).asInstanceOf[Animation]
    
    /**
      * 低功耗蓝牙接口
      * @version 1.1.0
      */
    inline def createBLEConnection(options: CreateBLEConnectionOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLEConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 创建并返回 camera 上下文 cameraContext 对象
      * cameraContext 与页面的 camera 组件绑定
      * 一个页面只能有一个camera，通过它可以操作对应的 <camera/> 组件。
      * 在自定义组件下，第一个参数传入组件实例this，以操作组件内 <camera/> 组件
      * @version 1.6.0
      */
    inline def createCameraContext(): CameraContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createCameraContext")().asInstanceOf[CameraContext]
    inline def createCameraContext(instance: Any): CameraContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createCameraContext")(instance.asInstanceOf[js.Any]).asInstanceOf[CameraContext]
    
    /**
      * 创建并返回绘图上下文context对象。
      * context只是一个记录方法调用的容器，
      * 用于生成记录绘制行为的actions数组。c
      * ontext跟<canvas/>不存在对应关系，
      * 一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
      */
    inline def createCanvasContext(selector: String): CanvasContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext")(selector.asInstanceOf[js.Any]).asInstanceOf[CanvasContext]
    
    /**
      * 创建并返回内部 audio 上下文 innerAudioContext 对象。
      */
    inline def createInnerAudioContext(): InnerAudioContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createInnerAudioContext")().asInstanceOf[InnerAudioContext]
    
    inline def createIntersectionObserver(context: Component[Any, Any]): IntersectionObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntersectionObserver")(context.asInstanceOf[js.Any]).asInstanceOf[IntersectionObserver]
    inline def createIntersectionObserver(context: Component[Any, Any], options: CreateIntersectionObserverOption): IntersectionObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("createIntersectionObserver")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IntersectionObserver]
    
    /**
      * 操作对应的 <live-player/> 组件。
      * 创建并返回 live-player 上下文 LivePlayerContext 对象。
      * 在自定义组件下，第二个参数传入组件实例this，以操作组件内 <live-player/> 组件
      * @version 1.7.0
      */
    inline def createLivePlayerContext(id: String, instance: Any): LivePlayerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createLivePlayerContext")(id.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[LivePlayerContext]
    
    /**
      * 创建并返回 map 上下文 mapContext 对象
      */
    inline def createMapContext(mapId: String): MapContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createMapContext")(mapId.asInstanceOf[js.Any]).asInstanceOf[MapContext]
    
    /**
      * 返回一个SelectorQuery对象实例。
      * 可以在这个实例上使用select等方法选择节点，并使用boundingClientRect等方法选择需要查询的信息。
      * @version 1.4.0
      */
    inline def createSelectorQuery(): SelectorQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("createSelectorQuery")().asInstanceOf[SelectorQuery]
    
    /**
      * 创建并返回 video 上下文 videoContext 对象
      * @param videoId video标签id <video  src="{{src}}" id="myVideo" ></video>
      */
    inline def createVideoContext(videoId: String): VideoContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createVideoContext")(videoId.asInstanceOf[js.Any]).asInstanceOf[VideoContext]
    
    /**
      * 下载文件资源到本地。客户端直接发起一个 HTTP GET 请求，
      * 把下载到的资源根据 type 进行处理，并返回文件的本地临时路径。
      */
    inline def downloadFile(options: DownloadFileOptions): DownloadTask = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(options.asInstanceOf[js.Any]).asInstanceOf[DownloadTask]
    
    /**
      * 绘制画布
      */
    inline def drawCanvas(options: DrawCanvasOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvas")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取当前账号信息
      * @version >= 2.2.2
      */
    inline def getAccountInfoSync(): AccountInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfoSync")().asInstanceOf[AccountInfo]
    
    /**
      * 获取蓝牙设备所有 characteristic（特征值）
      */
    inline def getBLEDeviceCharacteristics(options: GetBLEDeviceCharacteristicsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBLEDeviceCharacteristics")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取蓝牙设备所有 service（服务）
      */
    inline def getBLEDeviceServices(options: GetBLEDeviceServicesOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBLEDeviceServices")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取全局唯一的背景音频管理器 backgroundAudioManager。
      * @version 1.2.0
      */
    inline def getBackgroundAudioManager(): BackgroundAudioManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundAudioManager")().asInstanceOf[BackgroundAudioManager]
    
    /**
      * 获取音乐播放状态。
      * @deprecated 1.2.0
      */
    inline def getBackgroundAudioPlayerState(options: GetBackgroundAudioPlayerStateOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundAudioPlayerState")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取所有已搜索到的iBeacon设备
      * @version 1.2.0
      */
    inline def getBeacons(options: GetBeaconsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBeacons")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取本机蓝牙适配器状态
      * @version 1.1.0
      */
    inline def getBluetoothAdapterState(options: GetBluetoothAdapterStateOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBluetoothAdapterState")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取所有已发现的蓝牙设备，包括已经和本机处于连接状态的设备
      */
    inline def getBluetoothDevices(options: GetBluetoothDevicesOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBluetoothDevices")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取系统剪贴板内容
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    inline def getClipboardData(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getClipboardData")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 根据 uuid 获取处于已连接状态的设备
      * @version 1.1.0
      */
    inline def getConnectedBluetoothDevices(options: GetConnectedBluetoothDevicesOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnectedBluetoothDevices")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取已连接中的 Wi-Fi 信息
      * @version 1.6.0
      */
    inline def getConnectedWifi(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnectedWifi")().asInstanceOf[Unit]
    inline def getConnectedWifi(options: GetConnectedWifiOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnectedWifi")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getEnvInfoSync(): EnvInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvInfoSync")().asInstanceOf[EnvInfo]
    
    /**
      * 获取第三方平台自定义的数据字段。
      * @version 1.1.0
      */
    inline def getExtConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtConfig")().asInstanceOf[Unit]
    inline def getExtConfig(options: GetExtConfigOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取第三方平台自定义的数据字段的同步接口。
      * @version 1.1.0
      */
    inline def getExtConfigSync(): ExtConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtConfigSync")().asInstanceOf[ExtConfig]
    
    /**
      *  获取文件信息
      * @version 1.4.0
      */
    inline def getFileInfo(options: GetFileInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取图片信息
      */
    inline def getImageInfo(options: GetImageInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取当前的地理位置、速度。
      */
    inline def getLocation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")().asInstanceOf[Unit]
    inline def getLocation(options: GetLocationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // #region LogManager
    /**
      * 获取日志管理器 logManager 对象。logManager提供log、info、warn、debug四个方法写日志到文件，
      * 这四个方法接受任意个类型为Object/Array/Number/String的参数，
      * 每次调用的参数的总大小不超过100Kb。最多保存5M的日志内容，超过5M后，旧的日志内容会被删除。
      * 用户可以通过设置Button组件的open-type为feedback来上传打印的日志。
      * 用户上传的日志可以通过登录小程序管理后台后进入左侧菜单“客服反馈”页面获取到。
      */
    inline def getLogManager(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogManager")().asInstanceOf[Logger]
    
    /**
      * 获取网络类型。
      */
    inline def getNetworkType(options: GetNetworkTypeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkType")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取全局唯一的录音管理器 recorderManager
      * @version 1.6.0
      */
    inline def getRecorderManager(): RecorderManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecorderManager")().asInstanceOf[RecorderManager]
    
    /**
      * 获取本地文件的文件信息
      */
    inline def getSavedFileInfo(options: GetSavedFileInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSavedFileInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取本地已保存的文件列表
      */
    inline def getSavedFileList(options: GetSavedFileListOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSavedFileList")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取屏幕亮度
      * @version 1.2.0
      */
    inline def getScreenBrightness(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenBrightness")().asInstanceOf[Unit]
    inline def getScreenBrightness(options: GetScreenBrightnessOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenBrightness")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取用户的当前设置。
      * 注：返回值中只会出现小程序已经向用户请求过的权限。
      * @version 1.2.0
      */
    inline def getSetting(options: OpenSettingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSetting")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取转发详细信息
      * @version 1.1.0
      */
    inline def getShareInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getShareInfo")().asInstanceOf[Unit]
    inline def getShareInfo(options: GetShareInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getShareInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 从本地缓存中异步获取指定 key 对应的内容。
      */
    inline def getStorage(options: GetStorageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 异步获取当前storage的相关信息
      */
    inline def getStorageInfo(options: GetStorageInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorageInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getStorageInfoSync(): StorageInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorageInfoSync")().asInstanceOf[StorageInfo]
    
    /**
      * 从本地缓存中同步获取指定 key 对应的内容。
      *
      */
    inline def getStorageSync(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorageSync")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * 获取 swanid。
      */
    inline def getSwanId(opt: SwanIdOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwanId")(opt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取系统信息。
      */
    inline def getSystemInfo(options: GetSystemInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getSystemInfoSync(): SystemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemInfoSync")().asInstanceOf[SystemInfo]
    
    inline def getUpdateManager(): UpdateManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateManager")().asInstanceOf[UpdateManager]
    
    /**
      * 获取用户信息，需要先调用 swan.login 接口。
      */
    inline def getUserInfo(options: GetUserInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 请求获取 Wi-Fi 列表
      * 在 onGetWifiList 注册的回调中返回 wifiList 数据。
      * iOS 将跳转到系统的 Wi-Fi 界面，Android 不会跳转。
      * iOS 11.0 及 iOS 11.1 两个版本因系统问题，该方法失效。但在 iOS 11.2 中已修复。
      * @version 1.6.0
      */
    inline def getWifiList(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getWifiList")().asInstanceOf[Unit]
    inline def getWifiList(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getWifiList")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 收起键盘。
      */
    inline def hideKeyboard(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideKeyboard")().asInstanceOf[Unit]
    
    /**
      * 隐藏消息提示框
      */
    inline def hideLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideLoading")().asInstanceOf[Unit]
    
    /**
      * 隐藏导航条加载动画。
      * @version 1.4.3
      */
    inline def hideNavigationBarLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideNavigationBarLoading")().asInstanceOf[Unit]
    
    /**
      * 隐藏分享按钮
      * @version 1.1.0
      */
    inline def hideShareMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideShareMenu")().asInstanceOf[Unit]
    inline def hideShareMenu(options: ShareMenuOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideShareMenu")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 隐藏 tabBar
      * @version 1.9.0
      */
    inline def hideTabBar(options: ShowTabBarOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideTabBar")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 隐藏 tabBar 某一项的右上角的红点
      * @version 1.9.0
      */
    inline def hideTabBarRedDot(option: TabBarBadgeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideTabBarRedDot")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def hideToast(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideToast")().asInstanceOf[Unit]
    
    /**
      * 获取手百登录状态。手百登录状态 true: 已登录，false: 未登录
      */
    inline def isLoginSync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoginSync")().asInstanceOf[Boolean]
    
    /**
      * 提前下载好子包的资源，目录结构配置参考(https://smartprogram.baidu.com/docs/develop/framework/subpackages/)。
      */
    inline def loadSubPackage(options: LoadSubPackageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSubPackage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 调用接口获取登录凭证（code）进而换取用户登录态信息，
      * 包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）。
      * 用户数据的加解密通讯需要依赖会话密钥完成。
      */
    inline def login(option: LoginOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("login")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 拨打电话
      */
    inline def makePhoneCall(options: MakePhoneCallOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makePhoneCall")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭当前页面，回退前一页面。
      */
    inline def navigateBack(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")().asInstanceOf[Unit]
    inline def navigateBack(options: NavigateBackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 返回到上一个小程序，只有在当前小程序是被其他小程序打开时可以调用成功
      */
    inline def navigateBackMiniProgram(options: NavigateBackMiniProgramOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBackMiniProgram")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *  返回上一个小程序
      */
    inline def navigateBackSmartProgram(options: navigateBackSmartProgramOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBackSmartProgram")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 保留当前页面，跳转到应用内的某个页面，使用swan.navigateBack可以返回到原页面。
      *
      * 注意：为了不让用户在使用小程序时造成困扰，
      * 我们规定页面路径只能是五层，请尽量避免多层级的交互方式。
      */
    inline def navigateTo(options: NavigateToOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开同一公众号下关联的另一个小程序。
      */
    inline def navigateToMiniProgram(options: NavigateToMiniProgramOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateToMiniProgram")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *  打开另一个小程序。
      */
    inline def navigateToSmartProgram(options: navigateToSmartProgramOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateToSmartProgram")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 用于延迟一部分操作到下一个时间片再执行（类似于 setTimeout）。
      * @param func
      * @version 2.2.3
      */
    inline def nextTick(func: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 启用低功耗蓝牙设备特征值变化时的 notify 功能。
      * 注意：必须设备的特征值支持notify才可以成功调用，具体参照 characteristic 的 properties 属性
      * 另外，必须先启用notify才能监听到设备 characteristicValueChange 事件
      */
    inline def notifyBLECharacteristicValueChanged(options: NotifyBLECharacteristicValueChanged): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyBLECharacteristicValueChanged")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听重力感应数据，频率：5次/秒
      */
    inline def onAccelerometerChange(callback: AccelerometerChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAccelerometerChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听低功耗蓝牙设备的特征值变化。必须先启用notify接口才能接收到设备推送的notification。
      */
    inline def onBLECharacteristicValueChange(callback: js.Function1[/* res */ DeviceId, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBLECharacteristicValueChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听低功耗蓝牙连接的错误事件，包括设备丢失，连接异常断开等等。
      */
    inline def onBLEConnectionStateChanged(callback: js.Function1[/* res */ Connected, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBLEConnectionStateChanged")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听音乐暂停。
      * @deprecated 1.2.0
      */
    inline def onBackgroundAudioPause(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundAudioPause")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听音乐播放。
      * @deprecated 1.2.0
      */
    inline def onBackgroundAudioPlay(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundAudioPlay")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听音乐停止。
      * @deprecated 1.2.0
      */
    inline def onBackgroundAudioStop(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundAudioStop")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听 iBeacon 服务的状态变化
      * @version 1.2.0
      */
    inline def onBeaconServiceChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeaconServiceChange")().asInstanceOf[Unit]
    inline def onBeaconServiceChange(callback: js.Function2[/* available */ Boolean, /* discovering */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeaconServiceChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听 iBeacon 设备的更新事件
      * @version 1.2.0
      */
    inline def onBeaconUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeaconUpdate")().asInstanceOf[Unit]
    inline def onBeaconUpdate(callback: js.Function1[/* beacons */ js.Array[Beacon], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeaconUpdate")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听蓝牙适配器状态变化事件
      * @version 1.1.0
      */
    inline def onBluetoothAdapterStateChange(callback: js.Function1[/* res */ BluetoothAdapterState, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBluetoothAdapterStateChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听寻找到新设备的事件
      * @version 1.1.0
      */
    inline def onBluetoothDeviceFound(callback: js.Function1[/* res */ Devices, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBluetoothDeviceFound")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听罗盘数据，频率：5次/秒，接口调用后会自动开始监听，可使用swan.stopCompass停止监听。
      */
    inline def onCompassChange(callback: CompassChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCompassChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听在获取到 Wi-Fi 列表数据时的事件，在回调中将返回 wifiList。
      * @version 1.6.0
      */
    inline def onGetWifiList(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onGetWifiList")().asInstanceOf[Unit]
    inline def onGetWifiList(callback: js.Function1[/* res */ GetWifiListOptions, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onGetWifiList")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // 内存
    inline def onMemoryWarning(callback: js.Function1[/* res */ Level, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMemoryWarning")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听网络状态变化。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    inline def onNetworkStatusChange(callback: js.Function1[/* res */ IsConnected, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNetworkStatusChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** 监听WebSocket关闭。 */
    inline def onSocketClose(callback: js.Function1[/* res */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketClose")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** 监听WebSocket错误。 */
    inline def onSocketError(callback: js.Function1[/* error */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketError")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听WebSocket接受到服务器的消息事件。
      */
    inline def onSocketMessage(callback: js.Function1[/* res */ DataResponse, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketMessage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** 监听WebSocket连接打开事件。 */
    inline def onSocketOpen(callback: js.Function1[/* res */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketOpen")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听用户主动截屏事件，用户使用系统截屏按键截屏时触发此事件
      * @version 1.4.0
      */
    inline def onUserCaptureScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUserCaptureScreen")().asInstanceOf[Unit]
    inline def onUserCaptureScreen(callback: js.Function1[/* res */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUserCaptureScreen")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听连接上 Wi-Fi 的事件。
      * @version 1.6.0
      */
    inline def onWifiConnected(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onWifiConnected")().asInstanceOf[Unit]
    inline def onWifiConnected(callback: js.Function1[/* wifi */ WiFi, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onWifiConnected")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 初始化蓝牙适配器
      * @version 1.1.0
      */
    inline def openBluetoothAdapter(options: OpenBluetoothAdapterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openBluetoothAdapter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 查看微信卡包中的卡券。
      *
      */
    inline def openCard(options: OpenCardOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openCard")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 新开页面打开文档，支持格式：doc, xls, ppt, pdf, docx, xlsx, pptx
      */
    inline def openDocument(options: OpenDocumentOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openDocument")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 使用微信内置地图查看位置
      */
    inline def openLocation(options: OpenLocationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openLocation")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 调起客户端小程序设置界面，返回用户设置的操作结果。
      * 注：设置界面只会出现小程序已经向用户请求过的权限。
      * @version 1.1.0
      */
    inline def openSetting(options: OpenSettingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openSetting")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 调起分享面板。
      * bug : 百度App Android 客户端 10.13 以下版本，点击分享
      * 面板的取消时,不会执行 fail 回调。
      */
    inline def openShare(options: openShareOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openShare")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def pageScrollTo(options: PageScrollToOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageScrollTo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 暂停播放音乐。
      * @deprecated 1.2.0
      */
    inline def pauseBackgroundAudio(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseBackgroundAudio")().asInstanceOf[Unit]
    inline def pauseBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseBackgroundAudio")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 暂停正在播放的语音。
      * 再次调用swan.playVoice播放同一个文件时，会从暂停处开始播放。
      * 如果想从头开始播放，需要先调用 swan.stopVoice。
      * @deprecated 1.6.0
      */
    inline def pauseVoice(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseVoice")().asInstanceOf[Unit]
    
    /**
      * 播放音乐，同时只能有一首音乐正在播放。
      * @deprecated 1.2.0
      */
    inline def playBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playBackgroundAudio")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 开始播放语音，同时只允许一个语音文件正在播放，
      * 如果前一个语音文件还没播放完，将中断前一个语音播放。
      * @deprecated 1.6.0
      */
    inline def playVoice(options: PlayVoiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playVoice")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 预览图片。
      */
    inline def previewImage(options: PreviewImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭所有页面，打开到应用内的某个页面。
      * @version 1.1.0
      */
    inline def reLaunch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reLaunch")().asInstanceOf[Unit]
    inline def reLaunch(options: ReLaunchOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reLaunch")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 读取低功耗蓝牙设备的特征值的二进制数据值。
      * 注意：必须设备的特征值支持read才可以成功调用，具体参照 characteristic 的 properties 属性
      */
    inline def readBLECharacteristicValue(options: ReadBLECharacteristicValue): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readBLECharacteristicValue")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭当前页面，跳转到应用内的某个页面。
      */
    inline def redirectTo(options: RedirectToOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 删除本地存储的文件
      */
    inline def removeSavedFile(options: RemoveSavedFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSavedFile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeStorage(options: RemoveStorageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStorage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeStorageSync(key: String): DataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStorageSync")(key.asInstanceOf[js.Any]).asInstanceOf[DataResponse]
    
    /**
      * 移除 tabBar 某一项右上角的文本
      * @version 1.9.0
      */
    inline def removeTabBarBadge(options: TabBarBadgeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTabBarBadge")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 自定义分析数据上报接口。使用前，需要在小程序管理后台自定义分析中新建事件，配置好事件名与字段。
      *
      * @param eventName 事件名
      * @param data 上报的自定义数据
      */
    inline def reportAnalytics(eventName: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportAnalytics")(eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 自定义业务数据监控上报接口。使用前，需要在小程序管理后台-运维中心-性能监控-业务数据监控中新建监控事件，
      * 配置监控描述与告警类型。每一个监控事件对应唯一的监控ID，开发者最多可以创建128个监控事件。
      * @param name 监控ID，在小程序管理后台新建数据指标后获得
      * @param value 上报数值，经处理后会在小程序管理后台上展示每分钟的上报总量
      */
    inline def reportMonitor(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportMonitor")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * swan.request发起的是https请求。一个微信小程序，同时只能有5个网络请求连接。
      */
    inline def request(options: RequestOptions): RequestTask = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[RequestTask]
    
    /**
      * 发起微信支付。
      */
    inline def requestPayment(options: RequestPaymentOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPayment")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 百度收银台。
      * @version 1.8.5
      */
    inline def requestPolymerPayment(options: requestPolymerPaymentOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPolymerPayment")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 保存文件到本地。
      * 本地文件存储的大小限制为 10M
      */
    inline def saveFile(options: SaveFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveFile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 保存图片到系统相册。
      * 需要用户授权 scope.writePhotosAlbum
      * @version 1.2.0
      */
    inline def saveImageToPhotosAlbum(options: SaveImageToPhotosAlbumOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveImageToPhotosAlbum")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** 保存视频到系统相册。需要用户授权 scope.writePhotosAlbum */
    inline def saveVideoToPhotosAlbum(options: SaveVideoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveVideoToPhotosAlbum")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 调起客户端扫码界面，扫码成功后返回对应的结果
      */
    inline def scanCode(options: ScanCodeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scanCode")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 控制音乐播放进度。
      * @deprecated 1.2.0
      */
    inline def seekBackgroundAudio(options: SeekBackgroundAudioOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seekBackgroundAudio")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 通过 WebSocket 连接发送数据，需要先 swan.connectSocket，
      * 并在 swan.onSocketOpen 回调之后才能发送。
      */
    inline def sendSocketMessage(options: SendSocketMessageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendSocketMessage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置系统剪贴板的内容
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    inline def setClipboardData(options: SetClipboardDataOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClipboardData")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 动态设置当前页面的标题。此方法为 web 版小程序专用方法，使用前需
      * 判断方法是否存在。
      */
    inline def setDocumentTitle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDocumentTitle")().asInstanceOf[Unit]
    inline def setDocumentTitle(options: Title): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDocumentTitle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setEnableDebug(options: EnableDebugOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnableDebug")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置是否保持常亮状态。
      * 仅在当前小程序生效，离开小程序后设置失效。
      * @version 1.4.0
      */
    inline def setKeepScreenOn(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setKeepScreenOn")().asInstanceOf[Unit]
    inline def setKeepScreenOn(options: SetKeepScreenOnOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setKeepScreenOn")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置 web 版小程序 description meta 信息。此方法为 web 版小
      * 程序专用方法，使用前需判断方法是否存在。
      */
    inline def setMetaDescription(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMetaDescription")().asInstanceOf[Unit]
    inline def setMetaDescription(content: MetaDescription): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMetaDescription")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置 web 版小程序 keywords meta 信息。此方法为 web 版小程序专
      * 用方法，使用前需判断方法是否存在。
      */
    inline def setMetaKeywords(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMetaKeywords")().asInstanceOf[Unit]
    inline def setMetaKeywords(content: MetaKeywords): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMetaKeywords")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置导航颜色
      * @version 1.4.3
      */
    inline def setNavigationBarColor(options: SetNavigationBarColorOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarColor")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 动态设置当前页面的标题。
      * @version 1.4.3
      */
    inline def setNavigationBarTitle(options: SetNavigationBarTitleOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarTitle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置屏幕亮度
      * @version 1.2.0
      */
    inline def setScreenBrightness(options: SetScreenBrightnessOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setScreenBrightness")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 将数据存储在本地缓存中指定的 key 中，
      * 会覆盖掉原来该 key 对应的内容，这是一个异步接口。
      */
    inline def setStorage(options: SetStorageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStorage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 将 data 存储在本地缓存中指定的 key 中，
      * 会覆盖掉原来该 key 对应的内容，这是一个同步接口。
      *
      * @param key 本地缓存中的指定的 key
      * @param data 需要存储的内容
      */
    inline def setStorageSync(key: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStorageSync")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // 界面-----设置tabBar
    /**
      * 为 tabBar 某一项的右上角添加文本
      * @version 1.9.0
      */
    inline def setTabBarBadge(options: SetTabBarBadgeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTabBarBadge")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 动态设置 tabBar 某一项的内容
      * @version 1.9.0
      */
    inline def setTabBarItem(options: SetTabBarItemOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTabBarItem")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 动态设置 tabBar 的整体样式
      * @version 1.9.0
      */
    inline def setTabBarStyle(options: SetTabBarStyleOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTabBarStyle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 动态设置置顶栏文字内容
      * 只有当前小程序被置顶时能生效，如果当前小程序没有被置顶，也能调用成功，但是不会立即生效
      * 只有在用户将这个小程序置顶后才换上设置的文字内容。
      * 注意：调用成功后，需间隔 5s 才能再次调用此接口，如果在 5s 内再次调用此接口，会回调
      * fail，errMsg："setTopBarText: fail invoke too frequently"
      * @version 1.4.3
      */
    inline def setTopBarText(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTopBarText")().asInstanceOf[Unit]
    inline def setTopBarText(options: SetTopBarTextOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTopBarText")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * iOS特有接口 在 onGetWifiList 回调后，利用接口设置 wifiList 中 AP 的相关信息。
      * 注意：
      * + 该接口只能在 onGetWifiList 回调之后才能调用。
      * + 此时客户端会挂起，等待小程序设置 Wi-Fi 信息，请务必尽快调用该接口，若无数据请传入一个空数组。
      * + 有可能随着周边 Wi-Fi 列表的刷新，单个流程内收到多次带有存在重复的 Wi-Fi 列表的回调。
      * @version 1.6.0
      */
    inline def setWifiList(options: SetWifiListOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWifiList")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示操作菜单
      */
    inline def showActionSheet(options: ActionSheetOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showActionSheet")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示 loading 提示框, 需主动调用 swan.hideLoading 才能关闭提示框
      */
    inline def showLoading(options: LoadingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showLoading")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示模态弹窗
      */
    inline def showModal(options: ModalOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showModal")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 在当前页面显示导航条加载动画。
      * @version 1.4.3
      */
    inline def showNavigationBarLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showNavigationBarLoading")().asInstanceOf[Unit]
    
    /**
      * 显示分享按钮
      *
      */
    inline def showShareMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showShareMenu")().asInstanceOf[Unit]
    inline def showShareMenu(options: ShareMenuOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showShareMenu")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示 tabBar
      * @version 1.9.0
      */
    inline def showTabBar(options: ShowTabBarOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showTabBar")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示 tabBar 某一项的右上角的红点
      * @version 1.9.0
      */
    inline def showTabBarRedDot(option: TabBarBadgeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showTabBarRedDot")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示消息提示框
      */
    inline def showToast(options: ToastOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 开始监听加速度数据。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    inline def startAccelerometer(options: AccelerometerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startAccelerometer")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 开始搜索附近的iBeacon设备
      * @version 1.2.0
      */
    inline def startBeaconDiscovery(options: StartBeaconDiscoveryOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startBeaconDiscovery")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 开始监听罗盘数据。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    inline def startCompass(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startCompass")().asInstanceOf[Unit]
    inline def startCompass(options: CompassOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startCompass")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // 页面-----下拉刷新
    /**
      * 开始下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致
      * @version 1.5.0
      */
    inline def startPullDownRefresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startPullDownRefresh")().asInstanceOf[Unit]
    inline def startPullDownRefresh(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startPullDownRefresh")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 开始录音。当主动调用swan.stopRecord，
      * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
      * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
      * 如需持久保存，需在主动调用swan.saveFile，在小程序下次启动时才能访问得到。
      * @deprecated 1.6.0
      */
    inline def startRecord(options: StartRecordAudioOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startRecord")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // 设备-----Wi-Fi
    /**
      * 初始化 Wi-Fi 模块。
      * @version 1.6.0
      */
    inline def startWifi(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startWifi")().asInstanceOf[Unit]
    inline def startWifi(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startWifi")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止监听加速度数据。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    inline def stopAccelerometer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAccelerometer")().asInstanceOf[Unit]
    inline def stopAccelerometer(options: AccelerometerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAccelerometer")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止播放音乐。
      * @deprecated 1.2.0
      */
    inline def stopBackgroundAudio(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopBackgroundAudio")().asInstanceOf[Unit]
    inline def stopBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopBackgroundAudio")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止搜索附近的iBeacon设备
      * @version 1.2.0
      */
    inline def stopBeaconDiscovery(options: StopBeaconDiscoveryOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopBeaconDiscovery")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止搜寻附近的蓝牙外围设备。请在确保找到需要连接的设备后调用该方法停止搜索。
      * @version 1.1.0
      */
    inline def stopBluetoothDevicesDiscovery(options: StopBluetoothDevicesDiscoveryOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopBluetoothDevicesDiscovery")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def stopCompass(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopCompass")().asInstanceOf[Unit]
    inline def stopCompass(options: CompassOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopCompass")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止当前页面下拉刷新
      * @version 1.5.0
      */
    inline def stopPullDownRefresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPullDownRefresh")().asInstanceOf[Unit]
    inline def stopPullDownRefresh(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPullDownRefresh")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 主动调用停止录音。
      */
    inline def stopRecord(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopRecord")().asInstanceOf[Unit]
    inline def stopRecord(options: StopRecordAudioOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopRecord")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 结束播放语音。
      * @deprecated 1.6.0
      */
    inline def stopVoice(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopVoice")().asInstanceOf[Unit]
    
    /**
      * 关闭 Wi-Fi 模块。
      * @version 1.6.0
      */
    inline def stopWifi(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopWifi")().asInstanceOf[Unit]
    inline def stopWifi(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopWifi")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
      */
    inline def switchTab(options: SwitchTabOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("switchTab")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 更新转发属性
      * @version 1.2.0
      */
    inline def updateShareMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateShareMenu")().asInstanceOf[Unit]
    inline def updateShareMenu(options: UpdateShareMenuOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateShareMenu")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 将本地资源上传到开发者服务器。
      * 如页面通过 swan.chooseImage 等接口获取到一个本地资源的临时文件路径后，
      * 可通过此接口将本地资源上传到指定服务器。
      * 客户端发起一个 HTTPS POST 请求，
      * 其中 Content-Type 为 multipart/form-data 。
      */
    inline def uploadFile(options: UploadFileOptions): UploadTask = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(options.asInstanceOf[js.Any]).asInstanceOf[UploadTask]
    
    /**
      * swanid有效性校验接口：true表示有效，false表示无效。
      */
    inline def verify(options: verifyOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // 设备-----震动
    /**
      * 使手机发生较长时间的振动（400ms）
      * @version 1.2.0
      */
    inline def vibrateLong(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrateLong")().asInstanceOf[Unit]
    inline def vibrateLong(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrateLong")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 使手机发生较短时间的振动（15ms）
      * @version 1.2.0
      */
    inline def vibrateShort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrateShort")().asInstanceOf[Unit]
    inline def vibrateShort(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrateShort")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 向低功耗蓝牙设备特征值中写入二进制数据。
      * 注意：必须设备的特征值支持write才可以成功调用，具体参照 characteristic 的 properties 属性
      * tips: 并行调用多次读写接口存在读写失败的可能性
      */
    inline def writeBLECharacteristicValue(options: WriteBLECharacteristicValue): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBLECharacteristicValue")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
