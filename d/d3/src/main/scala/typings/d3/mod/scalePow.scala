package typings.d3.mod

import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScalePower
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scalePow")
@js.native
object scalePow extends js.Object {
  
  def apply[Range, Output, Unknown](): ScalePower[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](domain: Iterable[NumberValue], range: Iterable[Range]): ScalePower[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](range: Iterable[Range]): ScalePower[Range, Output, Unknown] = js.native
}
