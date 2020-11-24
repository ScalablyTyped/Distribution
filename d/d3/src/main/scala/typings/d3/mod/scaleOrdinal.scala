package typings.d3.mod

import typings.d3Scale.anon.ToString
import typings.d3Scale.mod.ScaleOrdinal_
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleOrdinal")
@js.native
object scaleOrdinal extends js.Object {
  
  def apply[Range](): ScaleOrdinal_[String, Range, scala.Nothing] = js.native
  def apply[Range](range: Iterable[Range]): ScaleOrdinal_[String, Range, scala.Nothing] = js.native
  def apply[Domain /* <: ToString */, Range, Unknown](domain: Iterable[Domain], range: Iterable[Range]): ScaleOrdinal_[Domain, Range, Unknown] = js.native
}
