package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkSurface extends SkObject[SkSurface] {
  def captureFrameAsSkPicture(drawFrame: js.Function1[/* canvas */ SkCanvas, Unit]): SkPicture
  def dispose(): Unit
  def flush(): Unit
  def getCanvas(): SkCanvas
  def height(): Double
  def makeImageSnapshot(): SkImage
  def makeSurface(info: SkImageInfo): SkSurface
  def width(): Double
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
}

