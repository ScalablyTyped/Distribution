package typings.cypress

import typings.cypress.cypressMod.Cypress.Offset
import typings.cypress.cypressStrings.linear
import typings.cypress.cypressStrings.swing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ScrollIntoViewOptions> */
trait PartialScrollIntoViewOpti extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[swing | linear] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Offset] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialScrollIntoViewOpti {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    easing: swing | linear = null,
    log: js.UndefOr[Boolean] = js.undefined,
    offset: Offset = null,
    timeout: Int | Double = null
  ): PartialScrollIntoViewOpti = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollIntoViewOpti]
  }
}

