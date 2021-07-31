package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.init
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.ObjectMethod_
  - typings.babelTypes.indexTs37Mod.ObjectProperty_
  - typings.babelTypes.indexTs37Mod.ObjectTypeInternalSlot_
  - typings.babelTypes.indexTs37Mod.ObjectTypeCallProperty_
  - typings.babelTypes.indexTs37Mod.ObjectTypeIndexer_
  - typings.babelTypes.indexTs37Mod.ObjectTypeProperty_
  - typings.babelTypes.indexTs37Mod.ObjectTypeSpreadProperty_
*/
trait UserWhitespacable
  extends StObject
     with _Node
object UserWhitespacable {
  
  @scala.inline
  def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    kind: method | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.indexTs37Mod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectMethod_]
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
  
  @scala.inline
  def ObjectTypeCallProperty_(static: Boolean, value: FlowType): typings.babelTypes.indexTs37Mod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectTypeCallProperty_]
  }
  
  @scala.inline
  def ObjectTypeIndexer_(key: FlowType, static: Boolean, value: FlowType): typings.babelTypes.indexTs37Mod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, id = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, variance = null)
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectTypeIndexer_]
  }
  
  @scala.inline
  def ObjectTypeInternalSlot_(id: Identifier_, method: Boolean, optional: Boolean, static: Boolean, value: FlowType): typings.babelTypes.indexTs37Mod.ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeInternalSlot")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectTypeInternalSlot_]
  }
  
  @scala.inline
  def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    value: FlowType
  ): typings.babelTypes.indexTs37Mod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, variance = null)
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectTypeProperty_]
  }
  
  @scala.inline
  def ObjectTypeSpreadProperty_(argument: FlowType): typings.babelTypes.indexTs37Mod.ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectTypeSpreadProperty_]
  }
}
