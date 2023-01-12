package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneRecorder extends StObject {
  
  /* private */ var _compareArray: Any
  
  /* private */ var _compareCollections: Any
  
  /* private */ var _compareObjects: Any
  
  /* private */ var _savedJSON: Any
  
  /* private */ var _trackedScene: Any
  
  /**
    * Get the delta between current state and original state
    * @returns a any containing the delta
    */
  def getDelta(): Any
  
  /**
    * Track a given scene. This means the current scene state will be considered the original state
    * @param scene defines the scene to track
    */
  def track(scene: Scene): Unit
}
object SceneRecorder {
  
  inline def apply(
    _compareArray: Any,
    _compareCollections: Any,
    _compareObjects: Any,
    _savedJSON: Any,
    _trackedScene: Any,
    getDelta: () => Any,
    track: Scene => Unit
  ): SceneRecorder = {
    val __obj = js.Dynamic.literal(_compareArray = _compareArray.asInstanceOf[js.Any], _compareCollections = _compareCollections.asInstanceOf[js.Any], _compareObjects = _compareObjects.asInstanceOf[js.Any], _savedJSON = _savedJSON.asInstanceOf[js.Any], _trackedScene = _trackedScene.asInstanceOf[js.Any], getDelta = js.Any.fromFunction0(getDelta), track = js.Any.fromFunction1(track))
    __obj.asInstanceOf[SceneRecorder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneRecorder] (val x: Self) extends AnyVal {
    
    inline def setGetDelta(value: () => Any): Self = StObject.set(x, "getDelta", js.Any.fromFunction0(value))
    
    inline def setTrack(value: Scene => Unit): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def set_compareArray(value: Any): Self = StObject.set(x, "_compareArray", value.asInstanceOf[js.Any])
    
    inline def set_compareCollections(value: Any): Self = StObject.set(x, "_compareCollections", value.asInstanceOf[js.Any])
    
    inline def set_compareObjects(value: Any): Self = StObject.set(x, "_compareObjects", value.asInstanceOf[js.Any])
    
    inline def set_savedJSON(value: Any): Self = StObject.set(x, "_savedJSON", value.asInstanceOf[js.Any])
    
    inline def set_trackedScene(value: Any): Self = StObject.set(x, "_trackedScene", value.asInstanceOf[js.Any])
  }
}
