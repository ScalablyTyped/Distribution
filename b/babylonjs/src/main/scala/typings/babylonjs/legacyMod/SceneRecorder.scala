package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SceneRecorder")
@js.native
class SceneRecorder ()
  extends typings.babylonjs.indexMod.SceneRecorder
/* static members */
object SceneRecorder {
  
  @JSImport("babylonjs/Legacy/legacy", "SceneRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "SceneRecorder.ApplyDelta")
  @js.native
  def ApplyDelta(deltaJSON: String, scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
  /**
    * Apply a given delta to a given scene
    * @param deltaJSON defines the JSON containing the delta
    * @param scene defines the scene to apply the delta to
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneRecorder.ApplyDelta")
  @js.native
  def ApplyDelta(deltaJSON: js.Any, scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "SceneRecorder.GetShadowGeneratorById")
  @js.native
  def GetShadowGeneratorById: js.Any = js.native
  @scala.inline
  def GetShadowGeneratorById_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShadowGeneratorById")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "SceneRecorder._ApplyDeltaForEntity")
  @js.native
  def _ApplyDeltaForEntity: js.Any = js.native
  @scala.inline
  def _ApplyDeltaForEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyDeltaForEntity")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "SceneRecorder._ApplyPropertiesToEntity")
  @js.native
  def _ApplyPropertiesToEntity: js.Any = js.native
  @scala.inline
  def _ApplyPropertiesToEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPropertiesToEntity")(x.asInstanceOf[js.Any])
}
