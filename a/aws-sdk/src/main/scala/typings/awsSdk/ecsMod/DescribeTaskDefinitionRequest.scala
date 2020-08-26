package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskDefinitionRequest extends js.Object {
  /**
    * Specifies whether to see the resource tags for the task definition. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[TaskDefinitionFieldList] = js.native
  /**
    * The family for the latest ACTIVE revision, family and revision (family:revision) for a specific revision in the family, or full Amazon Resource Name (ARN) of the task definition to describe.
    */
  var taskDefinition: String = js.native
}

object DescribeTaskDefinitionRequest {
  @scala.inline
  def apply(taskDefinition: String): DescribeTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskDefinitionRequest]
  }
  @scala.inline
  implicit class DescribeTaskDefinitionRequestOps[Self <: DescribeTaskDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setTaskDefinition(value: String): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeVarargs(value: TaskDefinitionField*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: TaskDefinitionFieldList): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
  
}

