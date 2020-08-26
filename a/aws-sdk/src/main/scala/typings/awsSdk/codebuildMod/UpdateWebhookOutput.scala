package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWebhookOutput extends js.Object {
  /**
    *  Information about a repository's webhook that is associated with a project in AWS CodeBuild. 
    */
  var webhook: js.UndefOr[Webhook] = js.native
}

object UpdateWebhookOutput {
  @scala.inline
  def apply(): UpdateWebhookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWebhookOutput]
  }
  @scala.inline
  implicit class UpdateWebhookOutputOps[Self <: UpdateWebhookOutput] (val x: Self) extends AnyVal {
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
    def setWebhook(value: Webhook): Self = this.set("webhook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebhook: Self = this.set("webhook", js.undefined)
  }
  
}

