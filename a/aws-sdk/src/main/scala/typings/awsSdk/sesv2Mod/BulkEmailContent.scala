package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkEmailContent extends js.Object {
  /**
    * The template to use for the bulk email message.
    */
  var Template: js.UndefOr[typings.awsSdk.sesv2Mod.Template] = js.native
}

object BulkEmailContent {
  @scala.inline
  def apply(): BulkEmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEmailContent]
  }
  @scala.inline
  implicit class BulkEmailContentOps[Self <: BulkEmailContent] (val x: Self) extends AnyVal {
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
    def setTemplate(value: Template): Self = this.set("Template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("Template", js.undefined)
  }
  
}

