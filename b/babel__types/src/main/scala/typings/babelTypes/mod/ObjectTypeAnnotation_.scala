package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  var callProperties: js.Array[ObjectTypeCallProperty_]
  
  var exact: Boolean
  
  var indexers: js.Array[ObjectTypeIndexer_]
  
  var inexact: Boolean | Null
  
  var internalSlots: js.Array[ObjectTypeInternalSlot_]
  
  var properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]
  
  @JSName("type")
  var type_ObjectTypeAnnotation_ : ObjectTypeAnnotation
}
object ObjectTypeAnnotation_ {
  
  inline def apply(
    callProperties: js.Array[ObjectTypeCallProperty_],
    exact: Boolean,
    indexers: js.Array[ObjectTypeIndexer_],
    internalSlots: js.Array[ObjectTypeInternalSlot_],
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]
  ): ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], internalSlots = internalSlots.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], end = null, inexact = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[ObjectTypeAnnotation_]
  }
  
  extension [Self <: ObjectTypeAnnotation_](x: Self) {
    
    inline def setCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = StObject.set(x, "callProperties", value.asInstanceOf[js.Any])
    
    inline def setCallPropertiesVarargs(value: ObjectTypeCallProperty_ *): Self = StObject.set(x, "callProperties", js.Array(value*))
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setIndexers(value: js.Array[ObjectTypeIndexer_]): Self = StObject.set(x, "indexers", value.asInstanceOf[js.Any])
    
    inline def setIndexersVarargs(value: ObjectTypeIndexer_ *): Self = StObject.set(x, "indexers", js.Array(value*))
    
    inline def setInexact(value: Boolean): Self = StObject.set(x, "inexact", value.asInstanceOf[js.Any])
    
    inline def setInexactNull: Self = StObject.set(x, "inexact", null)
    
    inline def setInternalSlots(value: js.Array[ObjectTypeInternalSlot_]): Self = StObject.set(x, "internalSlots", value.asInstanceOf[js.Any])
    
    inline def setInternalSlotsVarargs(value: ObjectTypeInternalSlot_ *): Self = StObject.set(x, "internalSlots", js.Array(value*))
    
    inline def setProperties(value: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (ObjectTypeProperty_ | ObjectTypeSpreadProperty_)*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: ObjectTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
