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
    val __obj = js.Dynamic.literal(afterScreenshot = afterScreenshot, beforeScreenshot = beforeScreenshot, blackout = blackout, capture = capture.asInstanceOf[js.Any], clip = clip, disableTimersAndAnimations = disableTimersAndAnimations, scale = scale, screenshotOnRunFailure = screenshotOnRunFailure)
  
    __obj.asInstanceOf[ScreenshotDefaultsOptions]
  }
}

