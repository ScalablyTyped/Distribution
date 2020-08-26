package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTypeInfo extends js.Object {
  /**
    * The date when this type was registered.
    */
  var creationDate: Timestamp = js.native
  /**
    * If the type is in deprecated state, then it is set to the date when the type was deprecated.
    */
  var deprecationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the type registered through RegisterWorkflowType.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The current status of the workflow type.
    */
  var status: RegistrationStatus = js.native
  /**
    * The workflow type this information is about.
    */
  var workflowType: WorkflowType = js.native
}

object WorkflowTypeInfo {
  @scala.inline
  def apply(creationDate: Timestamp, status: RegistrationStatus, workflowType: WorkflowType): WorkflowTypeInfo = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTypeInfo]
  }
  @scala.inline
  implicit class WorkflowTypeInfoOps[Self <: WorkflowTypeInfo] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: RegistrationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = this.set("workflowType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeprecationDate(value: Timestamp): Self = this.set("deprecationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationDate: Self = this.set("deprecationDate", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

