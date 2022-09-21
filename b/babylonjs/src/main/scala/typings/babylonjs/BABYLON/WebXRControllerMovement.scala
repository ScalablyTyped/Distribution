package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRControllerMovement
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _attachController: Any = js.native
  
  /* private */ var _controllers: Any = js.native
  
  /* private */ var _currentRegistrationConfigurations: Any = js.native
  
  /* private */ var _detachController: Any = js.native
  
  /* private */ var _featureContext: Any = js.native
  
  /* private */ var _movementDirection: Any = js.native
  
  /* private */ var _movementState: Any = js.native
  
  /* private */ var _tmpMovementTranslation: Any = js.native
  
  /* private */ var _tmpRotationMatrix: Any = js.native
  
  /* private */ var _tmpTranslationDirection: Any = js.native
  
  /* private */ var _xrInput: Any = js.native
  
  /**
    * Current movement direction.  Will be null before XR Frames have been processed.
    */
  def movementDirection: Nullable[Quaternion] = js.native
  
  /**
    * Is movement enabled
    */
  def movementEnabled: Boolean = js.native
  /**
    * Sets whether movement is enabled or not
    * @param enabled is movement enabled
    */
  def movementEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * If movement follows viewer pose
    */
  def movementOrientationFollowsViewerPose: Boolean = js.native
  /**
    * Sets whether movement follows viewer pose
    * @param followsPose is movement should follow viewer pose
    */
  def movementOrientationFollowsViewerPose_=(followsPose: Boolean): Unit = js.native
  
  /**
    * Gets movement speed
    */
  def movementSpeed: Double = js.native
  /**
    * Sets movement speed
    * @param movementSpeed movement speed
    */
  def movementSpeed_=(movementSpeed: Double): Unit = js.native
  
  /**
    * Gets minimum threshold the controller's thumbstick/touchpad must pass before being recognized for movement (avoids jitter/unintentional movement)
    */
  def movementThreshold: Double = js.native
  /**
    * Sets minimum threshold the controller's thumbstick/touchpad must pass before being recognized for movement (avoids jitter/unintentional movement)
    * @param movementThreshold new threshold
    */
  def movementThreshold_=(movementThreshold: Double): Unit = js.native
  
  /**
    * Is rotation enabled
    */
  def rotationEnabled: Boolean = js.native
  /**
    * Sets whether rotation is enabled or not
    * @param enabled is rotation enabled
    */
  def rotationEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * Gets rotation speed factor
    */
  def rotationSpeed: Double = js.native
  /**
    * Sets rotation speed factor (1.0 is default)
    * @param rotationSpeed new rotation speed factor
    */
  def rotationSpeed_=(rotationSpeed: Double): Unit = js.native
  
  /**
    * Gets minimum threshold the controller's thumbstick/touchpad must pass before being recognized for rotation (avoids jitter/unintentional rotation)
    */
  def rotationThreshold: Double = js.native
  /**
    * Sets minimum threshold the controller's thumbstick/touchpad must pass before being recognized for rotation (avoids jitter/unintentional rotation)
    * @param threshold new threshold
    */
  def rotationThreshold_=(threshold: Double): Unit = js.native
}
