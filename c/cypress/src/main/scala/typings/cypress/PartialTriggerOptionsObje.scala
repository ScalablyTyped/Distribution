package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.TriggerOptions & cypress.cypress.Cypress.ObjectLike> */
trait PartialTriggerOptionsObje extends js.Object {
  var bubbles: js.UndefOr[Boolean] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialTriggerOptionsObje {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): PartialTriggerOptionsObje = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTriggerOptionsObje]
  }
}

