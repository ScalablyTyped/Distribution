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
  
  var callProperties: js.Array[ObjectTypeCallProperty_] | Null
  
  var exact: Boolean
  
  var indexers: js.Array[ObjectTypeIndexer_] | Null
  
  var inexact: Boolean | Null
  
  var internalSlots: js.Array[ObjectTypeInternalSlot_] | Null
  
  var properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]
  
  @JSName("type")
  var type_ObjectTypeAnnotation_ : ObjectTypeAnnotation
}
object ObjectTypeAnnotation_ {
  
  inline def apply(exact: Boolean, properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], callProperties = null, end = null, indexers = null, inexact = null, innerComments = null, internalSlots = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[ObjectTypeAnnotation_]
  }
  
  extension [Self <: ObjectTypeAnnotation_](x: Self) {
    
    inline def setCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = StObject.set(x, "callProperties", value.asInstanceOf[js.Any])
    
    inline def setCallPropertiesNull: Self = StObject.set(x, "callProperties", null)
    
    inline def setCallPropertiesVarargs(value: ObjectTypeCallProperty_ *): Self = StObject.set(x, "callProperties", js.Array(value :_*))
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setIndexers(value: js.Array[ObjectTypeIndexer_]): Self = StObject.set(x, "indexers", value.asInstanceOf[js.Any])
    
    inline def setIndexersNull: Self = StObject.set(x, "indexers", null)
    
    inline def setIndexersVarargs(value: ObjectTypeIndexer_ *): Self = StObject.set(x, "indexers", js.Array(value :_*))
    
    inline def setInexact(value: Boolean): Self = StObject.set(x, "inexact", value.asInstanceOf[js.Any])
    
    inline def setInexactNull: Self = StObject.set(x, "inexact", null)
    
    inline def setInternalSlots(value: js.Array[ObjectTypeInternalSlot_]): Self = StObject.set(x, "internalSlots", value.asInstanceOf[js.Any])
    
    inline def setInternalSlotsNull: Self = StObject.set(x, "internalSlots", null)
    
    inline def setInternalSlotsVarargs(value: ObjectTypeInternalSlot_ *): Self = StObject.set(x, "internalSlots", js.Array(value :_*))
    
    inline def setProperties(value: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (ObjectTypeProperty_ | ObjectTypeSpreadProperty_)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    inline def setType(value: ObjectTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
