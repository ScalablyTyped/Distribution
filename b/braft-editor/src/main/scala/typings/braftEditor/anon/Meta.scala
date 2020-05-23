package typings.braftEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var meta: Alt
  var url: String
}

object Meta {
  @scala.inline
  def apply(meta: Alt, url: String): Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

