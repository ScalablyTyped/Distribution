package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.DebugOptions> */
trait PartialDebugOptions extends js.Object {
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialDebugOptions {
  @scala.inline
  def apply(verbose: js.UndefOr[Boolean] = js.undefined): PartialDebugOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDebugOptions]
  }
}

