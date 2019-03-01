package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulePlain
  extends CssNodeCommon
     with CssNodePlain {
  var block: BlockPlain
  var prelude: SelectorListPlain | Raw
  @JSName("type")
  var type_RulePlain: cssDashTreeLib.cssDashTreeLibStrings.Rule
}

object RulePlain {
  @scala.inline
  def apply(
    block: BlockPlain,
    prelude: SelectorListPlain | Raw,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Rule,
    loc: CssLocation = null
  ): RulePlain = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("prelude")(prelude.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[RulePlain]
  }
}

