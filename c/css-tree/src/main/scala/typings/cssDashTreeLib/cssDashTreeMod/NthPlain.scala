package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NthPlain
  extends CssNodeCommon
     with CssNodePlain {
  var nth: AnPlusB | Identifier
  var selector: SelectorListPlain | scala.Null
  @JSName("type")
  var type_NthPlain: cssDashTreeLib.cssDashTreeLibStrings.Nth
}

object NthPlain {
  @scala.inline
  def apply(
    nth: AnPlusB | Identifier,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Nth,
    loc: CssLocation = null,
    selector: SelectorListPlain = null
  ): NthPlain = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("nth")(nth.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[NthPlain]
  }
}

