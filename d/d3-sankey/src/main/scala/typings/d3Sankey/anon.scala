package typings.d3Sankey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined d3-sankey.d3-sankey.SankeyLink<{}, {}> */
  trait SankeyLink extends StObject {
    
    /**
      * Link's zero-based index within the array of links calculated by Sankey layout generator.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Link's source node. For convenience, when initializing a Sankey layout using the default node id accessor,
      * source may be the zero-based index of the corresponding node in the nodes array
      * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
      * the Sankey layout can be configured with a custom node ID accessor to resolve the source node of the link upon initialization.
      *
      * Once the Sankey generator is invoked to return the Sankey graph object,
      * the numeric index will be replaced with the corresponding source node object.
      */
    var source: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object])
    
    /**
      * Link's target node. For convenience, when initializing a Sankey layout using the default node id accessor,
      * target may be the zero-based index of the corresponding node in the nodes array
      * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
      * the Sankey layout can be configured with a custom node ID accessor to resolve the target node of the link upon initialization.
      *
      * Once the Sankey generator is invoked to return the Sankey graph object,
      * the numeric index will be replaced with the corresponding target node object.
      */
    var target: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object])
    
    /**
      * Link's numeric value
      */
    var value: Double
    
    /**
      * Link's width (proportional to its value) calculated by Sankey layout generator.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Link's vertical starting position (at source node) calculated by Sankey layout generator.
      */
    var y0: js.UndefOr[Double] = js.undefined
    
    /**
      * Link's vertical end position (at target node) calculated by Sankey layout generator.
      */
    var y1: js.UndefOr[Double] = js.undefined
  }
  object SankeyLink {
    
    @scala.inline
    def apply(
      source: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object]),
      target: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object]),
      value: Double
    ): SankeyLink = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyLink]
    }
    
    @scala.inline
    implicit class SankeyLinkMutableBuilder[Self <: SankeyLink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setSource(value: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object])): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Double | String | (typings.d3Sankey.mod.SankeyNode[js.Object, js.Object])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    }
  }
  
  /* Inlined d3-sankey.d3-sankey.SankeyLink<{}, {}> */
  trait SankeyLinkIndex extends StObject {
    
    /**
      * Link's zero-based index within the array of links calculated by Sankey layout generator.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Link's source node. For convenience, when initializing a Sankey layout using the default node id accessor,
      * source may be the zero-based index of the corresponding node in the nodes array
      * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
      * the Sankey layout can be configured with a custom node ID accessor to resolve the source node of the link upon initialization.
      *
      * Once the Sankey generator is invoked to return the Sankey graph object,
      * the numeric index will be replaced with the corresponding source node object.
      */
    var source: Double | String | SankeyNodeDepth
    
    /**
      * Link's target node. For convenience, when initializing a Sankey layout using the default node id accessor,
      * target may be the zero-based index of the corresponding node in the nodes array
      * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
      * the Sankey layout can be configured with a custom node ID accessor to resolve the target node of the link upon initialization.
      *
      * Once the Sankey generator is invoked to return the Sankey graph object,
      * the numeric index will be replaced with the corresponding target node object.
      */
    var target: Double | String | SankeyNodeDepth
    
    /**
      * Link's numeric value
      */
    var value: Double
    
    /**
      * Link's width (proportional to its value) calculated by Sankey layout generator.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Link's vertical starting position (at source node) calculated by Sankey layout generator.
      */
    var y0: js.UndefOr[Double] = js.undefined
    
    /**
      * Link's vertical end position (at target node) calculated by Sankey layout generator.
      */
    var y1: js.UndefOr[Double] = js.undefined
  }
  object SankeyLinkIndex {
    
    @scala.inline
    def apply(
      source: Double | String | SankeyNodeDepth,
      target: Double | String | SankeyNodeDepth,
      value: Double
    ): SankeyLinkIndex = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyLinkIndex]
    }
    
    @scala.inline
    implicit class SankeyLinkIndexMutableBuilder[Self <: SankeyLinkIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setSource(value: Double | String | SankeyNodeDepth): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Double | String | SankeyNodeDepth): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    }
  }
  
  /* Inlined d3-sankey.d3-sankey.SankeyNode<{}, {}> */
  trait SankeyNode extends StObject {
    
    /**
      * Node’s zero-based graph depth, derived from the graph topology calculated by Sankey layout generator.
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Node’s zero-based graph height, derived from the graph topology calculated by Sankey layout generator.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Node’s zero-based index within the array of nodes calculated by Sankey layout generator.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Array of outgoing links which have this node as their source.
      * This property is calculated internally by the Sankey layout generator.
      */
    var sourceLinks: js.UndefOr[js.Array[SankeyLink]] = js.undefined
    
    /**
      * Array of incoming links which have this node as their target.
      * This property is calculated internally by the Sankey layout generator.
      */
    var targetLinks: js.UndefOr[js.Array[SankeyLink]] = js.undefined
    
    /**
      * Node's value calculated by Sankey layout Generator;
      * the sum of link.value for the node’s incoming links.
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /**
      * Node's minimum horizontal position (derived from the node.depth) calculated by Sankey layout generator.
      */
    var x0: js.UndefOr[Double] = js.undefined
    
    /**
      * Node’s maximum horizontal position (node.x0 + sankey.nodeWidth) calculated by Sankey layout generator.
      */
    var x1: js.UndefOr[Double] = js.undefined
    
    /**
      * Node's minimum vertical position calculated by Sankey layout generator.
      */
    var y0: js.UndefOr[Double] = js.undefined
    
    /**
      * Node's maximum vertical position (node.y1 - node.y0 is proportional to node.value) calculated by Sankey layout generator.
      */
    var y1: js.UndefOr[Double] = js.undefined
  }
  object SankeyNode {
    
    @scala.inline
    def apply(): SankeyNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SankeyNode]
    }
    
    @scala.inline
    implicit class SankeyNodeMutableBuilder[Self <: SankeyNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setSourceLinks(value: js.Array[SankeyLink]): Self = StObject.set(x, "sourceLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceLinksUndefined: Self = StObject.set(x, "sourceLinks", js.undefined)
      
      @scala.inline
      def setSourceLinksVarargs(value: SankeyLink*): Self = StObject.set(x, "sourceLinks", js.Array(value :_*))
      
      @scala.inline
      def setTargetLinks(value: js.Array[SankeyLink]): Self = StObject.set(x, "targetLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetLinksUndefined: Self = StObject.set(x, "targetLinks", js.undefined)
      
      @scala.inline
      def setTargetLinksVarargs(value: SankeyLink*): Self = StObject.set(x, "targetLinks", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      @scala.inline
      def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    }
  }
  
  /* Inlined d3-sankey.d3-sankey.SankeyNode<{}, {}> */
  trait SankeyNodeDepth extends StObject {
    
    /**
      * Node’s zero-based graph depth, derived from the graph topology calculated by Sankey layout generator.
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Node’s zero-based graph height, derived from the graph topology calculated by Sankey layout generator.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Node’s zero-based index within the array of nodes calculated by Sankey layout generator.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Array of outgoing links which have this node as their source.
      * This property is calculated internally by the Sankey layout generator.
      */
    var sourceLinks: js.UndefOr[js.Array[typings.d3Sankey.mod.SankeyLink[js.Object, js.Object]]] = js.undefined
    
    /**
      * Array of incoming links which have this node as their target.
      * This property is calculated internally by the Sankey layout generator.
      */
    var targetLinks: js.UndefOr[js.Array[typings.d3Sankey.mod.SankeyLink[js.Object, js.Object]]] = js.undefined
    
    /**
      * Node's value calculated by Sankey layout Generator;
      * the sum of link.value for the node’s incoming links.
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /**
      * Node's minimum horizontal position (derived from the node.depth) calculated by Sankey layout generator.
      */
    var x0: js.UndefOr[Double] = js.undefined
    
    /**
      * Node’s maximum horizontal position (node.x0 + sankey.nodeWidth) calculated by Sankey layout generator.
      */
    var x1: js.UndefOr[Double] = js.undefined
    
    /**
      * Node's minimum vertical position calculated by Sankey layout generator.
      */
    var y0: js.UndefOr[Double] = js.undefined
    
    /**
      * Node's maximum vertical position (node.y1 - node.y0 is proportional to node.value) calculated by Sankey layout generator.
      */
    var y1: js.UndefOr[Double] = js.undefined
  }
  object SankeyNodeDepth {
    
    @scala.inline
    def apply(): SankeyNodeDepth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SankeyNodeDepth]
    }
    
    @scala.inline
    implicit class SankeyNodeDepthMutableBuilder[Self <: SankeyNodeDepth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setSourceLinks(value: js.Array[typings.d3Sankey.mod.SankeyLink[js.Object, js.Object]]): Self = StObject.set(x, "sourceLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceLinksUndefined: Self = StObject.set(x, "sourceLinks", js.undefined)
      
      @scala.inline
      def setSourceLinksVarargs(value: (typings.d3Sankey.mod.SankeyLink[js.Object, js.Object])*): Self = StObject.set(x, "sourceLinks", js.Array(value :_*))
      
      @scala.inline
      def setTargetLinks(value: js.Array[typings.d3Sankey.mod.SankeyLink[js.Object, js.Object]]): Self = StObject.set(x, "targetLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetLinksUndefined: Self = StObject.set(x, "targetLinks", js.undefined)
      
      @scala.inline
      def setTargetLinksVarargs(value: (typings.d3Sankey.mod.SankeyLink[js.Object, js.Object])*): Self = StObject.set(x, "targetLinks", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      @scala.inline
      def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    }
  }
}
