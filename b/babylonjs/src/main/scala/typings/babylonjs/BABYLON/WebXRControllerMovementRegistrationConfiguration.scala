package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.anon.axisChangedHandleraxesIWeAllowedComponentTypes
  - typings.babylonjs.anon.buttonChangedhandlerpressAllowedComponentTypes
*/
trait WebXRControllerMovementRegistrationConfiguration extends StObject
object WebXRControllerMovementRegistrationConfiguration {
  
  inline def axisChangedHandleraxesIWeAllowedComponentTypes(
    axisChangedHandler: (IWebXRMotionControllerAxesValue, WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => Unit
  ): typings.babylonjs.anon.axisChangedHandleraxesIWeAllowedComponentTypes = {
    val __obj = js.Dynamic.literal(axisChangedHandler = js.Any.fromFunction4(axisChangedHandler))
    __obj.asInstanceOf[typings.babylonjs.anon.axisChangedHandleraxesIWeAllowedComponentTypes]
  }
  
  inline def buttonChangedhandlerpressAllowedComponentTypes(
    buttonChangedhandler: (IWebXRMotionControllerComponentChangesValues[Boolean], WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => Unit
  ): typings.babylonjs.anon.buttonChangedhandlerpressAllowedComponentTypes = {
    val __obj = js.Dynamic.literal(buttonChangedhandler = js.Any.fromFunction4(buttonChangedhandler))
    __obj.asInstanceOf[typings.babylonjs.anon.buttonChangedhandlerpressAllowedComponentTypes]
  }
}
