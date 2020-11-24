package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITexturePackerFrame extends js.Object {
  
  /**
    * The frame ID
    */
  var id: Double = js.native
  
  /**
    * The Frames offset
    */
  var offset: Vector2 = js.native
  
  /**
    * The frames Scale
    */
  var scale: Vector2 = js.native
}
object ITexturePackerFrame {
  
  @scala.inline
  def apply(id: Double, offset: Vector2, scale: Vector2): ITexturePackerFrame = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITexturePackerFrame]
  }
  
  @scala.inline
  implicit class ITexturePackerFrameOps[Self <: ITexturePackerFrame] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Vector2): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Vector2): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
}
