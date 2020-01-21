package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declaration
  extends CssNodeCommon
     with CssNode {
  var important: Boolean | String
  var property: String
  @JSName("type")
  var type_Declaration: typings.cssTree.cssTreeStrings.Declaration
  var value: Value | Raw
}

object Declaration {
  @scala.inline
  def apply(
    important: Boolean | String,
    property: String,
    `type`: typings.cssTree.cssTreeStrings.Declaration,
    value: Value | Raw,
    loc: CssLocation = null
  ): Declaration = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
}

