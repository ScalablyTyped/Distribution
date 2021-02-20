package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLogSubscriptionsResult extends StObject {
  
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
  implicit class ListLogSubscriptionsResultMutableBuilder[Self <: ListLogSubscriptionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogSubscriptions(value: LogSubscriptions): Self = StObject.set(x, "LogSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogSubscriptionsUndefined: Self = StObject.set(x, "LogSubscriptions", js.undefined)
    
    @scala.inline
    def setLogSubscriptionsVarargs(value: LogSubscription*): Self = StObject.set(x, "LogSubscriptions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
