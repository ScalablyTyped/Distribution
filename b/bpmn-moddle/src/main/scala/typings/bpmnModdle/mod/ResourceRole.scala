package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRole extends BaseElement {
  var ResourceParameterBindings: js.Array[ResourceParameterBinding] = js.native
  var name: String = js.native
  var resourceAssignmentExpression: ResourceAssignmentExpression = js.native
  var resourceRef: Resource = js.native
}

object ResourceRole {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    ResourceParameterBindings: js.Array[ResourceParameterBinding],
    id: String,
    name: String,
    resourceAssignmentExpression: ResourceAssignmentExpression,
    resourceRef: Resource
  ): ResourceRole = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], ResourceParameterBindings = ResourceParameterBindings.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceAssignmentExpression = resourceAssignmentExpression.asInstanceOf[js.Any], resourceRef = resourceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRole]
  }
  @scala.inline
  implicit class ResourceRoleOps[Self <: ResourceRole] (val x: Self) extends AnyVal {
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
    def setResourceParameterBindingsVarargs(value: ResourceParameterBinding*): Self = this.set("ResourceParameterBindings", js.Array(value :_*))
    @scala.inline
    def setResourceParameterBindings(value: js.Array[ResourceParameterBinding]): Self = this.set("ResourceParameterBindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceAssignmentExpression(value: ResourceAssignmentExpression): Self = this.set("resourceAssignmentExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceRef(value: Resource): Self = this.set("resourceRef", value.asInstanceOf[js.Any])
  }
  
}

