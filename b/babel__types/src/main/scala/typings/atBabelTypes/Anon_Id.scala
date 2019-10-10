package typings.atBabelTypes

import typings.atBabelTypes.atBabelTypesMod.Expression
import typings.atBabelTypes.atBabelTypesMod.LVal
import typings.atBabelTypes.atBabelTypesStrings.`var`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: LVal
  var init: js.UndefOr[Expression] = js.undefined
  var kind: `var`
}

object Anon_Id {
  @scala.inline
  def apply(id: LVal, kind: `var`, init: Expression = null): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, kind = kind)
    if (init != null) __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[Anon_Id]
  }
}

