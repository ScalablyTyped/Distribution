package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
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
  implicit class ObjectTypeAnnotation_Ops[Self <: ObjectTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (ObjectTypeProperty_ | ObjectTypeSpreadProperty_)*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallPropertiesVarargs(value: ObjectTypeCallProperty_ *): Self = this.set("callProperties", js.Array(value :_*))
    
    @scala.inline
    def setCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = this.set("callProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallPropertiesNull: Self = this.set("callProperties", null)
    
    @scala.inline
    def setIndexersVarargs(value: ObjectTypeIndexer_ *): Self = this.set("indexers", js.Array(value :_*))
    
    @scala.inline
    def setIndexers(value: js.Array[ObjectTypeIndexer_]): Self = this.set("indexers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexersNull: Self = this.set("indexers", null)
    
    @scala.inline
    def setInexact(value: Boolean): Self = this.set("inexact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInexactNull: Self = this.set("inexact", null)
    
    @scala.inline
    def setInternalSlotsVarargs(value: ObjectTypeInternalSlot_ *): Self = this.set("internalSlots", js.Array(value :_*))
    
    @scala.inline
    def setInternalSlots(value: js.Array[ObjectTypeInternalSlot_]): Self = this.set("internalSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalSlotsNull: Self = this.set("internalSlots", null)
  }
}
