package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.ObjectProperty_
  - typings.babelTypes.indexTs37Mod.ClassProperty_
  - typings.babelTypes.indexTs37Mod.ClassPrivateProperty_
*/
trait Property
  extends StObject
     with _Node
object Property {
  
  @scala.inline
  def ClassPrivateProperty_(key: PrivateName_, static: js.Any): typings.babelTypes.indexTs37Mod.ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, value = null)
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ClassPrivateProperty_]
  }
  
  @scala.inline
  def ClassProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    static: Boolean
  ): typings.babelTypes.indexTs37Mod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], accessibility = null, declare = null, decorators = null, definite = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null, value = null)
    __obj.updateDynamic("type")("ClassProperty")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ClassProperty_]
  }
  
  @scala.inline
  def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    shorthand: Boolean,
    value: Expression | PatternLike
  ): typings.babelTypes.indexTs37Mod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectProperty_]
  }
}
