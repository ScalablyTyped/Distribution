package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nth
  extends CssNodeCommon
     with CssNode {
  var nth: AnPlusB | Identifier
  var selector: SelectorList | scala.Null
  @JSName("type")
  var type_Nth: cssDashTreeLib.cssDashTreeLibStrings.Nth
}

object Nth {
  @scala.inline
  def apply(
    nth: AnPlusB | Identifier,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Nth,
    loc: CssLocation = null,
    selector: SelectorList = null
  ): Nth = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("nth")(nth.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Nth]
  }
}

