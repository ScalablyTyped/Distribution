package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkShapedText extends SkObject[SkShapedText] {
  def getBounds(): SkRect
}

object SkShapedText {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    getBounds: () => SkRect,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean
  ): SkShapedText = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getBounds = js.Any.fromFunction0(getBounds), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
  
    __obj.asInstanceOf[SkShapedText]
  }
}

