package typings.dashify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condense: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(condense: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(condense)) __obj.updateDynamic("condense")(condense.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

