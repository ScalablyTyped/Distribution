package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRControllerComponentMod.IWebXRMotionControllerAxesValue
import typings.babylonjs.webXRControllerComponentMod.IWebXRMotionControllerComponentChangesValues
import typings.babylonjs.webXRInputMod.WebXRInput
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRControllerMovementMod {
  
  @JSImport("babylonjs/XR/features/WebXRControllerMovement", "WebXRControllerMovement")
  @js.native
  open class WebXRControllerMovement protected () extends WebXRAbstractFeature {
    /**
      * constructs a new movement controller system
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param options configuration object for this feature
      */
    def this(_xrSessionManager: WebXRSessionManager, options: IWebXRControllerMovementOptions) = this()
    
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
  /* static members */
  object WebXRControllerMovement {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRControllerMovement", "WebXRControllerMovement.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * Standard controller configurations.
      */
    @JSImport("babylonjs/XR/features/WebXRControllerMovement", "WebXRControllerMovement.REGISTRATIONS")
    @js.native
    val REGISTRATIONS: StringDictionary[js.Array[WebXRControllerMovementRegistrationConfiguration]] = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the webxr specs version
      */
    @JSImport("babylonjs/XR/features/WebXRControllerMovement", "WebXRControllerMovement.Version")
    @js.native
    val Version: Double = js.native
  }
  
  trait IWebXRControllerMovementOptions extends StObject {
    
    /**
      * Override default behaviour and provide your own movement controls
      */
    var customRegistrationConfigurations: js.UndefOr[js.Array[WebXRControllerMovementRegistrationConfiguration]] = js.undefined
    
    /**
      * Is movement enabled
      */
    var movementEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Camera direction follows view pose and movement by default will move independently of the viewer's pose.
      */
    var movementOrientationFollowsViewerPose: Boolean
    
    /**
      * Movement speed factor (default is 1.0)
      */
    var movementSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum threshold the controller's thumbstick/touchpad must pass before being recognized for movement (avoids jitter/unintentional movement)
      */
    var movementThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Is rotation enabled
      */
    var rotationEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Movement speed factor (default is 1.0)
      */
    var rotationSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum threshold the controller's thumstick/touchpad must pass before being recognized for rotation (avoids jitter/unintentional rotation)
      */
    var rotationThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Babylon XR Input class for controller
      */
    var xrInput: WebXRInput
  }
  object IWebXRControllerMovementOptions {
    
    inline def apply(movementOrientationFollowsViewerPose: Boolean, xrInput: WebXRInput): IWebXRControllerMovementOptions = {
      val __obj = js.Dynamic.literal(movementOrientationFollowsViewerPose = movementOrientationFollowsViewerPose.asInstanceOf[js.Any], xrInput = xrInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRControllerMovementOptions]
    }
    
    extension [Self <: IWebXRControllerMovementOptions](x: Self) {
      
      inline def setCustomRegistrationConfigurations(value: js.Array[WebXRControllerMovementRegistrationConfiguration]): Self = StObject.set(x, "customRegistrationConfigurations", value.asInstanceOf[js.Any])
      
      inline def setCustomRegistrationConfigurationsUndefined: Self = StObject.set(x, "customRegistrationConfigurations", js.undefined)
      
      inline def setCustomRegistrationConfigurationsVarargs(value: WebXRControllerMovementRegistrationConfiguration*): Self = StObject.set(x, "customRegistrationConfigurations", js.Array(value*))
      
      inline def setMovementEnabled(value: Boolean): Self = StObject.set(x, "movementEnabled", value.asInstanceOf[js.Any])
      
      inline def setMovementEnabledUndefined: Self = StObject.set(x, "movementEnabled", js.undefined)
      
      inline def setMovementOrientationFollowsViewerPose(value: Boolean): Self = StObject.set(x, "movementOrientationFollowsViewerPose", value.asInstanceOf[js.Any])
      
      inline def setMovementSpeed(value: Double): Self = StObject.set(x, "movementSpeed", value.asInstanceOf[js.Any])
      
      inline def setMovementSpeedUndefined: Self = StObject.set(x, "movementSpeed", js.undefined)
      
      inline def setMovementThreshold(value: Double): Self = StObject.set(x, "movementThreshold", value.asInstanceOf[js.Any])
      
      inline def setMovementThresholdUndefined: Self = StObject.set(x, "movementThreshold", js.undefined)
      
      inline def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
      
      inline def setRotationEnabledUndefined: Self = StObject.set(x, "rotationEnabled", js.undefined)
      
      inline def setRotationSpeed(value: Double): Self = StObject.set(x, "rotationSpeed", value.asInstanceOf[js.Any])
      
      inline def setRotationSpeedUndefined: Self = StObject.set(x, "rotationSpeed", js.undefined)
      
      inline def setRotationThreshold(value: Double): Self = StObject.set(x, "rotationThreshold", value.asInstanceOf[js.Any])
      
      inline def setRotationThresholdUndefined: Self = StObject.set(x, "rotationThreshold", js.undefined)
      
      inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebXRControllerMovementFeatureContext extends StObject {
    
    var movementEnabled: Boolean
    
    var movementOrientationFollowsViewerPose: Boolean
    
    var movementSpeed: Double
    
    var movementThreshold: Double
    
    var rotationEnabled: Boolean
    
    var rotationSpeed: Double
    
    var rotationThreshold: Double
  }
  object WebXRControllerMovementFeatureContext {
    
    inline def apply(
      movementEnabled: Boolean,
      movementOrientationFollowsViewerPose: Boolean,
      movementSpeed: Double,
      movementThreshold: Double,
      rotationEnabled: Boolean,
      rotationSpeed: Double,
      rotationThreshold: Double
    ): WebXRControllerMovementFeatureContext = {
      val __obj = js.Dynamic.literal(movementEnabled = movementEnabled.asInstanceOf[js.Any], movementOrientationFollowsViewerPose = movementOrientationFollowsViewerPose.asInstanceOf[js.Any], movementSpeed = movementSpeed.asInstanceOf[js.Any], movementThreshold = movementThreshold.asInstanceOf[js.Any], rotationEnabled = rotationEnabled.asInstanceOf[js.Any], rotationSpeed = rotationSpeed.asInstanceOf[js.Any], rotationThreshold = rotationThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebXRControllerMovementFeatureContext]
    }
    
    extension [Self <: WebXRControllerMovementFeatureContext](x: Self) {
      
      inline def setMovementEnabled(value: Boolean): Self = StObject.set(x, "movementEnabled", value.asInstanceOf[js.Any])
      
      inline def setMovementOrientationFollowsViewerPose(value: Boolean): Self = StObject.set(x, "movementOrientationFollowsViewerPose", value.asInstanceOf[js.Any])
      
      inline def setMovementSpeed(value: Double): Self = StObject.set(x, "movementSpeed", value.asInstanceOf[js.Any])
      
      inline def setMovementThreshold(value: Double): Self = StObject.set(x, "movementThreshold", value.asInstanceOf[js.Any])
      
      inline def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
      
      inline def setRotationSpeed(value: Double): Self = StObject.set(x, "rotationSpeed", value.asInstanceOf[js.Any])
      
      inline def setRotationThreshold(value: Double): Self = StObject.set(x, "rotationThreshold", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.anon.axisChangedHandleraxesIWe
    - typings.babylonjs.anon.buttonChangedhandlerpress
  */
  trait WebXRControllerMovementRegistrationConfiguration extends StObject
  object WebXRControllerMovementRegistrationConfiguration {
    
    inline def axisChangedHandleraxesIWe(
      axisChangedHandler: (IWebXRMotionControllerAxesValue, WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => Unit
    ): typings.babylonjs.anon.axisChangedHandleraxesIWe = {
      val __obj = js.Dynamic.literal(axisChangedHandler = js.Any.fromFunction4(axisChangedHandler))
      __obj.asInstanceOf[typings.babylonjs.anon.axisChangedHandleraxesIWe]
    }
    
    inline def buttonChangedhandlerpress(
      buttonChangedhandler: (IWebXRMotionControllerComponentChangesValues[Boolean], WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => Unit
    ): typings.babylonjs.anon.buttonChangedhandlerpress = {
      val __obj = js.Dynamic.literal(buttonChangedhandler = js.Any.fromFunction4(buttonChangedhandler))
      __obj.asInstanceOf[typings.babylonjs.anon.buttonChangedhandlerpress]
    }
  }
  
  trait WebXRControllerMovementState extends StObject {
    
    var moveX: Double
    
    var moveY: Double
    
    var rotateX: Double
    
    var rotateY: Double
  }
  object WebXRControllerMovementState {
    
    inline def apply(moveX: Double, moveY: Double, rotateX: Double, rotateY: Double): WebXRControllerMovementState = {
      val __obj = js.Dynamic.literal(moveX = moveX.asInstanceOf[js.Any], moveY = moveY.asInstanceOf[js.Any], rotateX = rotateX.asInstanceOf[js.Any], rotateY = rotateY.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebXRControllerMovementState]
    }
    
    extension [Self <: WebXRControllerMovementState](x: Self) {
      
      inline def setMoveX(value: Double): Self = StObject.set(x, "moveX", value.asInstanceOf[js.Any])
      
      inline def setMoveY(value: Double): Self = StObject.set(x, "moveY", value.asInstanceOf[js.Any])
      
      inline def setRotateX(value: Double): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
      
      inline def setRotateY(value: Double): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
    }
  }
}
