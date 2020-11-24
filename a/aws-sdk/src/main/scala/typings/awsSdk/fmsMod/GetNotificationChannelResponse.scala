package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNotificationChannelResponse extends js.Object {
  
  /**
    * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
    */
  var SnsRoleName: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The SNS topic that records AWS Firewall Manager activity. 
    */
  var SnsTopicArn: js.UndefOr[ResourceArn] = js.native
}
object GetNotificationChannelResponse {
  
  @scala.inline
  def apply(): GetNotificationChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNotificationChannelResponse]
  }
  
  @scala.inline
  implicit class GetNotificationChannelResponseOps[Self <: GetNotificationChannelResponse] (val x: Self) extends AnyVal {
    
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
    def setSnsRoleName(value: ResourceArn): Self = this.set("SnsRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsRoleName: Self = this.set("SnsRoleName", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: ResourceArn): Self = this.set("SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("SnsTopicArn", js.undefined)
  }
}
