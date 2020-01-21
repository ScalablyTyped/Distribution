package typings.babelTraverse

import typings.babelTraverse.babelTraverseStrings.`var`
import typings.babelTraverse.babelTraverseStrings.const
import typings.babelTraverse.babelTraverseStrings.let
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.LVal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConst extends js.Object {
  var id: LVal
  var init: js.UndefOr[Expression] = js.undefined
  var kind: js.UndefOr[`var` | let | const] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object AnonConst {
  @scala.inline
  def apply(
    id: LVal,
    init: Expression = null,
    kind: `var` | let | const = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): AnonConst = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConst]
  }
}

