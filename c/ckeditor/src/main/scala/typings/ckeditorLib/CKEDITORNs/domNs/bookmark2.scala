package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bookmark2 extends js.Object {
  var collapsed: scala.Boolean
  var end: js.Array[scala.Double]
  var endOffset: scala.Double
  var is2: scala.Boolean
  var normalized: scala.Boolean
  var start: js.Array[scala.Double]
  var startOffset: scala.Double
}

object bookmark2 {
  @scala.inline
  def apply(
    collapsed: scala.Boolean,
    end: js.Array[scala.Double],
    endOffset: scala.Double,
    is2: scala.Boolean,
    normalized: scala.Boolean,
    start: js.Array[scala.Double],
    startOffset: scala.Double
  ): bookmark2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapsed")(collapsed)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("endOffset")(endOffset)
    __obj.updateDynamic("is2")(is2)
    __obj.updateDynamic("normalized")(normalized)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("startOffset")(startOffset)
    __obj.asInstanceOf[bookmark2]
  }
}

