package typings.babylonjs.geometryBufferRendererMod

import typings.babylonjs.mathVectorMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait ISavedTransformationMatrix extends js.Object {
  
  var viewProjection: Matrix = js.native
  
  var world: Matrix = js.native
}
object ISavedTransformationMatrix {
  
  @scala.inline
  def apply(viewProjection: Matrix, world: Matrix): ISavedTransformationMatrix = {
    val __obj = js.Dynamic.literal(viewProjection = viewProjection.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavedTransformationMatrix]
  }
  
  @scala.inline
  implicit class ISavedTransformationMatrixOps[Self <: ISavedTransformationMatrix] (val x: Self) extends AnyVal {
    
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
    def setViewProjection(value: Matrix): Self = this.set("viewProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorld(value: Matrix): Self = this.set("world", value.asInstanceOf[js.Any])
  }
}
