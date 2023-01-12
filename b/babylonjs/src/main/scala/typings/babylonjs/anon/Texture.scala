package typings.babylonjs.anon

import typings.babylonjs.BABYLON.BaseTexture
import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Texture extends StObject {
  
  var color: Color4
  
  var texture: Nullable[BaseTexture]
}
object Texture {
  
  inline def apply(color: Color4): Texture = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], texture = null)
    __obj.asInstanceOf[Texture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Texture] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color4): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Nullable[BaseTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureNull: Self = StObject.set(x, "texture", null)
  }
}
