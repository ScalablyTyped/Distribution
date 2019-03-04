package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declaration
  extends CssNodeCommon
     with CssNode {
  var important: scala.Boolean | java.lang.String
  var property: java.lang.String
  @JSName("type")
  var type_Declaration: cssDashTreeLib.cssDashTreeLibStrings.Declaration
  var value: Value | Raw
}

object Declaration {
  @scala.inline
  def apply(
    important: scala.Boolean | java.lang.String,
    property: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Declaration,
    value: Value | Raw,
    loc: CssLocation = null
  ): Declaration = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Declaration]
  }
}

