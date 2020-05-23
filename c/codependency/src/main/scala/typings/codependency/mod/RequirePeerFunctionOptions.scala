package typings.codependency.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequirePeerFunctionOptions extends js.Object {
  var dontThrow: js.UndefOr[Boolean] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
}

object RequirePeerFunctionOptions {
  @scala.inline
  def apply(dontThrow: js.UndefOr[Boolean] = js.undefined, optional: js.UndefOr[Boolean] = js.undefined): RequirePeerFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dontThrow)) __obj.updateDynamic("dontThrow")(dontThrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequirePeerFunctionOptions]
  }
}

