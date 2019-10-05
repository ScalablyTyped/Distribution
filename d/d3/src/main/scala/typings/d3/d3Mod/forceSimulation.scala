package typings.d3.d3Mod

import typings.d3DashForce.d3DashForceMod.Simulation
import typings.d3DashForce.d3DashForceMod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "forceSimulation")
@js.native
object forceSimulation extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */](): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](nodesData: js.Array[NodeDatum]): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
}

