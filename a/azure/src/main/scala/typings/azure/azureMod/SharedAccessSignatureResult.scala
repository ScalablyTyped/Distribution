package typings.azure.azureMod

import typings.azure.Anon_Se
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAccessSignatureResult extends js.Object {
  var baseUrl: String
  var path: String
  var queryString: Anon_Se
  def url(): String
}

object SharedAccessSignatureResult {
  @scala.inline
  def apply(baseUrl: String, path: String, queryString: Anon_Se, url: () => String): SharedAccessSignatureResult = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = js.Any.fromFunction0(url))
  
    __obj.asInstanceOf[SharedAccessSignatureResult]
  }
}

