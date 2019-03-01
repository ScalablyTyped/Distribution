package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Url: cssDashTreeLib.cssDashTreeLibStrings.Url
  var value: StringNode | Raw
}

object Url {
  @scala.inline
  def apply(`type`: cssDashTreeLib.cssDashTreeLibStrings.Url, value: StringNode | Raw, loc: CssLocation = null): Url = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Url]
  }
}

