package typings.cypress.Cypress

import typings.cypress.JQuery
import typings.cypress.anon.Blackout
import typings.cypress.cypressStrings.fullPage
import typings.cypress.cypressStrings.runner
import typings.cypress.cypressStrings.viewport
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotOptions extends js.Object {
  var blackout: js.Array[String]
  var capture: runner | viewport | fullPage
  var clip: Dimensions
  var disableTimersAndAnimations: Boolean
  var padding: Padding
  var scale: Boolean
  def onAfterScreenshot($el: JQuery[HTMLElement], props: Blackout): Unit
  def onBeforeScreenshot($el: JQuery[HTMLElement]): Unit
}

object ScreenshotOptions {
  @scala.inline
  def apply(
    blackout: js.Array[String],
    capture: runner | viewport | fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: Boolean,
    onAfterScreenshot: (JQuery[HTMLElement], Blackout) => Unit,
    onBeforeScreenshot: JQuery[HTMLElement] => Unit,
    padding: Padding,
    scale: Boolean
  ): ScreenshotOptions = {
    val __obj = js.Dynamic.literal(blackout = blackout.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], disableTimersAndAnimations = disableTimersAndAnimations.asInstanceOf[js.Any], onAfterScreenshot = js.Any.fromFunction2(onAfterScreenshot), onBeforeScreenshot = js.Any.fromFunction1(onBeforeScreenshot), padding = padding.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotOptions]
  }
}

