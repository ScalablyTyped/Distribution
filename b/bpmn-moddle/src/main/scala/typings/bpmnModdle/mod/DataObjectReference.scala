package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.FlowElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, auditing, monitoring, categoryValueRef */ @js.native
trait DataObjectReference extends ItemAwareElement {
  var auditing: Auditing = js.native
  var categoryValueRef: js.Array[CategoryValue] = js.native
  var dataObjectRef: DataObject = js.native
  var monitoring: Monitoring = js.native
  var name: js.UndefOr[String] = js.native
}

object DataObjectReference {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class DataObjectReferenceOps[Self <: DataObjectReference] (val x: Self) extends AnyVal {
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
    def setAuditing(value: Auditing): Self = this.set("auditing", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryValueRefVarargs(value: CategoryValue*): Self = this.set("categoryValueRef", js.Array(value :_*))
    @scala.inline
    def setCategoryValueRef(value: js.Array[CategoryValue]): Self = this.set("categoryValueRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataObjectRef(value: DataObject): Self = this.set("dataObjectRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoring(value: Monitoring): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

