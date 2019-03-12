package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAccessSignatureResult extends js.Object {
  var baseUrl: java.lang.String
  var path: java.lang.String
  var queryString: azureLib.Anon_Se
  def url(): java.lang.String
}

object SharedAccessSignatureResult {
  @scala.inline
  def apply(
    baseUrl: java.lang.String,
    path: java.lang.String,
    queryString: azureLib.Anon_Se,
    url: () => java.lang.String
  ): SharedAccessSignatureResult = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl, path = path, queryString = queryString, url = js.Any.fromFunction0(url))
  
    __obj.asInstanceOf[SharedAccessSignatureResult]
  }
}

