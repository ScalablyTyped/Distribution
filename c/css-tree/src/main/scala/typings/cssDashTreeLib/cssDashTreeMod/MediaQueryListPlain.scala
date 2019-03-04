package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryListPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_MediaQueryListPlain: cssDashTreeLib.cssDashTreeLibStrings.MediaQueryList
}

object MediaQueryListPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.MediaQueryList,
    loc: CssLocation = null
  ): MediaQueryListPlain = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[MediaQueryListPlain]
  }
}

