package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workflow extends js.Object {
  /**
    * The date and time when the workflow was created.
    */
  var CreatedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.native
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.native
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.native
  /**
    * The date and time when the workflow was last modified.
    */
  var LastModifiedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * The information about the last execution of the workflow.
    */
  var LastRun: js.UndefOr[WorkflowRun] = js.native
  /**
    * The name of the workflow representing the flow.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object Workflow {
  @scala.inline
  def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  @scala.inline
  implicit class WorkflowOps[Self <: Workflow] (val x: Self) extends AnyVal {
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
    def setCreatedOn(value: TimestampValue): Self = this.set("CreatedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedOn: Self = this.set("CreatedOn", js.undefined)
    @scala.inline
    def setDefaultRunProperties(value: WorkflowRunProperties): Self = this.set("DefaultRunProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRunProperties: Self = this.set("DefaultRunProperties", js.undefined)
    @scala.inline
    def setDescription(value: GenericString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setGraph(value: WorkflowGraph): Self = this.set("Graph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraph: Self = this.set("Graph", js.undefined)
    @scala.inline
    def setLastModifiedOn(value: TimestampValue): Self = this.set("LastModifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedOn: Self = this.set("LastModifiedOn", js.undefined)
    @scala.inline
    def setLastRun(value: WorkflowRun): Self = this.set("LastRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRun: Self = this.set("LastRun", js.undefined)
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

