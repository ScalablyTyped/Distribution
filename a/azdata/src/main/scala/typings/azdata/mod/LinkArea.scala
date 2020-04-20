package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkArea extends js.Object {
  var text: String
  var url: String
}

object LinkArea {
  @scala.inline
  def apply(text: String, url: String): LinkArea = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkArea]
  }
}

