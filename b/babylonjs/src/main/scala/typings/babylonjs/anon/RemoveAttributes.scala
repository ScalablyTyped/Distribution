package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAttributes extends StObject {
  
  var removeAttributes: js.UndefOr[Boolean] = js.native
  
  var removeIfDef: js.UndefOr[Boolean] = js.native
  
  var removeUniforms: js.UndefOr[Boolean] = js.native
  
  var removeVaryings: js.UndefOr[Boolean] = js.native
  
  var repeatKey: js.UndefOr[String] = js.native
  
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.native
}
object RemoveAttributes {
  
  @scala.inline
  def apply(): RemoveAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveAttributes]
  }
  
  @scala.inline
  implicit class RemoveAttributesMutableBuilder[Self <: RemoveAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveAttributes(value: Boolean): Self = StObject.set(x, "removeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAttributesUndefined: Self = StObject.set(x, "removeAttributes", js.undefined)
    
    @scala.inline
    def setRemoveIfDef(value: Boolean): Self = StObject.set(x, "removeIfDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIfDefUndefined: Self = StObject.set(x, "removeIfDef", js.undefined)
    
    @scala.inline
    def setRemoveUniforms(value: Boolean): Self = StObject.set(x, "removeUniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUniformsUndefined: Self = StObject.set(x, "removeUniforms", js.undefined)
    
    @scala.inline
    def setRemoveVaryings(value: Boolean): Self = StObject.set(x, "removeVaryings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveVaryingsUndefined: Self = StObject.set(x, "removeVaryings", js.undefined)
    
    @scala.inline
    def setRepeatKey(value: String): Self = StObject.set(x, "repeatKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatKeyUndefined: Self = StObject.set(x, "repeatKey", js.undefined)
    
    @scala.inline
    def setReplaceStrings(value: js.Array[Replace]): Self = StObject.set(x, "replaceStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceStringsUndefined: Self = StObject.set(x, "replaceStrings", js.undefined)
    
    @scala.inline
    def setReplaceStringsVarargs(value: Replace*): Self = StObject.set(x, "replaceStrings", js.Array(value :_*))
  }
}
