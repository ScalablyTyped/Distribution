package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLogSubscriptionsResult extends js.Object {
  
  /**
    * A list of active LogSubscription objects for calling the AWS account.
    */
  var LogSubscriptions: js.UndefOr[typings.awsSdk.directoryserviceMod.LogSubscriptions] = js.native
  
  /**
    * The token for the next set of items to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}
object ListLogSubscriptionsResult {
  
  @scala.inline
  def apply(): ListLogSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogSubscriptionsResult]
  }
  
  @scala.inline
  implicit class ListLogSubscriptionsResultOps[Self <: ListLogSubscriptionsResult] (val x: Self) extends AnyVal {
    
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
    def setLogSubscriptionsVarargs(value: LogSubscription*): Self = this.set("LogSubscriptions", js.Array(value :_*))
    
    @scala.inline
    def setLogSubscriptions(value: LogSubscriptions): Self = this.set("LogSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogSubscriptions: Self = this.set("LogSubscriptions", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
