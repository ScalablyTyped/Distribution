package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericController
  extends StObject
     with WebVRController {
  
  /**
    * Called once for each button that changed state since the last frame
    * @param buttonIdx Which button index changed
    * @param state New state of the button
    */
  /* protected */ def _handleButtonChange(buttonIdx: Double, state: ExtendedGamepadButton): Unit = js.native
}
