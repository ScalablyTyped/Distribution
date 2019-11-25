package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CDC
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_CDC: typings.cssDashTree.cssDashTreeStrings.CDC
}

object CDC {
  @scala.inline
  def apply(`type`: typings.cssDashTree.cssDashTreeStrings.CDC, loc: CssLocation = null): CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDC]
  }
}

