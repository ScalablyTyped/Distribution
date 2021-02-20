package typings.ckeditorCkeditor5Engine.mod.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCompiledItemDefinition extends StObject {
  
  var allowAttributes: String | js.Array[String] = js.native
  
  var allowIn: String | js.Array[String] = js.native
  
  var isBlock: Boolean = js.native
  
  var isLimit: Boolean = js.native
  
  var isObject: Boolean = js.native
  
  var name: String = js.native
}
object SchemaCompiledItemDefinition {
  
  @scala.inline
  def apply(
    allowAttributes: String | js.Array[String],
    allowIn: String | js.Array[String],
    isBlock: Boolean,
    isLimit: Boolean,
    isObject: Boolean,
    name: String
  ): SchemaCompiledItemDefinition = {
    val __obj = js.Dynamic.literal(allowAttributes = allowAttributes.asInstanceOf[js.Any], allowIn = allowIn.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], isLimit = isLimit.asInstanceOf[js.Any], isObject = isObject.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompiledItemDefinition]
  }
  
  @scala.inline
  implicit class SchemaCompiledItemDefinitionMutableBuilder[Self <: SchemaCompiledItemDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAttributes(value: String | js.Array[String]): Self = StObject.set(x, "allowAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAttributesVarargs(value: String*): Self = StObject.set(x, "allowAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAllowIn(value: String | js.Array[String]): Self = StObject.set(x, "allowIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInVarargs(value: String*): Self = StObject.set(x, "allowIn", js.Array(value :_*))
    
    @scala.inline
    def setIsBlock(value: Boolean): Self = StObject.set(x, "isBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLimit(value: Boolean): Self = StObject.set(x, "isLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObject(value: Boolean): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
