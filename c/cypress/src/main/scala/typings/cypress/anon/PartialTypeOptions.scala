package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.TypeOptions> */
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
    delay: js.UndefOr[Double] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    parseSpecialCharSequences: js.UndefOr[Boolean] = js.undefined,
    release: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): PartialTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseSpecialCharSequences)) __obj.updateDynamic("parseSpecialCharSequences")(parseSpecialCharSequences.get.asInstanceOf[js.Any])
    if (!js.isUndefined(release)) __obj.updateDynamic("release")(release.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTypeOptions]
  }
}

