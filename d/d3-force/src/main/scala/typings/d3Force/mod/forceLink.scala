package typings.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-force", "forceLink")
@js.native
object forceLink extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](): ForceLink_[NodeDatum, LinksDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](links: js.Array[LinksDatum]): ForceLink_[NodeDatum, LinksDatum] = js.native
}

