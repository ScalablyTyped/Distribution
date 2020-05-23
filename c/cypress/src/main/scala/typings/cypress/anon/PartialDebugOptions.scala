package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.DebugOptions> */
trait PartialDebugOptions extends js.Object {
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialDebugOptions {
  @scala.inline
  def apply(verbose: js.UndefOr[Boolean] = js.undefined): PartialDebugOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDebugOptions]
  }
}

