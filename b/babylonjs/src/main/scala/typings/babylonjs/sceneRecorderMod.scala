package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneRecorderMod {
  
  @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder")
  @js.native
  open class SceneRecorder () extends StObject {
    
    /* private */ var _compareArray: Any = js.native
    
    /* private */ var _compareCollections: Any = js.native
    
    /* private */ var _compareObjects: Any = js.native
    
    /* private */ var _savedJSON: Any = js.native
    
    /* private */ var _trackedScene: Any = js.native
    
    /**
      * Get the delta between current state and original state
      * @returns a any containing the delta
      */
    def getDelta(): Any = js.native
    
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
    inline def ApplyDelta(deltaJSON: Any, scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyDelta")(deltaJSON.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder.GetShadowGeneratorById")
    @js.native
    def GetShadowGeneratorById: Any = js.native
    inline def GetShadowGeneratorById_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShadowGeneratorById")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder._ApplyDeltaForEntity")
    @js.native
    def _ApplyDeltaForEntity: Any = js.native
    inline def _ApplyDeltaForEntity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyDeltaForEntity")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/sceneRecorder", "SceneRecorder._ApplyPropertiesToEntity")
    @js.native
    def _ApplyPropertiesToEntity: Any = js.native
    inline def _ApplyPropertiesToEntity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPropertiesToEntity")(x.asInstanceOf[js.Any])
  }
}
