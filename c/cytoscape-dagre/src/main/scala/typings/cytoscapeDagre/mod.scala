package typings.cytoscapeDagre

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.Ext
import typings.cytoscape.mod.NodeSingular
import typings.cytoscape.mod.Position
import typings.cytoscape.mod.ShapedLayoutOptions
import typings.cytoscapeDagre.cytoscapeDagreStrings.LR
import typings.cytoscapeDagre.cytoscapeDagreStrings.TB
import typings.cytoscapeDagre.cytoscapeDagreStrings.`longest-path`
import typings.cytoscapeDagre.cytoscapeDagreStrings.`network-simplex`
import typings.cytoscapeDagre.cytoscapeDagreStrings.`tight-tree`
import typings.cytoscapeDagre.cytoscapeDagreStrings.dagre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-dagre", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  // function( node, i ){ return true; },
  type AnimationFilterFunction = js.Function2[/* node */ NodeSingular, /* i */ Double, Boolean]
  
  trait DagreLayoutOptions
    extends StObject
       with ShapedLayoutOptions {
    
    /**
      * whether to animate specific nodes when animation is on; non-animated nodes immediately go to their final positions
      */
    @JSName("animateFilter")
    var animateFilter_DagreLayoutOptions: js.UndefOr[AnimationFilterFunction] = js.undefined
    
    /**
      * the separation between adjacent edges in the same rank, default: 10
      */
    var edgeSep: js.UndefOr[Double] = js.undefined
    
    /**
      * higher weight edges are generally made shorter and straighter than lower weight edges,
      * default: 1 for all edges
      */
    var edgeWeight: js.UndefOr[EdgeAssessmentFunction] = js.undefined
    
    /**
      * number of ranks to keep between the source and target of the edge, default: 1 for all edges
      */
    var minLen: js.UndefOr[EdgeAssessmentFunction] = js.undefined
    
    @JSName("name")
    var name_DagreLayoutOptions: dagre
    
    /**
      *  the separation between adjacent nodes in the same rank, default: 50
      */
    var nodeSep: js.UndefOr[Double] = js.undefined
    
    /**
      *  'TB' for top to bottom flow, 'LR' for left to right, default: 'TB'
      */
    var rankDir: js.UndefOr[TB | LR] = js.undefined
    
    /**
      * the separation between each rank in the layout, default: 50
      */
    var rankSep: js.UndefOr[Double] = js.undefined
    
    /**
      * Type of algorithm to assign a rank to each node in the input graph.
      * Possible values: 'network-simplex', 'tight-tree', or 'longest-path'.
      * default: 'network-simplex'
      */
    var ranker: js.UndefOr[`network-simplex` | `tight-tree` | `longest-path`] = js.undefined
    
    /**
      * a function that applies a transform to the final node position
      */
    @JSName("transform")
    var transform_DagreLayoutOptions: js.UndefOr[TransformFunction] = js.undefined
  }
  object DagreLayoutOptions {
    
    inline def apply(): DagreLayoutOptions = {
      val __obj = js.Dynamic.literal(name = "dagre")
      __obj.asInstanceOf[DagreLayoutOptions]
    }
    
    extension [Self <: DagreLayoutOptions](x: Self) {
      
      inline def setAnimateFilter(value: (/* node */ NodeSingular, /* i */ Double) => Boolean): Self = StObject.set(x, "animateFilter", js.Any.fromFunction2(value))
      
      inline def setAnimateFilterUndefined: Self = StObject.set(x, "animateFilter", js.undefined)
      
      inline def setEdgeSep(value: Double): Self = StObject.set(x, "edgeSep", value.asInstanceOf[js.Any])
      
      inline def setEdgeSepUndefined: Self = StObject.set(x, "edgeSep", js.undefined)
      
      inline def setEdgeWeight(value: /* edge */ EdgeSingular => Double): Self = StObject.set(x, "edgeWeight", js.Any.fromFunction1(value))
      
      inline def setEdgeWeightUndefined: Self = StObject.set(x, "edgeWeight", js.undefined)
      
      inline def setMinLen(value: /* edge */ EdgeSingular => Double): Self = StObject.set(x, "minLen", js.Any.fromFunction1(value))
      
      inline def setMinLenUndefined: Self = StObject.set(x, "minLen", js.undefined)
      
      inline def setName(value: dagre): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeSep(value: Double): Self = StObject.set(x, "nodeSep", value.asInstanceOf[js.Any])
      
      inline def setNodeSepUndefined: Self = StObject.set(x, "nodeSep", js.undefined)
      
      inline def setRankDir(value: TB | LR): Self = StObject.set(x, "rankDir", value.asInstanceOf[js.Any])
      
      inline def setRankDirUndefined: Self = StObject.set(x, "rankDir", js.undefined)
      
      inline def setRankSep(value: Double): Self = StObject.set(x, "rankSep", value.asInstanceOf[js.Any])
      
      inline def setRankSepUndefined: Self = StObject.set(x, "rankSep", js.undefined)
      
      inline def setRanker(value: `network-simplex` | `tight-tree` | `longest-path`): Self = StObject.set(x, "ranker", value.asInstanceOf[js.Any])
      
      inline def setRankerUndefined: Self = StObject.set(x, "ranker", js.undefined)
      
      inline def setTransform(value: (/* node */ NodeSingular, /* pos */ Position) => Position): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  // function( edge ){ return 1; }
  type EdgeAssessmentFunction = js.Function1[/* edge */ EdgeSingular, Double]
  
  // function( node, pos ){ return pos; }
  type TransformFunction = js.Function2[/* node */ NodeSingular, /* pos */ Position, Position]
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
}
