package typings.babylonjs.BABYLON

import typings.babylonjs.XRHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRHandTracking
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _attachHand: Any = js.native
  
  /* private */ var _attachedHands: Any = js.native
  
  /* private */ var _detachHand: Any = js.native
  
  /* private */ var _detachHandById: Any = js.native
  
  /* private */ var _handResources: Any = js.native
  
  /* private */ var _trackingHands: Any = js.native
  
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
  
  /** Options to use when constructing this feature. */
  val options: IWebXRHandTrackingOptions = js.native
}
