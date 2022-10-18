package typings.babylonjs.anon

import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: Color4
  
  var texture: Nullable[BaseTexture]
}
object Color {
  
  inline def apply(color: Color4): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], texture = null)
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: Color4): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Nullable[BaseTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureNull: Self = StObject.set(x, "texture", null)
  }
}
