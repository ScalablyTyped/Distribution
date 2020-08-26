package typings.cloudflareApps.CloudflareApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalURL extends js.Object {
  var parsed: OriginalURLParsed = js.native
  var raw: String = js.native
}

object OriginalURL {
  @scala.inline
  def apply(parsed: OriginalURLParsed, raw: String): OriginalURL = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalURL]
  }
  @scala.inline
  implicit class OriginalURLOps[Self <: OriginalURL] (val x: Self) extends AnyVal {
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
    def setParsed(value: OriginalURLParsed): Self = this.set("parsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
  
}

