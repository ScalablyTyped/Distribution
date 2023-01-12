package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ObjectTypeIndexer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeIndexer_
  extends StObject
     with BaseNode
     with Flow
     with Node
     with UserWhitespacable {
  
  var id: js.UndefOr[Identifier_ | Null] = js.undefined
  
  var key: FlowType
  
  var static: Boolean
  
  @JSName("type")
  var type_ObjectTypeIndexer_ : ObjectTypeIndexer
  
  var value: FlowType
  
  var variance: js.UndefOr[Variance_ | Null] = js.undefined
}
object ObjectTypeIndexer_ {
  
  inline def apply(key: FlowType, static: Boolean, value: FlowType): ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[ObjectTypeIndexer_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectTypeIndexer_] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey(value: FlowType): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setType(value: ObjectTypeIndexer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FlowType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariance(value: Variance_): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceNull: Self = StObject.set(x, "variance", null)
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
