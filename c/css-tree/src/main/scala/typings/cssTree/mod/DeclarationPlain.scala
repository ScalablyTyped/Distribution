package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationPlain
  extends CssNodeCommon
     with CssNodePlain {
  var important: Boolean | String
  var property: String
  @JSName("type")
  var type_DeclarationPlain: typings.cssTree.cssTreeStrings.Declaration
  var value: ValuePlain | Raw
}

object DeclarationPlain {
  @scala.inline
  def apply(
    important: Boolean | String,
    property: String,
    `type`: typings.cssTree.cssTreeStrings.Declaration,
    value: ValuePlain | Raw,
    loc: CssLocation = null
  ): DeclarationPlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationPlain]
  }
}

