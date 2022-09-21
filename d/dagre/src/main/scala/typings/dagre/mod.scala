package typings.dagre

import org.scalablytyped.runtime.StringDictionary
import typings.dagre.anon.Class
import typings.dagre.anon.Compound
import typings.dagre.anon.X
import typings.dagre.dagreStrings.c
import typings.dagre.dagreStrings.l
import typings.dagre.dagreStrings.r
import typings.dagre.mod.graphlib.Graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dagre", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object graphlib {
    
    @JSImport("dagre", "graphlib.Graph")
    @js.native
    open class Graph[T] () extends StObject {
      def this(opt: Compound) = this()
      
      def children(parentName: String): js.UndefOr[String] = js.native
      
      def edge(edgeObj: Edge): GraphEdge = js.native
      def edge(outNodeName: String, inNodeName: String): GraphEdge = js.native
      def edge(outNodeName: String, inNodeName: String, name: String): GraphEdge = js.native
      
      def edgeCount(): Double = js.native
      
      def edges(): js.Array[Edge] = js.native
      
      def filterNodes(callback: js.Function1[/* nodeId */ String, Boolean]): Graph[T] = js.native
      
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
      
      def removeEdge(outNodeName: String, inNodeName: String): Graph[T] = js.native
      def removeEdge(outNodeName: String, inNodeName: String, name: String): Graph[T] = js.native
      
      def removeNode(name: String): Graph[T] = js.native
      
      def setDefaultEdgeLabel(callback: String): Graph[T] = js.native
      def setDefaultEdgeLabel(
        callback: js.Function3[/* v */ String, /* w */ String, /* name */ js.UndefOr[String], String | Label]
      ): Graph[T] = js.native
      
      def setDefaultNodeLabel(callback: String): Graph[T] = js.native
      def setDefaultNodeLabel(callback: js.Function1[/* nodeId */ String, String | Label]): Graph[T] = js.native
      
      def setEdge(params: Edge): Graph[T] = js.native
      def setEdge(params: Edge, value: String): Graph[T] = js.native
      def setEdge(params: Edge, value: StringDictionary[Any]): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String, value: String): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String, value: String, name: String): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String, value: Unit, name: String): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String, value: Label): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String, value: Label, name: String): Graph[T] = js.native
      
      def setGraph(label: GraphLabel): Graph[T] = js.native
      
      def setNode(name: String, label: String): Graph[T] = js.native
      def setNode(name: String, label: Label): Graph[T] = js.native
      
      def setParent(childName: String, parentName: String): Unit = js.native
      
      def sinks(): js.Array[Node[T]] = js.native
      
      def sources(): js.Array[Node[T]] = js.native
      
      def successors(name: String): js.UndefOr[js.Array[Node[T]]] = js.native
    }
    
    object alg {
      
      @JSImport("dagre", "graphlib.alg")
      @js.native
      val ^ : js.Any = js.native
      
      inline def components(graph: Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("components")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
      
      inline def dijkstra(graph: Graph[js.Object], source: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def dijkstra(graph: Graph[js.Object], source: String, weightFn: Unit, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def dijkstra(graph: Graph[js.Object], source: String, weightFn: WeightFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def dijkstra(graph: Graph[js.Object], source: String, weightFn: WeightFn, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def dijkstraAll(graph: Graph[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def dijkstraAll(graph: Graph[js.Object], weightFn: Unit, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def dijkstraAll(graph: Graph[js.Object], weightFn: WeightFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def dijkstraAll(graph: Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def findCycles(graph: Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findCycles")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
      
      inline def floydWarchall(graph: Graph[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def floydWarchall(graph: Graph[js.Object], weightFn: Unit, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def floydWarchall(graph: Graph[js.Object], weightFn: WeightFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def floydWarchall(graph: Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def isAcyclic(graph: Graph[js.Object]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAcyclic")(graph.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def postorder(graph: Graph[js.Object], nodeNames: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("postorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
      inline def postorder(graph: Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("postorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
      
      inline def preorder(graph: Graph[js.Object], nodeNames: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("preorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
      inline def preorder(graph: Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("preorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
      
      inline def prim[T](graph: Graph[T]): Graph[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prim")(graph.asInstanceOf[js.Any]).asInstanceOf[Graph[T]]
      inline def prim[T](graph: Graph[T], weightFn: WeightFn): Graph[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prim")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Graph[T]]
      
      inline def tarjam(graph: Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tarjam")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
      
      inline def topsort(graph: Graph[js.Object]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("topsort")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    }
    
    object json {
      
      @JSImport("dagre", "graphlib.json")
      @js.native
      val ^ : js.Any = js.native
      
      inline def read(graph: Any): Graph[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(graph.asInstanceOf[js.Any]).asInstanceOf[Graph[js.Object]]
      
      inline def write(graph: Graph[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(graph.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
  }
  
  inline def layout(graph: Graph[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def layout(graph: Graph[js.Object], layout: GraphLabel & NodeConfig & EdgeConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Edge extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var v: String
    
    var w: String
  }
  object Edge {
    
    inline def apply(v: String, w: String): Edge = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edge]
    }
    
    extension [Self <: Edge](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait EdgeConfig extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var labeloffest: js.UndefOr[Double] = js.undefined
    
    var lablepos: js.UndefOr[l | c | r] = js.undefined
    
    var minlen: js.UndefOr[Double] = js.undefined
    
    var weight: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object EdgeConfig {
    
    inline def apply(): EdgeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EdgeConfig]
    }
    
    extension [Self <: EdgeConfig](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabeloffest(value: Double): Self = StObject.set(x, "labeloffest", value.asInstanceOf[js.Any])
      
      inline def setLabeloffestUndefined: Self = StObject.set(x, "labeloffest", js.undefined)
      
      inline def setLablepos(value: l | c | r): Self = StObject.set(x, "lablepos", value.asInstanceOf[js.Any])
      
      inline def setLableposUndefined: Self = StObject.set(x, "lablepos", js.undefined)
      
      inline def setMinlen(value: Double): Self = StObject.set(x, "minlen", value.asInstanceOf[js.Any])
      
      inline def setMinlenUndefined: Self = StObject.set(x, "minlen", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type EdgeFn = js.Function1[/* outNodeName */ String, js.Array[GraphEdge]]
  
  trait GraphEdge
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var points: js.Array[X]
  }
  object GraphEdge {
    
    inline def apply(points: js.Array[X]): GraphEdge = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphEdge]
    }
    
    extension [Self <: GraphEdge](x: Self) {
      
      inline def setPoints(value: js.Array[X]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: X*): Self = StObject.set(x, "points", js.Array(value*))
    }
  }
  
  trait GraphLabel extends StObject {
    
    var acyclicer: js.UndefOr[String] = js.undefined
    
    var align: js.UndefOr[String] = js.undefined
    
    var compound: js.UndefOr[Boolean] = js.undefined
    
    var edgesep: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var marginx: js.UndefOr[Double] = js.undefined
    
    var marginy: js.UndefOr[Double] = js.undefined
    
    var nodesep: js.UndefOr[Double] = js.undefined
    
    var rankdir: js.UndefOr[String] = js.undefined
    
    var ranker: js.UndefOr[String] = js.undefined
    
    var ranksep: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object GraphLabel {
    
    inline def apply(): GraphLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphLabel]
    }
    
    extension [Self <: GraphLabel](x: Self) {
      
      inline def setAcyclicer(value: String): Self = StObject.set(x, "acyclicer", value.asInstanceOf[js.Any])
      
      inline def setAcyclicerUndefined: Self = StObject.set(x, "acyclicer", js.undefined)
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
      
      inline def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
      
      inline def setEdgesep(value: Double): Self = StObject.set(x, "edgesep", value.asInstanceOf[js.Any])
      
      inline def setEdgesepUndefined: Self = StObject.set(x, "edgesep", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMarginx(value: Double): Self = StObject.set(x, "marginx", value.asInstanceOf[js.Any])
      
      inline def setMarginxUndefined: Self = StObject.set(x, "marginx", js.undefined)
      
      inline def setMarginy(value: Double): Self = StObject.set(x, "marginy", value.asInstanceOf[js.Any])
      
      inline def setMarginyUndefined: Self = StObject.set(x, "marginy", js.undefined)
      
      inline def setNodesep(value: Double): Self = StObject.set(x, "nodesep", value.asInstanceOf[js.Any])
      
      inline def setNodesepUndefined: Self = StObject.set(x, "nodesep", js.undefined)
      
      inline def setRankdir(value: String): Self = StObject.set(x, "rankdir", value.asInstanceOf[js.Any])
      
      inline def setRankdirUndefined: Self = StObject.set(x, "rankdir", js.undefined)
      
      inline def setRanker(value: String): Self = StObject.set(x, "ranker", value.asInstanceOf[js.Any])
      
      inline def setRankerUndefined: Self = StObject.set(x, "ranker", js.undefined)
      
      inline def setRanksep(value: Double): Self = StObject.set(x, "ranksep", value.asInstanceOf[js.Any])
      
      inline def setRanksepUndefined: Self = StObject.set(x, "ranksep", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Label = StringDictionary[Any]
  
  type Node[T] = T & Class
  
  trait NodeConfig extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object NodeConfig {
    
    inline def apply(): NodeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeConfig]
    }
    
    extension [Self <: NodeConfig](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type WeightFn = js.Function1[/* edge */ Edge, Double]
}
