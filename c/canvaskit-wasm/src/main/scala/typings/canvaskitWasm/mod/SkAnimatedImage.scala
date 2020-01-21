package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkAnimatedImage extends SkObject[SkAnimatedImage] {
  def decodeNextFrame(): Double
  def getFrameCount(): Double
  def getRepetitionCount(): Double
  def height(): Double
  def width(): Double
}

object SkAnimatedImage {
  @scala.inline
  def apply(
    decodeNextFrame: () => Double,
    delete: () => Unit,
    deleteAfter: () => Unit,
    getFrameCount: () => Double,
    getRepetitionCount: () => Double,
    height: () => Double,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    width: () => Double
  ): SkAnimatedImage = {
    val __obj = js.Dynamic.literal(decodeNextFrame = js.Any.fromFunction0(decodeNextFrame), delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getFrameCount = js.Any.fromFunction0(getFrameCount), getRepetitionCount = js.Any.fromFunction0(getRepetitionCount), height = js.Any.fromFunction0(height), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), width = js.Any.fromFunction0(width))
  
    __obj.asInstanceOf[SkAnimatedImage]
  }
}

