package typings.ckeditorCkeditor5Engine.mod.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaItemDefinition extends StObject {
  
  var allowAttributes: String | js.Array[String] = js.native
  
  var allowAttributesOf: String | js.Array[String] = js.native
  
  var allowContentOf: String | js.Array[String] = js.native
  
  var allowIn: String | js.Array[String] = js.native
  
  var allowWhere: String | js.Array[String] = js.native
  
  var inheritAllFrom: String | js.Array[String] = js.native
  
  var inheritTypesFrom: String | js.Array[String] = js.native
  
  var isBlock: Boolean = js.native
  
  var isLimit: Boolean = js.native
  
  var isObject: Boolean = js.native
}
object SchemaItemDefinition {
  
  @scala.inline
  def apply(
    allowAttributes: String | js.Array[String],
    allowAttributesOf: String | js.Array[String],
    allowContentOf: String | js.Array[String],
    allowIn: String | js.Array[String],
    allowWhere: String | js.Array[String],
    inheritAllFrom: String | js.Array[String],
    inheritTypesFrom: String | js.Array[String],
    isBlock: Boolean,
    isLimit: Boolean,
    isObject: Boolean
  ): SchemaItemDefinition = {
    val __obj = js.Dynamic.literal(allowAttributes = allowAttributes.asInstanceOf[js.Any], allowAttributesOf = allowAttributesOf.asInstanceOf[js.Any], allowContentOf = allowContentOf.asInstanceOf[js.Any], allowIn = allowIn.asInstanceOf[js.Any], allowWhere = allowWhere.asInstanceOf[js.Any], inheritAllFrom = inheritAllFrom.asInstanceOf[js.Any], inheritTypesFrom = inheritTypesFrom.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], isLimit = isLimit.asInstanceOf[js.Any], isObject = isObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaItemDefinition]
  }
  
  @scala.inline
  implicit class SchemaItemDefinitionMutableBuilder[Self <: SchemaItemDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAttributes(value: String | js.Array[String]): Self = StObject.set(x, "allowAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAttributesOf(value: String | js.Array[String]): Self = StObject.set(x, "allowAttributesOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAttributesOfVarargs(value: String*): Self = StObject.set(x, "allowAttributesOf", js.Array(value :_*))
    
    @scala.inline
    def setAllowAttributesVarargs(value: String*): Self = StObject.set(x, "allowAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAllowContentOf(value: String | js.Array[String]): Self = StObject.set(x, "allowContentOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowContentOfVarargs(value: String*): Self = StObject.set(x, "allowContentOf", js.Array(value :_*))
    
    @scala.inline
    def setAllowIn(value: String | js.Array[String]): Self = StObject.set(x, "allowIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInVarargs(value: String*): Self = StObject.set(x, "allowIn", js.Array(value :_*))
    
    @scala.inline
    def setAllowWhere(value: String | js.Array[String]): Self = StObject.set(x, "allowWhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowWhereVarargs(value: String*): Self = StObject.set(x, "allowWhere", js.Array(value :_*))
    
    @scala.inline
    def setInheritAllFrom(value: String | js.Array[String]): Self = StObject.set(x, "inheritAllFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritAllFromVarargs(value: String*): Self = StObject.set(x, "inheritAllFrom", js.Array(value :_*))
    
    @scala.inline
    def setInheritTypesFrom(value: String | js.Array[String]): Self = StObject.set(x, "inheritTypesFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritTypesFromVarargs(value: String*): Self = StObject.set(x, "inheritTypesFrom", js.Array(value :_*))
    
    @scala.inline
    def setIsBlock(value: Boolean): Self = StObject.set(x, "isBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLimit(value: Boolean): Self = StObject.set(x, "isLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObject(value: Boolean): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
  }
}
