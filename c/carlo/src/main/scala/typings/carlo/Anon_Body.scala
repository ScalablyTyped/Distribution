package typings.carlo

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /**
    *  Response body.
    */
  var body: Buffer
  /**
    * HTTP response headers.
    */
  var headers: js.Object
  /**
    * HTTP status code (200, 304, etc), defaults to 200.
    */
  var status: Double
}

object Anon_Body {
  @scala.inline
  def apply(body: Buffer, headers: js.Object, status: Double): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, status = status)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

