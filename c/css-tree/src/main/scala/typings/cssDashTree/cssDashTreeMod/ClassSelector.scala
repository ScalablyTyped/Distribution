package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String
  @JSName("type")
  var type_ClassSelector: typings.cssDashTree.cssDashTreeStrings.ClassSelector
}

object ClassSelector {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.ClassSelector,
    loc: CssLocation = null
  ): ClassSelector = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ClassSelector]
  }
}

