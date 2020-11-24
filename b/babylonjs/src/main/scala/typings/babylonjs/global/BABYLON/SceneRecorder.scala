package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SceneRecorder")
@js.native
class SceneRecorder ()
  extends typings.babylonjs.BABYLON.SceneRecorder
/* static members */
@JSGlobal("BABYLON.SceneRecorder")
@js.native
object SceneRecorder extends js.Object {
  
  def ApplyDelta(deltaJSON: String, scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
  /**
    * Apply a given delta to a given scene
    * @param deltaJSON defines the JSON containing the delta
    * @param scene defines the scene to apply the delta to
    */
  def ApplyDelta(deltaJSON: js.Any, scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
  
  var GetShadowGeneratorById: js.Any = js.native
  
  var _ApplyDeltaForEntity: js.Any = js.native
  
  var _ApplyPropertiesToEntity: js.Any = js.native
}
