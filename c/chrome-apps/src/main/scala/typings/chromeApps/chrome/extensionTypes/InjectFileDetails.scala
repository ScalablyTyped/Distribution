package typings.chromeApps.chrome.extensionTypes

import typings.chromeApps.chrome.extensionTypes.internal.InjectDetailsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectFileDetails extends InjectDetailsBase {
  /** JavaScript or CSS file to inject. */
  var file: String = js.native
}

object InjectFileDetails {
  @scala.inline
  def apply(cssOrigin: CSSOrigin, file: String, runAt: RunAt): InjectFileDetails = {
    val __obj = js.Dynamic.literal(cssOrigin = cssOrigin.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectFileDetails]
  }
  @scala.inline
  implicit class InjectFileDetailsOps[Self <: InjectFileDetails] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
  }
  
}

