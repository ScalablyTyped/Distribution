package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CDO
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_CDO: typings.cssDashTree.cssDashTreeStrings.CDO
}

object CDO {
  @scala.inline
  def apply(`type`: typings.cssDashTree.cssDashTreeStrings.CDO, loc: CssLocation = null): CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[CDO]
  }
}

