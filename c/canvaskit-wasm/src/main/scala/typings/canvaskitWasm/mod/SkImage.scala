package typings.canvaskitWasm.mod

import typings.std.Float32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkImage extends SkObject[SkImage] {
  def encodeToData(): SkData
  def height(): Double
  def readPixels(info: SkImageInfo, srcX: Double, srcY: Double): Uint8Array | Float32Array | Null
  def width(): Double
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
}

