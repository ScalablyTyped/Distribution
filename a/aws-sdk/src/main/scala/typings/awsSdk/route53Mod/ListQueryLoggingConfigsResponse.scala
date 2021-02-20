package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueryLoggingConfigsResponse extends StObject {
  
  /**
    * If a response includes the last of the query logging configurations that are associated with the current AWS account, NextToken doesn't appear in the response. If a response doesn't include the last of the configurations, you can get more configurations by submitting another ListQueryLoggingConfigs request. Get the value of NextToken that Amazon Route 53 returned in the previous response and include it in NextToken in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An array that contains one QueryLoggingConfig element for each configuration for DNS query logging that is associated with the current AWS account.
    */
  var QueryLoggingConfigs: typings.awsSdk.route53Mod.QueryLoggingConfigs = js.native
}
object ListQueryLoggingConfigsResponse {
  
  @scala.inline
  def apply(QueryLoggingConfigs: QueryLoggingConfigs): ListQueryLoggingConfigsResponse = {
    val __obj = js.Dynamic.literal(QueryLoggingConfigs = QueryLoggingConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueryLoggingConfigsResponse]
  }
  
  @scala.inline
  implicit class ListQueryLoggingConfigsResponseMutableBuilder[Self <: ListQueryLoggingConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQueryLoggingConfigs(value: QueryLoggingConfigs): Self = StObject.set(x, "QueryLoggingConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryLoggingConfigsVarargs(value: QueryLoggingConfig*): Self = StObject.set(x, "QueryLoggingConfigs", js.Array(value :_*))
  }
}
