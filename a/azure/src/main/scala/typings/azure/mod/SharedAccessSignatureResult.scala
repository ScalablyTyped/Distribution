package typings.azure.mod

import typings.azure.anon.Se
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAccessSignatureResult extends js.Object {
  var baseUrl: String
  var path: String
  var queryString: Se
  def url(): String
}

object SharedAccessSignatureResult {
  @scala.inline
  def apply(baseUrl: String, path: String, queryString: Se, url: () => String): SharedAccessSignatureResult = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[SharedAccessSignatureResult]
  }
}

