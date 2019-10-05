package typings.d3.d3Mod

import typings.d3DashForce.d3DashForceMod.ForceLink
import typings.d3DashForce.d3DashForceMod.SimulationLinkDatum
import typings.d3DashForce.d3DashForceMod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "forceLink")
@js.native
object forceLink extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](): ForceLink[NodeDatum, LinksDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](links: js.Array[LinksDatum]): ForceLink[NodeDatum, LinksDatum] = js.native
}

