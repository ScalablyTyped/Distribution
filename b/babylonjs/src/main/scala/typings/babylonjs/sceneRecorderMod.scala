package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneRecorderMod {
  
  @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder")
  @js.native
  class SceneRecorder () extends StObject {
    
    var _compareArray: js.Any = js.native
    
    var _compareCollections: js.Any = js.native
    
    var _compareObjects: js.Any = js.native
    
    var _savedJSON: js.Any = js.native
    
    var _trackedScene: js.Any = js.native
    
    /**
      * Get the delta between current state and original state
      * @returns a string containing the delta
      */
    def getDelta(): js.Any = js.native
    
    /**
      * Track a given scene. This means the current scene state will be considered the original state
      * @param scene defines the scene to track
      */
    def track(scene: Scene): Unit = js.native
  }
  /* static members */
  object SceneRecorder {
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder.ApplyDelta")
    @js.native
    def ApplyDelta(deltaJSON: String, scene: Scene): Unit = js.native
    /**
      * Apply a given delta to a given scene
      * @param deltaJSON defines the JSON containing the delta
      * @param scene defines the scene to apply the delta to
      */
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder.ApplyDelta")
    @js.native
    def ApplyDelta(deltaJSON: js.Any, scene: Scene): Unit = js.native
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder.GetShadowGeneratorById")
    @js.native
    def GetShadowGeneratorById: js.Any = js.native
    @scala.inline
    def GetShadowGeneratorById_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShadowGeneratorById")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder._ApplyDeltaForEntity")
    @js.native
    def _ApplyDeltaForEntity: js.Any = js.native
    @scala.inline
    def _ApplyDeltaForEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyDeltaForEntity")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder._ApplyPropertiesToEntity")
    @js.native
    def _ApplyPropertiesToEntity: js.Any = js.native
    @scala.inline
    def _ApplyPropertiesToEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPropertiesToEntity")(x.asInstanceOf[js.Any])
  }
}
