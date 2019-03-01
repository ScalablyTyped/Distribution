package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ratio
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var left: java.lang.String
  var right: java.lang.String
  @JSName("type")
  var type_Ratio: cssDashTreeLib.cssDashTreeLibStrings.Ratio
}

object Ratio {
  @scala.inline
  def apply(
    left: java.lang.String,
    right: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Ratio,
    loc: CssLocation = null
  ): Ratio = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Ratio]
  }
}

