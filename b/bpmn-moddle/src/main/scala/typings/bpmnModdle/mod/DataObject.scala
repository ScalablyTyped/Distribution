package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.ItemAwareElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined itemSubjectRef, dataState */ trait DataObject
  extends StObject
     with FlowElement {
  
  var dataState: DataState
  
  /** @default false */
  var isCollection: Boolean
  
  var itemSubjectRef: ItemDefinition
}
object DataObject {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataState: DataState,
    id: String,
    isCollection: Boolean,
    itemSubjectRef: ItemDefinition,
    monitoring: Monitoring
  ): DataObject = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
  
  @scala.inline
  implicit class DataObjectMutableBuilder[Self <: DataObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataState(value: DataState): Self = StObject.set(x, "dataState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSubjectRef(value: ItemDefinition): Self = StObject.set(x, "itemSubjectRef", value.asInstanceOf[js.Any])
  }
}
