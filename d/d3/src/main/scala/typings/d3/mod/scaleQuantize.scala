package typings.d3.mod

import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScaleQuantize_
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleQuantize")
@js.native
object scaleQuantize extends js.Object {
  
  def apply[Range, Unknown](): ScaleQuantize_[Range, Unknown] = js.native
  def apply[Range, Unknown](domain: Iterable[NumberValue], range: Iterable[Range]): ScaleQuantize_[Range, Unknown] = js.native
  def apply[Range, Unknown](range: Iterable[Range]): ScaleQuantize_[Range, Unknown] = js.native
}
