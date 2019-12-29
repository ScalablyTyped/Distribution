package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkImageFilterFactory extends js.Object {
  def MakeBlur(rx: Double, ry: Double, tileMode: SkTileMode): SkImageFilter = js.native
  def MakeBlur(rx: Double, ry: Double, tileMode: SkTileMode, next: SkImageFilter): SkImageFilter = js.native
  def MakeColorFilter(filter: SkColorFilter): SkImageFilter = js.native
  def MakeColorFilter(filter: SkColorFilter, next: SkImageFilter): SkImageFilter = js.native
  def MakeCompose(first: SkImageFilter, second: SkImageFilter): SkImageFilter = js.native
  def MakeMatrixTransform(matrix: SkMatrix, filterQuality: SkFilterQuality): SkImageFilter = js.native
  def MakeMatrixTransform(matrix: SkMatrix, filterQuality: SkFilterQuality, next: SkImageFilter): SkImageFilter = js.native
}

