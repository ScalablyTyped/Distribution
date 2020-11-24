package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneRecorder extends js.Object {
  
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
object SceneRecorder {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SceneRecorderOps[Self <: SceneRecorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_compareArray(value: js.Any): Self = this.set("_compareArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_compareCollections(value: js.Any): Self = this.set("_compareCollections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_compareObjects(value: js.Any): Self = this.set("_compareObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_savedJSON(value: js.Any): Self = this.set("_savedJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_trackedScene(value: js.Any): Self = this.set("_trackedScene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDelta(value: () => js.Any): Self = this.set("getDelta", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrack(value: Scene => Unit): Self = this.set("track", js.Any.fromFunction1(value))
  }
}
