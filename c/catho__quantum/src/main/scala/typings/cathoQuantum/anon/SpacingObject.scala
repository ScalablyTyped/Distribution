package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpacingObject extends js.Object {
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object SpacingObject {
  @scala.inline
  def apply(spacing: js.Object = null): SpacingObject = {
    val __obj = js.Dynamic.literal()
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingObject]
  }
}

