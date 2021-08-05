package typings.d3Sankey

import org.scalablytyped.runtime.StringDictionary
import typings.d3Sankey.anon.SankeyLinkIndex
import typings.d3Shape.mod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-sankey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sankey(): SankeyLayout[SankeyGraph[js.Object, js.Object], js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankey")().asInstanceOf[SankeyLayout[SankeyGraph[js.Object, js.Object], js.Object, js.Object]]
  
  inline def sankeyCenter(node: typings.d3Sankey.anon.SankeyNode, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sankeyCenter")(node.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sankeyJustify(node: typings.d3Sankey.anon.SankeyNode, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sankeyJustify")(node.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sankeyLeft(node: typings.d3Sankey.anon.SankeyNode, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sankeyLeft")(node.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sankeyLinkHorizontal(): Link[js.Any, SankeyLinkIndex, js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankeyLinkHorizontal")().asInstanceOf[Link[js.Any, SankeyLinkIndex, js.Tuple2[Double, Double]]]
  
  inline def sankeyLinkHorizontal_N_SankeyExtraPropertiesL_SankeyExtraProperties[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): Link[js.Any, SankeyLink[N, L], js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankeyLinkHorizontal")().asInstanceOf[Link[js.Any, SankeyLink[N, L], js.Tuple2[Double, Double]]]
  
  inline def sankeyRight(node: typings.d3Sankey.anon.SankeyNode, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sankeyRight")(node.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sankey_DataN_SankeyExtraPropertiesL_SankeyExtraProperties[Data, N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): SankeyLayout[Data, N, L] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankey")().asInstanceOf[SankeyLayout[Data, N, L]]
  
  inline def sankey_N_SankeyExtraPropertiesL_SankeyExtraProperties[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): SankeyLayout[SankeyGraph[N, L], N, L] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankey")().asInstanceOf[SankeyLayout[SankeyGraph[N, L], N, L]]
  
  type SankeyExtraProperties = StringDictionary[js.Any]
  
  trait SankeyGraph[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends StObject {
    
    /**
      * Array of Sankey diagram links
      */
    var links: js.Array[SankeyLink[N, L]]
    
    /**
      * Array of Sankey diagram nodes
      */
    var nodes: js.Array[SankeyNode[N, L]]
  }
  object SankeyGraph {
    
    inline def apply[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](links: js.Array[SankeyLink[N, L]], nodes: js.Array[SankeyNode[N, L]]): SankeyGraph[N, L] = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyGraph[N, L]]
    }
    
    extension [Self <: SankeyGraph[?, ?], N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](x: Self & (SankeyGraph[N, L])) {
      
      inline def setLinks(value: js.Array[SankeyLink[N, L]]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: (SankeyLink[N, L])*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      inline def setNodes(value: js.Array[SankeyNode[N, L]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: (SankeyNode[N, L])*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SankeyLayout[Data, N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends StObject {
    
    /**
      * Computes the node and link positions for the given arguments, returning a graph representing the Sankey layout.
      *
      * @param data Data object being passed as the first argument to the nodes and links accessor functions. Additional arguments will also be passed
      * to the accessor functions.
      */
    def apply(data: Data, args: js.Any*): SankeyGraph[N, L] = js.native
    
    /**
      * Return the current extent which defaults to [[0, 0], [1, 1]].
      */
    def extent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    /**
      * Set the extent of the Sankey layout to the specified bounds and returns this Sankey layout generator.
      *
      * @param extent Extent bounds for the layout. The extent bounds are specified as an array [[x0, y0], [x1, y1]],
      * where x0 is the left side of the extent, y0 is the top, x1 is the right and y1 is the bottom. The default is [[0, 0], [1, 1]].
      */
    def extent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
    
    /**
      * Return the current number of relaxation iterations, which defaults to 32.
      */
    def iterations(): Double = js.native
    /**
      * Set the number of relaxation iterations when generating the layout and return this Sankey layout generator.
      *
      * @param iterations Number of relaxation iterations, which defaults to 32.
      */
    def iterations(iterations: Double): this.type = js.native
    
    /**
      * Return the current links accessor function, which defaults to a function returning the "links" property of the
      * first argument it is invoked with.
      */
    def links(): js.Function2[/* data */ Data, /* repeated */ js.Any, js.Array[SankeyLink[N, L]]] = js.native
    /**
      * Set the Sankey generator's links accessor to a function returning the specified array of objects and returns this Sankey layout generator.
      *
      * @param links Array of links.
      */
    def links(links: js.Array[SankeyLink[N, L]]): this.type = js.native
    /**
      * Set the Sankey generator's links accessor to the specified function and returns this Sankey layout generator.
      *
      * @param links A links accessor function. The function is invoked when the Sankey layout is generated, being passed any arguments passed to the Sankey generator.
      * This function must return an array of links.
      */
    def links(links: js.Function2[/* data */ Data, /* repeated */ js.Any, js.Array[SankeyLink[N, L]]]): this.type = js.native
    
    /**
      * Return the current node alignment method, which defaults to d3.sankeyJustify.
      */
    def nodeAlign(): js.Function2[/* node */ SankeyNode[N, L], /* n */ Double, Double] = js.native
    /**
      * Set the node alignment method the specified function and return this Sankey layout generator.
      *
      * @param nodeAlign A node alignment function which is evaluated for each input node in order,
      * being passed the current node and the total depth n of the graph (one plus the maximum node.depth),
      * and must return an integer between 0 and n - 1 that indicates the desired horizontal position of the node in the generated Sankey diagram.
      */
    def nodeAlign(nodeAlign: js.Function2[/* node */ SankeyNode[N, L], /* n */ Double, Double]): this.type = js.native
    
    /**
      * Return the current node id accessor.
      * The default accessor is a function being passed in a Sankey layout node and returning its numeric node.index.
      */
    def nodeId(): js.Function1[/* node */ SankeyNode[N, L], String | Double] = js.native
    /**
      * Set the node id accessor to the specified function and return this Sankey layout generator.
      *
      * The default accessor is a function being passed in a Sankey layout node and returning its numeric node.index.
      * The default id accessor allows each link’s source and target to be specified as a zero-based index into the nodes array.
      *
      * @param nodeId A node id accessor function being passed a node in the Sankey graph and returning its id.
      */
    def nodeId(nodeId: js.Function1[/* node */ SankeyNode[N, L], String | Double]): this.type = js.native
    
    /**
      * Return the current node padding, which defaults to 8.
      *
      * Node padding refers to the vertical space between nodes which occupy the same horizontal space.
      */
    def nodePadding(): Double = js.native
    /**
      * Set the vertical separation between nodes at each column to the specified number and return this Sankey layout generator.
      *
      * @param padding Node padding, i.e. vertical separation between nodes at each column, in pixels, which defaults to 8.
      */
    def nodePadding(padding: Double): this.type = js.native
    
    /**
      * Returns the node comparison function which defaults to undefined.
      */
    def nodeSort(): js.UndefOr[js.Function2[/* a */ SankeyNode[N, L], /* b */ SankeyNode[N, L], Double]] = js.native
    /**
      * Set the node comparison function and return this Sankey layout generator.
      *
      * @param compare Node comparison function.
      */
    def nodeSort(compare: js.Function2[/* a */ SankeyNode[N, L], /* b */ SankeyNode[N, L], Double]): this.type = js.native
    
    /**
      * Return the current node width, which defaults to 24.
      */
    def nodeWidth(): Double = js.native
    /**
      * Set the node width to the specified number and return this Sankey layout generator.
      *
      * @param width Width of node in pixels, which defaults to 24.
      */
    def nodeWidth(width: Double): this.type = js.native
    
    /**
      * Return the current nodes accessor function, which defaults to a function returning the "nodes" property of the
      * first argument it is invoked with.
      */
    def nodes(): js.Function2[/* data */ Data, /* repeated */ js.Any, js.Array[SankeyNode[N, L]]] = js.native
    /**
      * Set the Sankey generator's nodes accessor to a function returning the specified array of objects and returns this Sankey layout generator.
      *
      * @param nodes Array of nodes.
      */
    def nodes(nodes: js.Array[SankeyNode[N, L]]): this.type = js.native
    /**
      * Set the Sankey generator's nodes accessor to the specified function and returns this Sankey layout generator.
      *
      * @param nodes A nodes accessor function. The function is invoked when the Sankey layout is generated, being passed any arguments passed to the Sankey generator.
      * This function must return an array of nodes.
      */
    def nodes(nodes: js.Function2[/* data */ Data, /* repeated */ js.Any, js.Array[SankeyNode[N, L]]]): this.type = js.native
    
    /**
      * Return the current layout size in pixels. The size is a two element array of [width, height] which defaults to [1, 1].
      */
    def size(): js.Tuple2[Double, Double] = js.native
    /**
      * Set the size of the layout and return this Sankey layout generator.
      * This convenience method is equivalent to using extent([[0, 0], [width, height]]).
      *
      * @param size A two element array of [width, height] in pixels which defaults to [1, 1].
      */
    def size(size: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Recomputes the specified graph’s links’ positions, updating the following properties of each link:
      *
      * - link.sy: the link’s vertical starting position (at source node)
      * - link.ty: the link’s vertical end position (at target node)
      *
      * This method is intended to be called after computing the initial Sankey layout, for example when the diagram is repositioned interactively.
      *
      * @param graph A previously initialized Sankey graph for which the link positions should be re-calculated
      */
    def update(graph: SankeyGraph[N, L]): SankeyGraph[N, L] = js.native
  }
  
  type SankeyLink[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] = L & (SankeyLinkMinimal[N, L])
  
  trait SankeyLinkMinimal[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends StObject {
    
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
    var source: Double | String | (SankeyNode[N, L])
    
    /**
      * Link's target node. For convenience, when initializing a Sankey layout using the default node id accessor,
      * target may be the zero-based index of the corresponding node in the nodes array
      * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
      * the Sankey layout can be configured with a custom node ID accessor to resolve the target node of the link upon initialization.
      *
      * Once the Sankey generator is invoked to return the Sankey graph object,
      * the numeric index will be replaced with the corresponding target node object.
      */
    var target: Double | String | (SankeyNode[N, L])
    
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
  object SankeyLinkMinimal {
    
    inline def apply[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](
      source: Double | String | (SankeyNode[N, L]),
      target: Double | String | (SankeyNode[N, L]),
      value: Double
    ): SankeyLinkMinimal[N, L] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyLinkMinimal[N, L]]
    }
    
    extension [Self <: SankeyLinkMinimal[?, ?], N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](x: Self & (SankeyLinkMinimal[N, L])) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setSource(value: Double | String | (SankeyNode[N, L])): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Double | String | (SankeyNode[N, L])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    }
  }
  
  type SankeyNode[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] = N & (SankeyNodeMinimal[N, L])
  
  trait SankeyNodeMinimal[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends StObject {
    
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
    var sourceLinks: js.UndefOr[js.Array[SankeyLink[N, L]]] = js.undefined
    
    /**
      * Array of incoming links which have this node as their target.
      * This property is calculated internally by the Sankey layout generator.
      */
    var targetLinks: js.UndefOr[js.Array[SankeyLink[N, L]]] = js.undefined
    
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
  object SankeyNodeMinimal {
    
    inline def apply[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): SankeyNodeMinimal[N, L] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SankeyNodeMinimal[N, L]]
    }
    
    extension [Self <: SankeyNodeMinimal[?, ?], N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](x: Self & (SankeyNodeMinimal[N, L])) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setSourceLinks(value: js.Array[SankeyLink[N, L]]): Self = StObject.set(x, "sourceLinks", value.asInstanceOf[js.Any])
      
      inline def setSourceLinksUndefined: Self = StObject.set(x, "sourceLinks", js.undefined)
      
      inline def setSourceLinksVarargs(value: (SankeyLink[N, L])*): Self = StObject.set(x, "sourceLinks", js.Array(value :_*))
      
      inline def setTargetLinks(value: js.Array[SankeyLink[N, L]]): Self = StObject.set(x, "targetLinks", value.asInstanceOf[js.Any])
      
      inline def setTargetLinksUndefined: Self = StObject.set(x, "targetLinks", js.undefined)
      
      inline def setTargetLinksVarargs(value: (SankeyLink[N, L])*): Self = StObject.set(x, "targetLinks", js.Array(value :_*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    }
  }
}
