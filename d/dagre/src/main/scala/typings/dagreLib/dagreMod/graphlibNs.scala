package typings
package dagreLib.dagreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre", "graphlib")
@js.native
object graphlibNs extends js.Object {
  @js.native
  class Graph () extends js.Object {
    def this(opt: dagreLib.Anon_Compound) = this()
    def children(parentName: java.lang.String): js.UndefOr[java.lang.String] = js.native
    def edge(edgeObj: dagreLib.dagreMod.Edge): dagreLib.dagreMod.GraphEdge = js.native
    def edge(outNodeName: java.lang.String, inNodeName: java.lang.String): dagreLib.dagreMod.GraphEdge = js.native
    def edge(outNodeName: java.lang.String, inNodeName: java.lang.String, name: java.lang.String): dagreLib.dagreMod.GraphEdge = js.native
    def edgeCount(): scala.Double = js.native
    def edges(): js.Array[dagreLib.dagreMod.Edge] = js.native
    def graph(): dagreLib.dagreMod.GraphLabel = js.native
    def hasEdge(edgeObj: dagreLib.dagreMod.Edge): scala.Boolean = js.native
    def hasEdge(outNodeName: java.lang.String, inNodeName: java.lang.String): scala.Boolean = js.native
    def hasEdge(outNodeName: java.lang.String, inNodeName: java.lang.String, name: java.lang.String): scala.Boolean = js.native
    def hasNode(name: java.lang.String): scala.Boolean = js.native
    def inEdges(inNodeName: java.lang.String): js.UndefOr[js.Array[dagreLib.dagreMod.Edge]] = js.native
    def inEdges(inNodeName: java.lang.String, outNodeName: java.lang.String): js.UndefOr[js.Array[dagreLib.dagreMod.Edge]] = js.native
    def isDirected(): scala.Boolean = js.native
    def isMultiGraph(): scala.Boolean = js.native
    def neighbors(name: java.lang.String): js.UndefOr[js.Array[dagreLib.dagreMod.Node]] = js.native
    def node(id: dagreLib.dagreMod.Label): dagreLib.dagreMod.Node = js.native
    def node(id: java.lang.String): dagreLib.dagreMod.Node = js.native
    def nodeCount(): scala.Double = js.native
    def nodes(): js.Array[java.lang.String] = js.native
    def outEdges(outNodeName: java.lang.String): js.UndefOr[js.Array[dagreLib.dagreMod.Edge]] = js.native
    def outEdges(outNodeName: java.lang.String, inNodeName: java.lang.String): js.UndefOr[js.Array[dagreLib.dagreMod.Edge]] = js.native
    def parent(childName: java.lang.String): js.UndefOr[java.lang.String] = js.native
    def predecessors(name: java.lang.String): js.UndefOr[js.Array[dagreLib.dagreMod.Node]] = js.native
    def removeEdge(outNodeName: java.lang.String, inNodeName: java.lang.String): Graph = js.native
    def removeNode(name: java.lang.String): Graph = js.native
    def setDefaultEdgeLabel(callback: java.lang.String): Graph = js.native
    def setDefaultEdgeLabel(
      callback: js.Function3[
          /* v */ java.lang.String, 
          /* w */ java.lang.String, 
          /* name */ js.UndefOr[java.lang.String], 
          java.lang.String | dagreLib.dagreMod.Label
        ]
    ): Graph = js.native
    def setDefaultNodeLabel(callback: java.lang.String): Graph = js.native
    def setDefaultNodeLabel(callback: js.Function1[/* nodeId */ java.lang.String, java.lang.String | dagreLib.dagreMod.Label]): Graph = js.native
    def setEdge(params: dagreLib.dagreMod.Edge): Graph = js.native
    def setEdge(params: dagreLib.dagreMod.Edge, value: java.lang.String): Graph = js.native
    def setEdge(params: dagreLib.dagreMod.Edge, value: org.scalablytyped.runtime.StringDictionary[js.Any]): Graph = js.native
    def setEdge(sourceId: java.lang.String, targetId: java.lang.String): Graph = js.native
    def setEdge(sourceId: java.lang.String, targetId: java.lang.String, value: dagreLib.dagreMod.Label): Graph = js.native
    def setEdge(
      sourceId: java.lang.String,
      targetId: java.lang.String,
      value: dagreLib.dagreMod.Label,
      name: java.lang.String
    ): Graph = js.native
    def setEdge(sourceId: java.lang.String, targetId: java.lang.String, value: java.lang.String): Graph = js.native
    def setEdge(
      sourceId: java.lang.String,
      targetId: java.lang.String,
      value: java.lang.String,
      name: java.lang.String
    ): Graph = js.native
    def setGraph(label: dagreLib.dagreMod.GraphLabel): Graph = js.native
    def setNode(name: java.lang.String, label: dagreLib.dagreMod.Label): Graph = js.native
    def setNode(name: java.lang.String, label: java.lang.String): Graph = js.native
    def setParent(childName: java.lang.String, parentName: java.lang.String): scala.Unit = js.native
    def sinks(): js.Array[dagreLib.dagreMod.Node] = js.native
    def sources(): js.Array[dagreLib.dagreMod.Node] = js.native
    def successors(name: java.lang.String): js.UndefOr[js.Array[dagreLib.dagreMod.Node]] = js.native
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

