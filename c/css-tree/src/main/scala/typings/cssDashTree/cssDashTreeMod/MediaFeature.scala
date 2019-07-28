package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaFeature
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String
  @JSName("type")
  var type_MediaFeature: typings.cssDashTree.cssDashTreeStrings.MediaFeature
  var value: Identifier | NumberNode | Dimension | Ratio | Null
}

object MediaFeature {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.MediaFeature,
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

