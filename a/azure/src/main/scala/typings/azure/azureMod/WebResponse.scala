package typings.azure.azureMod

import typings.azure.Anon_Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponse extends js.Object {
  var body: Anon_Entry
  var headers: js.Any
  var isSuccessful: Boolean
  var md5: js.Any
  var statusCode: Double
}

object WebResponse {
  @scala.inline
  def apply(body: Anon_Entry, headers: js.Any, isSuccessful: Boolean, md5: js.Any, statusCode: Double): WebResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, isSuccessful = isSuccessful, md5 = md5, statusCode = statusCode)
  
    __obj.asInstanceOf[WebResponse]
  }
}

