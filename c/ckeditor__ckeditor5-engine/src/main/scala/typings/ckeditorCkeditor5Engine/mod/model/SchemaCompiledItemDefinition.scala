package typings.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCompiledItemDefinition extends js.Object {
  
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
  implicit class SchemaCompiledItemDefinitionOps[Self <: SchemaCompiledItemDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowAttributesVarargs(value: String*): Self = this.set("allowAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAllowAttributes(value: String | js.Array[String]): Self = this.set("allowAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInVarargs(value: String*): Self = this.set("allowIn", js.Array(value :_*))
    
    @scala.inline
    def setAllowIn(value: String | js.Array[String]): Self = this.set("allowIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlock(value: Boolean): Self = this.set("isBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLimit(value: Boolean): Self = this.set("isLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObject(value: Boolean): Self = this.set("isObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
