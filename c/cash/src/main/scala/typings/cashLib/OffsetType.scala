package typings
package cashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetType extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object OffsetType {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): OffsetType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[OffsetType]
  }
}

