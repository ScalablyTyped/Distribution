package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRenderingContext2D extends js.Object {
  var msImageSmoothingEnabled: scala.Boolean
}

object CanvasRenderingContext2D {
  @scala.inline
  def apply(msImageSmoothingEnabled: scala.Boolean): CanvasRenderingContext2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("msImageSmoothingEnabled")(msImageSmoothingEnabled)
    __obj.asInstanceOf[CanvasRenderingContext2D]
  }
}

