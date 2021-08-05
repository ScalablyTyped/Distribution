package typings.ckeditorCkeditor5Engine.mod.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompiledItemDefinition extends StObject {
  
  var allowAttributes: String | js.Array[String]
  
  var allowIn: String | js.Array[String]
  
  var isBlock: Boolean
  
  var isLimit: Boolean
  
  var isObject: Boolean
  
  var name: String
}
object SchemaCompiledItemDefinition {
  
  inline def apply(
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
  
  extension [Self <: SchemaCompiledItemDefinition](x: Self) {
    
    inline def setAllowAttributes(value: String | js.Array[String]): Self = StObject.set(x, "allowAttributes", value.asInstanceOf[js.Any])
    
    inline def setAllowAttributesVarargs(value: String*): Self = StObject.set(x, "allowAttributes", js.Array(value :_*))
    
    inline def setAllowIn(value: String | js.Array[String]): Self = StObject.set(x, "allowIn", value.asInstanceOf[js.Any])
    
    inline def setAllowInVarargs(value: String*): Self = StObject.set(x, "allowIn", js.Array(value :_*))
    
    inline def setIsBlock(value: Boolean): Self = StObject.set(x, "isBlock", value.asInstanceOf[js.Any])
    
    inline def setIsLimit(value: Boolean): Self = StObject.set(x, "isLimit", value.asInstanceOf[js.Any])
    
    inline def setIsObject(value: Boolean): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
