package typings
package ckeditorLib.CKEDITORNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait customHandler extends js.Object {
  var assignedTo: js.UndefOr[scala.Double] = js.undefined
  var setup: js.UndefOr[js.Function1[/* style */ definition, scala.Unit]] = js.undefined
  var `type`: java.lang.String | scala.Double
}

object customHandler {
  @scala.inline
  def apply(
    `type`: java.lang.String | scala.Double,
    assignedTo: scala.Int | scala.Double = null,
    setup: js.Function1[/* style */ definition, scala.Unit] = null
  ): customHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (assignedTo != null) __obj.updateDynamic("assignedTo")(assignedTo.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup)
    __obj.asInstanceOf[customHandler]
  }
}

