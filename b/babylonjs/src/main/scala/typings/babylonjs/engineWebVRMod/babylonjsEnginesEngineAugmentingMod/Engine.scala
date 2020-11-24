package typings.babylonjs.engineWebVRMod.babylonjsEnginesEngineAugmentingMod

import typings.babylonjs.engineMod.IDisplayChangedEventArgs
import typings.babylonjs.engineWebVRMod.IVRPresentationAttributes
import typings.babylonjs.mathSizeMod.Size
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webVRCameraMod.WebVROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Engine extends js.Object {
  
  /** @hidden */
  def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
  
  /** @hidden */
  var _oldHardwareScaleFactor: Double = js.native
  
  /** @hidden */
  var _oldSize: Size = js.native
  
  /** @hidden */
  def _onVRDisplayPointerRestricted(): Unit = js.native
  
  /** @hidden */
  def _onVRDisplayPointerUnrestricted(): Unit = js.native
  
  /** @hidden */
  def _onVRFullScreenTriggered(): Unit = js.native
  
  /** @hidden */
  var _onVrDisplayConnect: Nullable[js.Function1[/* display */ _, Unit]] = js.native
  
  /** @hidden */
  var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
  
  /** @hidden */
  var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
  
  /** @hidden */
  var _vrDisplay: js.Any = js.native
  
  /** @hidden */
  var _vrExclusivePointerMode: Boolean = js.native
  
  /** @hidden */
  var _vrSupported: Boolean = js.native
  
  /** @hidden */
  var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs] = js.native
  
  /**
    * Call this function to switch to webVR mode
    * Will do nothing if webVR is not supported or if there is no webVR device
    * @param options the webvr options provided to the camera. mainly used for multiview
    * @see https://doc.babylonjs.com/how_to/webvr_camera
    */
  def enableVR(options: WebVROptions): Unit = js.native
  
  /**
    * Gets the current webVR device
    * @returns the current webVR device (or null)
    */
  def getVRDevice(): js.Any = js.native
  
  /**
    * Initializes a webVR display and starts listening to display change events
    * The onVRDisplayChangedObservable will be notified upon these changes
    * @returns A promise containing a VRDisplay and if vr is supported
    */
  def initWebVRAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
  
  /**
    * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
    * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
    */
  var isInVRExclusivePointerMode: Boolean = js.native
  
  /**
    * Gets a boolean indicating if a webVR device was detected
    * @returns true if a webVR device was detected
    */
  def isVRDevicePresent(): Boolean = js.native
  
  /**
    * Observable signaled when VR display mode changes
    */
  var onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs] = js.native
  
  /**
    * Observable signaled when VR request present is complete
    */
  var onVRRequestPresentComplete: Observable[Boolean] = js.native
  
  /**
    * Observable signaled when VR request present starts
    */
  var onVRRequestPresentStart: Observable[Engine] = js.native
  
  /**
    * Gets or sets the presentation attributes used to configure VR rendering
    */
  var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
}
object Engine {
  
