package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkSurface extends SkObject[SkSurface] {
  def captureFrameAsSkPicture(drawFrame: js.Function1[/* canvas */ SkCanvas, Unit]): SkPicture = js.native
  def dispose(): Unit = js.native
  def flush(): Unit = js.native
  def getCanvas(): SkCanvas = js.native
  def height(): Double = js.native
  def makeImageSnapshot(): SkImage = js.native
  def makeSurface(info: SkImageInfo): SkSurface = js.native
  def width(): Double = js.native
}

object SkSurface {
  @scala.inline
  def apply(
    captureFrameAsSkPicture: js.Function1[/* canvas */ SkCanvas, Unit] => SkPicture,
    delete: () => Unit,
    deleteAfter: () => Unit,
    dispose: () => Unit,
    flush: () => Unit,
    getCanvas: () => SkCanvas,
    height: () => Double,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    makeImageSnapshot: () => SkImage,
    makeSurface: SkImageInfo => SkSurface,
    width: () => Double
  ): SkSurface = {
    val __obj = js.Dynamic.literal(captureFrameAsSkPicture = js.Any.fromFunction1(captureFrameAsSkPicture), delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), dispose = js.Any.fromFunction0(dispose), flush = js.Any.fromFunction0(flush), getCanvas = js.Any.fromFunction0(getCanvas), height = js.Any.fromFunction0(height), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), makeImageSnapshot = js.Any.fromFunction0(makeImageSnapshot), makeSurface = js.Any.fromFunction1(makeSurface), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[SkSurface]
  }
  @scala.inline
  implicit class SkSurfaceOps[Self <: SkSurface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaptureFrameAsSkPicture(value: js.Function1[/* canvas */ SkCanvas, Unit] => SkPicture): Self = this.set("captureFrameAsSkPicture", js.Any.fromFunction1(value))
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCanvas(value: () => SkCanvas): Self = this.set("getCanvas", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: () => Double): Self = this.set("height", js.Any.fromFunction0(value))
    @scala.inline
    def setMakeImageSnapshot(value: () => SkImage): Self = this.set("makeImageSnapshot", js.Any.fromFunction0(value))
    @scala.inline
    def setMakeSurface(value: SkImageInfo => SkSurface): Self = this.set("makeSurface", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: () => Double): Self = this.set("width", js.Any.fromFunction0(value))
  }
  
}

