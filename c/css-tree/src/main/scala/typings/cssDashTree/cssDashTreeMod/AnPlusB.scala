package typings.cssDashTree.cssDashTreeMod

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
  var type_AnPlusB: typings.cssDashTree.cssDashTreeStrings.AnPlusB
}

object AnPlusB {
  @scala.inline
  def apply(
    `type`: typings.cssDashTree.cssDashTreeStrings.AnPlusB,
    a: String = null,
    b: String = null,
    loc: CssLocation = null
  ): AnPlusB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnPlusB]
  }
}

