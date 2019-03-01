package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CDO
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_CDO: cssDashTreeLib.cssDashTreeLibStrings.CDO
}

object CDO {
  @scala.inline
  def apply(`type`: cssDashTreeLib.cssDashTreeLibStrings.CDO, loc: CssLocation = null): CDO = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[CDO]
  }
}

