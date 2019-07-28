package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationListPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_DeclarationListPlain: typings.cssDashTree.cssDashTreeStrings.DeclarationList
}

object DeclarationListPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: typings.cssDashTree.cssDashTreeStrings.DeclarationList,
    loc: CssLocation = null
  ): DeclarationListPlain = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DeclarationListPlain]
  }
}

