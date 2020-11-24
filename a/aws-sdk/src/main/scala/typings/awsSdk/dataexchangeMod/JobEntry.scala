package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobEntry extends js.Object {
  
  /**
    * The ARN for the job.
    */
  var Arn: typings.awsSdk.dataexchangeMod.Arn = js.native
  
  /**
    * The date and time that the job was created, in ISO 8601 format.
    */
  var CreatedAt: Timestamp = js.native
  
  /**
    * Details of the operation to be performed by the job, such as export destination details or import source details.
    */
  var Details: ResponseDetails = js.native
  
  /**
    * Errors for jobs.
    */
  var Errors: js.UndefOr[ListOfJobError] = js.native
  
  /**
    * The unique identifier for the job.
    */
  var Id: typings.awsSdk.dataexchangeMod.Id = js.native
  
  /**
    * The state of the job.
    */
  var State: typings.awsSdk.dataexchangeMod.State = js.native
  
  /**
    * The job type.
    */
  var Type: typings.awsSdk.dataexchangeMod.Type = js.native
  
  /**
    * The date and time that the job was last updated, in ISO 8601 format.
    */
  var UpdatedAt: Timestamp = js.native
}
object JobEntry {
  
  @scala.inline
  def apply(
    Arn: Arn,
    CreatedAt: Timestamp,
    Details: ResponseDetails,
    Id: Id,
    State: State,
    Type: Type,
    UpdatedAt: Timestamp
  ): JobEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEntry]
  }
  
  @scala.inline
  implicit class JobEntryOps[Self <: JobEntry] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: ResponseDetails): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: JobError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: ListOfJobError): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
