package typings.babylonjs.anon

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranscodedPixels extends js.Object {
  var height: Double
  var transcodedPixels: ArrayBufferView
  var width: Double
}

object TranscodedPixels {
  @scala.inline
  def apply(height: Double, transcodedPixels: ArrayBufferView, width: Double): TranscodedPixels = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transcodedPixels = transcodedPixels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodedPixels]
  }
}

