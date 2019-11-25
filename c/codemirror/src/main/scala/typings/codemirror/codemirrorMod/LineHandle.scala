package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHandle extends js.Object {
  var text: String
}

object LineHandle {
  @scala.inline
  def apply(text: String): LineHandle = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineHandle]
  }
}

