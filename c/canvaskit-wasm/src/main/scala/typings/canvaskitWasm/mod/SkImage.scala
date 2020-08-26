package typings.canvaskitWasm.mod

import typings.std.Float32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkImage extends SkObject[SkImage] {
  def encodeToData(): SkData = js.native
  def height(): Double = js.native
  def readPixels(info: SkImageInfo, srcX: Double, srcY: Double): Uint8Array | Float32Array | Null = js.native
  def width(): Double = js.native
}

object SkImage {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    encodeToData: () => SkData,
    height: () => Double,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    readPixels: (SkImageInfo, Double, Double) => Uint8Array | Float32Array | Null,
    width: () => Double
  ): SkImage = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), encodeToData = js.Any.fromFunction0(encodeToData), height = js.Any.fromFunction0(height), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), readPixels = js.Any.fromFunction3(readPixels), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[SkImage]
  }
  @scala.inline
  implicit class SkImageOps[Self <: SkImage] (val x: Self) extends AnyVal {
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
    def setEncodeToData(value: () => SkData): Self = this.set("encodeToData", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: () => Double): Self = this.set("height", js.Any.fromFunction0(value))
    @scala.inline
    def setReadPixels(value: (SkImageInfo, Double, Double) => Uint8Array | Float32Array | Null): Self = this.set("readPixels", js.Any.fromFunction3(value))
    @scala.inline
    def setWidth(value: () => Double): Self = this.set("width", js.Any.fromFunction0(value))
  }
  
}

