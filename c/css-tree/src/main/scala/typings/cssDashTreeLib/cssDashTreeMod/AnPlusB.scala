package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnPlusB
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var a: java.lang.String | scala.Null
  var b: java.lang.String | scala.Null
  @JSName("type")
  var type_AnPlusB: cssDashTreeLib.cssDashTreeLibStrings.AnPlusB
}

object AnPlusB {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.AnPlusB,
    a: java.lang.String = null,
    b: java.lang.String = null,
    loc: CssLocation = null
  ): AnPlusB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (a != null) __obj.updateDynamic("a")(a)
    if (b != null) __obj.updateDynamic("b")(b)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[AnPlusB]
  }
}

