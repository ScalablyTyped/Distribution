package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkAnimation extends SkObject[SkAnimation] {
  def duration(): Double
  def fps(): Double
  def render(canvas: SkCanvas, bounds: SkRect): Unit
  def seek(time: Double): Unit
  def seekFrame(frame: Double): Unit
  def size(): SkSize
  def version(): String
}

object SkAnimation {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    duration: () => Double,
    fps: () => Double,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    render: (SkCanvas, SkRect) => Unit,
    seek: Double => Unit,
    seekFrame: Double => Unit,
    size: () => SkSize,
    version: () => String
  ): SkAnimation = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), duration = js.Any.fromFunction0(duration), fps = js.Any.fromFunction0(fps), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), render = js.Any.fromFunction2(render), seek = js.Any.fromFunction1(seek), seekFrame = js.Any.fromFunction1(seekFrame), size = js.Any.fromFunction0(size), version = js.Any.fromFunction0(version))
  
    __obj.asInstanceOf[SkAnimation]
  }
}

