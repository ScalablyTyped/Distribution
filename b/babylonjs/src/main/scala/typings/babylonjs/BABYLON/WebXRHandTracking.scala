package typings.babylonjs.BABYLON

import typings.babylonjs.XRHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRHandTracking extends WebXRAbstractFeature {
  
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
