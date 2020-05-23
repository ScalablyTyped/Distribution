package typings.delegatedEvents.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentTarget extends js.Object {
  var currentTarget: Element
}

object CurrentTarget {
  @scala.inline
  def apply(currentTarget: Element): CurrentTarget = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTarget]
  }
}

