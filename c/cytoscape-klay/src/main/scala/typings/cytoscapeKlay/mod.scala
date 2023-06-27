package typings.cytoscapeKlay

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.BaseLayoutOptions
import typings.cytoscape.mod.Css.TransitionTimingFunction
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.Ext
import typings.cytoscape.mod.NodeSingular
import typings.cytoscapeKlay.cytoscapeKlayStrings.BALANCED
import typings.cytoscapeKlay.cytoscapeKlayStrings.BRANDES_KOEPF
import typings.cytoscapeKlay.cytoscapeKlayStrings.DOWN
import typings.cytoscapeKlay.cytoscapeKlayStrings.GREEDY
import typings.cytoscapeKlay.cytoscapeKlayStrings.INTERACTIVE
import typings.cytoscapeKlay.cytoscapeKlayStrings.LAYER_SWEEP
import typings.cytoscapeKlay.cytoscapeKlayStrings.LEFT
import typings.cytoscapeKlay.cytoscapeKlayStrings.LEFTDOWN
import typings.cytoscapeKlay.cytoscapeKlayStrings.LEFTUP
import typings.cytoscapeKlay.cytoscapeKlayStrings.LINEAR_SEGMENTS
import typings.cytoscapeKlay.cytoscapeKlayStrings.LONGEST_PATH
import typings.cytoscapeKlay.cytoscapeKlayStrings.NETWORK_SIMPLEX
import typings.cytoscapeKlay.cytoscapeKlayStrings.NONE
import typings.cytoscapeKlay.cytoscapeKlayStrings.ORTHOGONAL
import typings.cytoscapeKlay.cytoscapeKlayStrings.POLYLINE
import typings.cytoscapeKlay.cytoscapeKlayStrings.RIGHT
import typings.cytoscapeKlay.cytoscapeKlayStrings.RIGHTDOWN
import typings.cytoscapeKlay.cytoscapeKlayStrings.RIGHTUP
import typings.cytoscapeKlay.cytoscapeKlayStrings.SIMPLE
import typings.cytoscapeKlay.cytoscapeKlayStrings.SPLINES
import typings.cytoscapeKlay.cytoscapeKlayStrings.UNDEFINED
import typings.cytoscapeKlay.cytoscapeKlayStrings.UP
import typings.cytoscapeKlay.cytoscapeKlayStrings.klay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-klay", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  /**
    * Following descriptions taken from
    * http://layout.rtsys.informatik.uni-kiel.de:9444/Providedlayout.html?algorithm=de.cau.cs.kieler.klay.layered
    */
  trait KlayAlgorithmOptions extends StObject {
    
    /**
      * Adds bend points even if an edge does not change direction.
      * @default false
      */
    var addUnnecessaryBendpoints: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The aimed aspect ratio of the drawing, that is the quotient of width by height
      * @default 1.6
      */
    var aspectRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimal amount of space to be left to the border
      * @default 20
      */
    var borderSpacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Tries to further compact components (disconnected sub-graphs).
      * @default false
      */
    var compactComponents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Strategy for crossing minimization.
      * LAYER_SWEEP The layer sweep algorithm iterates multiple times over the layers, trying to find node orderings
      *   that minimize the number of crossings. The algorithm uses randomization to increase the odds of finding a
      *   good result. To improve its results, consider increasing the Thoroughness option, which influences the
      *   number of iterations done. The Randomization seed also influences results.
      * INTERACTIVE Orders the nodes of each layer by comparing their positions before the layout algorithm was
      *   started. The idea is that the relative order of nodes as it was before layout was applied is not changed.
      *   This of course requires valid positions for all nodes to have been set on the input graph before calling
      *   the layout algorithm. The interactive layer sweep algorithm uses the Interactive Reference Point option to
      *   determine which reference point of nodes are used to compare positions.
      * @default 'LAYER_SWEEP'
      */
    var crossingMinimization: js.UndefOr[LAYER_SWEEP | INTERACTIVE] = js.undefined
    
    /**
      * Strategy for cycle breaking. Cycle breaking looks for cycles in the graph and determines which edges to
      * reverse to break the cycles. Reversed edges will end up pointing to the opposite direction of regular
      * edges (that is, reversed edges will point left if edges usually point right).
      *  GREEDY This algorithm reverses edges greedily. The algorithm tries to avoid edges that have the Priority
      *    property set.
      *  INTERACTIVE The interactive algorithm tries to reverse edges that already pointed leftwards in the input
      *    graph. This requires node and port coordinates to have been set to sensible values.
      * @default 'GREEDY'
      */
    var cycleBreaking: js.UndefOr[GREEDY | INTERACTIVE] = js.undefined
    
    /**
      * Overall direction of edges: horizontal (right / left) or vertical (down / up)
      * UNDEFINED, RIGHT, LEFT, DOWN, UP
      * @default 'UNDEFINED'
      */
    var direction: js.UndefOr[UNDEFINED | RIGHT | LEFT | DOWN | UP] = js.undefined
    
    /**
      * Defines how edges are routed (POLYLINE, ORTHOGONAL, SPLINES)
      * @default 'ORTHOGONAL'
      */
    var edgeRouting: js.UndefOr[ORTHOGONAL | POLYLINE | SPLINES] = js.undefined
    
    /**
      * Factor by which the object spacing is multiplied to arrive at the minimal spacing between edges.
      * @default 0.5
      */
    var edgeSpacingFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether feedback edges should be highlighted by routing around the nodes.
      * @default false
      */
    var feedbackEdges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tells the BK node placer to use a certain alignment instead of taking the optimal result.  This option should
      * usually be left alone.
      * - NONE Chooses the smallest layout from the four possible candidates.
      * - LEFTUP Chooses the left-up candidate from the four possible candidates.
      * - RIGHTUP Chooses the right-up candidate from the four possible candidates.
      * - LEFTDOWN Chooses the left-down candidate from the four possible candidates.
      * - RIGHTDOWN Chooses the right-down candidate from the four possible candidates.
      * - BALANCED Creates a balanced layout from the four possible candidates.
      * @default 'NONE'
      */
    var fixedAlignment: js.UndefOr[NONE | LEFTUP | RIGHTUP | LEFTDOWN | RIGHTDOWN | BALANCED] = js.undefined
    
    /**
      * Factor by which the usual spacing is multiplied to determine the in-layer spacing between objects.
      * @default 1.0
      */
    var inLayerSpacingFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the selected layouter should consider the full hierarchy
      * @default false
      */
    var layoutHierarchy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Dampens the movement of nodes to keep the diagram from getting too large.
      * @default 0.3
      */
    var linearSegmentsDeflectionDampening: js.UndefOr[Double] = js.undefined
    
    // Edges that have no ports are merged so they touch the connected nodes at the same points.
    // @default false
    var mergeEdges: js.UndefOr[Boolean] = js.undefined
    
    // If hierarchical layout is active, hierarchy-crossing edges use as few hierarchical ports as possible.
    // @default true
    var mergeHierarchyCrossingEdges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Strategy for node layering.
      * - NETWORK_SIMPLEX This algorithm tries to minimize the length of edges. This is the most computationally
      *   intensive algorithm. The number of iterations after which it aborts if it hasn't found a result yet can be
      *   set with the Maximal Iterations option.
      * - LONGEST_PATH A very simple algorithm that distributes nodes along their longest path to a sink node.
      * - INTERACTIVE Distributes the nodes into layers by comparing their positions before the layout algorithm was
      *     started. The idea is that the relative horizontal order of nodes as it was before layout was applied is
      *     not changed. This of course requires valid positions for all nodes to have been set on the input graph
      *     before calling the layout algorithm. The interactive node layering algorithm uses the Interactive
      *     Reference Point option to determine which reference point of nodes are used to compare positions.
      * @default NETWORK_SIMPLEX
      */
    var nodeLayering: js.UndefOr[NETWORK_SIMPLEX | LONGEST_PATH | INTERACTIVE] = js.undefined
    
    /**
      * Strategy for Node Placement
      * - BRANDES_KOEPF Minimizes the number of edge bends at the expense of diagram size: diagrams drawn with this
      *   algorithm are usually higher than diagrams drawn with other algorithms.
      * - LINEAR_SEGMENTS Computes a balanced placement.
      * - INTERACTIVE Tries to keep the preset y coordinates of nodes from the original layout. For dummy nodes, a
      *   guess is made to infer their coordinates. Requires the other interactive phase implementations to have run
      *   as well.
      * - SIMPLE Minimizes the area at the expense of... well, pretty much everything else.
      * @default 'BRANDES_KOEPF'
      */
    var nodePlacement: js.UndefOr[BRANDES_KOEPF | LINEAR_SEGMENTS | INTERACTIVE | SIMPLE] = js.undefined
    
    /**
      * Seed used for pseudo-random number generators to control the layout algorithm; 0 means a new seed is generated
      * @default 1
      */
    var randomizationSeed: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether a self-loop is routed around or inside its node.
      * @default false
      */
    var routeSelfLoopInside: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether each connected component should be processed separately
      * @default true
      */
    var separateConnectedComponents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overall setting for the minimal amount of space to be left between objects
      * @default 20
      */
    var spacing: js.UndefOr[Double] = js.undefined
    
    /**
      * How much effort should be spent to produce a nice layout.
      * @default 7
      */
    var thoroughness: js.UndefOr[Double] = js.undefined
  }
  object KlayAlgorithmOptions {
    
    inline def apply(): KlayAlgorithmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KlayAlgorithmOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KlayAlgorithmOptions] (val x: Self) extends AnyVal {
      
      inline def setAddUnnecessaryBendpoints(value: Boolean): Self = StObject.set(x, "addUnnecessaryBendpoints", value.asInstanceOf[js.Any])
      
      inline def setAddUnnecessaryBendpointsUndefined: Self = StObject.set(x, "addUnnecessaryBendpoints", js.undefined)
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setBorderSpacing(value: Double): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
      
      inline def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
      
      inline def setCompactComponents(value: Boolean): Self = StObject.set(x, "compactComponents", value.asInstanceOf[js.Any])
      
      inline def setCompactComponentsUndefined: Self = StObject.set(x, "compactComponents", js.undefined)
      
      inline def setCrossingMinimization(value: LAYER_SWEEP | INTERACTIVE): Self = StObject.set(x, "crossingMinimization", value.asInstanceOf[js.Any])
      
      inline def setCrossingMinimizationUndefined: Self = StObject.set(x, "crossingMinimization", js.undefined)
      
      inline def setCycleBreaking(value: GREEDY | INTERACTIVE): Self = StObject.set(x, "cycleBreaking", value.asInstanceOf[js.Any])
      
      inline def setCycleBreakingUndefined: Self = StObject.set(x, "cycleBreaking", js.undefined)
      
      inline def setDirection(value: UNDEFINED | RIGHT | LEFT | DOWN | UP): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEdgeRouting(value: ORTHOGONAL | POLYLINE | SPLINES): Self = StObject.set(x, "edgeRouting", value.asInstanceOf[js.Any])
      
      inline def setEdgeRoutingUndefined: Self = StObject.set(x, "edgeRouting", js.undefined)
      
      inline def setEdgeSpacingFactor(value: Double): Self = StObject.set(x, "edgeSpacingFactor", value.asInstanceOf[js.Any])
      
      inline def setEdgeSpacingFactorUndefined: Self = StObject.set(x, "edgeSpacingFactor", js.undefined)
      
      inline def setFeedbackEdges(value: Boolean): Self = StObject.set(x, "feedbackEdges", value.asInstanceOf[js.Any])
      
      inline def setFeedbackEdgesUndefined: Self = StObject.set(x, "feedbackEdges", js.undefined)
      
      inline def setFixedAlignment(value: NONE | LEFTUP | RIGHTUP | LEFTDOWN | RIGHTDOWN | BALANCED): Self = StObject.set(x, "fixedAlignment", value.asInstanceOf[js.Any])
      
      inline def setFixedAlignmentUndefined: Self = StObject.set(x, "fixedAlignment", js.undefined)
      
      inline def setInLayerSpacingFactor(value: Double): Self = StObject.set(x, "inLayerSpacingFactor", value.asInstanceOf[js.Any])
      
      inline def setInLayerSpacingFactorUndefined: Self = StObject.set(x, "inLayerSpacingFactor", js.undefined)
      
      inline def setLayoutHierarchy(value: Boolean): Self = StObject.set(x, "layoutHierarchy", value.asInstanceOf[js.Any])
      
      inline def setLayoutHierarchyUndefined: Self = StObject.set(x, "layoutHierarchy", js.undefined)
      
      inline def setLinearSegmentsDeflectionDampening(value: Double): Self = StObject.set(x, "linearSegmentsDeflectionDampening", value.asInstanceOf[js.Any])
      
      inline def setLinearSegmentsDeflectionDampeningUndefined: Self = StObject.set(x, "linearSegmentsDeflectionDampening", js.undefined)
      
      inline def setMergeEdges(value: Boolean): Self = StObject.set(x, "mergeEdges", value.asInstanceOf[js.Any])
      
      inline def setMergeEdgesUndefined: Self = StObject.set(x, "mergeEdges", js.undefined)
      
      inline def setMergeHierarchyCrossingEdges(value: Boolean): Self = StObject.set(x, "mergeHierarchyCrossingEdges", value.asInstanceOf[js.Any])
      
      inline def setMergeHierarchyCrossingEdgesUndefined: Self = StObject.set(x, "mergeHierarchyCrossingEdges", js.undefined)
      
      inline def setNodeLayering(value: NETWORK_SIMPLEX | LONGEST_PATH | INTERACTIVE): Self = StObject.set(x, "nodeLayering", value.asInstanceOf[js.Any])
      
      inline def setNodeLayeringUndefined: Self = StObject.set(x, "nodeLayering", js.undefined)
      
      inline def setNodePlacement(value: BRANDES_KOEPF | LINEAR_SEGMENTS | INTERACTIVE | SIMPLE): Self = StObject.set(x, "nodePlacement", value.asInstanceOf[js.Any])
      
      inline def setNodePlacementUndefined: Self = StObject.set(x, "nodePlacement", js.undefined)
      
      inline def setRandomizationSeed(value: Double): Self = StObject.set(x, "randomizationSeed", value.asInstanceOf[js.Any])
      
      inline def setRandomizationSeedUndefined: Self = StObject.set(x, "randomizationSeed", js.undefined)
      
      inline def setRouteSelfLoopInside(value: Boolean): Self = StObject.set(x, "routeSelfLoopInside", value.asInstanceOf[js.Any])
      
      inline def setRouteSelfLoopInsideUndefined: Self = StObject.set(x, "routeSelfLoopInside", js.undefined)
      
      inline def setSeparateConnectedComponents(value: Boolean): Self = StObject.set(x, "separateConnectedComponents", value.asInstanceOf[js.Any])
      
      inline def setSeparateConnectedComponentsUndefined: Self = StObject.set(x, "separateConnectedComponents", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setThoroughness(value: Double): Self = StObject.set(x, "thoroughness", value.asInstanceOf[js.Any])
      
      inline def setThoroughnessUndefined: Self = StObject.set(x, "thoroughness", js.undefined)
    }
  }
  
  /**
    * Following descriptions taken from
    * http://layout.rtsys.informatik.uni-kiel.de:9444/Providedlayout.html?algorithm=de.cau.cs.kieler.klay.layered
    * @see <a href='https://github.com/cytoscape/cytoscape.js-klay'>cytoscape-klay package Documentation</a>
    */
  trait KlayLayoutOptions
    extends StObject
       with BaseLayoutOptions {
    
    /**
      * Whether to transition the node positions
      * @default false
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to animate specific nodes when animation is on; non-animated nodes immediately go to their final
      * positions
      * @default true
      */
    var animateFilter: js.UndefOr[js.Function2[/* node */ NodeSingular, /* i */ Double, Boolean]] = js.undefined
    
    /**
      * Duration of animation in ms if enabled
      * @default 500
      */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Easing of animation if enabled.  See [Transition Animation](https://js.cytoscape.org/#style/transition-animation)
      * for allowable values
      * @default undefined;
      */
    var animationEasing: js.UndefOr[TransitionTimingFunction] = js.undefined
    
    /**
      * Whether to fit
      * @default true
      */
    var fit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The main klay algorithm options.
      */
    var klay: js.UndefOr[KlayAlgorithmOptions] = js.undefined
    
    @JSName("name")
    var name_KlayLayoutOptions: klay
    
    /**
      * Boolean which changes whether label dimensions are included when calculating node dimensions
      * @default false
      */
    var nodeDimensionsIncludeLabels: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Padding on fit
      * @default 20
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * Edges with a non-nil value are skipped when greedy edge cycle breaking is enabled
      */
    var priority: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Any]] = js.undefined
  }
  object KlayLayoutOptions {
    
    inline def apply(): KlayLayoutOptions = {
      val __obj = js.Dynamic.literal(name = "klay")
      __obj.asInstanceOf[KlayLayoutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KlayLayoutOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateFilter(value: (/* node */ NodeSingular, /* i */ Double) => Boolean): Self = StObject.set(x, "animateFilter", js.Any.fromFunction2(value))
      
      inline def setAnimateFilterUndefined: Self = StObject.set(x, "animateFilter", js.undefined)
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationEasing(value: TransitionTimingFunction): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
      
      inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
      
      inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setKlay(value: KlayAlgorithmOptions): Self = StObject.set(x, "klay", value.asInstanceOf[js.Any])
      
      inline def setKlayUndefined: Self = StObject.set(x, "klay", js.undefined)
      
      inline def setName(value: klay): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeDimensionsIncludeLabels(value: Boolean): Self = StObject.set(x, "nodeDimensionsIncludeLabels", value.asInstanceOf[js.Any])
      
      inline def setNodeDimensionsIncludeLabelsUndefined: Self = StObject.set(x, "nodeDimensionsIncludeLabels", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPriority(value: /* edge */ EdgeSingular => Any): Self = StObject.set(x, "priority", js.Any.fromFunction1(value))
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
}
