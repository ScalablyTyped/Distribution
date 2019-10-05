package typings.d3.d3Mod

import typings.d3DashForce.d3DashForceMod.ForceCollide
import typings.d3DashForce.d3DashForceMod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "forceCollide")
@js.native
object forceCollide extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */](): ForceCollide[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* node */ NodeDatum, /* i */ Double, /* nodes */ js.Array[NodeDatum], Double]
  ): ForceCollide[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](radius: Double): ForceCollide[NodeDatum] = js.native
}

