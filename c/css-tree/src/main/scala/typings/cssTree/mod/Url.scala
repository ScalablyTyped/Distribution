package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Url: typings.cssTree.cssTreeStrings.Url
  var value: StringNode | Raw
}

object Url {
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.Url, value: StringNode | Raw, loc: CssLocation = null): Url = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

