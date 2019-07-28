package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssNodeCommon extends js.Object {
  var loc: js.UndefOr[CssLocation] = js.undefined
  var `type`: String
}

object CssNodeCommon {
  @scala.inline
  def apply(`type`: String, loc: CssLocation = null): CssNodeCommon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[CssNodeCommon]
  }
}

