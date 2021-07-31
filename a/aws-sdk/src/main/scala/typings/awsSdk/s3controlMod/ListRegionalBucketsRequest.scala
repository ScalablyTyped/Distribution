package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegionalBucketsRequest extends StObject {
  
  /**
    * The AWS account ID of the Outposts bucket.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.s3controlMod.MaxResults] = js.undefined
  
  /**
    * 
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * The ID of the AWS Outposts.  This is required by Amazon S3 on Outposts buckets. 
    */
  var OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.undefined
}
object ListRegionalBucketsRequest {
  
  @scala.inline
  def apply(AccountId: AccountId): ListRegionalBucketsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRegionalBucketsRequest]
  }
  
  @scala.inline
  implicit class ListRegionalBucketsRequestMutableBuilder[Self <: ListRegionalBucketsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOutpostId(value: NonEmptyMaxLength64String): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
  }
}
