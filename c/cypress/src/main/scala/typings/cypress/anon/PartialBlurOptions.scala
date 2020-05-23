package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.BlurOptions> */
trait PartialBlurOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
}

object PartialBlurOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, log: js.UndefOr[Boolean] = js.undefined): PartialBlurOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBlurOptions]
  }
}

