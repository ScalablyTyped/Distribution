package typings
package d3DashForceLib.d3DashForceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-force", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def forceCenter[NodeDatum /* <: SimulationNodeDatum */](): ForceCenter[NodeDatum] = js.native
  def forceCenter[NodeDatum /* <: SimulationNodeDatum */](x: scala.Double): ForceCenter[NodeDatum] = js.native
  def forceCenter[NodeDatum /* <: SimulationNodeDatum */](x: scala.Double, y: scala.Double): ForceCenter[NodeDatum] = js.native
  def forceCollide[NodeDatum /* <: SimulationNodeDatum */](): ForceCollide[NodeDatum] = js.native
  def forceCollide[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[
      /* node */ NodeDatum, 
      /* i */ scala.Double, 
      /* nodes */ js.Array[NodeDatum], 
      scala.Double
    ]
  ): ForceCollide[NodeDatum] = js.native
  def forceCollide[NodeDatum /* <: SimulationNodeDatum */](radius: scala.Double): ForceCollide[NodeDatum] = js.native
  def forceLink[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](): ForceLink[NodeDatum, LinksDatum] = js.native
  def forceLink[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](links: js.Array[LinksDatum]): ForceLink[NodeDatum, LinksDatum] = js.native
  def forceManyBody[NodeDatum /* <: SimulationNodeDatum */](): ForceManyBody[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    y: scala.Double
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: scala.Double
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: scala.Double,
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: scala.Double,
    y: scala.Double
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](radius: scala.Double): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: scala.Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: scala.Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: scala.Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    y: scala.Double
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](radius: scala.Double, x: scala.Double): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: scala.Double,
    x: scala.Double,
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](radius: scala.Double, x: scala.Double, y: scala.Double): ForceRadial[NodeDatum] = js.native
  def forceSimulation[NodeDatum /* <: SimulationNodeDatum */](): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
  def forceSimulation[NodeDatum /* <: SimulationNodeDatum */](nodesData: js.Array[NodeDatum]): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
  @JSName("forceSimulation")
  def forceSimulation_NodeDatumSimulationNodeDatumLinkDatumSimulationLinkDatum[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: SimulationLinkDatum[NodeDatum] */](): Simulation[NodeDatum, LinkDatum] = js.native
  @JSName("forceSimulation")
  def forceSimulation_NodeDatumSimulationNodeDatumLinkDatumSimulationLinkDatum[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: SimulationLinkDatum[NodeDatum] */](nodesData: js.Array[NodeDatum]): Simulation[NodeDatum, LinkDatum] = js.native
  def forceX[NodeDatum /* <: SimulationNodeDatum */](): ForceX[NodeDatum] = js.native
  def forceX[NodeDatum /* <: SimulationNodeDatum */](
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): ForceX[NodeDatum] = js.native
  def forceX[NodeDatum /* <: SimulationNodeDatum */](x: scala.Double): ForceX[NodeDatum] = js.native
  def forceY[NodeDatum /* <: SimulationNodeDatum */](): ForceY[NodeDatum] = js.native
  def forceY[NodeDatum /* <: SimulationNodeDatum */](
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): ForceY[NodeDatum] = js.native
  def forceY[NodeDatum /* <: SimulationNodeDatum */](y: scala.Double): ForceY[NodeDatum] = js.native
}

