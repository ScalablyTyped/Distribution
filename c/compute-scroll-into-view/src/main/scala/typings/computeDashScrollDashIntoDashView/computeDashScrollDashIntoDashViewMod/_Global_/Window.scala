package typings.computeDashScrollDashIntoDashView.computeDashScrollDashIntoDashViewMod._Global_

import typings.computeDashScrollDashIntoDashView.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var visualViewport: js.UndefOr[Anon_Height] = js.undefined
}

object Window {
  @scala.inline
  def apply(visualViewport: Anon_Height = null): Window = {
    val __obj = js.Dynamic.literal()
    if (visualViewport != null) __obj.updateDynamic("visualViewport")(visualViewport)
    __obj.asInstanceOf[Window]
  }
}

