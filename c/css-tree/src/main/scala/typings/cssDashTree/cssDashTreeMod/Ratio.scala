package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ratio
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var left: String
  var right: String
  @JSName("type")
  var type_Ratio: typings.cssDashTree.cssDashTreeStrings.Ratio
}

object Ratio {
  @scala.inline
  def apply(
    left: String,
    right: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.Ratio,
    loc: CssLocation = null
  ): Ratio = {
    val __obj = js.Dynamic.literal(left = left, right = right)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Ratio]
  }
}

