package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsInput extends StObject {
  
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String
  
  /**
    * The state of the jobs to return. You can specify true or false.
    */
  var completed: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be fewer than the specified limit, but the number of returned jobs never exceeds the limit.
    */
  var limit: js.UndefOr[String] = js.undefined
  
  /**
    * An opaque string used for pagination. This value specifies the job at which the listing of jobs should begin. Get the marker value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of results started in a previous List Jobs request.
    */
  var marker: js.UndefOr[String] = js.undefined
  
  /**
    * The type of job status to return. You can specify the following values: InProgress, Succeeded, or Failed.
    */
  var statuscode: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the vault.
    */
  var vaultName: String
}
object ListJobsInput {
  
  @scala.inline
  def apply(accountId: String, vaultName: String): ListJobsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsInput]
  }
  
  @scala.inline
  implicit class ListJobsInputMutableBuilder[Self <: ListJobsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setStatuscode(value: String): Self = StObject.set(x, "statuscode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuscodeUndefined: Self = StObject.set(x, "statuscode", js.undefined)
    
    @scala.inline
    def setVaultName(value: String): Self = StObject.set(x, "vaultName", value.asInstanceOf[js.Any])
  }
}
