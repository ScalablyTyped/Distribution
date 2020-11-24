package typings.babylonjs.anon

import typings.babylonjs.BABYLON.BaseTexture
import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Texture extends js.Object {
  
  var color: Color4 = js.native
  
  var texture: Nullable[BaseTexture] = js.native
}
object Texture {
  
  @scala.inline
  def apply(color: Color4): Texture = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Texture]
  }
  
  @scala.inline
  implicit class TextureOps[Self <: Texture] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color4): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: Nullable[BaseTexture]): Self = this.set("texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureNull: Self = this.set("texture", null)
  }
}
