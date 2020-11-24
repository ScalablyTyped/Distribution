package typings.babylonjs.miscIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "SceneRecorder")
@js.native
class SceneRecorder ()
  extends typings.babylonjs.sceneRecorderMod.SceneRecorder
/* static members */
@JSImport("babylonjs/Misc/index", "SceneRecorder")
@js.native
object SceneRecorder extends js.Object {
  
  def ApplyDelta(deltaJSON: String, scene: Scene): Unit = js.native
  /**
    * Apply a given delta to a given scene
    * @param deltaJSON defines the JSON containing the delta
    * @param scene defines the scene to apply the delta to
    */
  def ApplyDelta(deltaJSON: js.Any, scene: Scene): Unit = js.native
  
  var GetShadowGeneratorById: js.Any = js.native
  
  var _ApplyDeltaForEntity: js.Any = js.native
  
  var _ApplyPropertiesToEntity: js.Any = js.native
}
