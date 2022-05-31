package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneRecorderMod {
  
  @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder")
  @js.native
  class SceneRecorder () extends StObject {
    
    /* private */ var _compareArray: js.Any = js.native
    
    /* private */ var _compareCollections: js.Any = js.native
    
    /* private */ var _compareObjects: js.Any = js.native
    
    /* private */ var _savedJSON: js.Any = js.native
    
    /* private */ var _trackedScene: js.Any = js.native
    
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
    
    inline def ApplyDelta(deltaJSON: String, scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyDelta")(deltaJSON.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Apply a given delta to a given scene
      * @param deltaJSON defines the JSON containing the delta
      * @param scene defines the scene to apply the delta to
      */
    inline def ApplyDelta(deltaJSON: js.Any, scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyDelta")(deltaJSON.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder.GetShadowGeneratorById")
    @js.native
    def GetShadowGeneratorById: js.Any = js.native
    inline def GetShadowGeneratorById_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShadowGeneratorById")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder._ApplyDeltaForEntity")
    @js.native
    def _ApplyDeltaForEntity: js.Any = js.native
    inline def _ApplyDeltaForEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyDeltaForEntity")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder._ApplyPropertiesToEntity")
    @js.native
    def _ApplyPropertiesToEntity: js.Any = js.native
    inline def _ApplyPropertiesToEntity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPropertiesToEntity")(x.asInstanceOf[js.Any])
  }
}
