package typings.d3.mod

import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScaleSymLog_
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleSymlog")
@js.native
object scaleSymlog extends js.Object {
  
  def apply[Range, Output, Unknown](): ScaleSymLog_[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](domain: Iterable[NumberValue], range: Iterable[Range]): ScaleSymLog_[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](range: Iterable[Range]): ScaleSymLog_[Range, Output, Unknown] = js.native
}
