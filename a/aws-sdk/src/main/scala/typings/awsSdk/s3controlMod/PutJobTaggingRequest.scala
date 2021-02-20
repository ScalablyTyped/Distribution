package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutJobTaggingRequest extends StObject {
  
  /**
    * The AWS account ID associated with the S3 Batch Operations job.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The ID for the S3 Batch Operations job whose tags you want to replace.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
  
  /**
    * The set of tags to associate with the S3 Batch Operations job.
    */
  var Tags: S3TagSet = js.native
}
object PutJobTaggingRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId, Tags: S3TagSet): PutJobTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutJobTaggingRequest]
  }
  
  @scala.inline
  implicit class PutJobTaggingRequestMutableBuilder[Self <: PutJobTaggingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: S3TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: S3Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
