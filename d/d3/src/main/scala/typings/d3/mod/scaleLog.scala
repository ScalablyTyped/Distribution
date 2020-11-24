package typings.d3.mod

import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScaleLogarithmic
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleLog")
@js.native
object scaleLog extends js.Object {
  
  def apply[Range, Output, Unknown](): ScaleLogarithmic[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](domain: Iterable[NumberValue], range: Iterable[Range]): ScaleLogarithmic[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](range: Iterable[Range]): ScaleLogarithmic[Range, Output, Unknown] = js.native
}
