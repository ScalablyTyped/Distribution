package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnPlusB
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var a: String | Null
  var b: String | Null
  @JSName("type")
  var type_AnPlusB: typings.cssTree.cssTreeStrings.AnPlusB
}

object AnPlusB {
  @scala.inline
  def apply(
    `type`: typings.cssTree.cssTreeStrings.AnPlusB,
    a: String = null,
    b: String = null,
    loc: CssLocation = null
  ): AnPlusB = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnPlusB]
  }
}

