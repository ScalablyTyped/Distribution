package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXROculusTouchMotionController extends WebXRAbstractMotionController {
  
  var _forceLegacyControllers: js.Any = js.native
  
  /**
    * Is this the new type of oculus touch. At the moment both have the same profile and it is impossible to differentiate
    * between the touch and touch 2.
    */
  var _isQuest: js.Any = js.native
  
  var _modelRootNode: js.Any = js.native
  
  /* protected */ def _updateModel(): Unit = js.native
}
