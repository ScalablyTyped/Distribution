package typings.cypress.anon

import typings.cypress.Cypress.Dimensions
import typings.cypress.Cypress.Padding
import typings.cypress.JQuery
import typings.cypress.cypressStrings.fullPage
import typings.cypress.cypressStrings.runner
import typings.cypress.cypressStrings.viewport
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.Loggable & cypress.Cypress.Timeoutable & cypress.Cypress.ScreenshotOptions> */
trait PartialLoggableTimeoutablBlackout extends js.Object {
  var blackout: js.UndefOr[js.Array[String]] = js.undefined
  var capture: js.UndefOr[runner | viewport | fullPage] = js.undefined
  var clip: js.UndefOr[Dimensions] = js.undefined
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var onAfterScreenshot: js.UndefOr[js.Function2[/* $el */ JQuery[HTMLElement], /* props */ Blackout, Unit]] = js.undefined
  var onBeforeScreenshot: js.UndefOr[js.Function1[/* $el */ JQuery[HTMLElement], Unit]] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialLoggableTimeoutablBlackout {
  @scala.inline
  def apply(
    blackout: js.Array[String] = null,
    capture: runner | viewport | fullPage = null,
    clip: Dimensions = null,
    disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    onAfterScreenshot: (/* $el */ JQuery[HTMLElement], /* props */ Blackout) => Unit = null,
    onBeforeScreenshot: /* $el */ JQuery[HTMLElement] => Unit = null,
    padding: Padding = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): PartialLoggableTimeoutablBlackout = {
    val __obj = js.Dynamic.literal()
    if (blackout != null) __obj.updateDynamic("blackout")(blackout.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTimersAndAnimations)) __obj.updateDynamic("disableTimersAndAnimations")(disableTimersAndAnimations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (onAfterScreenshot != null) __obj.updateDynamic("onAfterScreenshot")(js.Any.fromFunction2(onAfterScreenshot))
    if (onBeforeScreenshot != null) __obj.updateDynamic("onBeforeScreenshot")(js.Any.fromFunction1(onBeforeScreenshot))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutablBlackout]
  }
}

