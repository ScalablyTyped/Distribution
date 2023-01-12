package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ObjectTypeProperty
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.init
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeProperty_
  extends StObject
     with BaseNode
     with Flow
     with Node
     with UserWhitespacable {
  
  var key: Identifier_ | StringLiteral_
  
  var kind: init | get | set
  
  var method: Boolean
  
  var optional: Boolean
  
  var proto: Boolean
  
  var static: Boolean
  
  @JSName("type")
  var type_ObjectTypeProperty_ : ObjectTypeProperty
  
  var value: FlowType
  
  var variance: js.UndefOr[Variance_ | Null] = js.undefined
}
object ObjectTypeProperty_ {
  
  inline def apply(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    method: Boolean,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    value: FlowType
  ): ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[ObjectTypeProperty_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectTypeProperty_] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: init | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setProto(value: Boolean): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setType(value: ObjectTypeProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FlowType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariance(value: Variance_): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceNull: Self = StObject.set(x, "variance", null)
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
