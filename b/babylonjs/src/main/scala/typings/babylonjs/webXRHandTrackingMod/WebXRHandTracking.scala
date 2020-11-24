package typings.babylonjs.webXRHandTrackingMod

import typings.babylonjs.XRHandedness
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/WebXRHandTracking", "WebXRHandTracking")
@js.native
class WebXRHandTracking protected () extends WebXRAbstractFeature {
  /**
    * Creates a new instance of the hit test feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(
    _xrSessionManager: WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRHandTrackingOptions
  ) = this()
  
  var _attachHand: js.Any = js.native
  
  var _detachHand: js.Any = js.native
  
  var _hands: js.Any = js.native
  
  /**
    * Get the hand object according to the controller id
    * @param controllerId the controller id to which we want to get the hand
    * @returns null if not found or the WebXRHand object if found
    */
  def getHandByControllerId(controllerId: String): Nullable[WebXRHand] = js.native
  
  /**
    * Get a hand object according to the requested handedness
    * @param handedness the handedness to request
    * @returns null if not found or the WebXRHand object if found
    */
  def getHandByHandedness(handedness: XRHandedness): Nullable[WebXRHand] = js.native
  
  /**
    * This observable will notify registered observers when a new hand object was added and initialized
    */
  var onHandAddedObservable: Observable[WebXRHand] = js.native
  
  /**
    * This observable will notify its observers right before the hand object is disposed
    */
  var onHandRemovedObservable: Observable[WebXRHand] = js.native
  
  /**
    * options to use when constructing this feature
    */
  val options: IWebXRHandTrackingOptions = js.native
}
/* static members */
@JSImport("babylonjs/XR/features/WebXRHandTracking", "WebXRHandTracking")
@js.native
object WebXRHandTracking extends js.Object {
  
  /**
    * The module's name
    */
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  val Version: Double = js.native
  
  var _idCounter: js.Any = js.native
}
