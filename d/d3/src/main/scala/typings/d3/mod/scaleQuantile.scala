package typings.d3.mod

import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScaleQuantile_
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleQuantile")
@js.native
object scaleQuantile extends js.Object {
  
  def apply[Range, Unknown](): ScaleQuantile_[Range, Unknown] = js.native
  def apply[Range, Unknown](domain: Iterable[js.UndefOr[NumberValue | Null]], range: Iterable[Range]): ScaleQuantile_[Range, Unknown] = js.native
  def apply[Range, Unknown](range: Iterable[Range]): ScaleQuantile_[Range, Unknown] = js.native
}
