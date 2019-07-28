package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String
  @JSName("type")
  var type_Identifier: typings.cssDashTree.cssDashTreeStrings.Identifier
}

object Identifier {
  @scala.inline
  def apply(name: String, `type`: typings.cssDashTree.cssDashTreeStrings.Identifier, loc: CssLocation = null): Identifier = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Identifier]
  }
}

