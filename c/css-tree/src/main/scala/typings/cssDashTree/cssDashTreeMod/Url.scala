package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Url: typings.cssDashTree.cssDashTreeStrings.Url
  var value: StringNode | Raw
}

object Url {
  @scala.inline
  def apply(
    `type`: typings.cssDashTree.cssDashTreeStrings.Url,
    value: StringNode | Raw,
    loc: CssLocation = null
  ): Url = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Url]
  }
}

