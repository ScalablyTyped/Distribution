package typings.d3.mod

import typings.d3Force.mod.Simulation
import typings.d3Force.mod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "forceSimulation")
@js.native
object forceSimulation extends js.Object {
  
  def apply[NodeDatum /* <: SimulationNodeDatum */](): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](nodesData: js.Array[NodeDatum]): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
}
