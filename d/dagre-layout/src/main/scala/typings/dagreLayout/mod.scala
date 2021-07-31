package typings.dagreLayout

import org.scalablytyped.runtime.StringDictionary
import typings.dagreLayout.anon.Compound
import typings.dagreLayout.anon.Name
import typings.dagreLayout.mod.graphlib.Graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dagre-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object graphlib {
    
    @JSImport("dagre-layout", "graphlib.Graph")
    @js.native
    class Graph () extends StObject {
      def this(opt: Compound) = this()
      
      def edge(id: js.Any): js.Any = js.native
      
      def edges(): js.Array[Edge] = js.native
      
      def graph(): GraphLabel = js.native
      
      def hasNode(name: String): Boolean = js.native
      
      def node(id: js.Any): js.Any = js.native
      
      def nodes(): js.Array[String] = js.native
      
      def setDefaultEdgeLabel(callback: String): Graph = js.native
      def setDefaultEdgeLabel(callback: js.Function0[String | js.Object]): Graph = js.native
      
      def setDefaultNodeLabel(callback: String): Graph = js.native
      def setDefaultNodeLabel(callback: js.Function0[String | js.Object]): Graph = js.native
      
      def setEdge(params: Name): Graph = js.native
      def setEdge(params: Name, value: String): Graph = js.native
      def setEdge(sourceId: String, targetId: String): Graph = js.native
      def setEdge(sourceId: String, targetId: String, options: StringDictionary[js.Any]): Graph = js.native
      def setEdge(sourceId: String, targetId: String, options: StringDictionary[js.Any], value: String): Graph = js.native
      def setEdge(sourceId: String, targetId: String, options: Unit, value: String): Graph = js.native
      
      def setGraph(label: GraphLabel): Graph = js.native
      
      def setNode(id: String, node: StringDictionary[js.Any]): Graph = js.native
      
      def setParent(name: String, parentName: String): Unit = js.native
    }
  }
  
  @scala.inline
  def layout(graph: Graph): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Edge extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var v: String
    
    var w: String
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
}
