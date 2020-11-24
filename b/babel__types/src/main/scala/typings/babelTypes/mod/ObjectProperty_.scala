package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectProperty_
  extends ObjectMember
     with BaseNode
     with Property
     with UserWhitespacable {
  
  var computed: Boolean = js.native
  
  var decorators: js.Array[Decorator_] | Null = js.native
  
  var key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ = js.native
  
  var shorthand: Boolean = js.native
  
  @JSName("type")
  var type_ObjectProperty_ : ObjectProperty = js.native
  
  var value: Expression | PatternLike = js.native
}
object ObjectProperty_ {
  
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    shorthand: Boolean,
    `type`: ObjectProperty,
    value: Expression | PatternLike
  ): ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectProperty_]
  }
  
  @scala.inline
  implicit class ObjectProperty_Ops[Self <: ObjectProperty_] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Expression | Identifier_ | StringLiteral_ | NumericLiteral_): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthand(value: Boolean): Self = this.set("shorthand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectProperty): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Expression | PatternLike): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = this.set("decorators", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = this.set("decorators", null)
  }
}
