package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobTaggingRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID associated with the S3 Batch Operations job.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The ID for the S3 Batch Operations job whose tags you want to delete.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId
}
object DeleteJobTaggingRequest {
  
  inline def apply(AccountId: AccountId, JobId: JobId): DeleteJobTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobTaggingRequest]
  }
  
  extension [Self <: DeleteJobTaggingRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
