package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkColorFilterFactory extends js.Object {
  def MakeBlend(color: SkColor, blendMode: SkBlendMode): SkColorFilter = js.native
  def MakeCompose(first: SkColorFilter, second: SkColorFilter): SkColorFilter = js.native
  def MakeLerp(lerp: Double, first: SkColorFilter, second: SkColorFilter): SkColorFilter = js.native
  def MakeLinearToSRGBGamma(): SkColorFilter = js.native
  def MakeMatrix(matrix: SkMatrix): SkColorFilter = js.native
  def MakeSRGBToLinearGamma(): SkColorFilter = js.native
}

object SkColorFilterFactory {
  @scala.inline
  def apply(
    MakeBlend: (SkColor, SkBlendMode) => SkColorFilter,
    MakeCompose: (SkColorFilter, SkColorFilter) => SkColorFilter,
    MakeLerp: (Double, SkColorFilter, SkColorFilter) => SkColorFilter,
    MakeLinearToSRGBGamma: () => SkColorFilter,
    MakeMatrix: SkMatrix => SkColorFilter,
    MakeSRGBToLinearGamma: () => SkColorFilter
  ): SkColorFilterFactory = {
    val __obj = js.Dynamic.literal(MakeBlend = js.Any.fromFunction2(MakeBlend), MakeCompose = js.Any.fromFunction2(MakeCompose), MakeLerp = js.Any.fromFunction3(MakeLerp), MakeLinearToSRGBGamma = js.Any.fromFunction0(MakeLinearToSRGBGamma), MakeMatrix = js.Any.fromFunction1(MakeMatrix), MakeSRGBToLinearGamma = js.Any.fromFunction0(MakeSRGBToLinearGamma))
    __obj.asInstanceOf[SkColorFilterFactory]
  }
  @scala.inline
  implicit class SkColorFilterFactoryOps[Self <: SkColorFilterFactory] (val x: Self) extends AnyVal {
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
    def setMakeBlend(value: (SkColor, SkBlendMode) => SkColorFilter): Self = this.set("MakeBlend", js.Any.fromFunction2(value))
    @scala.inline
    def setMakeCompose(value: (SkColorFilter, SkColorFilter) => SkColorFilter): Self = this.set("MakeCompose", js.Any.fromFunction2(value))
    @scala.inline
    def setMakeLerp(value: (Double, SkColorFilter, SkColorFilter) => SkColorFilter): Self = this.set("MakeLerp", js.Any.fromFunction3(value))
    @scala.inline
    def setMakeLinearToSRGBGamma(value: () => SkColorFilter): Self = this.set("MakeLinearToSRGBGamma", js.Any.fromFunction0(value))
    @scala.inline
    def setMakeMatrix(value: SkMatrix => SkColorFilter): Self = this.set("MakeMatrix", js.Any.fromFunction1(value))
    @scala.inline
    def setMakeSRGBToLinearGamma(value: () => SkColorFilter): Self = this.set("MakeSRGBToLinearGamma", js.Any.fromFunction0(value))
  }
  
}

