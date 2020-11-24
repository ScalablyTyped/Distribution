package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.OptionalMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait OptionalMemberExpression_
  extends Expression
     with BaseNode {
  
  var computed: Boolean = js.native
  
  var `object`: Expression = js.native
  
  var optional: Boolean = js.native
  
  var property: Expression | Identifier_ = js.native
  
  @JSName("type")
  var type_OptionalMemberExpression_ : OptionalMemberExpression = js.native
}
object OptionalMemberExpression_ {
  
  @scala.inline
  def apply(
    computed: Boolean,
    `object`: Expression,
    optional: Boolean,
    property: Expression | Identifier_,
    `type`: OptionalMemberExpression
  ): OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalMemberExpression_]
  }
  
  @scala.inline
  implicit class OptionalMemberExpression_Ops[Self <: OptionalMemberExpression_] (val x: Self) extends AnyVal {
    
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
    def setComputed(value: Boolean): Self = this.set("computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Expression): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Expression | Identifier_): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OptionalMemberExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
