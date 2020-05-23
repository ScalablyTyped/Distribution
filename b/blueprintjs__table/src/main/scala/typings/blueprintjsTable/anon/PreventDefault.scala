package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreventDefault extends js.Object {
  var preventDefault: Boolean
  var stopPropagation: Boolean
}

object PreventDefault {
  @scala.inline
  def apply(preventDefault: Boolean, stopPropagation: Boolean): PreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventDefault]
  }
}

