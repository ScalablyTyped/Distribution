package typings.dav.mod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicOptions extends js.Object {
  /**
    * put request body.
    */
  var data: String
  /**
    * cached calendar object etag.
    */
  var etag: String
  /**
    * http method.
    */
  var method: String
}

object BasicOptions {
  @scala.inline
  def apply(data: String, etag: String, method: String): BasicOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicOptions]
  }
}

