package typings.dagreDashD3.dagreDashD3Mod

import typings.dagre.Anon_Compound
import typings.dagre.dagreMod.EdgeFn
import typings.dagre.dagreMod.WeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "graphlib")
@js.native
object graphlibNs extends js.Object {
  @js.native
  class Graph ()
    extends typings.dagre.dagreMod.graphlibNs.Graph {
    def this(opt: Anon_Compound) = this()
  }
  
  @JSName("alg")
  @js.native
  object algNs extends js.Object {
    def components(graph: typings.dagre.dagreMod.graphlibNs.Graph): js.Array[js.Array[String]] = js.native
    def dijkstra(graph: typings.dagre.dagreMod.graphlibNs.Graph, source: String): js.Any = js.native
    def dijkstra(graph: typings.dagre.dagreMod.graphlibNs.Graph, source: String, weightFn: WeightFn): js.Any = js.native
    def dijkstra(graph: typings.dagre.dagreMod.graphlibNs.Graph, source: String, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def dijkstraAll(graph: typings.dagre.dagreMod.graphlibNs.Graph): js.Any = js.native
    def dijkstraAll(graph: typings.dagre.dagreMod.graphlibNs.Graph, weightFn: WeightFn): js.Any = js.native
    def dijkstraAll(graph: typings.dagre.dagreMod.graphlibNs.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def findCycles(graph: typings.dagre.dagreMod.graphlibNs.Graph): js.Array[js.Array[String]] = js.native
    def floydWarchall(graph: typings.dagre.dagreMod.graphlibNs.Graph): js.Any = js.native
    def floydWarchall(graph: typings.dagre.dagreMod.graphlibNs.Graph, weightFn: WeightFn): js.Any = js.native
    def floydWarchall(graph: typings.dagre.dagreMod.graphlibNs.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def isAcyclic(graph: typings.dagre.dagreMod.graphlibNs.Graph): Boolean = js.native
    def postorder(graph: typings.dagre.dagreMod.graphlibNs.Graph, nodeNames: String): js.Array[String] = js.native
    def postorder(graph: typings.dagre.dagreMod.graphlibNs.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def preorder(graph: typings.dagre.dagreMod.graphlibNs.Graph, nodeNames: String): js.Array[String] = js.native
    def preorder(graph: typings.dagre.dagreMod.graphlibNs.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def prim(graph: typings.dagre.dagreMod.graphlibNs.Graph): typings.dagre.dagreMod.graphlibNs.Graph = js.native
    def prim(graph: typings.dagre.dagreMod.graphlibNs.Graph, weightFn: WeightFn): typings.dagre.dagreMod.graphlibNs.Graph = js.native
    def tarjam(graph: typings.dagre.dagreMod.graphlibNs.Graph): js.Array[js.Array[String]] = js.native
    def topsort(graph: typings.dagre.dagreMod.graphlibNs.Graph): js.Array[String] = js.native
  }
  
  @JSName("json")
  @js.native
  object jsonNs extends js.Object {
    def read(graph: js.Any): typings.dagre.dagreMod.graphlibNs.Graph = js.native
    def write(graph: typings.dagre.dagreMod.graphlibNs.Graph): js.Any = js.native
  }
  
}

