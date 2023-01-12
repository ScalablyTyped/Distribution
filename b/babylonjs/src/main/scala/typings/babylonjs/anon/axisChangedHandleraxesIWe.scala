package typings.babylonjs.anon

import typings.babylonjs.XRHandedness
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRFeaturesWebXRControllerMovementMod.WebXRControllerMovementFeatureContext
import typings.babylonjs.xRFeaturesWebXRControllerMovementMod.WebXRControllerMovementRegistrationConfiguration
import typings.babylonjs.xRFeaturesWebXRControllerMovementMod.WebXRControllerMovementState
import typings.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.MotionControllerComponentType
import typings.babylonjs.xRMotionControllerWebXRControllerComponentMod.IWebXRMotionControllerAxesValue
import typings.babylonjs.xRMotionControllerWebXRControllerComponentMod.WebXRControllerComponent
import typings.babylonjs.xRWebXRInputMod.WebXRInput
import typings.babylonjs.xRWebXRInputSourceMod.WebXRInputSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {axisChangedHandler (axes : babylonjs.babylonjs/XR/motionController/webXRControllerComponent.IWebXRMotionControllerAxesValue, movementState : babylonjs.babylonjs/XR/features/WebXRControllerMovement.WebXRControllerMovementState, featureContext : babylonjs.babylonjs/XR/features/WebXRControllerMovement.WebXRControllerMovementFeatureContext, xrInput : babylonjs.babylonjs/XR/webXRInput.WebXRInput): void} & {  allowedComponentTypes :std.Array<babylonjs.babylonjs/XR/motionController/webXRAbstractMotionController.MotionControllerComponentType> | undefined,   forceHandedness :babylonjs.XRHandedness | undefined,   mainComponentOnly :boolean | undefined,   componentSelectionPredicate :(xrController : babylonjs.babylonjs/XR/webXRInputSource.WebXRInputSource): babylonjs.babylonjs/types.Nullable<babylonjs.babylonjs/XR/motionController/webXRControllerComponent.WebXRControllerComponent> | undefined} */
trait axisChangedHandleraxesIWe
  extends StObject
     with WebXRControllerMovementRegistrationConfiguration {
  
  /**
    * handlers are filtered to these types only
    */
  var allowedComponentTypes: js.UndefOr[js.Array[MotionControllerComponentType]] = js.undefined
  
  /**
    * Called when axis changes occur.
    */
  def axisChangedHandler(
    axes: IWebXRMotionControllerAxesValue,
    movementState: WebXRControllerMovementState,
    featureContext: WebXRControllerMovementFeatureContext,
    xrInput: WebXRInput
  ): Unit
  
  /**
    * Additional predicate to apply to controllers to restrict a handler being added.
    */
  var componentSelectionPredicate: js.UndefOr[
    js.Function1[/* xrController */ WebXRInputSource, Nullable[WebXRControllerComponent]]
  ] = js.undefined
  
  /**
    * For registering movement to specific hand only.  Useful if your app has a "main hand" and "off hand" for determining the functionality of a controller.
    */
  var forceHandedness: js.UndefOr[XRHandedness] = js.undefined
  
  /**
    * For main component only (useful for buttons and may not trigger axis changes).
    */
  var mainComponentOnly: js.UndefOr[Boolean] = js.undefined
}
object axisChangedHandleraxesIWe {
  
  inline def apply(
    axisChangedHandler: (IWebXRMotionControllerAxesValue, WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => Unit
  ): axisChangedHandleraxesIWe = {
    val __obj = js.Dynamic.literal(axisChangedHandler = js.Any.fromFunction4(axisChangedHandler))
    __obj.asInstanceOf[axisChangedHandleraxesIWe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: axisChangedHandleraxesIWe] (val x: Self) extends AnyVal {
    
    inline def setAllowedComponentTypes(value: js.Array[MotionControllerComponentType]): Self = StObject.set(x, "allowedComponentTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedComponentTypesUndefined: Self = StObject.set(x, "allowedComponentTypes", js.undefined)
    
    inline def setAllowedComponentTypesVarargs(value: MotionControllerComponentType*): Self = StObject.set(x, "allowedComponentTypes", js.Array(value*))
    
    inline def setAxisChangedHandler(
      value: (IWebXRMotionControllerAxesValue, WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => Unit
    ): Self = StObject.set(x, "axisChangedHandler", js.Any.fromFunction4(value))
    
    inline def setComponentSelectionPredicate(value: /* xrController */ WebXRInputSource => Nullable[WebXRControllerComponent]): Self = StObject.set(x, "componentSelectionPredicate", js.Any.fromFunction1(value))
    
    inline def setComponentSelectionPredicateUndefined: Self = StObject.set(x, "componentSelectionPredicate", js.undefined)
    
    inline def setForceHandedness(value: XRHandedness): Self = StObject.set(x, "forceHandedness", value.asInstanceOf[js.Any])
    
    inline def setForceHandednessUndefined: Self = StObject.set(x, "forceHandedness", js.undefined)
    
    inline def setMainComponentOnly(value: Boolean): Self = StObject.set(x, "mainComponentOnly", value.asInstanceOf[js.Any])
    
    inline def setMainComponentOnlyUndefined: Self = StObject.set(x, "mainComponentOnly", js.undefined)
  }
}
