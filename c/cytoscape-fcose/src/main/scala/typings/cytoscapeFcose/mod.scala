package typings.cytoscapeFcose

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.BaseLayoutOptions
import typings.cytoscape.mod.Ext
import typings.cytoscape.mod.Position
import typings.cytoscapeFcose.cytoscapeFcoseStrings.`ease-out`
import typings.cytoscapeFcose.cytoscapeFcoseStrings.all
import typings.cytoscapeFcose.cytoscapeFcoseStrings.cose
import typings.cytoscapeFcose.cytoscapeFcoseStrings.default
import typings.cytoscapeFcose.cytoscapeFcoseStrings.draft
import typings.cytoscapeFcose.cytoscapeFcoseStrings.enforced
import typings.cytoscapeFcose.cytoscapeFcoseStrings.fcose
import typings.cytoscapeFcose.cytoscapeFcoseStrings.proof
import typings.cytoscapeFcose.cytoscapeFcoseStrings.transformed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-fcose", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  trait FcoseAlignmentConstraint extends StObject {
    
    var horizontal: js.Array[js.Tuple2[String, String]]
    
    var vertical: js.Array[js.Tuple2[String, String]]
  }
  object FcoseAlignmentConstraint {
    
    inline def apply(horizontal: js.Array[js.Tuple2[String, String]], vertical: js.Array[js.Tuple2[String, String]]): FcoseAlignmentConstraint = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[FcoseAlignmentConstraint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FcoseAlignmentConstraint] (val x: Self) extends AnyVal {
      
      inline def setHorizontal(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "horizontal", js.Array(value*))
      
      inline def setVertical(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "vertical", js.Array(value*))
    }
  }
  
  trait FcoseFixedNodeConstraint extends StObject {
    
    var nodeId: String
    
    var position: Position
  }
  object FcoseFixedNodeConstraint {
    
    inline def apply(nodeId: String, position: Position): FcoseFixedNodeConstraint = {
      val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[FcoseFixedNodeConstraint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FcoseFixedNodeConstraint] (val x: Self) extends AnyVal {
      
      inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait FcoseLayoutOptions
    extends StObject
       with BaseLayoutOptions {
    
    // Align desired nodes in vertical/horizontal direction
    // {vertical: [['n1', 'n2'], [...]], horizontal: [['n2', 'n4'], [...]]}
    var alignmentConstraint: js.UndefOr[FcoseAlignmentConstraint] = js.undefined
    
    // Whether or not to animate the layout
    var animate: js.UndefOr[Boolean] = js.undefined
    
    // Duration of animation in ms, if enabled
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    // Easing of animation, if enabled
    var animationEasing: js.UndefOr[`ease-out`] = js.undefined
    
    // Divisor to compute edge forces
    var edgeElasticity: js.UndefOr[js.Function1[/* edge */ Any, Double]] = js.undefined
    
    // Fit the viewport to the repositioned nodes
    var fit: js.UndefOr[Boolean] = js.undefined
    
    /* constraint options */
    // Fix desired nodes to predefined positions
    // [{nodeId: 'n1', position: {x: 100, y: 200}}, {...}]
    var fixedNodeConstraint: js.UndefOr[js.Array[FcoseFixedNodeConstraint]] = js.undefined
    
    // Gravity force (constant)
    var gravity: js.UndefOr[Double] = js.undefined
    
    // Gravity force (constant) for compounds
    var gravityCompound: js.UndefOr[Double] = js.undefined
    
    // Gravity range (constant)
    var gravityRange: js.UndefOr[Double] = js.undefined
    
    // Gravity range (constant) for compounds
    var gravityRangeCompound: js.UndefOr[Double] = js.undefined
    
    // Ideal edge (non nested) length
    var idealEdgeLength: js.UndefOr[js.Function1[/* edge */ Any, Double]] = js.undefined
    
    // Initial cooling factor for incremental layout
    var initialEnergyOnIncremental: js.UndefOr[Double] = js.undefined
    
    @JSName("name")
    var name_FcoseLayoutOptions: fcose
    
    // Nesting factor (multiplier) to compute ideal edge length for nested edges
    var nestingFactor: js.UndefOr[Double] = js.undefined
    
    // Whether to include labels in node dimensions. Valid in "proof" quality
    var nodeDimensionsIncludeLabels: js.UndefOr[Boolean] = js.undefined
    
    /* incremental layout options */
    // Node repulsion (non overlapping) multiplier
    var nodeRepulsion: js.UndefOr[Double] = js.undefined
    
    // Separation amount between nodes
    var nodeSeparation: js.UndefOr[Double] = js.undefined
    
    // Maximum number of iterations to perform - this is a suggested value and might be adjusted by the algorithm as required
    var numIter: js.UndefOr[Double] = js.undefined
    
    // Whether to pack disconnected components - cytoscape-layout-utilities extension should be registered and initialized
    var packComponents: js.UndefOr[Boolean] = js.undefined
    
    // Padding around layout
    var padding: js.UndefOr[Double] = js.undefined
    
    // Power iteration tolerance
    var piTol: js.UndefOr[Double] = js.undefined
    
    // 'draft', 'default' or 'proof'
    // - "draft" only applies spectral layout
    // - "default" improves the quality with incremental layout (fast cooling rate)
    // - "proof" improves the quality with incremental layout (slow cooling rate)
    var quality: js.UndefOr[default | draft | proof] = js.undefined
    
    // Use random node positions at beginning of layout
    // if this is set to false, then quality option must be "proof"
    var randomize: js.UndefOr[Boolean] = js.undefined
    
    // Place two nodes relatively in vertical/horizontal direction
    // [{top: 'n1', bottom: 'n2', gap: 100}, {left: 'n3', right: 'n4', gap: 75}, {...}]
    var relativePlacementConstraint: js.UndefOr[js.Array[FcoseRelativePlacementConstraint]] = js.undefined
    
    // Sample size to construct distance matrix
    var sampleSize: js.UndefOr[Double] = js.undefined
    
    /* spectral layout options */
    // False for random, true for greedy sampling
    var samplingType: js.UndefOr[Boolean] = js.undefined
    
    // Layout step - all, transformed, enforced, cose - for debug purpose only
    var step: js.UndefOr[all | transformed | enforced | cose] = js.undefined
    
    // For enabling tiling
    var tile: js.UndefOr[Boolean] = js.undefined
    
    // Represents the amount of the horizontal space to put between the zero degree members during the tiling operation(can also be a function)
    var tilingPaddingHorizontal: js.UndefOr[Double] = js.undefined
    
    // Represents the amount of the vertical space to put between the zero degree members during the tiling operation(can also be a function)
    var tilingPaddingVertical: js.UndefOr[Double] = js.undefined
    
    // Whether or not simple nodes (non-compound nodes) are of uniform dimensions
    var uniformNodeDimensions: js.UndefOr[Boolean] = js.undefined
  }
  object FcoseLayoutOptions {
    
    inline def apply(): FcoseLayoutOptions = {
      val __obj = js.Dynamic.literal(name = "fcose")
      __obj.asInstanceOf[FcoseLayoutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FcoseLayoutOptions] (val x: Self) extends AnyVal {
      
      inline def setAlignmentConstraint(value: FcoseAlignmentConstraint): Self = StObject.set(x, "alignmentConstraint", value.asInstanceOf[js.Any])
      
      inline def setAlignmentConstraintUndefined: Self = StObject.set(x, "alignmentConstraint", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationEasing(value: `ease-out`): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
      
      inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
      
      inline def setEdgeElasticity(value: /* edge */ Any => Double): Self = StObject.set(x, "edgeElasticity", js.Any.fromFunction1(value))
      
      inline def setEdgeElasticityUndefined: Self = StObject.set(x, "edgeElasticity", js.undefined)
      
      inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setFixedNodeConstraint(value: js.Array[FcoseFixedNodeConstraint]): Self = StObject.set(x, "fixedNodeConstraint", value.asInstanceOf[js.Any])
      
      inline def setFixedNodeConstraintUndefined: Self = StObject.set(x, "fixedNodeConstraint", js.undefined)
      
      inline def setFixedNodeConstraintVarargs(value: FcoseFixedNodeConstraint*): Self = StObject.set(x, "fixedNodeConstraint", js.Array(value*))
      
      inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityCompound(value: Double): Self = StObject.set(x, "gravityCompound", value.asInstanceOf[js.Any])
      
      inline def setGravityCompoundUndefined: Self = StObject.set(x, "gravityCompound", js.undefined)
      
      inline def setGravityRange(value: Double): Self = StObject.set(x, "gravityRange", value.asInstanceOf[js.Any])
      
      inline def setGravityRangeCompound(value: Double): Self = StObject.set(x, "gravityRangeCompound", value.asInstanceOf[js.Any])
      
      inline def setGravityRangeCompoundUndefined: Self = StObject.set(x, "gravityRangeCompound", js.undefined)
      
      inline def setGravityRangeUndefined: Self = StObject.set(x, "gravityRange", js.undefined)
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setIdealEdgeLength(value: /* edge */ Any => Double): Self = StObject.set(x, "idealEdgeLength", js.Any.fromFunction1(value))
      
      inline def setIdealEdgeLengthUndefined: Self = StObject.set(x, "idealEdgeLength", js.undefined)
      
      inline def setInitialEnergyOnIncremental(value: Double): Self = StObject.set(x, "initialEnergyOnIncremental", value.asInstanceOf[js.Any])
      
      inline def setInitialEnergyOnIncrementalUndefined: Self = StObject.set(x, "initialEnergyOnIncremental", js.undefined)
      
      inline def setName(value: fcose): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNestingFactor(value: Double): Self = StObject.set(x, "nestingFactor", value.asInstanceOf[js.Any])
      
      inline def setNestingFactorUndefined: Self = StObject.set(x, "nestingFactor", js.undefined)
      
      inline def setNodeDimensionsIncludeLabels(value: Boolean): Self = StObject.set(x, "nodeDimensionsIncludeLabels", value.asInstanceOf[js.Any])
      
      inline def setNodeDimensionsIncludeLabelsUndefined: Self = StObject.set(x, "nodeDimensionsIncludeLabels", js.undefined)
      
      inline def setNodeRepulsion(value: Double): Self = StObject.set(x, "nodeRepulsion", value.asInstanceOf[js.Any])
      
      inline def setNodeRepulsionUndefined: Self = StObject.set(x, "nodeRepulsion", js.undefined)
      
      inline def setNodeSeparation(value: Double): Self = StObject.set(x, "nodeSeparation", value.asInstanceOf[js.Any])
      
      inline def setNodeSeparationUndefined: Self = StObject.set(x, "nodeSeparation", js.undefined)
      
      inline def setNumIter(value: Double): Self = StObject.set(x, "numIter", value.asInstanceOf[js.Any])
      
      inline def setNumIterUndefined: Self = StObject.set(x, "numIter", js.undefined)
      
      inline def setPackComponents(value: Boolean): Self = StObject.set(x, "packComponents", value.asInstanceOf[js.Any])
      
      inline def setPackComponentsUndefined: Self = StObject.set(x, "packComponents", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPiTol(value: Double): Self = StObject.set(x, "piTol", value.asInstanceOf[js.Any])
      
      inline def setPiTolUndefined: Self = StObject.set(x, "piTol", js.undefined)
      
      inline def setQuality(value: default | draft | proof): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      inline def setRelativePlacementConstraint(value: js.Array[FcoseRelativePlacementConstraint]): Self = StObject.set(x, "relativePlacementConstraint", value.asInstanceOf[js.Any])
      
      inline def setRelativePlacementConstraintUndefined: Self = StObject.set(x, "relativePlacementConstraint", js.undefined)
      
      inline def setRelativePlacementConstraintVarargs(value: FcoseRelativePlacementConstraint*): Self = StObject.set(x, "relativePlacementConstraint", js.Array(value*))
      
      inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
      
      inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
      
      inline def setSamplingType(value: Boolean): Self = StObject.set(x, "samplingType", value.asInstanceOf[js.Any])
      
      inline def setSamplingTypeUndefined: Self = StObject.set(x, "samplingType", js.undefined)
      
      inline def setStep(value: all | transformed | enforced | cose): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTile(value: Boolean): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
      
      inline def setTilingPaddingHorizontal(value: Double): Self = StObject.set(x, "tilingPaddingHorizontal", value.asInstanceOf[js.Any])
      
      inline def setTilingPaddingHorizontalUndefined: Self = StObject.set(x, "tilingPaddingHorizontal", js.undefined)
      
      inline def setTilingPaddingVertical(value: Double): Self = StObject.set(x, "tilingPaddingVertical", value.asInstanceOf[js.Any])
      
      inline def setTilingPaddingVerticalUndefined: Self = StObject.set(x, "tilingPaddingVertical", js.undefined)
      
      inline def setUniformNodeDimensions(value: Boolean): Self = StObject.set(x, "uniformNodeDimensions", value.asInstanceOf[js.Any])
      
      inline def setUniformNodeDimensionsUndefined: Self = StObject.set(x, "uniformNodeDimensions", js.undefined)
    }
  }
  
  trait FcoseRelativeHorizontalPlacementConstraint
    extends StObject
       with FcoseRelativePlacementConstraint {
    
    var gap: Double
    
    var left: String
    
    var right: String
  }
  object FcoseRelativeHorizontalPlacementConstraint {
    
    inline def apply(gap: Double, left: String, right: String): FcoseRelativeHorizontalPlacementConstraint = {
      val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[FcoseRelativeHorizontalPlacementConstraint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FcoseRelativeHorizontalPlacementConstraint] (val x: Self) extends AnyVal {
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cytoscapeFcose.mod.FcoseRelativeVerticalPlacementConstraint
    - typings.cytoscapeFcose.mod.FcoseRelativeHorizontalPlacementConstraint
  */
  trait FcoseRelativePlacementConstraint extends StObject
  object FcoseRelativePlacementConstraint {
    
    inline def FcoseRelativeHorizontalPlacementConstraint(gap: Double, left: String, right: String): typings.cytoscapeFcose.mod.FcoseRelativeHorizontalPlacementConstraint = {
      val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cytoscapeFcose.mod.FcoseRelativeHorizontalPlacementConstraint]
    }
    
    inline def FcoseRelativeVerticalPlacementConstraint(bottom: String, gap: Double, top: String): typings.cytoscapeFcose.mod.FcoseRelativeVerticalPlacementConstraint = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cytoscapeFcose.mod.FcoseRelativeVerticalPlacementConstraint]
    }
  }
  
  trait FcoseRelativeVerticalPlacementConstraint
    extends StObject
       with FcoseRelativePlacementConstraint {
    
    var bottom: String
    
    var gap: Double
    
    var top: String
  }
  object FcoseRelativeVerticalPlacementConstraint {
    
    inline def apply(bottom: String, gap: Double, top: String): FcoseRelativeVerticalPlacementConstraint = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[FcoseRelativeVerticalPlacementConstraint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FcoseRelativeVerticalPlacementConstraint] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
}
