package typings.cordovaPluginXSocialsharing

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialSharingOptions extends js.Object {
  var appPackageName: js.UndefOr[String] = js.native
  var chooserTitle: js.UndefOr[String] = js.native
  var files: js.UndefOr[ArrayLike[String]] = js.native
  var message: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object SocialSharingOptions {
  @scala.inline
  def apply(): SocialSharingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialSharingOptions]
  }
  @scala.inline
  implicit class SocialSharingOptionsOps[Self <: SocialSharingOptions] (val x: Self) extends AnyVal {
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
    def setAppPackageName(value: String): Self = this.set("appPackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppPackageName: Self = this.set("appPackageName", js.undefined)
    @scala.inline
    def setChooserTitle(value: String): Self = this.set("chooserTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChooserTitle: Self = this.set("chooserTitle", js.undefined)
    @scala.inline
    def setFiles(value: ArrayLike[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

