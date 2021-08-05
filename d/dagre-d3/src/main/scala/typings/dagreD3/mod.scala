package typings.dagreD3

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.Selection_
import typings.dagre.anon.Compound
import typings.dagre.mod.Edge
import typings.dagre.mod.EdgeConfig
import typings.dagre.mod.EdgeFn
import typings.dagre.mod.GraphLabel
import typings.dagre.mod.NodeConfig
import typings.dagre.mod.WeightFn
import typings.dagre.mod.graphlib.Graph
import typings.dagreD3.anon.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dagre-d3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object graphlib {
    
    @JSImport("dagre-d3", "graphlib.Graph")
    @js.native
    class Graph[T] ()
      extends typings.dagre.mod.graphlib.Graph[T] {
      def this(opt: Compound) = this()
    }
    
    object alg {
      
      @JSImport("dagre-d3", "graphlib.alg")
      @js.native
      val ^ : js.Any = js.native
      
      inline def components(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("components")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
      
      inline def dijkstra(graph: typings.dagre.mod.graphlib.Graph[js.Object], source: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def dijkstra(graph: typings.dagre.mod.graphlib.Graph[js.Object], source: String, weightFn: Unit, edgeFn: EdgeFn): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def dijkstra(graph: typings.dagre.mod.graphlib.Graph[js.Object], source: String, weightFn: WeightFn): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def dijkstra(
        graph: typings.dagre.mod.graphlib.Graph[js.Object],
        source: String,
        weightFn: WeightFn,
        edgeFn: EdgeFn
      ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: Unit, edgeFn: EdgeFn): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def findCycles(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findCycles")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
      
      inline def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: Unit, edgeFn: EdgeFn): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
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
      
      @JSImport("dagre-d3", "graphlib.json")
      @js.native
      val ^ : js.Any = js.native
      
      inline def read(graph: js.Any): typings.dagre.mod.graphlib.Graph[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(graph.asInstanceOf[js.Any]).asInstanceOf[typings.dagre.mod.graphlib.Graph[js.Object]]
      
      inline def write(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    }
  }
  
  inline def layout(graph: Graph[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def layout(graph: Graph[js.Object], layout: GraphLabel & NodeConfig & EdgeConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dagre-d3", "render")
  @js.native
  class render ()
    extends StObject
       with Render_
  
  @js.native
  trait Render_ extends StObject {
    
    // see https://dagrejs.github.io/project/dagre-d3/latest/demo/user-defined.html for example usage
    def apply(selection: Selection_[js.Any, js.Any, js.Any, js.Any], g: typings.graphlib.mod.Graph): Unit = js.native
    
    def arrows(): StringDictionary[
        js.Function4[
          /* parent */ Selection_[js.Any, js.Any, js.Any, js.Any], 
          /* id */ String, 
          /* edge */ Edge, 
          /* type */ String, 
          Unit
        ]
      ] = js.native
    
    def shapes(): StringDictionary[
        js.Function3[
          /* parent */ Selection_[js.Any, js.Any, js.Any, js.Any], 
          /* bbox */ js.Any, 
          /* node */ Node, 
          Unit
        ]
      ] = js.native
  }
}
