package typings.d3.mod

import typings.d3Force.mod.ForceX_
import typings.d3Force.mod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "forceX")
@js.native
object forceX extends js.Object {
  
  def apply[NodeDatum /* <: SimulationNodeDatum */](): ForceX_[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): ForceX_[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](x: Double): ForceX_[NodeDatum] = js.native
}
