package typings.babylonjs.anon

import typings.babylonjs.BABYLON.BaseTexture
import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Texture extends StObject {
  
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
  implicit class TextureMutableBuilder[Self <: Texture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color4): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: Nullable[BaseTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureNull: Self = StObject.set(x, "texture", null)
  }
}
