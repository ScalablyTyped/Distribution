package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.FlowElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, auditing, monitoring, categoryValueRef */ trait DataObjectReference
  extends StObject
     with ItemAwareElement {
  
  var auditing: Auditing
  
  var categoryValueRef: js.Array[CategoryValue]
  
  var dataObjectRef: DataObject
  
  var monitoring: Monitoring
  
  var name: js.UndefOr[String] = js.undefined
}
object DataObjectReference {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataObjectRef: DataObject,
    dataState: DataState,
    id: String,
    itemSubjectRef: ItemDefinition,
    monitoring: Monitoring
  ): DataObjectReference = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataObjectRef = dataObjectRef.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectReference]
  }
  
  extension [Self <: DataObjectReference](x: Self) {
    
    inline def setAuditing(value: Auditing): Self = StObject.set(x, "auditing", value.asInstanceOf[js.Any])
    
    inline def setCategoryValueRef(value: js.Array[CategoryValue]): Self = StObject.set(x, "categoryValueRef", value.asInstanceOf[js.Any])
    
    inline def setCategoryValueRefVarargs(value: CategoryValue*): Self = StObject.set(x, "categoryValueRef", js.Array(value*))
    
    inline def setDataObjectRef(value: DataObject): Self = StObject.set(x, "dataObjectRef", value.asInstanceOf[js.Any])
    
    inline def setMonitoring(value: Monitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
