package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSubscriptionFiltersResponse extends js.Object {
  
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The subscription filters.
    */
  var subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.native
}
object DescribeSubscriptionFiltersResponse {
  
  @scala.inline
  def apply(): DescribeSubscriptionFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscriptionFiltersResponse]
  }
  
  @scala.inline
  implicit class DescribeSubscriptionFiltersResponseOps[Self <: DescribeSubscriptionFiltersResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSubscriptionFiltersVarargs(value: SubscriptionFilter*): Self = this.set("subscriptionFilters", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptionFilters(value: SubscriptionFilters): Self = this.set("subscriptionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionFilters: Self = this.set("subscriptionFilters", js.undefined)
  }
}
