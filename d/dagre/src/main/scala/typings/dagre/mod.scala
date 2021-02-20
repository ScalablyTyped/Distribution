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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object graphlib {
    
    @JSImport("dagre", "graphlib.Graph")
    @js.native
    class Graph[T] () extends StObject {
      def this(opt: Compound) = this()
      
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
      
      def removeEdge(outNodeName: String, inNodeName: String): Graph[T] = js.native
      
      def removeNode(name: String): Graph[T] = js.native
      
      def setDefaultEdgeLabel(callback: String): Graph[T] = js.native
      def setDefaultEdgeLabel(
        callback: js.Function3[/* v */ String, /* w */ String, /* name */ js.UndefOr[String], String | Label]
      ): Graph[T] = js.native
      
      def setDefaultNodeLabel(callback: String): Graph[T] = js.native
      def setDefaultNodeLabel(callback: js.Function1[/* nodeId */ String, String | Label]): Graph[T] = js.native
      
      def setEdge(params: Edge): Graph[T] = js.native
      def setEdge(params: Edge, value: String): Graph[T] = js.native
      def setEdge(params: Edge, value: StringDictionary[js.Any]): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String, value: js.UndefOr[scala.Nothing], name: String): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String, value: String): Graph[T] = js.native
      def setEdge(sourceId: String, targetId: String, value: String, name: String): Graph[T] = js.native
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
      
      @JSImport("dagre", "graphlib.alg.components")
      @js.native
      def components(graph: Graph[js.Object]): js.Array[js.Array[String]] = js.native
      
      @JSImport("dagre", "graphlib.alg.dijkstra")
      @js.native
      def dijkstra(graph: Graph[js.Object], source: String): js.Any = js.native
      @JSImport("dagre", "graphlib.alg.dijkstra")
      @js.native
      def dijkstra(graph: Graph[js.Object], source: String, weightFn: js.UndefOr[scala.Nothing], edgeFn: EdgeFn): js.Any = js.native
      @JSImport("dagre", "graphlib.alg.dijkstra")
      @js.native
      def dijkstra(graph: Graph[js.Object], source: String, weightFn: WeightFn): js.Any = js.native
      @JSImport("dagre", "graphlib.alg.dijkstra")
      @js.native
      def dijkstra(graph: Graph[js.Object], source: String, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
      
      @JSImport("dagre", "graphlib.alg.dijkstraAll")
      @js.native
      def dijkstraAll(graph: Graph[js.Object]): js.Any = js.native
      @JSImport("dagre", "graphlib.alg.dijkstraAll")
      @js.native
      def dijkstraAll(graph: Graph[js.Object], weightFn: js.UndefOr[scala.Nothing], edgeFn: EdgeFn): js.Any = js.native
      @JSImport("dagre", "graphlib.alg.dijkstraAll")
      @js.native
      def dijkstraAll(graph: Graph[js.Object], weightFn: WeightFn): js.Any = js.native
      @JSImport("dagre", "graphlib.alg.dijkstraAll")
      @js.native
      def dijkstraAll(graph: Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
      
      @JSImport("dagre", "graphlib.alg.findCycles")
      @js.native
      def findCycles(graph: Graph[js.Object]): js.Array[js.Array[String]] = js.native
      
      @JSImport("dagre", "graphlib.alg.floydWarchall")
      @js.native
      def floydWarchall(graph: Graph[js.Object]): js.Any = js.native
      @JSImport("dagre", "graphlib.alg.floydWarchall")
      @js.native
      def floydWarchall(graph: Graph[js.Object], weightFn: js.UndefOr[scala.Nothing], edgeFn: EdgeFn): js.Any = js.native
      @JSImport("dagre", "graphlib.alg.floydWarchall")
      @js.native
      def floydWarchall(graph: Graph[js.Object], weightFn: WeightFn): js.Any = js.native
      @JSImport("dagre", "graphlib.alg.floydWarchall")
      @js.native
      def floydWarchall(graph: Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
      
      @JSImport("dagre", "graphlib.alg.isAcyclic")
      @js.native
      def isAcyclic(graph: Graph[js.Object]): Boolean = js.native
      
      @JSImport("dagre", "graphlib.alg.postorder")
      @js.native
      def postorder(graph: Graph[js.Object], nodeNames: String): js.Array[String] = js.native
      @JSImport("dagre", "graphlib.alg.postorder")
      @js.native
      def postorder(graph: Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = js.native
      
      @JSImport("dagre", "graphlib.alg.preorder")
      @js.native
      def preorder(graph: Graph[js.Object], nodeNames: String): js.Array[String] = js.native
      @JSImport("dagre", "graphlib.alg.preorder")
      @js.native
      def preorder(graph: Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = js.native
      
      @JSImport("dagre", "graphlib.alg.prim")
      @js.native
      def prim[T](graph: Graph[T]): Graph[T] = js.native
      @JSImport("dagre", "graphlib.alg.prim")
      @js.native
      def prim[T](graph: Graph[T], weightFn: WeightFn): Graph[T] = js.native
      
      @JSImport("dagre", "graphlib.alg.tarjam")
      @js.native
      def tarjam(graph: Graph[js.Object]): js.Array[js.Array[String]] = js.native
      
      @JSImport("dagre", "graphlib.alg.topsort")
      @js.native
      def topsort(graph: Graph[js.Object]): js.Array[String] = js.native
    }
    
    object json {
      
      @JSImport("dagre", "graphlib.json.read")
      @js.native
      def read(graph: js.Any): Graph[js.Object] = js.native
      
      @JSImport("dagre", "graphlib.json.write")
      @js.native
      def write(graph: Graph[js.Object]): js.Any = js.native
    }
  }
  
  @JSImport("dagre", "layout")
  @js.native
  def layout(graph: Graph[js.Object]): Unit = js.native
  @JSImport("dagre", "layout")
  @js.native
  def layout(graph: Graph[js.Object], layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
  
  @js.native
  trait Edge extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var v: String = js.native
    
    var w: String = js.native
  }
  object Edge {
    
    @scala.inline
    def apply(v: String, w: String): Edge = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edge]
    }
    
    @scala.inline
    implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EdgeConfig extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var labeloffest: js.UndefOr[Double] = js.native
    
    var lablepos: js.UndefOr[l | c | r] = js.native
    
    var minlen: js.UndefOr[Double] = js.native
    
    var weight: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object EdgeConfig {
    
    @scala.inline
    def apply(): EdgeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EdgeConfig]
    }
    
    @scala.inline
    implicit class EdgeConfigMutableBuilder[Self <: EdgeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLabeloffest(value: Double): Self = StObject.set(x, "labeloffest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabeloffestUndefined: Self = StObject.set(x, "labeloffest", js.undefined)
      
      @scala.inline
      def setLablepos(value: l | c | r): Self = StObject.set(x, "lablepos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLableposUndefined: Self = StObject.set(x, "lablepos", js.undefined)
      
      @scala.inline
      def setMinlen(value: Double): Self = StObject.set(x, "minlen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinlenUndefined: Self = StObject.set(x, "minlen", js.undefined)
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type EdgeFn = js.Function1[/* outNodeName */ String, js.Array[GraphEdge]]
  
  @js.native
  trait GraphEdge
    extends /* key */ StringDictionary[js.Any] {
    
    var points: js.Array[X] = js.native
  }
  object GraphEdge {
    
    @scala.inline
    def apply(points: js.Array[X]): GraphEdge = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphEdge]
    }
    
    @scala.inline
    implicit class GraphEdgeMutableBuilder[Self <: GraphEdge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoints(value: js.Array[X]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: X*): Self = StObject.set(x, "points", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GraphLabel extends StObject {
    
    var acyclicer: js.UndefOr[String] = js.native
    
    var align: js.UndefOr[String] = js.native
    
    var compound: js.UndefOr[Boolean] = js.native
    
    var edgesep: js.UndefOr[Double] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var marginx: js.UndefOr[Double] = js.native
    
    var marginy: js.UndefOr[Double] = js.native
    
    var nodesep: js.UndefOr[Double] = js.native
    
    var rankdir: js.UndefOr[String] = js.native
    
    var ranker: js.UndefOr[String] = js.native
    
    var ranksep: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object GraphLabel {
    
    @scala.inline
    def apply(): GraphLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphLabel]
    }
    
    @scala.inline
    implicit class GraphLabelMutableBuilder[Self <: GraphLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcyclicer(value: String): Self = StObject.set(x, "acyclicer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcyclicerUndefined: Self = StObject.set(x, "acyclicer", js.undefined)
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
      
      @scala.inline
      def setEdgesep(value: Double): Self = StObject.set(x, "edgesep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesepUndefined: Self = StObject.set(x, "edgesep", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMarginx(value: Double): Self = StObject.set(x, "marginx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginxUndefined: Self = StObject.set(x, "marginx", js.undefined)
      
      @scala.inline
      def setMarginy(value: Double): Self = StObject.set(x, "marginy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginyUndefined: Self = StObject.set(x, "marginy", js.undefined)
      
      @scala.inline
      def setNodesep(value: Double): Self = StObject.set(x, "nodesep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesepUndefined: Self = StObject.set(x, "nodesep", js.undefined)
      
      @scala.inline
      def setRankdir(value: String): Self = StObject.set(x, "rankdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRankdirUndefined: Self = StObject.set(x, "rankdir", js.undefined)
      
      @scala.inline
      def setRanker(value: String): Self = StObject.set(x, "ranker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRankerUndefined: Self = StObject.set(x, "ranker", js.undefined)
      
      @scala.inline
      def setRanksep(value: Double): Self = StObject.set(x, "ranksep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRanksepUndefined: Self = StObject.set(x, "ranksep", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Label = StringDictionary[js.Any]
  
  type Node[T] = T with Class
  
  @js.native
  trait NodeConfig extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object NodeConfig {
    
    @scala.inline
    def apply(): NodeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeConfig]
    }
    
    @scala.inline
    implicit class NodeConfigMutableBuilder[Self <: NodeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type WeightFn = js.Function1[/* edge */ Edge, Double]
}
