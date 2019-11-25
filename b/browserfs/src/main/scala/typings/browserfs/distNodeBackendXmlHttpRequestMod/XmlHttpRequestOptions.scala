package typings.browserfs.distNodeBackendXmlHttpRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlHttpRequestOptions extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[String | js.Object] = js.undefined
}

object XmlHttpRequestOptions {
  @scala.inline
  def apply(baseUrl: String = null, index: String | js.Object = null): XmlHttpRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlHttpRequestOptions]
  }
}

