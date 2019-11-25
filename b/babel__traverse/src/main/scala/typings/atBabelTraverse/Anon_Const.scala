package typings.atBabelTraverse

import typings.atBabelTraverse.atBabelTraverseStrings.`var`
import typings.atBabelTraverse.atBabelTraverseStrings.const
import typings.atBabelTraverse.atBabelTraverseStrings.let
import typings.atBabelTypes.atBabelTypesMod.Expression
import typings.atBabelTypes.atBabelTypesMod.LVal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Const extends js.Object {
  var id: LVal
  var init: js.UndefOr[Expression] = js.undefined
  var kind: js.UndefOr[`var` | let | const] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object Anon_Const {
  @scala.inline
  def apply(
    id: LVal,
    init: Expression = null,
    kind: `var` | let | const = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): Anon_Const = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Const]
  }
}

