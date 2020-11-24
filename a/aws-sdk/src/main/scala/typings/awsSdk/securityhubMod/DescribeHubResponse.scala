package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHubResponse extends js.Object {
  
  /**
    * Whether to automatically enable new controls when they are added to standards that are enabled. If set to true, then new controls for enabled standards are enabled automatically. If set to false, then new controls are not enabled.
    */
  var AutoEnableControls: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the Hub resource that was retrieved.
    */
  var HubArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The date and time when Security Hub was enabled in the account.
    */
  var SubscribedAt: js.UndefOr[NonEmptyString] = js.native
}
object DescribeHubResponse {
  
  @scala.inline
  def apply(): DescribeHubResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHubResponse]
  }
  
  @scala.inline
  implicit class DescribeHubResponseOps[Self <: DescribeHubResponse] (val x: Self) extends AnyVal {
    
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
    def setAutoEnableControls(value: Boolean): Self = this.set("AutoEnableControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEnableControls: Self = this.set("AutoEnableControls", js.undefined)
    
    @scala.inline
    def setHubArn(value: NonEmptyString): Self = this.set("HubArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHubArn: Self = this.set("HubArn", js.undefined)
    
    @scala.inline
    def setSubscribedAt(value: NonEmptyString): Self = this.set("SubscribedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribedAt: Self = this.set("SubscribedAt", js.undefined)
  }
}
