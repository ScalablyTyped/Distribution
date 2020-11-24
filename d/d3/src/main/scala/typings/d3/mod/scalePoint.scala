package typings.d3.mod

import typings.d3Scale.anon.ToString
import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScalePoint_
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scalePoint")
@js.native
object scalePoint extends js.Object {
  
  def apply[Domain /* <: ToString */](): ScalePoint_[Domain] = js.native
  def apply[Domain /* <: ToString */](domain: Iterable[Domain], range: Iterable[NumberValue]): ScalePoint_[Domain] = js.native
  def apply[Domain /* <: ToString */](range: Iterable[NumberValue]): ScalePoint_[Domain] = js.native
}
