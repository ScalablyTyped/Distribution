package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CDC
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_CDC: cssDashTreeLib.cssDashTreeLibStrings.CDC
}

object CDC {
  @scala.inline
  def apply(`type`: cssDashTreeLib.cssDashTreeLibStrings.CDC, loc: CssLocation = null): CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[CDC]
  }
}

