package typings.babylonjs.anon

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  var color: Color4 = js.native
  
  var texture: Nullable[BaseTexture] = js.native
}
object Color {
  
  @scala.inline
  def apply(color: Color4): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color4): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: Nullable[BaseTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureNull: Self = StObject.set(x, "texture", null)
  }
}
