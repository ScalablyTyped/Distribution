package typings.dagreD3

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Selection.mod.ValueFn
import typings.d3Transition.mod.SelectionOrTransition
import typings.dagre.anon.Compound
import typings.dagre.mod.EdgeConfig
import typings.dagre.mod.EdgeFn
import typings.dagre.mod.GraphLabel
import typings.dagre.mod.NodeConfig
import typings.dagre.mod.WeightFn
import typings.dagre.mod.graphlib.Graph
import typings.dagreD3.anon.Name
import typings.dagreD3.anon.Node
import typings.graphlib.mod.Edge
import typings.graphlib.mod.GraphOptions
import typings.graphlib.mod.Path
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object dagre {
    
    @JSImport("dagre-d3", "dagre")
    @js.native
    val ^ : js.Any = js.native
    
    object graphlib {
      
      @JSImport("dagre-d3", "dagre.graphlib.Graph")
      @js.native
      open class Graph[T] ()
        extends typings.dagre.mod.graphlib.Graph[T] {
        def this(opt: Compound) = this()
      }
      
      object alg {
        
        @JSImport("dagre-d3", "dagre.graphlib.alg")
        @js.native
        val ^ : js.Any = js.native
        
        inline def components(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("components")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
        
        inline def dijkstra(graph: typings.dagre.mod.graphlib.Graph[js.Object], source: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstra(graph: typings.dagre.mod.graphlib.Graph[js.Object], source: String, weightFn: Unit, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstra(graph: typings.dagre.mod.graphlib.Graph[js.Object], source: String, weightFn: WeightFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstra(
          graph: typings.dagre.mod.graphlib.Graph[js.Object],
          source: String,
          weightFn: WeightFn,
          edgeFn: EdgeFn
        ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        
        inline def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any]).asInstanceOf[Any]
        inline def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: Unit, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        
        inline def findCycles(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findCycles")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
        
        inline def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any]).asInstanceOf[Any]
        inline def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: Unit, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        
        inline def isAcyclic(graph: typings.dagre.mod.graphlib.Graph[js.Object]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAcyclic")(graph.asInstanceOf[js.Any]).asInstanceOf[Boolean]
        
        inline def postorder(graph: typings.dagre.mod.graphlib.Graph[js.Object], nodeNames: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("postorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
        inline def postorder(graph: typings.dagre.mod.graphlib.Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("postorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
        
        inline def preorder(graph: typings.dagre.mod.graphlib.Graph[js.Object], nodeNames: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("preorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
        inline def preorder(graph: typings.dagre.mod.graphlib.Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("preorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
        
        inline def prim[T](graph: typings.dagre.mod.graphlib.Graph[T]): typings.dagre.mod.graphlib.Graph[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prim")(graph.asInstanceOf[js.Any]).asInstanceOf[typings.dagre.mod.graphlib.Graph[T]]
        inline def prim[T](graph: typings.dagre.mod.graphlib.Graph[T], weightFn: WeightFn): typings.dagre.mod.graphlib.Graph[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prim")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[typings.dagre.mod.graphlib.Graph[T]]
        
        inline def tarjam(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tarjam")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
        
        inline def topsort(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("topsort")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
      }
      
      object json {
        
        @JSImport("dagre-d3", "dagre.graphlib.json")
        @js.native
        val ^ : js.Any = js.native
        
        inline def read(graph: Any): typings.dagre.mod.graphlib.Graph[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(graph.asInstanceOf[js.Any]).asInstanceOf[typings.dagre.mod.graphlib.Graph[js.Object]]
        
        inline def write(graph: typings.dagre.mod.graphlib.Graph[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(graph.asInstanceOf[js.Any]).asInstanceOf[Any]
      }
    }
    
    inline def layout(graph: Graph[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def layout(graph: Graph[js.Object], layout: GraphLabel & NodeConfig & EdgeConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object graphlib {
    
    @JSImport("dagre-d3", "graphlib.Graph")
    @js.native
    open class Graph ()
      extends typings.graphlib.mod.Graph {
      def this(options: GraphOptions) = this()
    }
    
    object alg {
      
      @JSImport("dagre-d3", "graphlib.alg")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Finds all connected components in a graph and returns an array of these components.
        * Each component is itself an array that contains the ids of nodes in the component.
        * Complexity: O(|V|).
        * 
        * @argument graph - graph to find components in.
        * @returns array of nodes list representing components
        */
      inline def components(graph: typings.graphlib.mod.Graph): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("components")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
      
      /**
        * This function is an implementation of Dijkstra's algorithm which finds the shortest
        * path from source to all other nodes in graph. This function returns a map of
        * v -> { distance, predecessor }. The distance property holds the sum of the weights
        * from source to v along the shortest path or Number.POSITIVE_INFINITY if there is no path
        * from source. The predecessor property can be used to walk the individual elements of the
        * path from source to v in reverse order.
        * Complexity: O((|E| + |V|) * log |V|).
        *
        * @argument graph - graph where to search pathes.
        * @argument source - node to start pathes from.
        * @argument weightFn - function which takes edge e and returns the weight of it. If no weightFn
        * is supplied then each edge is assumed to have a weight of 1. This function throws an
        * Error if any of the traversed edges have a negative edge weight.
        * @argument edgeFn - function which takes a node v and returns the ids of all edges incident to it
        * for the purposes of shortest path traversal. By default this function uses the graph.outEdges.
        * @returns shortest pathes map that starts from node source
        */
      inline def dijkstra(graph: typings.graphlib.mod.Graph, source: String): StringDictionary[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Path]]
      inline def dijkstra(graph: typings.graphlib.mod.Graph, source: String, weightFn: js.Function1[/* e */ Edge, Double]): StringDictionary[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Path]]
      inline def dijkstra(
        graph: typings.graphlib.mod.Graph,
        source: String,
        weightFn: js.Function1[/* e */ Edge, Double],
        edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
      ): StringDictionary[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Path]]
      inline def dijkstra(
        graph: typings.graphlib.mod.Graph,
        source: String,
        weightFn: Unit,
        edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
      ): StringDictionary[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Path]]
      
      /**
        * This function finds the shortest path from each node to every other reachable node in
        * the graph. It is similar to alg.dijkstra, but instead of returning a single-source
        * array, it returns a mapping of source -> alg.dijksta(g, source, weightFn, edgeFn).
        * Complexity: O(|V| * (|E| + |V|) * log |V|).
        *
        * @argument graph - graph where to search pathes.
        * @argument weightFn - function which takes edge e and returns the weight of it. If no weightFn
        * is supplied then each edge is assumed to have a weight of 1. This function throws an
        * Error if any of the traversed edges have a negative edge weight.
        * @argument edgeFn - function which takes a node v and returns the ids of all edges incident to it
        * for the purposes of shortest path traversal. By default this function uses the graph.outEdges.
        * @returns shortest pathes map.
        */
      inline def dijkstraAll(graph: typings.graphlib.mod.Graph): StringDictionary[StringDictionary[Path]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[StringDictionary[Path]]]
      inline def dijkstraAll(graph: typings.graphlib.mod.Graph, weightFn: js.Function1[/* e */ Edge, Double]): StringDictionary[StringDictionary[Path]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[StringDictionary[Path]]]
      inline def dijkstraAll(
        graph: typings.graphlib.mod.Graph,
        weightFn: js.Function1[/* e */ Edge, Double],
        edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
      ): StringDictionary[StringDictionary[Path]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[StringDictionary[Path]]]
      inline def dijkstraAll(
        graph: typings.graphlib.mod.Graph,
        weightFn: Unit,
        edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
      ): StringDictionary[StringDictionary[Path]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[StringDictionary[Path]]]
      
      /**
        * Given a Graph, graph, this function returns all nodes that are part of a cycle. As there
        * may be more than one cycle in a graph this function return an array of these cycles,
        * where each cycle is itself represented by an array of ids for each node involved in
        * that cycle. Method alg.isAcyclic is more efficient if you only need to determine whether a graph has a
        * cycle or not.
        * Complexity: O(|V| + |E|).
        * 
        * @argument graph - graph where to search cycles.
        * @returns cycles list.
        */
      inline def findCycles(graph: typings.graphlib.mod.Graph): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findCycles")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
      
      /**
        * This function is an implementation of the Floyd-Warshall algorithm, which finds the
        * shortest path from each node to every other reachable node in the graph. It is similar
        * to alg.dijkstraAll, but it handles negative edge weights and is more efficient for some types
        * of graphs. This function returns a map of source -> { target -> { distance, predecessor }.
        * The distance property holds the sum of the weights from source to target along the shortest
        * path of Number.POSITIVE_INFINITY if there is no path from source. The predecessor property
        * can be used to walk the individual elements of the path from source to target in reverse
        * order.
        * Complexity: O(|V|^3).
        *
        * @argument graph - graph where to search pathes.
        * @argument weightFn - function which takes edge e and returns the weight of it. If no weightFn
        * is supplied then each edge is assumed to have a weight of 1. This function throws an
        * Error if any of the traversed edges have a negative edge weight.
        * @argument edgeFn - function which takes a node v and returns the ids of all edges incident to it
        * for the purposes of shortest path traversal. By default this function uses the graph.outEdges.
        * @returns shortest pathes map.
        */
      inline def floydWarshall(graph: typings.graphlib.mod.Graph): StringDictionary[StringDictionary[Path]] = ^.asInstanceOf[js.Dynamic].applyDynamic("floydWarshall")(graph.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[StringDictionary[Path]]]
      inline def floydWarshall(graph: typings.graphlib.mod.Graph, weightFn: js.Function1[/* e */ Edge, Double]): StringDictionary[StringDictionary[Path]] = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarshall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[StringDictionary[Path]]]
      inline def floydWarshall(
        graph: typings.graphlib.mod.Graph,
        weightFn: js.Function1[/* e */ Edge, Double],
        edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
      ): StringDictionary[StringDictionary[Path]] = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarshall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[StringDictionary[Path]]]
      inline def floydWarshall(
        graph: typings.graphlib.mod.Graph,
        weightFn: Unit,
        edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
      ): StringDictionary[StringDictionary[Path]] = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarshall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[StringDictionary[Path]]]
      
      /**
        * Given a Graph, graph, this function returns true if the graph has no cycles and returns false if it
        * does. This algorithm returns as soon as it detects the first cycle. You can use alg.findCycles
        * to get the actual list of cycles in the graph.
        * 
        * @argument graph - graph to detect whether it acyclic ot not.
        * @returns whether graph contain cycles or not.
        */
      inline def isAcyclic(graph: typings.graphlib.mod.Graph): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAcyclic")(graph.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Performs post-order depth first traversal on the input graph. If the graph is
        * undirected then this algorithm will navigate using neighbors. If the graph
        * is directed then this algorithm will navigate using successors.
        * 
        * @argument graph - depth first traversal target.
        * @argument vs - nodes list to traverse.
        * @returns the nodes in the order they were visited as a list of their names.
        */
      inline def postorder(graph: typings.graphlib.mod.Graph, vs: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("postorder")(graph.asInstanceOf[js.Any], vs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
      
      /**
        * Performs pre-order depth first traversal on the input graph. If the graph is
        * undirected then this algorithm will navigate using neighbors. If the graph
        * is directed then this algorithm will navigate using successors.
        * 
        * @argument graph - depth first traversal target.
        * @argument vs - nodes list to traverse.
        * @returns the nodes in the order they were visited as a list of their names.
        */
      inline def preorder(graph: typings.graphlib.mod.Graph, vs: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("preorder")(graph.asInstanceOf[js.Any], vs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
      
      /**
        * Prim's algorithm takes a connected undirected graph and generates a minimum spanning tree. This
        * function returns the minimum spanning tree as an undirected graph. This algorithm is derived
        * from the description in "Introduction to Algorithms", Third Edition, Cormen, et al., Pg 634.
        * Complexity: O(|E| * log |V|);
        *
        * @argument graph - graph to generate a minimum spanning tree of.
        * @argument weightFn - function which takes edge e and returns the weight of it. It throws an Error if
        *           the graph is not connected.
        * @returns minimum spanning tree of graph.
        */
      inline def prim(graph: typings.graphlib.mod.Graph, weightFn: js.Function1[/* e */ Edge, Double]): typings.graphlib.mod.Graph = (^.asInstanceOf[js.Dynamic].applyDynamic("prim")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[typings.graphlib.mod.Graph]
      
      /**
        * This function is an implementation of Tarjan's algorithm which finds all strongly connected
        * components in the directed graph g. Each strongly connected component is composed of nodes that
        * can reach all other nodes in the component via directed edges. A strongly connected component
        * can consist of a single node if that node cannot both reach and be reached by any other
        * specific node in the graph. Components of more than one node are guaranteed to have at least
        * one cycle.
        * Complexity: O(|V| + |E|).
        *
        * @argument graph - graph to find all strongly connected components of.
        * @return  an array of components. Each component is itself an array that contains
        *          the ids of all nodes in the component.
        */
      inline def tarjan(graph: typings.graphlib.mod.Graph): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tarjan")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
      
      /**
        * Given a Graph graph this function applies topological sorting to it.
        * If the graph has a cycle it is impossible to generate such a list and CycleException is thrown.
        * Complexity: O(|V| + |E|).
        * 
        * @argument graph - graph to apply topological sorting to.
        * @returns an array of nodes such that for each edge u -> v, u appears before v in the array.
        */
      inline def topsort(graph: typings.graphlib.mod.Graph): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("topsort")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    }
    
    object json {
      
      @JSImport("dagre-d3", "graphlib.json")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Takes JSON as input and returns the graph representation.
        *
        * @example
        * var g2 = graphlib.json.read(JSON.parse(str));
        * g2.nodes();
        * // ['a', 'b']
        * g2.edges()
        * // [ { v: 'a', w: 'b' } ]
        * 
        * @argument json - JSON serializable graph representation
        * @returns graph constructed acccording to specified representation
        */
      inline def read(json: js.Object): typings.graphlib.mod.Graph = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(json.asInstanceOf[js.Any]).asInstanceOf[typings.graphlib.mod.Graph]
      
      /**
        * Creates a JSON representation of the graph that can be serialized to a string with
        * JSON.stringify. The graph can later be restored using json.read.
        * 
        * @argument graph - target to create JSON representation of.
        * @returns JSON serializable graph representation
        */
      inline def write(graph: typings.graphlib.mod.Graph): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    }
  }
  
  object intersect {
    
    @JSImport("dagre-d3", "intersect")
    @js.native
    val ^ : js.Any = js.native
    
    inline def circle(node: Node, rx: Double, point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(node.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def ellipse(node: Node, rx: Double, ry: Double, point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(node.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def node(node: Node, point: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("node")(node.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def polygon(node: Node, polyPoints: js.Array[Point], point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(node.asInstanceOf[js.Any], polyPoints.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def rect(node: Node, point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("rect")(node.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dagre-d3", "render")
  @js.native
  open class render ()
    extends StObject
       with Render_
  
  object util {
    
    @JSImport("dagre-d3", "util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def applyClass[GElement /* <: BaseType */, Datum](
      dom: Selection_[GElement, Datum, Any, Any],
      classFn: ValueFn[GElement, Datum, String | Double | Boolean | Null],
      otherClasses: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyClass")(dom.asInstanceOf[js.Any], classFn.asInstanceOf[js.Any], otherClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def applyStyle[GElement /* <: BaseType */, Datum](
      dom: Selection_[GElement, Datum, Any, Any],
      styleFn: ValueFn[GElement, Datum, String | Double | Boolean | Null]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyle")(dom.asInstanceOf[js.Any], styleFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def applyTransition[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum](selection: Selection_[GElement, Datum, PElement, PDatum], g: Graph[Any]): SelectionOrTransition[GElement, Datum, PElement, PDatum] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransition")(selection.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[SelectionOrTransition[GElement, Datum, PElement, PDatum]]
    
    inline def edgeToId(e: Name): String = ^.asInstanceOf[js.Dynamic].applyDynamic("edgeToId")(e.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isSubgraph(g: Graph[Any], v: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubgraph")(g.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  type Arrow = js.Function4[
    /* parent */ Selection_[Any, Any, Any, Any], 
    /* id */ String, 
    /* edge */ typings.dagre.mod.Edge, 
    /* type */ String, 
    Unit
  ]
  
  type Arrows = StringDictionary[Arrow]
  
  type CreateClusters = js.Function2[
    /* selection */ Selection_[SVGGElement, String, Any, Any], 
    /* g */ Graph[Any], 
    SelectionOrTransition[BaseType, Any, Any, Any]
  ]
  
  type CreateEdgeLabels = js.Function2[
    /* selection */ Selection_[SVGGElement, String, Any, Any], 
    /* g */ Graph[Any], 
    SelectionOrTransition[BaseType, Any, Any, Any]
  ]
  
  type CreateEdgePaths = js.Function3[
    /* selection */ Selection_[SVGGElement, String, Any, Any], 
    /* g */ Graph[Any], 
    /* arrows */ Arrows, 
    SelectionOrTransition[BaseType, Any, Any, Any]
  ]
  
  type CreateNodes = js.Function3[
    /* selection */ Selection_[SVGGElement, String, Any, Any], 
    /* g */ Graph[Any], 
    /* shapes */ Shapes, 
    SelectionOrTransition[BaseType, Any, Any, Any]
  ]
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Render_ extends StObject {
    
    // see https://dagrejs.github.io/project/dagre-d3/latest/demo/user-defined.html for example usage
    def apply(selection: Selection_[Any, Any, Any, Any], g: Graph[Any]): Unit = js.native
    
    def arrows(): Arrows = js.native
    def arrows(value: Arrows): Render_ = js.native
    
    def createClusters(): CreateClusters = js.native
    def createClusters(value: CreateClusters): Render_ = js.native
    
    def createEdgeLabels(): CreateEdgeLabels = js.native
    def createEdgeLabels(value: CreateEdgeLabels): Render_ = js.native
    
    def createEdgePaths(): CreateEdgePaths = js.native
    def createEdgePaths(value: CreateEdgePaths): Render_ = js.native
    
    def createNodes(): CreateNodes = js.native
    def createNodes(value: CreateNodes): Render_ = js.native
    
    def shapes(): Shapes = js.native
    def shapes(value: Shapes): Render_ = js.native
  }
  
  type Shape = js.Function3[
    /* parent */ Selection_[Any, String, Any, Any], 
    /* bbox */ Any, 
    /* node */ Node, 
    Selection_[Any, String, Any, Any]
  ]
  
  type Shapes = StringDictionary[Shape]
}
