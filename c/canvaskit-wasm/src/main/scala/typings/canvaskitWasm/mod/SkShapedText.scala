package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkShapedText extends SkObject[SkShapedText] {
  def getBounds(): SkRect = js.native
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
  @scala.inline
  implicit class SkShapedTextOps[Self <: SkShapedText] (val x: Self) extends AnyVal {
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
    def setGetBounds(value: () => SkRect): Self = this.set("getBounds", js.Any.fromFunction0(value))
  }
  
}

