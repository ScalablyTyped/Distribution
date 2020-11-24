package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/sceneRecorder", JSImport.Namespace)
@js.native
object sceneRecorderMod extends js.Object {
  
  @js.native
  class SceneRecorder () extends js.Object {
    
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
}
