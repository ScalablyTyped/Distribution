package typings.delegatedEvents

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentTarget extends js.Object {
  var currentTarget: Element
}

object AnonCurrentTarget {
  @scala.inline
  def apply(currentTarget: Element): AnonCurrentTarget = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentTarget]
  }
}

