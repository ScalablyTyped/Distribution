package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotDefaultsOptions extends ScreenshotOptions {
  var screenshotOnRunFailure: scala.Boolean
}

object ScreenshotDefaultsOptions {
  @scala.inline
  def apply(
    afterScreenshot: js.Function1[stdLib.Document, scala.Unit],
    beforeScreenshot: js.Function1[stdLib.Document, scala.Unit],
    blackout: js.Array[java.lang.String],
    capture: cypressLib.cypressLibStrings.runner | cypressLib.cypressLibStrings.viewport | cypressLib.cypressLibStrings.fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: scala.Boolean,
    scale: scala.Boolean,
    screenshotOnRunFailure: scala.Boolean
  ): ScreenshotDefaultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterScreenshot")(afterScreenshot)
    __obj.updateDynamic("beforeScreenshot")(beforeScreenshot)
    __obj.updateDynamic("blackout")(blackout)
    __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    __obj.updateDynamic("clip")(clip)
    __obj.updateDynamic("disableTimersAndAnimations")(disableTimersAndAnimations)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("screenshotOnRunFailure")(screenshotOnRunFailure)
    __obj.asInstanceOf[ScreenshotDefaultsOptions]
  }
}

