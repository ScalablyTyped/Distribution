package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDetails extends StObject {
  
  /**
    * The AWS account ID associated with the job.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Represents other information about a job required for a job worker to complete the job. 
    */
  var data: js.UndefOr[JobData] = js.undefined
  
  /**
    * The unique system-generated ID of the job.
    */
  var id: js.UndefOr[JobId] = js.undefined
}
object JobDetails {
  
  @scala.inline
  def apply(): JobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDetails]
  }
  
  @scala.inline
  implicit class JobDetailsMutableBuilder[Self <: JobDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setData(value: JobData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setId(value: JobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
