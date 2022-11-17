package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeAnnotation_
  extends StObject
     with BaseNode {
  
  var callProperties: js.UndefOr[js.Array[ObjectTypeCallProperty_]] = js.undefined
  
  var exact: Boolean
  
  var indexers: js.UndefOr[js.Array[ObjectTypeIndexer_]] = js.undefined
  
  var inexact: js.UndefOr[Boolean | Null] = js.undefined
  
  var internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlot_]] = js.undefined
  
  var properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]
  
  @JSName("type")
  var type_ObjectTypeAnnotation_ : "ObjectTypeAnnotation"
}
object ObjectTypeAnnotation_ {
  
  inline def apply(exact: Boolean, properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[ObjectTypeAnnotation_]
  }
  
  extension [Self <: ObjectTypeAnnotation_](x: Self) {
    
    inline def setCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = StObject.set(x, "callProperties", value.asInstanceOf[js.Any])
    
    inline def setCallPropertiesUndefined: Self = StObject.set(x, "callProperties", js.undefined)
    
    inline def setCallPropertiesVarargs(value: ObjectTypeCallProperty_ *): Self = StObject.set(x, "callProperties", js.Array(value*))
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setIndexers(value: js.Array[ObjectTypeIndexer_]): Self = StObject.set(x, "indexers", value.asInstanceOf[js.Any])
    
    inline def setIndexersUndefined: Self = StObject.set(x, "indexers", js.undefined)
    
    inline def setIndexersVarargs(value: ObjectTypeIndexer_ *): Self = StObject.set(x, "indexers", js.Array(value*))
    
    inline def setInexact(value: Boolean): Self = StObject.set(x, "inexact", value.asInstanceOf[js.Any])
    
    inline def setInexactNull: Self = StObject.set(x, "inexact", null)
    
    inline def setInexactUndefined: Self = StObject.set(x, "inexact", js.undefined)
    
    inline def setInternalSlots(value: js.Array[ObjectTypeInternalSlot_]): Self = StObject.set(x, "internalSlots", value.asInstanceOf[js.Any])
    
    inline def setInternalSlotsUndefined: Self = StObject.set(x, "internalSlots", js.undefined)
    
    inline def setInternalSlotsVarargs(value: ObjectTypeInternalSlot_ *): Self = StObject.set(x, "internalSlots", js.Array(value*))
    
    inline def setProperties(value: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (ObjectTypeProperty_ | ObjectTypeSpreadProperty_)*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: "ObjectTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
