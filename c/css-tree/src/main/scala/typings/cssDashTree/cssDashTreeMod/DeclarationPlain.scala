package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationPlain
  extends CssNodeCommon
     with CssNodePlain {
  var important: Boolean | String
  var property: String
  @JSName("type")
  var type_DeclarationPlain: typings.cssDashTree.cssDashTreeStrings.Declaration
  var value: ValuePlain | Raw
}

object DeclarationPlain {
  @scala.inline
  def apply(
    important: Boolean | String,
    property: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.Declaration,
    value: ValuePlain | Raw,
    loc: CssLocation = null
  ): DeclarationPlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DeclarationPlain]
  }
}

