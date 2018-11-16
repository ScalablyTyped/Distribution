package typings
package dagreDashD3Lib.dagreDashD3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "graphlib")
@js.native
object graphlibNs extends js.Object {
  @js.native
  class Graph ()
    extends dagreLib.dagreMod.graphlibNs.Graph {
    def this(opt: dagreLib.Anon_Compound) = this()
  }
  
  @JSName("alg")
  @js.native
  object algNs extends js.Object {
    def components(graph: dagreLib.dagreMod.graphlibNs.Graph): js.Array[js.Array[java.lang.String]] = js.native
    def dijkstra(graph: dagreLib.dagreMod.graphlibNs.Graph, source: java.lang.String): js.Any = js.native
    def dijkstra(
      graph: dagreLib.dagreMod.graphlibNs.Graph,
      source: java.lang.String,
      weightFn: dagreLib.dagreMod.WeightFn
    ): js.Any = js.native
    def dijkstra(
      graph: dagreLib.dagreMod.graphlibNs.Graph,
      source: java.lang.String,
      weightFn: dagreLib.dagreMod.WeightFn,
      edgeFn: dagreLib.dagreMod.EdgeFn
    ): js.Any = js.native
    def dijkstraAll(graph: dagreLib.dagreMod.graphlibNs.Graph): js.Any = js.native
    def dijkstraAll(graph: dagreLib.dagreMod.graphlibNs.Graph, weightFn: dagreLib.dagreMod.WeightFn): js.Any = js.native
    def dijkstraAll(
      graph: dagreLib.dagreMod.graphlibNs.Graph,
      weightFn: dagreLib.dagreMod.WeightFn,
      edgeFn: dagreLib.dagreMod.EdgeFn
    ): js.Any = js.native
    def findCycles(graph: dagreLib.dagreMod.graphlibNs.Graph): js.Array[js.Array[java.lang.String]] = js.native
    def floydWarchall(graph: dagreLib.dagreMod.graphlibNs.Graph): js.Any = js.native
    def floydWarchall(graph: dagreLib.dagreMod.graphlibNs.Graph, weightFn: dagreLib.dagreMod.WeightFn): js.Any = js.native
    def floydWarchall(
      graph: dagreLib.dagreMod.graphlibNs.Graph,
      weightFn: dagreLib.dagreMod.WeightFn,
      edgeFn: dagreLib.dagreMod.EdgeFn
    ): js.Any = js.native
    def isAcyclic(graph: dagreLib.dagreMod.graphlibNs.Graph): scala.Boolean = js.native
    def postorder(graph: dagreLib.dagreMod.graphlibNs.Graph, nodeNames: java.lang.String): js.Array[java.lang.String] = js.native
    def postorder(graph: dagreLib.dagreMod.graphlibNs.Graph, nodeNames: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    def preorder(graph: dagreLib.dagreMod.graphlibNs.Graph, nodeNames: java.lang.String): js.Array[java.lang.String] = js.native
    def preorder(graph: dagreLib.dagreMod.graphlibNs.Graph, nodeNames: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    def prim(graph: dagreLib.dagreMod.graphlibNs.Graph): dagreLib.dagreMod.graphlibNs.Graph = js.native
    def prim(graph: dagreLib.dagreMod.graphlibNs.Graph, weightFn: dagreLib.dagreMod.WeightFn): dagreLib.dagreMod.graphlibNs.Graph = js.native
    def tarjam(graph: dagreLib.dagreMod.graphlibNs.Graph): js.Array[js.Array[java.lang.String]] = js.native
    def topsort(graph: dagreLib.dagreMod.graphlibNs.Graph): js.Array[java.lang.String] = js.native
  }
  
  @JSName("json")
  @js.native
  object jsonNs extends js.Object {
    def read(graph: js.Any): dagreLib.dagreMod.graphlibNs.Graph = js.native
    def write(graph: dagreLib.dagreMod.graphlibNs.Graph): js.Any = js.native
  }
  
}

