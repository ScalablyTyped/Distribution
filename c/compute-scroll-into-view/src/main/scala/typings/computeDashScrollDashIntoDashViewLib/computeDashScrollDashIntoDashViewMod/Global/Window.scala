package typings
package computeDashScrollDashIntoDashViewLib.computeDashScrollDashIntoDashViewMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var visualViewport: js.UndefOr[computeDashScrollDashIntoDashViewLib.Anon_Height] = js.undefined
}

object Window {
  @scala.inline
  def apply(visualViewport: computeDashScrollDashIntoDashViewLib.Anon_Height = null): Window = {
    val __obj = js.Dynamic.literal()
    if (visualViewport != null) __obj.updateDynamic("visualViewport")(visualViewport)
    __obj.asInstanceOf[Window]
  }
}

