package typings
package atBabelTraverseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Const extends js.Object {
  var id: atBabelTypesLib.atBabelTypesMod.LVal
  var init: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression] = js.undefined
  var kind: js.UndefOr[
    atBabelTraverseLib.atBabelTraverseLibStrings.`var` | atBabelTraverseLib.atBabelTraverseLibStrings.let | atBabelTraverseLib.atBabelTraverseLibStrings.const
  ] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Const {
  @scala.inline
  def apply(
    id: atBabelTypesLib.atBabelTypesMod.LVal,
    init: atBabelTypesLib.atBabelTypesMod.Expression = null,
    kind: atBabelTraverseLib.atBabelTraverseLibStrings.`var` | atBabelTraverseLib.atBabelTraverseLibStrings.let | atBabelTraverseLib.atBabelTraverseLibStrings.const = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Const = {
    val __obj = js.Dynamic.literal(id = id)
    if (init != null) __obj.updateDynamic("init")(init)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[Anon_Const]
  }
}

