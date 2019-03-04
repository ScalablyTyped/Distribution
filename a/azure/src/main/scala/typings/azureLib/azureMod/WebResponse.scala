package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponse extends js.Object {
  var body: azureLib.Anon_Entry
  var headers: js.Any
  var isSuccessful: scala.Boolean
  var md5: js.Any
  var statusCode: scala.Double
}

object WebResponse {
  @scala.inline
  def apply(
    body: azureLib.Anon_Entry,
    headers: js.Any,
    isSuccessful: scala.Boolean,
    md5: js.Any,
    statusCode: scala.Double
  ): WebResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, isSuccessful = isSuccessful, md5 = md5, statusCode = statusCode)
  
    __obj.asInstanceOf[WebResponse]
  }
}

