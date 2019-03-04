package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: java.lang.String
  @JSName("type")
  var type_TypeSelector: cssDashTreeLib.cssDashTreeLibStrings.TypeSelector
}

object TypeSelector {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.TypeSelector,
    loc: CssLocation = null
  ): TypeSelector = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[TypeSelector]
  }
}

