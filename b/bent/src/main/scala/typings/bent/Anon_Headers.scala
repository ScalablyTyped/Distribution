package typings.bent

import typings.bent.bentMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: Headers
  var statusCode: Double
  var statusMessage: String
}

object Anon_Headers {
  @scala.inline
  def apply(headers: Headers, statusCode: Double, statusMessage: String): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers, statusCode = statusCode, statusMessage = statusMessage)
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

