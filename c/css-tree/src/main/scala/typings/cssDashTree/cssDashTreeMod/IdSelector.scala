package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String
  @JSName("type")
  var type_IdSelector: typings.cssDashTree.cssDashTreeStrings.IdSelector
}

object IdSelector {
  @scala.inline
  def apply(name: String, `type`: typings.cssDashTree.cssDashTreeStrings.IdSelector, loc: CssLocation = null): IdSelector = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[IdSelector]
  }
}

