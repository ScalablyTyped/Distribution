package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmap extends js.Object {
  val height: Double
  val width: Double
  def close(): Unit
}

object ImageBitmap {
  @scala.inline
  def apply(close: () => Unit, height: Double, width: Double): ImageBitmap = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageBitmap]
  }
}

