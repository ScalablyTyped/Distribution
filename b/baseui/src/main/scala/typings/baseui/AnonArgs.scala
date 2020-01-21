package typings.baseui

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ T, ReactNode]] = js.undefined
}

object AnonArgs {
  @scala.inline
  def apply[T](children: /* args */ T => ReactNode = null): AnonArgs[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[AnonArgs[T]]
  }
}

