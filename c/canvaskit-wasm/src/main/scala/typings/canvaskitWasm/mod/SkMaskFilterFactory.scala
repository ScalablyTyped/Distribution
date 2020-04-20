package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkMaskFilterFactory extends js.Object {
  def MakeBlur(blurStyle: SkBlurStyle, radius: Double, b: Boolean): SkMaskFilter
}

object SkMaskFilterFactory {
  @scala.inline
  def apply(MakeBlur: (SkBlurStyle, Double, Boolean) => SkMaskFilter): SkMaskFilterFactory = {
    val __obj = js.Dynamic.literal(MakeBlur = js.Any.fromFunction3(MakeBlur))
    __obj.asInstanceOf[SkMaskFilterFactory]
  }
}

