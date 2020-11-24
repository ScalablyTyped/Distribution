package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeResult extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule for which you have created assocations.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.native
}
object SubscribeResult {
  
  @scala.inline
  def apply(): SubscribeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeResult]
  }
  
  @scala.inline
  implicit class SubscribeResultOps[Self <: SubscribeResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: NotificationRuleArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
  }
}
