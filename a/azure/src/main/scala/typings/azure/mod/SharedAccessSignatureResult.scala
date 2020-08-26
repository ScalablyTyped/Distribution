package typings.azure.mod

import typings.azure.anon.Se
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAccessSignatureResult extends js.Object {
  var baseUrl: String = js.native
  var path: String = js.native
  var queryString: Se = js.native
  def url(): String = js.native
}

object SharedAccessSignatureResult {
  @scala.inline
  def apply(baseUrl: String, path: String, queryString: Se, url: () => String): SharedAccessSignatureResult = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[SharedAccessSignatureResult]
  }
  @scala.inline
  implicit class SharedAccessSignatureResultOps[Self <: SharedAccessSignatureResult] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryString(value: Se): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: () => String): Self = this.set("url", js.Any.fromFunction0(value))
  }
  
}

