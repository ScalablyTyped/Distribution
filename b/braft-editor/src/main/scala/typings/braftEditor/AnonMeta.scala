package typings.braftEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeta extends js.Object {
  var meta: AnonAlt
  var url: String
}

object AnonMeta {
  @scala.inline
  def apply(meta: AnonAlt, url: String): AnonMeta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMeta]
  }
}

