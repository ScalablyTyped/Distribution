package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAggregationAuthorizationRequest extends StObject {
  
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: AccountId = js.native
  
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: AwsRegion = js.native
  
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.native
}
object PutAggregationAuthorizationRequest {
  
  @scala.inline
  def apply(AuthorizedAccountId: AccountId, AuthorizedAwsRegion: AwsRegion): PutAggregationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizedAccountId = AuthorizedAccountId.asInstanceOf[js.Any], AuthorizedAwsRegion = AuthorizedAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAggregationAuthorizationRequest]
  }
  
  @scala.inline
  implicit class PutAggregationAuthorizationRequestMutableBuilder[Self <: PutAggregationAuthorizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizedAccountId(value: AccountId): Self = StObject.set(x, "AuthorizedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedAwsRegion(value: AwsRegion): Self = StObject.set(x, "AuthorizedAwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
