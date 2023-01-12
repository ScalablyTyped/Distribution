package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAttributes extends StObject {
  
  var removeAttributes: js.UndefOr[Boolean] = js.undefined
  
  var removeIfDef: js.UndefOr[Boolean] = js.undefined
  
  var removeUniforms: js.UndefOr[Boolean] = js.undefined
  
  var removeVaryings: js.UndefOr[Boolean] = js.undefined
  
  var repeatKey: js.UndefOr[String] = js.undefined
  
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.undefined
}
object RemoveAttributes {
  
  inline def apply(): RemoveAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveAttributes] (val x: Self) extends AnyVal {
    
    inline def setRemoveAttributes(value: Boolean): Self = StObject.set(x, "removeAttributes", value.asInstanceOf[js.Any])
    
    inline def setRemoveAttributesUndefined: Self = StObject.set(x, "removeAttributes", js.undefined)
    
    inline def setRemoveIfDef(value: Boolean): Self = StObject.set(x, "removeIfDef", value.asInstanceOf[js.Any])
    
    inline def setRemoveIfDefUndefined: Self = StObject.set(x, "removeIfDef", js.undefined)
    
    inline def setRemoveUniforms(value: Boolean): Self = StObject.set(x, "removeUniforms", value.asInstanceOf[js.Any])
    
    inline def setRemoveUniformsUndefined: Self = StObject.set(x, "removeUniforms", js.undefined)
    
    inline def setRemoveVaryings(value: Boolean): Self = StObject.set(x, "removeVaryings", value.asInstanceOf[js.Any])
    
    inline def setRemoveVaryingsUndefined: Self = StObject.set(x, "removeVaryings", js.undefined)
    
    inline def setRepeatKey(value: String): Self = StObject.set(x, "repeatKey", value.asInstanceOf[js.Any])
    
    inline def setRepeatKeyUndefined: Self = StObject.set(x, "repeatKey", js.undefined)
    
    inline def setReplaceStrings(value: js.Array[Replace]): Self = StObject.set(x, "replaceStrings", value.asInstanceOf[js.Any])
    
    inline def setReplaceStringsUndefined: Self = StObject.set(x, "replaceStrings", js.undefined)
    
    inline def setReplaceStringsVarargs(value: Replace*): Self = StObject.set(x, "replaceStrings", js.Array(value*))
  }
}
