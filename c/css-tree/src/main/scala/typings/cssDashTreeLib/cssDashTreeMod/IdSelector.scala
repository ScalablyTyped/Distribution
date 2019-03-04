package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: java.lang.String
  @JSName("type")
  var type_IdSelector: cssDashTreeLib.cssDashTreeLibStrings.IdSelector
}

object IdSelector {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.IdSelector,
    loc: CssLocation = null
  ): IdSelector = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[IdSelector]
  }
}

