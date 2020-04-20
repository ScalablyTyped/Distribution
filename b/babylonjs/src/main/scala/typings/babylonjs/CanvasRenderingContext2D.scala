package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRenderingContext2D extends js.Object {
  var msImageSmoothingEnabled: Boolean
}

object CanvasRenderingContext2D {
  @scala.inline
  def apply(msImageSmoothingEnabled: Boolean): CanvasRenderingContext2D = {
    val __obj = js.Dynamic.literal(msImageSmoothingEnabled = msImageSmoothingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRenderingContext2D]
  }
}

