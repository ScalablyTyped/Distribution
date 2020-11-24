package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointConnectionNotificationsResult extends js.Object {
  
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
  implicit class DescribeVpcEndpointConnectionNotificationsResultOps[Self <: DescribeVpcEndpointConnectionNotificationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionNotificationSetVarargs(value: ConnectionNotification*): Self = this.set("ConnectionNotificationSet", js.Array(value :_*))
    
    @scala.inline
    def setConnectionNotificationSet(value: ConnectionNotificationSet): Self = this.set("ConnectionNotificationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionNotificationSet: Self = this.set("ConnectionNotificationSet", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
