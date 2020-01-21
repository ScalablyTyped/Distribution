package typings.dagreD3.mod

import typings.dagre.AnonCompound
import typings.dagre.mod.EdgeFn
import typings.dagre.mod.WeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "graphlib")
@js.native
object graphlib extends js.Object {
  @js.native
  class Graph ()
    extends typings.dagre.mod.graphlib.Graph {
    def this(opt: AnonCompound) = this()
  }
  
  @js.native
  object alg extends js.Object {
    def components(graph: typings.dagre.mod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def dijkstra(graph: typings.dagre.mod.graphlib.Graph, source: String): js.Any = js.native
    def dijkstra(graph: typings.dagre.mod.graphlib.Graph, source: String, weightFn: WeightFn): js.Any = js.native
    def dijkstra(graph: typings.dagre.mod.graphlib.Graph, source: String, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph): js.Any = js.native
    def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph, weightFn: WeightFn): js.Any = js.native
    def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def findCycles(graph: typings.dagre.mod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def floydWarchall(graph: typings.dagre.mod.graphlib.Graph): js.Any = js.native
    def floydWarchall(graph: typings.dagre.mod.graphlib.Graph, weightFn: WeightFn): js.Any = js.native
    def floydWarchall(graph: typings.dagre.mod.graphlib.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def isAcyclic(graph: typings.dagre.mod.graphlib.Graph): Boolean = js.native
    def postorder(graph: typings.dagre.mod.graphlib.Graph, nodeNames: String): js.Array[String] = js.native
    def postorder(graph: typings.dagre.mod.graphlib.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def preorder(graph: typings.dagre.mod.graphlib.Graph, nodeNames: String): js.Array[String] = js.native
    def preorder(graph: typings.dagre.mod.graphlib.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def prim(graph: typings.dagre.mod.graphlib.Graph): typings.dagre.mod.graphlib.Graph = js.native
    def prim(graph: typings.dagre.mod.graphlib.Graph, weightFn: WeightFn): typings.dagre.mod.graphlib.Graph = js.native
    def tarjam(graph: typings.dagre.mod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def topsort(graph: typings.dagre.mod.graphlib.Graph): js.Array[String] = js.native
  }
  
  @js.native
  object json extends js.Object {
    def read(graph: js.Any): typings.dagre.mod.graphlib.Graph = js.native
    def write(graph: typings.dagre.mod.graphlib.Graph): js.Any = js.native
  }
  
}

