package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.TypeOptions> */
trait PartialTypeOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var parseSpecialCharSequences: js.UndefOr[Boolean] = js.undefined
  var release: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialTypeOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    parseSpecialCharSequences: js.UndefOr[Boolean] = js.undefined,
    release: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): PartialTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(parseSpecialCharSequences)) __obj.updateDynamic("parseSpecialCharSequences")(parseSpecialCharSequences.asInstanceOf[js.Any])
    if (!js.isUndefined(release)) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTypeOptions]
  }
}

