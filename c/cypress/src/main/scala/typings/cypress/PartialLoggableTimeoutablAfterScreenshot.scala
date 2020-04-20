package typings.cypress

import typings.cypress.cypressStrings.fullPage
import typings.cypress.cypressStrings.runner
import typings.cypress.cypressStrings.viewport
import typings.cypress.mod.Cypress.Dimensions
import typings.cypress.mod.Cypress.Padding
import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Loggable & cypress.cypress.Cypress.Timeoutable & cypress.cypress.Cypress.ScreenshotOptions> */
trait PartialLoggableTimeoutablAfterScreenshot extends js.Object {
  var afterScreenshot: js.UndefOr[js.Function1[/* doc */ Document_, Unit]] = js.undefined
  var beforeScreenshot: js.UndefOr[js.Function1[/* doc */ Document_, Unit]] = js.undefined
  var blackout: js.UndefOr[js.Array[String]] = js.undefined
  var capture: js.UndefOr[runner | viewport | fullPage] = js.undefined
  var clip: js.UndefOr[Dimensions] = js.undefined
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialLoggableTimeoutablAfterScreenshot {
  @scala.inline
  def apply(
    afterScreenshot: /* doc */ Document_ => Unit = null,
    beforeScreenshot: /* doc */ Document_ => Unit = null,
    blackout: js.Array[String] = null,
    capture: runner | viewport | fullPage = null,
    clip: Dimensions = null,
    disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    padding: Padding = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): PartialLoggableTimeoutablAfterScreenshot = {
    val __obj = js.Dynamic.literal()
    if (afterScreenshot != null) __obj.updateDynamic("afterScreenshot")(js.Any.fromFunction1(afterScreenshot))
    if (beforeScreenshot != null) __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction1(beforeScreenshot))
    if (blackout != null) __obj.updateDynamic("blackout")(blackout.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTimersAndAnimations)) __obj.updateDynamic("disableTimersAndAnimations")(disableTimersAndAnimations.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutablAfterScreenshot]
  }
}

