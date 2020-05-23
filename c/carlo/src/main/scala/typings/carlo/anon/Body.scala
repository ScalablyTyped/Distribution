package typings.carlo.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
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

object Body {
  @scala.inline
  def apply(body: Buffer, headers: js.Object, status: Double): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

