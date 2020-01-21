package typings.d3pie

import typings.d3pie.d3pieStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var location: js.UndefOr[left] = js.undefined
}

object AnonLeft {
  @scala.inline
  def apply(location: left = null): AnonLeft = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

