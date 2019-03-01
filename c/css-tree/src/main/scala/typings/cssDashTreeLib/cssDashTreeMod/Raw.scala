package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Raw
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Raw: cssDashTreeLib.cssDashTreeLibStrings.Raw
  var value: java.lang.String
}

object Raw {
  @scala.inline
  def apply(`type`: cssDashTreeLib.cssDashTreeLibStrings.Raw, value: java.lang.String, loc: CssLocation = null): Raw = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Raw]
  }
}

