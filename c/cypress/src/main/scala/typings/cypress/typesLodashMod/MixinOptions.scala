package typings.cypress.typesLodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// mixin
trait MixinOptions extends js.Object {
  var chain: js.UndefOr[Boolean] = js.undefined
}

object MixinOptions {
  @scala.inline
  def apply(chain: js.UndefOr[Boolean] = js.undefined): MixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chain)) __obj.updateDynamic("chain")(chain.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixinOptions]
  }
}

