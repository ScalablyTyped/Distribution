package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectProperty
import org.scalablytyped.runtime.StObject
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
  implicit class ObjectProperty_MutableBuilder[Self <: ObjectProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: Expression | Identifier_ | StringLiteral_ | NumericLiteral_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Expression | PatternLike): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
