package typings.babylonjs

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTranscodedPixels extends js.Object {
  var height: Double
  var transcodedPixels: ArrayBufferView
  var width: Double
}

object AnonTranscodedPixels {
  @scala.inline
  def apply(height: Double, transcodedPixels: ArrayBufferView, width: Double): AnonTranscodedPixels = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transcodedPixels = transcodedPixels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranscodedPixels]
  }
}

