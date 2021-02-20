package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  
  var callProperties: js.Array[ObjectTypeCallProperty_] | Null = js.native
  
  var exact: Boolean = js.native
  
  var indexers: js.Array[ObjectTypeIndexer_] | Null = js.native
  
  var inexact: Boolean | Null = js.native
  
  var internalSlots: js.Array[ObjectTypeInternalSlot_] | Null = js.native
  
  var properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_] = js.native
  
  @JSName("type")
  var type_ObjectTypeAnnotation_ : ObjectTypeAnnotation = js.native
}
object ObjectTypeAnnotation_ {
  
  @scala.inline
  def apply(
    exact: Boolean,
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
    `type`: ObjectTypeAnnotation
  ): ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeAnnotation_]
  }
  
  @scala.inline
  implicit class ObjectTypeAnnotation_MutableBuilder[Self <: ObjectTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = StObject.set(x, "callProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallPropertiesNull: Self = StObject.set(x, "callProperties", null)
    
    @scala.inline
    def setCallPropertiesVarargs(value: ObjectTypeCallProperty_ *): Self = StObject.set(x, "callProperties", js.Array(value :_*))
    
    @scala.inline
    def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexers(value: js.Array[ObjectTypeIndexer_]): Self = StObject.set(x, "indexers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexersNull: Self = StObject.set(x, "indexers", null)
    
    @scala.inline
    def setIndexersVarargs(value: ObjectTypeIndexer_ *): Self = StObject.set(x, "indexers", js.Array(value :_*))
    
    @scala.inline
    def setInexact(value: Boolean): Self = StObject.set(x, "inexact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInexactNull: Self = StObject.set(x, "inexact", null)
    
    @scala.inline
    def setInternalSlots(value: js.Array[ObjectTypeInternalSlot_]): Self = StObject.set(x, "internalSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalSlotsNull: Self = StObject.set(x, "internalSlots", null)
    
    @scala.inline
    def setInternalSlotsVarargs(value: ObjectTypeInternalSlot_ *): Self = StObject.set(x, "internalSlots", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (ObjectTypeProperty_ | ObjectTypeSpreadProperty_)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ObjectTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
