package typings
package carloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /**
    *  Response body.
    */
  var body: nodeLib.Buffer
  /**
    * HTTP response headers.
    */
  var headers: js.Object
  /**
    * HTTP status code (200, 304, etc), defaults to 200.
    */
  var status: scala.Double
}

object Anon_Body {
  @scala.inline
  def apply(body: nodeLib.Buffer, headers: js.Object, status: scala.Double): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, status = status)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

