package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.init
import typings.babelTypes.babelTypesStrings.method_
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.ObjectMethod_
  - typings.babelTypes.libMod.ObjectProperty_
  - typings.babelTypes.libMod.ObjectTypeInternalSlot_
  - typings.babelTypes.libMod.ObjectTypeCallProperty_
  - typings.babelTypes.libMod.ObjectTypeIndexer_
  - typings.babelTypes.libMod.ObjectTypeProperty_
  - typings.babelTypes.libMod.ObjectTypeSpreadProperty_
*/
trait UserWhitespacable extends StObject
object UserWhitespacable {
  
  inline def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_,
    kind: method_ | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typings.babelTypes.libMod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectMethod_]
  }
  
  inline def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | DecimalLiteral_ | PrivateName_,
    shorthand: Boolean,
    value: Expression | PatternLike
  ): typings.babelTypes.libMod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectProperty_]
  }
  
  inline def ObjectTypeCallProperty_(static: Boolean, value: FlowType): typings.babelTypes.libMod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeCallProperty_]
  }
  
  inline def ObjectTypeIndexer_(key: FlowType, static: Boolean, value: FlowType): typings.babelTypes.libMod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeIndexer_]
  }
  
  inline def ObjectTypeInternalSlot_(id: Identifier_, method: Boolean, optional: Boolean, static: Boolean, value: FlowType): typings.babelTypes.libMod.ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeInternalSlot")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeInternalSlot_]
  }
  
  inline def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    method: Boolean,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    value: FlowType
  ): typings.babelTypes.libMod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeProperty_]
  }
  
  inline def ObjectTypeSpreadProperty_(argument: FlowType): typings.babelTypes.libMod.ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeSpreadProperty_]
  }
}
