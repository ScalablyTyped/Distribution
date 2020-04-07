package typings.babylonjs.engineWebVRMod.babylonjsEnginesEngineAugmentingMod

import typings.babylonjs.engineMod.IDisplayChangedEventArgs
import typings.babylonjs.engineWebVRMod.IVRPresentationAttributes
import typings.babylonjs.mathSizeMod.Size
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webVRCameraMod.WebVROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  /** @hidden */
  var _oldHardwareScaleFactor: Double
  /** @hidden */
  var _oldSize: Size
  /** @hidden */
  var _onVrDisplayConnect: Nullable[js.Function1[/* display */ _, Unit]]
  /** @hidden */
  var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]]
  /** @hidden */
  var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]]
  /** @hidden */
  var _vrDisplay: js.Any
  /** @hidden */
  var _vrExclusivePointerMode: Boolean
  /** @hidden */
  var _vrSupported: Boolean
  /** @hidden */
  var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs]
  /**
    * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
    * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
    */
  var isInVRExclusivePointerMode: Boolean
  /**
    * Observable signaled when VR display mode changes
    */
  var onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs]
  /**
    * Observable signaled when VR request present is complete
    */
  var onVRRequestPresentComplete: Observable[Boolean]
  /**
    * Observable signaled when VR request present starts
    */
  var onVRRequestPresentStart: Observable[Engine]
  /**
    * Gets or sets the presentation attributes used to configure VR rendering
    */
  var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.undefined
  /** @hidden */
  def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs]
  /** @hidden */
  def _onVRDisplayPointerRestricted(): Unit
  /** @hidden */
  def _onVRDisplayPointerUnrestricted(): Unit
  /** @hidden */
  def _onVRFullScreenTriggered(): Unit
  /**
    * Call this function to switch to webVR mode
    * Will do nothing if webVR is not supported or if there is no webVR device
    * @param options the webvr options provided to the camera. mainly used for multiview
    * @see http://doc.babylonjs.com/how_to/webvr_camera
    */
  def enableVR(options: WebVROptions): Unit
  /**
    * Gets the current webVR device
    * @returns the current webVR device (or null)
    */
  def getVRDevice(): js.Any
  /**
    * Initializes a webVR display and starts listening to display change events
    * The onVRDisplayChangedObservable will be notified upon these changes
    * @returns A promise containing a VRDisplay and if vr is supported
    */
  def initWebVRAsync(): js.Promise[IDisplayChangedEventArgs]
  /**
    * Gets a boolean indicating if a webVR device was detected
    * @returns true if a webVR device was detected
    */
  def isVRDevicePresent(): Boolean
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
    onVRRequestPresentStart: Observable[Engine],
    _onVrDisplayConnect: /* display */ _ => Unit = null,
    _onVrDisplayDisconnect: () => Unit = null,
    _onVrDisplayPresentChange: () => Unit = null,
    vrPresentationAttributes: IVRPresentationAttributes = null
  ): Engine = {
    val __obj = js.Dynamic.literal(_getVRDisplaysAsync = js.Any.fromFunction0(_getVRDisplaysAsync), _oldHardwareScaleFactor = _oldHardwareScaleFactor.asInstanceOf[js.Any], _oldSize = _oldSize.asInstanceOf[js.Any], _onVRDisplayPointerRestricted = js.Any.fromFunction0(_onVRDisplayPointerRestricted), _onVRDisplayPointerUnrestricted = js.Any.fromFunction0(_onVRDisplayPointerUnrestricted), _onVRFullScreenTriggered = js.Any.fromFunction0(_onVRFullScreenTriggered), _vrDisplay = _vrDisplay.asInstanceOf[js.Any], _vrExclusivePointerMode = _vrExclusivePointerMode.asInstanceOf[js.Any], _vrSupported = _vrSupported.asInstanceOf[js.Any], _webVRInitPromise = _webVRInitPromise.asInstanceOf[js.Any], enableVR = js.Any.fromFunction1(enableVR), getVRDevice = js.Any.fromFunction0(getVRDevice), initWebVRAsync = js.Any.fromFunction0(initWebVRAsync), isInVRExclusivePointerMode = isInVRExclusivePointerMode.asInstanceOf[js.Any], isVRDevicePresent = js.Any.fromFunction0(isVRDevicePresent), onVRDisplayChangedObservable = onVRDisplayChangedObservable.asInstanceOf[js.Any], onVRRequestPresentComplete = onVRRequestPresentComplete.asInstanceOf[js.Any], onVRRequestPresentStart = onVRRequestPresentStart.asInstanceOf[js.Any])
    if (_onVrDisplayConnect != null) __obj.updateDynamic("_onVrDisplayConnect")(js.Any.fromFunction1(_onVrDisplayConnect))
    if (_onVrDisplayDisconnect != null) __obj.updateDynamic("_onVrDisplayDisconnect")(js.Any.fromFunction0(_onVrDisplayDisconnect))
    if (_onVrDisplayPresentChange != null) __obj.updateDynamic("_onVrDisplayPresentChange")(js.Any.fromFunction0(_onVrDisplayPresentChange))
    if (vrPresentationAttributes != null) __obj.updateDynamic("vrPresentationAttributes")(vrPresentationAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
}

