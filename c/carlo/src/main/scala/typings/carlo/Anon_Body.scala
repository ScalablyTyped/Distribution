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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

