package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SceneRecorder")
@js.native
class SceneRecorder ()
  extends StObject
     with typings.babylonjs.BABYLON.SceneRecorder {
  
  /* private */ /* CompleteClass */
  var _compareArray: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _compareCollections: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _compareObjects: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _savedJSON: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _trackedScene: js.Any = js.native
  
  /**
    * Get the delta between current state and original state
    * @returns a string containing the delta
    */
  /* CompleteClass */
  override def getDelta(): js.Any = js.native
  
  /**
    * Track a given scene. This means the current scene state will be considered the original state
    * @param scene defines the scene to track
    */
  /* CompleteClass */
  override def track(scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
}
/* static members */
object SceneRecorder {
  
  @JSGlobal("BABYLON.SceneRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ApplyDelta(deltaJSON: String, scene: typings.babylonjs.BABYLON.Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyDelta")(deltaJSON.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Apply a given delta to a given scene
    * @param deltaJSON defines the JSON containing the delta
    * @param scene defines the scene to apply the delta to
    */
  inline def ApplyDelta(deltaJSON: js.Any, scene: typings.babylonjs.BABYLON.Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyDelta")(deltaJSON.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("BABYLON.SceneRecorder.GetShadowGeneratorById")
  @js.native
  def GetShadowGeneratorById: js.Any = js.native
  inline def GetShadowGeneratorById_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShadowGeneratorById")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.SceneRecorder._ApplyDeltaForEntity")
  @js.native
  def _ApplyDeltaForEntity: js.Any = js.native
  inline def _ApplyDeltaForEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyDeltaForEntity")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.SceneRecorder._ApplyPropertiesToEntity")
  @js.native
  def _ApplyPropertiesToEntity: js.Any = js.native
  inline def _ApplyPropertiesToEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPropertiesToEntity")(x.asInstanceOf[js.Any])
}
