package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobResponse extends js.Object {
  /**
    * The ARN for the job.
    */
  var Arn: js.UndefOr[typings.awsSdk.dataexchangeMod.Arn] = js.native
  /**
    * The date and time that the job was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * Details about the job.
    */
  var Details: js.UndefOr[ResponseDetails] = js.native
  /**
    * The errors associated with jobs.
    */
  var Errors: js.UndefOr[ListOfJobError] = js.native
  /**
    * The unique identifier for the job.
    */
  var Id: js.UndefOr[typings.awsSdk.dataexchangeMod.Id] = js.native
  /**
    * The state of the job.
    */
  var State: js.UndefOr[typings.awsSdk.dataexchangeMod.State] = js.native
  /**
    * The job type.
    */
  var Type: js.UndefOr[typings.awsSdk.dataexchangeMod.Type] = js.native
  /**
    * The date and time that the job was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object GetJobResponse {
  @scala.inline
  def apply(): GetJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobResponse]
  }
  @scala.inline
  implicit class GetJobResponseOps[Self <: GetJobResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setDetails(value: ResponseDetails): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: JobError*): Self = this.set("Errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: ListOfJobError): Self = this.set("Errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
  
}

