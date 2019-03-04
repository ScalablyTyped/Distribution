package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaFeature
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: java.lang.String
  @JSName("type")
  var type_MediaFeature: cssDashTreeLib.cssDashTreeLibStrings.MediaFeature
  var value: Identifier | NumberNode | Dimension | Ratio | scala.Null
}

object MediaFeature {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.MediaFeature,
    loc: CssLocation = null,
    value: Identifier | NumberNode | Dimension | Ratio = null
  ): MediaFeature = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFeature]
  }
}

