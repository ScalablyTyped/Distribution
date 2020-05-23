package typings.babelTypes.anon

import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.LVal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: LVal
  var init: js.UndefOr[Expression] = js.undefined
  var kind: `var`
}

object Id {
  @scala.inline
  def apply(id: LVal, kind: `var`, init: Expression = null): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

