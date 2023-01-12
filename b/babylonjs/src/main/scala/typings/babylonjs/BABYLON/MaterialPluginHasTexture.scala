package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginHasTexture extends StObject {
  
  var hasTexture: Boolean
  
  var texture: BaseTexture
}
object MaterialPluginHasTexture {
  
  inline def apply(hasTexture: Boolean, texture: BaseTexture): MaterialPluginHasTexture = {
    val __obj = js.Dynamic.literal(hasTexture = hasTexture.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginHasTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialPluginHasTexture] (val x: Self) extends AnyVal {
    
    inline def setHasTexture(value: Boolean): Self = StObject.set(x, "hasTexture", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: BaseTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
