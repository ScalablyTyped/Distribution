package typings.cypress.Cypress

import typings.cypress.cypressStrings.fullPage
import typings.cypress.cypressStrings.runner
import typings.cypress.cypressStrings.viewport
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotDefaultsOptions extends ScreenshotOptions {
  var screenshotOnRunFailure: Boolean
}

object ScreenshotDefaultsOptions {
  @scala.inline
  def apply(
    afterScreenshot: Document => Unit,
    beforeScreenshot: Document => Unit,
    blackout: js.Array[String],
    capture: runner | viewport | fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: Boolean,
    scale: Boolean,
    screenshotOnRunFailure: Boolean
  ): ScreenshotDefaultsOptions = {
    val __obj = js.Dynamic.literal(afterScreenshot = js.Any.fromFunction1(afterScreenshot), beforeScreenshot = js.Any.fromFunction1(beforeScreenshot), blackout = blackout, capture = capture.asInstanceOf[js.Any], clip = clip, disableTimersAndAnimations = disableTimersAndAnimations, scale = scale, screenshotOnRunFailure = screenshotOnRunFailure)
  
    __obj.asInstanceOf[ScreenshotDefaultsOptions]
  }
}

