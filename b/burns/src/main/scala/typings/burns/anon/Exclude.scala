package typings.burns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exclude extends js.Object {
  var exclude: js.UndefOr[js.Any] = js.undefined
}

object Exclude {
  @scala.inline
  def apply(exclude: js.Any = null): Exclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclude]
  }
}

