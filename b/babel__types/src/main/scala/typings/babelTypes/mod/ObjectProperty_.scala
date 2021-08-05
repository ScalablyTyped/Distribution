package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectProperty_
  extends StObject
     with BaseNode
     with ObjectMember
     with Property
     with UserWhitespacable {
  
  var computed: Boolean
  
  var decorators: js.Array[Decorator_] | Null
  
  var key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_
  
  var shorthand: Boolean
  
  @JSName("type")
  var type_ObjectProperty_ : ObjectProperty
  
  var value: Expression | PatternLike
}
object ObjectProperty_ {
  
  inline def apply(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    shorthand: Boolean,
    value: Expression | PatternLike
  ): ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[ObjectProperty_]
  }
  
  extension [Self <: ObjectProperty_](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    inline def setKey(value: Expression | Identifier_ | StringLiteral_ | NumericLiteral_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    
    inline def setType(value: ObjectProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression | PatternLike): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
