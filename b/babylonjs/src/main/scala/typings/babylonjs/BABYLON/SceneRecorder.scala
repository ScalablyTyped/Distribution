package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneRecorder extends StObject {
  
  /* private */ var _compareArray: js.Any
  
  /* private */ var _compareCollections: js.Any
  
  /* private */ var _compareObjects: js.Any
  
  /* private */ var _savedJSON: js.Any
  
  /* private */ var _trackedScene: js.Any
  
  /**
    * Get the delta between current state and original state
    * @returns a string containing the delta
    */
  def getDelta(): js.Any
  
  /**
    * Track a given scene. This means the current scene state will be considered the original state
    * @param scene defines the scene to track
    */
  def track(scene: Scene): Unit
}
object SceneRecorder {
  
  inline def apply(
    _compareArray: js.Any,
    _compareCollections: js.Any,
    _compareObjects: js.Any,
    _savedJSON: js.Any,
    _trackedScene: js.Any,
    getDelta: () => js.Any,
    track: Scene => Unit
  ): SceneRecorder = {
    val __obj = js.Dynamic.literal(_compareArray = _compareArray.asInstanceOf[js.Any], _compareCollections = _compareCollections.asInstanceOf[js.Any], _compareObjects = _compareObjects.asInstanceOf[js.Any], _savedJSON = _savedJSON.asInstanceOf[js.Any], _trackedScene = _trackedScene.asInstanceOf[js.Any], getDelta = js.Any.fromFunction0(getDelta), track = js.Any.fromFunction1(track))
    __obj.asInstanceOf[SceneRecorder]
  }
  
  extension [Self <: SceneRecorder](x: Self) {
    
    inline def setGetDelta(value: () => js.Any): Self = StObject.set(x, "getDelta", js.Any.fromFunction0(value))
    
    inline def setTrack(value: Scene => Unit): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def set_compareArray(value: js.Any): Self = StObject.set(x, "_compareArray", value.asInstanceOf[js.Any])
    
    inline def set_compareCollections(value: js.Any): Self = StObject.set(x, "_compareCollections", value.asInstanceOf[js.Any])
    
    inline def set_compareObjects(value: js.Any): Self = StObject.set(x, "_compareObjects", value.asInstanceOf[js.Any])
    
    inline def set_savedJSON(value: js.Any): Self = StObject.set(x, "_savedJSON", value.asInstanceOf[js.Any])
    
    inline def set_trackedScene(value: js.Any): Self = StObject.set(x, "_trackedScene", value.asInstanceOf[js.Any])
  }
}
