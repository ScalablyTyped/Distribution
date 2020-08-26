package typings.browserfs.xmlHttpRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlHttpRequestOptions extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var index: js.UndefOr[String | js.Object] = js.native
}

object XmlHttpRequestOptions {
  @scala.inline
  def apply(): XmlHttpRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlHttpRequestOptions]
  }
  @scala.inline
  implicit class XmlHttpRequestOptionsOps[Self <: XmlHttpRequestOptions] (val x: Self) extends AnyVal {
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setIndex(value: String | js.Object): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

