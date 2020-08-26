package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SenderApplication extends js.Object {
  var packageId: String | Null = js.native
  var platform: SenderPlatform = js.native
  var url: String | Null = js.native
}

object SenderApplication {
  @scala.inline
  def apply(platform: SenderPlatform): SenderApplication = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SenderApplication]
  }
  @scala.inline
  implicit class SenderApplicationOps[Self <: SenderApplication] (val x: Self) extends AnyVal {
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
    def setPlatform(value: SenderPlatform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageId(value: String): Self = this.set("packageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageIdNull: Self = this.set("packageId", null)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlNull: Self = this.set("url", null)
  }
  
}

