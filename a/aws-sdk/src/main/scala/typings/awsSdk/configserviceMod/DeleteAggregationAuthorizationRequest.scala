package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAggregationAuthorizationRequest extends StObject {
  
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: AccountId
  
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: AwsRegion
}
object DeleteAggregationAuthorizationRequest {
  
  inline def apply(AuthorizedAccountId: AccountId, AuthorizedAwsRegion: AwsRegion): DeleteAggregationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizedAccountId = AuthorizedAccountId.asInstanceOf[js.Any], AuthorizedAwsRegion = AuthorizedAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAggregationAuthorizationRequest]
  }
  
  extension [Self <: DeleteAggregationAuthorizationRequest](x: Self) {
    
    inline def setAuthorizedAccountId(value: AccountId): Self = StObject.set(x, "AuthorizedAccountId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedAwsRegion(value: AwsRegion): Self = StObject.set(x, "AuthorizedAwsRegion", value.asInstanceOf[js.Any])
  }
}
