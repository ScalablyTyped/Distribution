package typings.cypress

import typings.cypress.cypressMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpenMode extends js.Object {
  var openMode: Nullable[Double]
  var runMode: Nullable[Double]
}

object AnonOpenMode {
  @scala.inline
  def apply(openMode: Int | Double = null, runMode: Int | Double = null): AnonOpenMode = {
    val __obj = js.Dynamic.literal()
    if (openMode != null) __obj.updateDynamic("openMode")(openMode.asInstanceOf[js.Any])
    if (runMode != null) __obj.updateDynamic("runMode")(runMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpenMode]
  }
}

