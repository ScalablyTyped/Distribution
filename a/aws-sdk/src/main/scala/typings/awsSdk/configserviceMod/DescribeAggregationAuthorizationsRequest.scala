package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAggregationAuthorizationsRequest extends StObject {
  
  /**
    * The maximum number of AggregationAuthorizations returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeAggregationAuthorizationsRequest {
  
  @scala.inline
  def apply(): DescribeAggregationAuthorizationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregationAuthorizationsRequest]
  }
  
  @scala.inline
  implicit class DescribeAggregationAuthorizationsRequestMutableBuilder[Self <: DescribeAggregationAuthorizationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
