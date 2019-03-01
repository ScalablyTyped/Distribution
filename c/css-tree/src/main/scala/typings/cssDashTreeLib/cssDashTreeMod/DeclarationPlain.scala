package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationPlain
  extends CssNodeCommon
     with CssNodePlain {
  var important: scala.Boolean | java.lang.String
  var property: java.lang.String
  @JSName("type")
  var type_DeclarationPlain: cssDashTreeLib.cssDashTreeLibStrings.Declaration
  var value: ValuePlain | Raw
}

object DeclarationPlain {
  @scala.inline
  def apply(
    important: scala.Boolean | java.lang.String,
    property: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Declaration,
    value: ValuePlain | Raw,
    loc: CssLocation = null
  ): DeclarationPlain = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("important")(important.asInstanceOf[js.Any])
    __obj.updateDynamic("property")(property)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DeclarationPlain]
  }
}

