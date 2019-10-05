package typings.d3.d3Mod

import typings.d3DashForce.d3DashForceMod.ForceY
import typings.d3DashForce.d3DashForceMod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "forceY")
@js.native
object forceY extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */](): ForceY[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): ForceY[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](y: Double): ForceY[NodeDatum] = js.native
}

