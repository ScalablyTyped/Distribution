package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRunRequest extends js.Object {
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  /**
    * Name of the workflow being run.
    */
  var Name: NameString = js.native
  /**
    * The ID of the workflow run.
    */
  var RunId: IdString = js.native
}

object GetWorkflowRunRequest {
  @scala.inline
  def apply(Name: NameString, RunId: IdString): GetWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunRequest]
  }
  @scala.inline
  implicit class GetWorkflowRunRequestOps[Self <: GetWorkflowRunRequest] (val x: Self) extends AnyVal {
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunId(value: IdString): Self = this.set("RunId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeGraph(value: NullableBoolean): Self = this.set("IncludeGraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeGraph: Self = this.set("IncludeGraph", js.undefined)
  }
  
}

