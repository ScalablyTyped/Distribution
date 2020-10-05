package typings.d3.mod

import typings.d3Force.mod.ForceCollide_
import typings.d3Force.mod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "forceCollide")
@js.native
object forceCollide extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */](): ForceCollide_[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* node */ NodeDatum, /* i */ Double, /* nodes */ js.Array[NodeDatum], Double]
  ): ForceCollide_[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](radius: Double): ForceCollide_[NodeDatum] = js.native
}

