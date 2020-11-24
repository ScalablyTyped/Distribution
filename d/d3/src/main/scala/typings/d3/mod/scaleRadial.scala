package typings.d3.mod

import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScaleRadial_
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleRadial")
@js.native
object scaleRadial extends js.Object {
  
  def apply[Range, Unknown](): ScaleRadial_[Range, Range, Unknown] = js.native
  def apply[Range, Unknown](domain: Iterable[NumberValue], range: Iterable[Range]): ScaleRadial_[Range, Range, Unknown] = js.native
  def apply[Range, Unknown](range: Iterable[Range]): ScaleRadial_[Range, Range, Unknown] = js.native
}
