package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkColorFilterFactory extends js.Object {
  def MakeBlend(color: SkColor, blendMode: SkBlendMode): SkColorFilter
  def MakeCompose(first: SkColorFilter, second: SkColorFilter): SkColorFilter
  def MakeLerp(lerp: Double, first: SkColorFilter, second: SkColorFilter): SkColorFilter
  def MakeLinearToSRGBGamma(): SkColorFilter
  def MakeMatrix(matrix: SkMatrix): SkColorFilter
  def MakeSRGBToLinearGamma(): SkColorFilter
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
}

