package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NthPlain
  extends CssNodeCommon
     with CssNodePlain {
  var nth: AnPlusB | Identifier
  var selector: SelectorListPlain | Null
  @JSName("type")
  var type_NthPlain: typings.cssDashTree.cssDashTreeStrings.Nth
}

object NthPlain {
  @scala.inline
  def apply(
    nth: AnPlusB | Identifier,
    `type`: typings.cssDashTree.cssDashTreeStrings.Nth,
    loc: CssLocation = null,
    selector: SelectorListPlain = null
  ): NthPlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthPlain]
  }
}

