package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobResponse extends StObject {
  
  /**
    * The ARN for the job.
    */
  var Arn: js.UndefOr[typings.awsSdk.dataexchangeMod.Arn] = js.undefined
  
  /**
    * The date and time that the job was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Details about the job.
    */
  var Details: js.UndefOr[ResponseDetails] = js.undefined
  
  /**
    * The errors associated with jobs.
    */
  var Errors: js.UndefOr[ListOfJobError] = js.undefined
  
  /**
    * The unique identifier for the job.
    */
  var Id: js.UndefOr[typings.awsSdk.dataexchangeMod.Id] = js.undefined
  
  /**
    * The state of the job.
    */
  var State: js.UndefOr[typings.awsSdk.dataexchangeMod.State] = js.undefined
  
  /**
    * The job type.
    */
  var Type: js.UndefOr[typings.awsSdk.dataexchangeMod.Type] = js.undefined
  
  /**
    * The date and time that the job was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.undefined
}
object GetJobResponse {
  
  @scala.inline
  def apply(): GetJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobResponse]
  }
  
  @scala.inline
  implicit class GetJobResponseMutableBuilder[Self <: GetJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDetails(value: ResponseDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setErrors(value: ListOfJobError): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: JobError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
