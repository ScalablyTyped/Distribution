package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.ItemAwareElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined itemSubjectRef, dataState */ trait DataStoreReference
  extends StObject
     with FlowElement {
  
  var dataState: DataState
  
  var dataStoreRef: DataStore
  
  var itemSubjectRef: ItemDefinition
}
object DataStoreReference {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataState: DataState,
    dataStoreRef: DataStore,
    id: String,
    itemSubjectRef: ItemDefinition,
    monitoring: Monitoring
  ): DataStoreReference = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], dataStoreRef = dataStoreRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStoreReference]
  }
  
  extension [Self <: DataStoreReference](x: Self) {
    
    inline def setDataState(value: DataState): Self = StObject.set(x, "dataState", value.asInstanceOf[js.Any])
    
    inline def setDataStoreRef(value: DataStore): Self = StObject.set(x, "dataStoreRef", value.asInstanceOf[js.Any])
    
    inline def setItemSubjectRef(value: ItemDefinition): Self = StObject.set(x, "itemSubjectRef", value.asInstanceOf[js.Any])
  }
}
