package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionPlacementConstraint extends js.Object {
  /**
    * A cluster query language expression to apply to the constraint. For more information, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide.
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * The type of constraint. The MemberOf constraint restricts selection to be from a group of valid candidates.
    */
  var `type`: js.UndefOr[TaskDefinitionPlacementConstraintType] = js.native
}

object TaskDefinitionPlacementConstraint {
  @scala.inline
  def apply(): TaskDefinitionPlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionPlacementConstraint]
  }
  @scala.inline
  implicit class TaskDefinitionPlacementConstraintOps[Self <: TaskDefinitionPlacementConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setType(value: TaskDefinitionPlacementConstraintType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

