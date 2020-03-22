package typings.dagre.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dagre.AnonCompound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre", "graphlib")
@js.native
object graphlib extends js.Object {
  @js.native
  class Graph[T] () extends js.Object {
    def this(opt: AnonCompound) = this()
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
    def neighbors(name: String): js.UndefOr[js.Array[Node[T]]] = js.native
    def node(id: String): Node[T] = js.native
    def node(id: Label): Node[T] = js.native
    def nodeCount(): Double = js.native
    def nodes(): js.Array[String] = js.native
    def outEdges(outNodeName: String): js.UndefOr[js.Array[Edge]] = js.native
    def outEdges(outNodeName: String, inNodeName: String): js.UndefOr[js.Array[Edge]] = js.native
    def parent(childName: String): js.UndefOr[String] = js.native
    def predecessors(name: String): js.UndefOr[js.Array[Node[T]]] = js.native
    def removeEdge(outNodeName: String, inNodeName: String): Graph[js.Object] = js.native
    def removeNode(name: String): Graph[js.Object] = js.native
    def setDefaultEdgeLabel(callback: String): Graph[js.Object] = js.native
    def setDefaultEdgeLabel(
      callback: js.Function3[/* v */ String, /* w */ String, /* name */ js.UndefOr[String], String | Label]
    ): Graph[js.Object] = js.native
    def setDefaultNodeLabel(callback: String): Graph[js.Object] = js.native
    def setDefaultNodeLabel(callback: js.Function1[/* nodeId */ String, String | Label]): Graph[js.Object] = js.native
    def setEdge(params: Edge): Graph[js.Object] = js.native
    def setEdge(params: Edge, value: String): Graph[js.Object] = js.native
    def setEdge(params: Edge, value: StringDictionary[js.Any]): Graph[js.Object] = js.native
    def setEdge(sourceId: String, targetId: String): Graph[js.Object] = js.native
    def setEdge(sourceId: String, targetId: String, value: String): Graph[js.Object] = js.native
    def setEdge(sourceId: String, targetId: String, value: String, name: String): Graph[js.Object] = js.native
    def setEdge(sourceId: String, targetId: String, value: Label): Graph[js.Object] = js.native
    def setEdge(sourceId: String, targetId: String, value: Label, name: String): Graph[js.Object] = js.native
    def setGraph(label: GraphLabel): Graph[js.Object] = js.native
    def setNode(name: String, label: String): Graph[js.Object] = js.native
    def setNode(name: String, label: Label): Graph[js.Object] = js.native
    def setParent(childName: String, parentName: String): Unit = js.native
    def sinks(): js.Array[Node[T]] = js.native
    def sources(): js.Array[Node[T]] = js.native
    def successors(name: String): js.UndefOr[js.Array[Node[T]]] = js.native
  }
  
  @js.native
  object alg extends js.Object {
    def components(graph: Graph[js.Object]): js.Array[js.Array[String]] = js.native
    def dijkstra(graph: Graph[js.Object], source: String): js.Any = js.native
    def dijkstra(graph: Graph[js.Object], source: String, weightFn: WeightFn): js.Any = js.native
    def dijkstra(graph: Graph[js.Object], source: String, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def dijkstraAll(graph: Graph[js.Object]): js.Any = js.native
    def dijkstraAll(graph: Graph[js.Object], weightFn: WeightFn): js.Any = js.native
    def dijkstraAll(graph: Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def findCycles(graph: Graph[js.Object]): js.Array[js.Array[String]] = js.native
    def floydWarchall(graph: Graph[js.Object]): js.Any = js.native
    def floydWarchall(graph: Graph[js.Object], weightFn: WeightFn): js.Any = js.native
    def floydWarchall(graph: Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def isAcyclic(graph: Graph[js.Object]): Boolean = js.native
    def postorder(graph: Graph[js.Object], nodeNames: String): js.Array[String] = js.native
    def postorder(graph: Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = js.native
    def preorder(graph: Graph[js.Object], nodeNames: String): js.Array[String] = js.native
    def preorder(graph: Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = js.native
    def prim(graph: Graph[js.Object]): Graph[js.Object] = js.native
    def prim(graph: Graph[js.Object], weightFn: WeightFn): Graph[js.Object] = js.native
    def tarjam(graph: Graph[js.Object]): js.Array[js.Array[String]] = js.native
    def topsort(graph: Graph[js.Object]): js.Array[String] = js.native
  }
  
  @js.native
  object json extends js.Object {
    def read(graph: js.Any): Graph[js.Object] = js.native
    def write(graph: Graph[js.Object]): js.Any = js.native
  }
  
}

