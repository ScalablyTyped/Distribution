package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegionalBucketsRequest extends js.Object {
  
  /**
    * The AWS account ID of the Outposts bucket.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.s3controlMod.MaxResults] = js.native
  
  /**
    * 
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * The ID of the AWS Outposts.  This is required by Amazon S3 on Outposts buckets. 
    */
  var OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.native
}
object ListRegionalBucketsRequest {
  
  @scala.inline
  def apply(AccountId: AccountId): ListRegionalBucketsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRegionalBucketsRequest]
  }
  
  @scala.inline
  implicit class ListRegionalBucketsRequestOps[Self <: ListRegionalBucketsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonEmptyMaxLength1024String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOutpostId(value: NonEmptyMaxLength64String): Self = this.set("OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostId: Self = this.set("OutpostId", js.undefined)
  }
}
