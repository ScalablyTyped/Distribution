package typings.computeScrollIntoView.mod._Global_

import typings.computeScrollIntoView.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var visualViewport: js.UndefOr[AnonHeight] = js.undefined
}

object Window {
  @scala.inline
  def apply(visualViewport: AnonHeight = null): Window = {
    val __obj = js.Dynamic.literal()
    if (visualViewport != null) __obj.updateDynamic("visualViewport")(visualViewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

