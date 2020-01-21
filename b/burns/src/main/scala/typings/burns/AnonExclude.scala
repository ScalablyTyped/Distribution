package typings.burns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclude extends js.Object {
  var exclude: js.UndefOr[js.Any] = js.undefined
}

object AnonExclude {
  @scala.inline
  def apply(exclude: js.Any = null): AnonExclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExclude]
  }
}

