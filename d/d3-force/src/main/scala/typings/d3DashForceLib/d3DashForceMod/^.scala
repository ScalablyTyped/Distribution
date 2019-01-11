package typings
package d3DashForceLib.d3DashForceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-force", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def forceCenter[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](): d3DashForceLib.d3DashForceMod.ForceCenter[NodeDatum] = js.native
  def forceCenter[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](x: scala.Double): d3DashForceLib.d3DashForceMod.ForceCenter[NodeDatum] = js.native
  def forceCenter[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](x: scala.Double, y: scala.Double): d3DashForceLib.d3DashForceMod.ForceCenter[NodeDatum] = js.native
  def forceCollide[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](): d3DashForceLib.d3DashForceMod.ForceCollide[NodeDatum] = js.native
  def forceCollide[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: js.Function3[
      /* node */ NodeDatum, 
      /* i */ scala.Double, 
      /* nodes */ js.Array[NodeDatum], 
      scala.Double
    ]
  ): d3DashForceLib.d3DashForceMod.ForceCollide[NodeDatum] = js.native
  def forceCollide[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](radius: scala.Double): d3DashForceLib.d3DashForceMod.ForceCollide[NodeDatum] = js.native
  def forceLink[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */, LinksDatum /* <: d3DashForceLib.d3DashForceMod.SimulationLinkDatum[NodeDatum] */](): d3DashForceLib.d3DashForceMod.ForceLink[NodeDatum, LinksDatum] = js.native
  def forceLink[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */, LinksDatum /* <: d3DashForceLib.d3DashForceMod.SimulationLinkDatum[NodeDatum] */](links: js.Array[LinksDatum]): d3DashForceLib.d3DashForceMod.ForceLink[NodeDatum, LinksDatum] = js.native
  def forceManyBody[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](): d3DashForceLib.d3DashForceMod.ForceManyBody[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    y: scala.Double
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: scala.Double
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: scala.Double,
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    x: scala.Double,
    y: scala.Double
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](radius: scala.Double): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: scala.Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: scala.Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: scala.Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double],
    y: scala.Double
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](radius: scala.Double, x: scala.Double): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    radius: scala.Double,
    x: scala.Double,
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceRadial[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](radius: scala.Double, x: scala.Double, y: scala.Double): d3DashForceLib.d3DashForceMod.ForceRadial[NodeDatum] = js.native
  def forceSimulation[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](): d3DashForceLib.d3DashForceMod.Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
  def forceSimulation[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](nodesData: js.Array[NodeDatum]): d3DashForceLib.d3DashForceMod.Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
  @JSName("forceSimulation")
  def forceSimulation_NodeDatumSimulationNodeDatumLinkDatumSimulationLinkDatum[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */, LinkDatum /* <: d3DashForceLib.d3DashForceMod.SimulationLinkDatum[NodeDatum] */](): d3DashForceLib.d3DashForceMod.Simulation[NodeDatum, LinkDatum] = js.native
  @JSName("forceSimulation")
  def forceSimulation_NodeDatumSimulationNodeDatumLinkDatumSimulationLinkDatum[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */, LinkDatum /* <: d3DashForceLib.d3DashForceMod.SimulationLinkDatum[NodeDatum] */](nodesData: js.Array[NodeDatum]): d3DashForceLib.d3DashForceMod.Simulation[NodeDatum, LinkDatum] = js.native
  def forceX[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](): d3DashForceLib.d3DashForceMod.ForceX[NodeDatum] = js.native
  def forceX[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    x: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): d3DashForceLib.d3DashForceMod.ForceX[NodeDatum] = js.native
  def forceX[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](x: scala.Double): d3DashForceLib.d3DashForceMod.ForceX[NodeDatum] = js.native
  def forceY[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](): d3DashForceLib.d3DashForceMod.ForceY[NodeDatum] = js.native
  def forceY[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](
    y: js.Function3[/* d */ NodeDatum, /* i */ scala.Double, /* data */ js.Array[NodeDatum], scala.Double]
  ): d3DashForceLib.d3DashForceMod.ForceY[NodeDatum] = js.native
  def forceY[NodeDatum /* <: d3DashForceLib.d3DashForceMod.SimulationNodeDatum */](y: scala.Double): d3DashForceLib.d3DashForceMod.ForceY[NodeDatum] = js.native
}

