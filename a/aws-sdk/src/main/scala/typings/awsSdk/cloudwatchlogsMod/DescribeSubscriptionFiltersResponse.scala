package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubscriptionFiltersResponse extends StObject {
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The subscription filters.
    */
  var subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.undefined
}
object DescribeSubscriptionFiltersResponse {
  
  @scala.inline
  def apply(): DescribeSubscriptionFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscriptionFiltersResponse]
  }
  
  @scala.inline
  implicit class DescribeSubscriptionFiltersResponseMutableBuilder[Self <: DescribeSubscriptionFiltersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSubscriptionFilters(value: SubscriptionFilters): Self = StObject.set(x, "subscriptionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionFiltersUndefined: Self = StObject.set(x, "subscriptionFilters", js.undefined)
    
    @scala.inline
    def setSubscriptionFiltersVarargs(value: SubscriptionFilter*): Self = StObject.set(x, "subscriptionFilters", js.Array(value :_*))
  }
}
