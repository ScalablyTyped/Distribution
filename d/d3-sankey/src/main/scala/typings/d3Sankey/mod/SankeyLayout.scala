package typings.d3Sankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SankeyLayout[Data, N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends js.Object {
  
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
