package typings.cliBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: Y
  var text: String
}

object Offset {
  @scala.inline
  def apply(offset: Y, text: String): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

