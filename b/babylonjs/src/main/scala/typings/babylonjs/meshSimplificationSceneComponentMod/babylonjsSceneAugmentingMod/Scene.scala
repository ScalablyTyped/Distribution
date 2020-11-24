package typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsSceneAugmentingMod

import typings.babylonjs.meshSimplificationMod.SimplificationQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene extends js.Object {
  
  /** @hidden (Backing field) */
  var _simplificationQueue: SimplificationQueue = js.native
  
  /**
    * Gets or sets the simplification queue attached to the scene
    * @see https://doc.babylonjs.com/how_to/in-browser_mesh_simplification
    */
  var simplificationQueue: SimplificationQueue = js.native
}
object Scene {
  
  @scala.inline
  def apply(_simplificationQueue: SimplificationQueue, simplificationQueue: SimplificationQueue): Scene = {
    val __obj = js.Dynamic.literal(_simplificationQueue = _simplificationQueue.asInstanceOf[js.Any], simplificationQueue = simplificationQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    
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
    def set_simplificationQueue(value: SimplificationQueue): Self = this.set("_simplificationQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplificationQueue(value: SimplificationQueue): Self = this.set("simplificationQueue", value.asInstanceOf[js.Any])
  }
}