  @scala.inline
  def apply(
    _getVRDisplaysAsync: () => js.Promise[IDisplayChangedEventArgs],
    _oldHardwareScaleFactor: Double,
    _oldSize: Size,
    _onVRDisplayPointerRestricted: () => Unit,
    _onVRDisplayPointerUnrestricted: () => Unit,
    _onVRFullScreenTriggered: () => Unit,
    _vrDisplay: js.Any,
    _vrExclusivePointerMode: Boolean,
    _vrSupported: Boolean,
    _webVRInitPromise: js.Promise[IDisplayChangedEventArgs],
    enableVR: WebVROptions => Unit,
    getVRDevice: () => js.Any,
    initWebVRAsync: () => js.Promise[IDisplayChangedEventArgs],
    isInVRExclusivePointerMode: Boolean,
    isVRDevicePresent: () => Boolean,
    onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs],
    onVRRequestPresentComplete: Observable[Boolean],
    onVRRequestPresentStart: Observable[Engine]
  ): Engine = {
    val __obj = js.Dynamic.literal(_getVRDisplaysAsync = js.Any.fromFunction0(_getVRDisplaysAsync), _oldHardwareScaleFactor = _oldHardwareScaleFactor.asInstanceOf[js.Any], _oldSize = _oldSize.asInstanceOf[js.Any], _onVRDisplayPointerRestricted = js.Any.fromFunction0(_onVRDisplayPointerRestricted), _onVRDisplayPointerUnrestricted = js.Any.fromFunction0(_onVRDisplayPointerUnrestricted), _onVRFullScreenTriggered = js.Any.fromFunction0(_onVRFullScreenTriggered), _vrDisplay = _vrDisplay.asInstanceOf[js.Any], _vrExclusivePointerMode = _vrExclusivePointerMode.asInstanceOf[js.Any], _vrSupported = _vrSupported.asInstanceOf[js.Any], _webVRInitPromise = _webVRInitPromise.asInstanceOf[js.Any], enableVR = js.Any.fromFunction1(enableVR), getVRDevice = js.Any.fromFunction0(getVRDevice), initWebVRAsync = js.Any.fromFunction0(initWebVRAsync), isInVRExclusivePointerMode = isInVRExclusivePointerMode.asInstanceOf[js.Any], isVRDevicePresent = js.Any.fromFunction0(isVRDevicePresent), onVRDisplayChangedObservable = onVRDisplayChangedObservable.asInstanceOf[js.Any], onVRRequestPresentComplete = onVRRequestPresentComplete.asInstanceOf[js.Any], onVRRequestPresentStart = onVRRequestPresentStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
  
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_getVRDisplaysAsync(value: () => js.Promise[IDisplayChangedEventArgs]): Self = this.set("_getVRDisplaysAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_oldHardwareScaleFactor(value: Double): Self = this.set("_oldHardwareScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_oldSize(value: Size): Self = this.set("_oldSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onVRDisplayPointerRestricted(value: () => Unit): Self = this.set("_onVRDisplayPointerRestricted", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_onVRDisplayPointerUnrestricted(value: () => Unit): Self = this.set("_onVRDisplayPointerUnrestricted", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_onVRFullScreenTriggered(value: () => Unit): Self = this.set("_onVRFullScreenTriggered", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_vrDisplay(value: js.Any): Self = this.set("_vrDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_vrExclusivePointerMode(value: Boolean): Self = this.set("_vrExclusivePointerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_vrSupported(value: Boolean): Self = this.set("_vrSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_webVRInitPromise(value: js.Promise[IDisplayChangedEventArgs]): Self = this.set("_webVRInitPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVR(value: WebVROptions => Unit): Self = this.set("enableVR", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVRDevice(value: () => js.Any): Self = this.set("getVRDevice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitWebVRAsync(value: () => js.Promise[IDisplayChangedEventArgs]): Self = this.set("initWebVRAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInVRExclusivePointerMode(value: Boolean): Self = this.set("isInVRExclusivePointerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVRDevicePresent(value: () => Boolean): Self = this.set("isVRDevicePresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVRDisplayChangedObservable(value: Observable[IDisplayChangedEventArgs]): Self = this.set("onVRDisplayChangedObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVRRequestPresentComplete(value: Observable[Boolean]): Self = this.set("onVRRequestPresentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVRRequestPresentStart(value: Observable[Engine]): Self = this.set("onVRRequestPresentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onVrDisplayConnect(value: /* display */ _ => Unit): Self = this.set("_onVrDisplayConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_onVrDisplayConnectNull: Self = this.set("_onVrDisplayConnect", null)
    
    @scala.inline
    def set_onVrDisplayDisconnect(value: () => Unit): Self = this.set("_onVrDisplayDisconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_onVrDisplayDisconnectNull: Self = this.set("_onVrDisplayDisconnect", null)
    
    @scala.inline
    def set_onVrDisplayPresentChange(value: () => Unit): Self = this.set("_onVrDisplayPresentChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_onVrDisplayPresentChangeNull: Self = this.set("_onVrDisplayPresentChange", null)
    
    @scala.inline
    def setVrPresentationAttributes(value: IVRPresentationAttributes): Self = this.set("vrPresentationAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVrPresentationAttributes: Self = this.set("vrPresentationAttributes", js.undefined)
  }
}
