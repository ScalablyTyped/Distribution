package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtrulePreludePlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_AtrulePreludePlain: cssDashTreeLib.cssDashTreeLibStrings.AtrulePrelude
}

object AtrulePreludePlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.AtrulePrelude,
    loc: CssLocation = null
  ): AtrulePreludePlain = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[AtrulePreludePlain]
  }
}

