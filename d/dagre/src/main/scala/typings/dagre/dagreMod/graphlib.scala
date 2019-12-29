package typings.dagre.dagreMod

import org.scalablytyped.runtime.StringDictionary
import typings.dagre.Anon_Compound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre", "graphlib")
@js.native
object graphlib extends js.Object {
  @js.native
  class Graph () extends js.Object {
    def this(opt: Anon_Compound) = this()
    def children(parentName: String): js.UndefOr[String] = js.native
    def edge(edgeObj: Edge): GraphEdge = js.native
    def edge(outNodeName: String, inNodeName: String): GraphEdge = js.native
    def edge(outNodeName: String, inNodeName: String, name: String): GraphEdge = js.native
    def edgeCount(): Double = js.native
    def edges(): js.Array[Edge] = js.native
    def graph(): GraphLabel = js.native
    def hasEdge(edgeObj: Edge): Boolean = js.native
    def hasEdge(outNodeName: String, inNodeName: String): Boolean = js.native
    def hasEdge(outNodeName: String, inNodeName: String, name: String): Boolean = js.native
    def hasNode(name: String): Boolean = js.native
    def inEdges(inNodeName: String): js.UndefOr[js.Array[Edge]] = js.native
    def inEdges(inNodeName: String, outNodeName: String): js.UndefOr[js.Array[Edge]] = js.native
    def isDirected(): Boolean = js.native
    def isMultiGraph(): Boolean = js.native
    def neighbors(name: String): js.UndefOr[js.Array[Node]] = js.native
    def node(id: String): Node = js.native
    def node(id: Label): Node = js.native
    def nodeCount(): Double = js.native
    def nodes(): js.Array[String] = js.native
    def outEdges(outNodeName: String): js.UndefOr[js.Array[Edge]] = js.native
    def outEdges(outNodeName: String, inNodeName: String): js.UndefOr[js.Array[Edge]] = js.native
    def parent(childName: String): js.UndefOr[String] = js.native
    def predecessors(name: String): js.UndefOr[js.Array[Node]] = js.native
    def removeEdge(outNodeName: String, inNodeName: String): Graph = js.native
    def removeNode(name: String): Graph = js.native
    def setDefaultEdgeLabel(callback: String): Graph = js.native
    def setDefaultEdgeLabel(
      callback: js.Function3[/* v */ String, /* w */ String, /* name */ js.UndefOr[String], String | Label]
    ): Graph = js.native
    def setDefaultNodeLabel(callback: String): Graph = js.native
    def setDefaultNodeLabel(callback: js.Function1[/* nodeId */ String, String | Label]): Graph = js.native
    def setEdge(params: Edge): Graph = js.native
    def setEdge(params: Edge, value: String): Graph = js.native
    def setEdge(params: Edge, value: StringDictionary[js.Any]): Graph = js.native
    def setEdge(sourceId: String, targetId: String): Graph = js.native
    def setEdge(sourceId: String, targetId: String, value: String): Graph = js.native
    def setEdge(sourceId: String, targetId: String, value: String, name: String): Graph = js.native
    def setEdge(sourceId: String, targetId: String, value: Label): Graph = js.native
    def setEdge(sourceId: String, targetId: String, value: Label, name: String): Graph = js.native
    def setGraph(label: GraphLabel): Graph = js.native
    def setNode(name: String, label: String): Graph = js.native
    def setNode(name: String, label: Label): Graph = js.native
    def setParent(childName: String, parentName: String): Unit = js.native
    def sinks(): js.Array[Node] = js.native
    def sources(): js.Array[Node] = js.native
    def successors(name: String): js.UndefOr[js.Array[Node]] = js.native
  }
  
  @js.native
  object alg extends js.Object {
    def components(graph: Graph): js.Array[js.Array[String]] = js.native
    def dijkstra(graph: Graph, source: String): js.Any = js.native
    def dijkstra(graph: Graph, source: String, weightFn: WeightFn): js.Any = js.native
    def dijkstra(graph: Graph, source: String, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def dijkstraAll(graph: Graph): js.Any = js.native
    def dijkstraAll(graph: Graph, weightFn: WeightFn): js.Any = js.native
    def dijkstraAll(graph: Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def findCycles(graph: Graph): js.Array[js.Array[String]] = js.native
    def floydWarchall(graph: Graph): js.Any = js.native
    def floydWarchall(graph: Graph, weightFn: WeightFn): js.Any = js.native
    def floydWarchall(graph: Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def isAcyclic(graph: Graph): Boolean = js.native
    def postorder(graph: Graph, nodeNames: String): js.Array[String] = js.native
    def postorder(graph: Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def preorder(graph: Graph, nodeNames: String): js.Array[String] = js.native
    def preorder(graph: Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def prim(graph: Graph): Graph = js.native
    def prim(graph: Graph, weightFn: WeightFn): Graph = js.native
    def tarjam(graph: Graph): js.Array[js.Array[String]] = js.native
    def topsort(graph: Graph): js.Array[String] = js.native
  }
  
  @js.native
  object json extends js.Object {
    def read(graph: js.Any): Graph = js.native
    def write(graph: Graph): js.Any = js.native
  }
  
}

