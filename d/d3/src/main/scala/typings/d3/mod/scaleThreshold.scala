package typings.d3.mod

import typings.d3Scale.mod.ScaleThreshold_
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleThreshold")
@js.native
object scaleThreshold extends js.Object {
  
  def apply[Domain /* <: Double | String | Date */, Range, Unknown](): ScaleThreshold_[Domain, Range, Unknown] = js.native
  def apply[Domain /* <: Double | String | Date */, Range, Unknown](domain: Iterable[Domain], range: Iterable[Range]): ScaleThreshold_[Domain, Range, Unknown] = js.native
  def apply[Domain /* <: Double | String | Date */, Range, Unknown](range: Iterable[Range]): ScaleThreshold_[Domain, Range, Unknown] = js.native
}
