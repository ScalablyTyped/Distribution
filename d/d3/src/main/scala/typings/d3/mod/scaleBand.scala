package typings.d3.mod

import typings.d3Scale.anon.ToString
import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScaleBand_
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleBand")
@js.native
object scaleBand extends js.Object {
  
  def apply[Domain /* <: ToString */](): ScaleBand_[Domain] = js.native
  def apply[Domain /* <: ToString */](domain: Iterable[Domain], range: Iterable[NumberValue]): ScaleBand_[Domain] = js.native
  def apply[Domain /* <: ToString */](range: Iterable[NumberValue]): ScaleBand_[Domain] = js.native
}
