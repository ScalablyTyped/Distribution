package typings
package d3DashGraphvizLib.d3DashGraphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graphviz[GElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum] extends js.Object {
  /**
    * Returns the active transition on the generated graph's top level svg with the specified name,
    * if any. Returns null if there is no such active transition on the top level svg node.
    * @param name the name of the transition
    */
  def active(): (d3DashTransitionLib.d3DashTransitionMod.Transition[GElement, Datum, PElement, PDatum]) | scala.Null = js.native
  def active(name: java.lang.String): (d3DashTransitionLib.d3DashTransitionMod.Transition[GElement, Datum, PElement, PDatum]) | scala.Null = js.native
  def addImage(path: java.lang.String, width: java.lang.String, height: java.lang.String): this.type = js.native
  def addImage(path: java.lang.String, width: java.lang.String, height: scala.Double): this.type = js.native
  def addImage(path: java.lang.String, width: scala.Double, height: java.lang.String): this.type = js.native
  // Images
  /**
    * Add an image reference. Must be called before {@link renderDot} ir {@link dot}
    * are called.
    * @param path the path of the image, may be a filename, relative or absolute path or a URL
    * @param width the width of the image, if a string is used then it may specify units. Allowed
    *               units are: in, px, pc, pt, cm, or mm. If no units are given or dimensions are
    *               given as numbers, points (pt) are used.
    * @param height the height of the image, which follows the same unit rules as width.
    */
  def addImage(path: java.lang.String, width: scala.Double, height: scala.Double): this.type = js.native
  // Customizing Graph Attributes
  /**
    *
    * @param callback
    */
  def attributer(): this.type = js.native
  def attributer(callback: d3DashSelectionLib.d3DashSelectionMod.ValueFn[GElement, Datum, scala.Unit]): this.type = js.native
  /**
    * Enables or disables conversion of polygons with an equal number of sides during shape
    * tweening.
    * @param enable true if conversion should be enabled, false if it should be disabled.
    */
  def convertEqualSidedPolygons(enable: scala.Boolean): this.type = js.native
  // Accessing Extracted Data
  /**
    * Returns the data extracted by {@link dot} or null if none exists.
    */
  def data(): Datum = js.native
  /**
    * Starts computation of the layout of a graph from the specified dotSrc string and saves the data for
    * rendering the SVG with {@link render} at a later stage.
    * @param src a string representing a valid string in the DOT language
    * @param callback
    */
  def dot(src: java.lang.String): this.type = js.native
  def dot(src: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  // Modifying an Existing Graph and Animating the Changes
  // Edges
  /**
    * Draws a straight edge from (x1, y1) to (x2, y2) using coordinates relative to top level G container element of the graph.
    * @param x1 the starting x co-ordinate
    * @param y1 the starting y co-ordinate
    * @param x2 the ending x co-ordinate
    * @param y2 the ending y co-ordinate
    * @param attributes object containing DOT attributes
    * @param options object containing the options used when drawing the edge
    */
  def drawEdge(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): this.type = js.native
  def drawEdge(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, attributes: DotAttributes): this.type = js.native
  def drawEdge(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    attributes: DotAttributes,
    options: EdgeOptions
  ): this.type = js.native
  // Nodes
  /**
    * Draws a node with the upper left corner of its bounding box at (x, y), using
    * coordinates relative to the top level G container element of the graph.
    * @param x x co-ordinate of the top-left bounding box of the node
    * @param y y co-ordinate of the top-left bounding box of the node
    * @param nodeId the ID of the node
    * @param attributes object containing DOT attributes
    * @param options object containing the options used when drawing the node, currently unused
    */
  def drawNode(x: scala.Double, y: scala.Double, nodeId: java.lang.String): this.type = js.native
  def drawNode(x: scala.Double, y: scala.Double, nodeId: java.lang.String, attributes: DotAttributes): this.type = js.native
  def drawNode(
    x: scala.Double,
    y: scala.Double,
    nodeId: java.lang.String,
    attributes: DotAttributes,
    options: js.Any
  ): this.type = js.native
  /**
    * Returns a {@link Selection} containing the edge currently being drawn. The selection is empty
    * if no edge has been drawn or the lastest drawn edge has been inserted into the graph data with
    * {@link insertDrawnNode}.
    */
  def drawnEdgeSelection(): d3DashSelectionLib.d3DashSelectionMod.Selection[GElement, Datum, PElement, PDatum] = js.native
  /**
    * Returns a {@link Selection} containing the node currently being drawn. The selection is empty
    * if no node has been drawn or the lastest drawn node has been inserted into the graph data with
    * {@link insertDrawnNode}.
    */
  def drawnNodeSelection(): d3DashSelectionLib.d3DashSelectionMod.Selection[GElement, Datum, PElement, PDatum] = js.native
  /**
    * Sets the Graphviz layout engine name to the specified engine string.
    * @param engine a string taking one of the following values:
    *            - circo
    *            - dot
    *            - fdp
    *            - neato
    *            - osage
    *            - patchwork
    *            - twopi
    */
  def engine(engine: Engine): this.type = js.native
  // Controlling Fade
  /**
    * Sets whether fade in and out of nodes is enabled.
    * @param enable true to enable fade in and out, false to disable
    */
  def fade(enable: scala.Boolean): this.type = js.native
  /**
    * Sets whether the graph's viewbox is affected by the size of its parent SVG's size
    * @param fit true, if the graph should scale to fit its parent, false if it should
    *             remain at its original size
    */
  def fit(fit: scala.Boolean): this.type = js.native
  // Controlling Animated Growth of Entering Edges
  /**
    * Sets whether animated growth of entering edges is enabled.
    * @param enable true to animate entering edges, false to disable
    */
  def growEnteringEdges(enable: scala.Boolean): this.type = js.native
  /**
    * Sets the SVG height attribute
    * @param height the height in pixels
    */
  def height(height: scala.Double): this.type = js.native
  /**
    * Inserts the edge into the graph data, making it available for an animated
    * transition into a subsequent new layout.
    * @param name the name of the edge.
    */
  def insertDrawnEdge(name: java.lang.String): this.type = js.native
  /**
    * Inserts the node into the graph data, making it available for an animated
    * transition into a subsequent new layout.
    * @param nodeId the ID of the node
    */
  def insertDrawnNode(nodeId: java.lang.String): this.type = js.native
  // Maintaining Object Constancy
  /**
    * Sets the key mode to the the provided mode string. Must be set before passing in
    * any DOT strings.
    * @param keyMode
    */
  def keyMode(keyMode: KeyMode): this.type = js.native
  /**
    * Sets whether events are logged or not.
    * @param enable true if events should be logged, false if not
    */
  def logEvents(enable: scala.Boolean): this.type = js.native
  /**
    * Updates the end point of the edge currently drawn with {@link drawEdge},
    * accepting the same options argument. This method cannot be used after the
    * edge has been inserted into the graph data with {@link insertDrawnEdge}.
    * @param x2 the ending x co-ordinate
    * @param y2 the ending y co-ordinate
    * @param options object containing the options used when drawing the edge
    */
  def moveDrawnEdgeEndPoint(x2: scala.Double, y2: scala.Double): this.type = js.native
  def moveDrawnEdgeEndPoint(x2: scala.Double, y2: scala.Double, options: EdgeOptions): this.type = js.native
  /**
    * Updates the position of the upper left corner of the node currently drawn
    * with {@link drawNode}, accepting the same options argument. This method
    * cannot be used after the node has been inserted into the graph data with
    * {@link insertDrawnNode}.
    * @param x new x co-ordinate of the top-left bounding box of the node
    * @param y new y co-ordinate of the top-left bounding box of the node
    * @param options object containing the options used when drawing the node, currently unused
    */
  def moveDrawnNode(x: scala.Double, y: scala.Double): this.type = js.native
  def moveDrawnNode(x: scala.Double, y: scala.Double, options: js.Any): this.type = js.native
  // Control Flow
  /**
    * Adds or removes a listener to the graphviz renderer instance for the specified event typenames.
    * @param typenames
    * @param callback
    */
  def on(typenames: TypeNames): this.type = js.native
  def on(typenames: TypeNames, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Sets the callback that is called if the layout computation encounters
    * an error. If no callback is passed then it removes the existing callback.
    * @param callback the call back function triggered by an error
    */
  def onerror(): this.type = js.native
  def onerror(callback: js.Function1[/* errorMessage */ js.Any, scala.Unit]): this.type = js.native
  // Options
  /**
    * Gets the currently set options object on the renderer
    */
  def options(): GraphvizOptions = js.native
  /**
    * Sets the options provided. Does not overwrite existing options that are not
    * provided in the options parameter.
    * @param options the options to set on the renderer
    */
  def options(options: GraphvizOptions): this.type = js.native
  /**
    * Removes the edge currently drawn with {@link drawEdge}. This method cannot
    * be used after the edge has been inserted into the graph data with
    * {@link insertDrawnEdge}.
    */
  def removeDrawnEdge(): this.type = js.native
  /**
    * Removes the node currently drawn with {@link drawNode}. This method cannot
    * be used after the node has been inserted into the graph data with {@link insertDrawnNode}.
    */
  def removeDrawnNode(): this.type = js.native
  /**
    * Starts rendering of an SVG graph from data saved by {@link dot} and appends it to the selection
    * the grapviz renderer instance was generated on.
    * @param callback
    */
  def render(): this.type = js.native
  def render(callback: js.Function0[scala.Unit]): this.type = js.native
  // Rendering
  /**
    * Renders an SVG graph from the specified src string and appends it to the selection the grapviz
    * renderer instance was generated on.
    * @param src a string representing a valid string in the DOT language
    * @param callback
    */
  def renderDot(src: java.lang.String): this.type = js.native
  def renderDot(src: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Resets any transformations made by panning and zooming.
    * @param transition an optional transition to apply during reset.
    */
  def resetZoom(): this.type = js.native
  def resetZoom(transition: d3DashTransitionLib.d3DashTransitionMod.Transition[GElement, Datum, PElement, PDatum]): this.type = js.native
  def resetZoom(transition: java.lang.String): this.type = js.native
  /**
    * Sets the value the graph should scale by in relation to its parent SVG. Scaling
    * only occurs if fit is set to true
    * @param scale the scale value with 1.0 being 100%, 0.5 being 50% etc.
    */
  def scale(scale: scala.Double): this.type = js.native
  // Large Graphs
  /**
    * Sets the total memory available to Viz.js to size bytes, which should be a power of 2.
    * @param size the size in bytes of memory allocated to Viz.js
    */
  def totalMemory(size: scala.Double): this.type = js.native
  // Creating Transitions
  /**
    * Applies the specified transition name to subsequent SVG rendering. Accepts the same arguments
    * as {@link d3-select.transition} or a function, but returns the graph renderer instance, not the
    * transition. If name is a function, it is taken to be a transition factory. A transition factory
    * is a function that returns a transition.
    * @param name either a function returning a transition, a transition object or a string naming a
    *              transition
    */
  def transition(): this.type = js.native
  def transition(
    name: js.Function0[
      (d3DashTransitionLib.d3DashTransitionMod.Transition[GElement, Datum, PElement, PDatum]) | java.lang.String
    ]
  ): this.type = js.native
  // Controlling Path Tweening
  /**
    * Enables or disables path tweening
    * @param enable true if path tweening should be enabled, false if it should be disabled
    */
  def tweenPaths(enable: scala.Boolean): this.type = js.native
  def tweenPrecision(precision: java.lang.String): this.type = js.native
  /**
    * Sets the precision of path tweening. If precision is a number, sets the precision used
    * during path tweening to precision points. The precision is the length of each path
    * segment during tweening. If instead precision is a string containing '%', sets the
    * relative precision.
    * @param precision the precision as either a number of a string containing a percentage
    */
  def tweenPrecision(precision: scala.Double): this.type = js.native
  // Controlling Shape Tweening
  /**
    * Enables or disables shape tweening during transitions. Implicitly sets path tweening
    * as enabled due to SVGs handling for them.
    * @param enable true if shape tweening should be enabled, false if it should be disabled
    */
  def tweenShapes(enable: scala.Boolean): this.type = js.native
  /**
    * Updates properties and attributes of the edge currently drawn with {@link drawEdge},
    * using the same arguments. This method cannot be used after the edge has been inserted
    * into the graph data with {@link insertDrawnEdge.}
    * @param x1 the starting x co-ordinate
    * @param y1 the starting y co-ordinate
    * @param x2 the ending x co-ordinate
    * @param y2 the ending y co-ordinate
    * @param attributes object containing DOT attributes
    * @param options object containing the options used when drawing the edge
    */
  def updateDrawnEdge(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): this.type = js.native
  def updateDrawnEdge(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, attributes: DotAttributes): this.type = js.native
  def updateDrawnEdge(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    attributes: DotAttributes,
    options: EdgeOptions
  ): this.type = js.native
  /**
    * Updates properties and attributes of the node currently drawn with {@link drawNode},
    * using the same arguments. This method cannot be used after the node has been inserted
    *  into the graph data with {@link insertDrawnNode}.
    * @param x x co-ordinate of the top-left bounding box of the node
    * @param y y co-ordinate of the top-left bounding box of the node
    * @param nodeId the ID of the node
    * @param attributes object containing DOT attributes
    * @param options object containing the options used when drawing the node, currently unused
    */
  def updateDrawnNode(x: scala.Double, y: scala.Double, nodeId: java.lang.String): this.type = js.native
  def updateDrawnNode(x: scala.Double, y: scala.Double, nodeId: java.lang.String, attributes: DotAttributes): this.type = js.native
  def updateDrawnNode(
    x: scala.Double,
    y: scala.Double,
    nodeId: java.lang.String,
    attributes: DotAttributes,
    options: js.Any
  ): this.type = js.native
  // Controlling SVG and Graph Size
  /**
    * Sets the SVG width attribute.
    * @param width the width in pixels
    */
  def width(width: scala.Double): this.type = js.native
  // Controlling Panning & Zooming
  /**
    * Enables or disables zooming and panning.
    * @param enable true if zooming should be enabled, false if it should be disabled.
    */
  def zoom(enable: scala.Boolean): this.type = js.native
  /**
    * Returns the zoom behaviour of a graph. If the zoom is disable or the graph has not
    * yet been rendered then returns null.
    */
  def zoomBehavior(): (d3DashZoomLib.d3DashZoomMod.ZoomBehavior[stdLib.Element, Datum]) | scala.Null = js.native
  /**
    * Sets the scale extend for zooming where the first number is the minimum allowed zoom
    * and the second is the maximum.
    * @param extent a tuple containing the minimum and maximum allowed zoom
    */
  def zoomScaleExtent(): this.type = js.native
  def zoomScaleExtent(extent: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
  /**
    * Returns the selection to which zoom behaviour has been applied. If zoom is disabled
    * or the graph has not yet been rendered then returns null.
    */
  def zoomSelection(): stdLib.Element | scala.Null = js.native
  /**
    * Sets the translate extent which restricts panning.
    * @param extent a tuple of the form ((x0, y0), (x1, y1)) where (x0, y0) is the top-left
    *               corner of the "world" and (x1, y1) is the bottom-right corner
    */
  def zoomTranslateExtent(): this.type = js.native
  def zoomTranslateExtent(extent: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]): this.type = js.native
}

