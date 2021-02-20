package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointConnectionNotificationsResult extends StObject {
  
  /**
    * One or more notifications.
    */
  var ConnectionNotificationSet: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionNotificationSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeVpcEndpointConnectionNotificationsResult {
  
  @scala.inline
  def apply(): DescribeVpcEndpointConnectionNotificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointConnectionNotificationsResult]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointConnectionNotificationsResultMutableBuilder[Self <: DescribeVpcEndpointConnectionNotificationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionNotificationSet(value: ConnectionNotificationSet): Self = StObject.set(x, "ConnectionNotificationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNotificationSetUndefined: Self = StObject.set(x, "ConnectionNotificationSet", js.undefined)
    
    @scala.inline
    def setConnectionNotificationSetVarargs(value: ConnectionNotification*): Self = StObject.set(x, "ConnectionNotificationSet", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
