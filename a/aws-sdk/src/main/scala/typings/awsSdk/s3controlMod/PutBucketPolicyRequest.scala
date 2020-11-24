package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketPolicyRequest extends js.Object {
  
  /**
    * The AWS account ID of the Outposts bucket.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * Specifies the bucket. For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the x-amz-outpost-id as well. For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the bucket accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;. For example, to access the bucket reports through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports. The value must be URL encoded. 
    */
  var Bucket: BucketName = js.native
  
  /**
    * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in the future.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var ConfirmRemoveSelfBucketAccess: js.UndefOr[typings.awsSdk.s3controlMod.ConfirmRemoveSelfBucketAccess] = js.native
  
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: typings.awsSdk.s3controlMod.Policy = js.native
}
object PutBucketPolicyRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, Bucket: BucketName, Policy: Policy): PutBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketPolicyRequest]
  }
  
  @scala.inline
  implicit class PutBucketPolicyRequestOps[Self <: PutBucketPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmRemoveSelfBucketAccess(value: ConfirmRemoveSelfBucketAccess): Self = this.set("ConfirmRemoveSelfBucketAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmRemoveSelfBucketAccess: Self = this.set("ConfirmRemoveSelfBucketAccess", js.undefined)
  }
}
