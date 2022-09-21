package typings.d3Graphviz

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Selection.mod.ValueFn
import typings.d3Transition.mod.Transition_
import typings.d3Zoom.mod.ZoomBehavior
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-graphviz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def graphviz(selector: String): Graphviz_[BaseType, Any, BaseType, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("graphviz")(selector.asInstanceOf[js.Any]).asInstanceOf[Graphviz_[BaseType, Any, BaseType, Any]]
  inline def graphviz(selector: String, options: Boolean): Graphviz_[BaseType, Any, BaseType, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphviz")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Graphviz_[BaseType, Any, BaseType, Any]]
  inline def graphviz(selector: String, options: GraphvizOptions): Graphviz_[BaseType, Any, BaseType, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphviz")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Graphviz_[BaseType, Any, BaseType, Any]]
  inline def graphviz(selector: BaseType): Graphviz_[BaseType, Any, BaseType, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("graphviz")(selector.asInstanceOf[js.Any]).asInstanceOf[Graphviz_[BaseType, Any, BaseType, Any]]
  inline def graphviz(selector: BaseType, options: Boolean): Graphviz_[BaseType, Any, BaseType, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphviz")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Graphviz_[BaseType, Any, BaseType, Any]]
  inline def graphviz(selector: BaseType, options: GraphvizOptions): Graphviz_[BaseType, Any, BaseType, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphviz")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Graphviz_[BaseType, Any, BaseType, Any]]
  
  trait DotAttributes extends StObject {
    
    var URL: js.UndefOr[Any] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var tooltip: js.UndefOr[Any] = js.undefined
  }
  object DotAttributes {
    
    inline def apply(): DotAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotAttributes]
    }
    
    extension [Self <: DotAttributes](x: Self) {
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltip(value: Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setURL(value: Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  trait EdgeOptions extends StObject {
    
    var shortening: Double
  }
  object EdgeOptions {
    
    inline def apply(shortening: Double): EdgeOptions = {
      val __obj = js.Dynamic.literal(shortening = shortening.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeOptions]
    }
    
    extension [Self <: EdgeOptions](x: Self) {
      
      inline def setShortening(value: Double): Self = StObject.set(x, "shortening", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.d3Graphviz.d3GraphvizStrings.circo
    - typings.d3Graphviz.d3GraphvizStrings.dot
    - typings.d3Graphviz.d3GraphvizStrings.fdp
    - typings.d3Graphviz.d3GraphvizStrings.neato
    - typings.d3Graphviz.d3GraphvizStrings.osage
    - typings.d3Graphviz.d3GraphvizStrings.patchwork
    - typings.d3Graphviz.d3GraphvizStrings.twopi
  */
  trait Engine extends StObject
  object Engine {
    
    inline def circo: typings.d3Graphviz.d3GraphvizStrings.circo = "circo".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.circo]
    
    inline def dot: typings.d3Graphviz.d3GraphvizStrings.dot = "dot".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.dot]
    
    inline def fdp: typings.d3Graphviz.d3GraphvizStrings.fdp = "fdp".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.fdp]
    
    inline def neato: typings.d3Graphviz.d3GraphvizStrings.neato = "neato".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.neato]
    
    inline def osage: typings.d3Graphviz.d3GraphvizStrings.osage = "osage".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.osage]
    
    inline def patchwork: typings.d3Graphviz.d3GraphvizStrings.patchwork = "patchwork".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.patchwork]
    
    inline def twopi: typings.d3Graphviz.d3GraphvizStrings.twopi = "twopi".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.twopi]
  }
  
  trait GraphvizOptions extends StObject {
    
    var convertEqualSidedPolygons: js.UndefOr[Boolean] = js.undefined
    
    var engine: js.UndefOr[Engine] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var fit: js.UndefOr[Boolean] = js.undefined
    
    var growEnteringEdges: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var keyMode: js.UndefOr[KeyMode] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var totalMemory: js.UndefOr[Double] = js.undefined
    
    var tweenPaths: js.UndefOr[Boolean] = js.undefined
    
    var tweenPrecision: js.UndefOr[Double | String] = js.undefined
    
    var tweenShapes: js.UndefOr[Boolean] = js.undefined
    
    var useWorker: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var zoom: js.UndefOr[Boolean] = js.undefined
    
    var zoomScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var zoomTranslateExtent: js.UndefOr[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.undefined
  }
  object GraphvizOptions {
    
    inline def apply(): GraphvizOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphvizOptions]
    }
    
    extension [Self <: GraphvizOptions](x: Self) {
      
      inline def setConvertEqualSidedPolygons(value: Boolean): Self = StObject.set(x, "convertEqualSidedPolygons", value.asInstanceOf[js.Any])
      
      inline def setConvertEqualSidedPolygonsUndefined: Self = StObject.set(x, "convertEqualSidedPolygons", js.undefined)
      
      inline def setEngine(value: Engine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setGrowEnteringEdges(value: Boolean): Self = StObject.set(x, "growEnteringEdges", value.asInstanceOf[js.Any])
      
      inline def setGrowEnteringEdgesUndefined: Self = StObject.set(x, "growEnteringEdges", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKeyMode(value: KeyMode): Self = StObject.set(x, "keyMode", value.asInstanceOf[js.Any])
      
      inline def setKeyModeUndefined: Self = StObject.set(x, "keyMode", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setTotalMemory(value: Double): Self = StObject.set(x, "totalMemory", value.asInstanceOf[js.Any])
      
      inline def setTotalMemoryUndefined: Self = StObject.set(x, "totalMemory", js.undefined)
      
      inline def setTweenPaths(value: Boolean): Self = StObject.set(x, "tweenPaths", value.asInstanceOf[js.Any])
      
      inline def setTweenPathsUndefined: Self = StObject.set(x, "tweenPaths", js.undefined)
      
      inline def setTweenPrecision(value: Double | String): Self = StObject.set(x, "tweenPrecision", value.asInstanceOf[js.Any])
      
      inline def setTweenPrecisionUndefined: Self = StObject.set(x, "tweenPrecision", js.undefined)
      
      inline def setTweenShapes(value: Boolean): Self = StObject.set(x, "tweenShapes", value.asInstanceOf[js.Any])
      
      inline def setTweenShapesUndefined: Self = StObject.set(x, "tweenShapes", js.undefined)
      
      inline def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
      
      inline def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomScaleExtent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zoomScaleExtent", value.asInstanceOf[js.Any])
      
      inline def setZoomScaleExtentUndefined: Self = StObject.set(x, "zoomScaleExtent", js.undefined)
      
      inline def setZoomTranslateExtent(value: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Self = StObject.set(x, "zoomTranslateExtent", value.asInstanceOf[js.Any])
      
      inline def setZoomTranslateExtentUndefined: Self = StObject.set(x, "zoomTranslateExtent", js.undefined)
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait Graphviz_[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends StObject {
    
    /**
      * Returns the active transition on the generated graph's top level svg with the specified name,
      * if any. Returns null if there is no such active transition on the top level svg node.
      * @param name the name of the transition
      */
    def active(): (Transition_[GElement, Datum, PElement, PDatum]) | Null = js.native
    def active(name: String): (Transition_[GElement, Datum, PElement, PDatum]) | Null = js.native
    
    def addImage(path: String, width: String, height: String): this.type = js.native
    def addImage(path: String, width: String, height: Double): this.type = js.native
    def addImage(path: String, width: Double, height: String): this.type = js.native
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
    def addImage(path: String, width: Double, height: Double): this.type = js.native
    
    // Customizing Graph Attributes
    /**
      *
      * @param callback
      */
    def attributer(): this.type = js.native
    def attributer(callback: ValueFn[GElement, Datum, Unit]): this.type = js.native
    
    /**
      * Enables or disables conversion of polygons with an equal number of sides during shape
      * tweening.
      * @param enable true if conversion should be enabled, false if it should be disabled.
      */
    def convertEqualSidedPolygons(enable: Boolean): this.type = js.native
    
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
    def dot(src: String): this.type = js.native
    def dot(src: String, callback: js.Function0[Unit]): this.type = js.native
    
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
    def drawEdge(x1: Double, y1: Double, x2: Double, y2: Double): this.type = js.native
    def drawEdge(x1: Double, y1: Double, x2: Double, y2: Double, attributes: Unit, options: EdgeOptions): this.type = js.native
    def drawEdge(x1: Double, y1: Double, x2: Double, y2: Double, attributes: DotAttributes): this.type = js.native
    def drawEdge(x1: Double, y1: Double, x2: Double, y2: Double, attributes: DotAttributes, options: EdgeOptions): this.type = js.native
    
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
    def drawNode(x: Double, y: Double, nodeId: String): this.type = js.native
    def drawNode(x: Double, y: Double, nodeId: String, attributes: Unit, options: Any): this.type = js.native
    def drawNode(x: Double, y: Double, nodeId: String, attributes: DotAttributes): this.type = js.native
    def drawNode(x: Double, y: Double, nodeId: String, attributes: DotAttributes, options: Any): this.type = js.native
    
    /**
      * Returns a {@link Selection} containing the edge currently being drawn. The selection is empty
      * if no edge has been drawn or the lastest drawn edge has been inserted into the graph data with
      * {@link insertDrawnNode}.
      */
    def drawnEdgeSelection(): Selection_[GElement, Datum, PElement, PDatum] = js.native
    
    /**
      * Returns a {@link Selection} containing the node currently being drawn. The selection is empty
      * if no node has been drawn or the lastest drawn node has been inserted into the graph data with
      * {@link insertDrawnNode}.
      */
    def drawnNodeSelection(): Selection_[GElement, Datum, PElement, PDatum] = js.native
    
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
    def fade(enable: Boolean): this.type = js.native
    
    /**
      * Sets whether the graph's viewbox is affected by the size of its parent SVG's size
      * @param fit true, if the graph should scale to fit its parent, false if it should
      *             remain at its original size
      */
    def fit(fit: Boolean): this.type = js.native
    
    // Controlling Animated Growth of Entering Edges
    /**
      * Sets whether animated growth of entering edges is enabled.
      * @param enable true to animate entering edges, false to disable
      */
    def growEnteringEdges(enable: Boolean): this.type = js.native
    
    /**
      * Sets the SVG height attribute
      * @param height the height in pixels
      */
    def height(height: Double): this.type = js.native
    
    /**
      * Inserts the edge into the graph data, making it available for an animated
      * transition into a subsequent new layout.
      * @param name the name of the edge.
      */
    def insertDrawnEdge(name: String): this.type = js.native
    
    /**
      * Inserts the node into the graph data, making it available for an animated
      * transition into a subsequent new layout.
      * @param nodeId the ID of the node
      */
    def insertDrawnNode(nodeId: String): this.type = js.native
    
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
    def logEvents(enable: Boolean): this.type = js.native
    
    /**
      * Updates the end point of the edge currently drawn with {@link drawEdge},
      * accepting the same options argument. This method cannot be used after the
      * edge has been inserted into the graph data with {@link insertDrawnEdge}.
      * @param x2 the ending x co-ordinate
      * @param y2 the ending y co-ordinate
      * @param options object containing the options used when drawing the edge
      */
    def moveDrawnEdgeEndPoint(x2: Double, y2: Double): this.type = js.native
    def moveDrawnEdgeEndPoint(x2: Double, y2: Double, options: EdgeOptions): this.type = js.native
    
    /**
      * Updates the position of the upper left corner of the node currently drawn
      * with {@link drawNode}, accepting the same options argument. This method
      * cannot be used after the node has been inserted into the graph data with
      * {@link insertDrawnNode}.
      * @param x new x co-ordinate of the top-left bounding box of the node
      * @param y new y co-ordinate of the top-left bounding box of the node
      * @param options object containing the options used when drawing the node, currently unused
      */
    def moveDrawnNode(x: Double, y: Double): this.type = js.native
    def moveDrawnNode(x: Double, y: Double, options: Any): this.type = js.native
    
    // Control Flow
    /**
      * Adds or removes a listener to the graphviz renderer instance for the specified event typenames.
      * @param typenames
      * @param callback
      */
    def on(typenames: TypeNames): this.type = js.native
    def on(typenames: TypeNames, callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * Sets the callback that is called if the layout computation encounters
      * an error. If no callback is passed then it removes the existing callback.
      * @param callback the call back function triggered by an error
      */
    def onerror(): this.type = js.native
    def onerror(callback: js.Function1[/* errorMessage */ Any, Unit]): this.type = js.native
    
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
    def render(callback: js.Function0[Unit]): this.type = js.native
    
    // Rendering
    /**
      * Renders an SVG graph from the specified src string and appends it to the selection the grapviz
      * renderer instance was generated on.
      * @param src a string representing a valid string in the DOT language
      * @param callback
      */
    def renderDot(src: String): this.type = js.native
    def renderDot(src: String, callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * Resets any transformations made by panning and zooming.
      * @param transition an optional transition to apply during reset.
      */
    def resetZoom(): this.type = js.native
    def resetZoom(transition: String): this.type = js.native
    def resetZoom(transition: Transition_[GElement, Datum, PElement, PDatum]): this.type = js.native
    
    /**
      * Sets the value the graph should scale by in relation to its parent SVG. Scaling
      * only occurs if fit is set to true
      * @param scale the scale value with 1.0 being 100%, 0.5 being 50% etc.
      */
    def scale(scale: Double): this.type = js.native
    
    // Large Graphs
    /**
      * Sets the total memory available to Viz.js to size bytes, which should be a power of 2.
      * @param size the size in bytes of memory allocated to Viz.js
      */
    def totalMemory(size: Double): this.type = js.native
    
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
    def transition(name: js.Function0[(Transition_[GElement, Datum, PElement, PDatum]) | String]): this.type = js.native
    
    // Controlling Path Tweening
    /**
      * Enables or disables path tweening
      * @param enable true if path tweening should be enabled, false if it should be disabled
      */
    def tweenPaths(enable: Boolean): this.type = js.native
    
    def tweenPrecision(precision: String): this.type = js.native
    /**
      * Sets the precision of path tweening. If precision is a number, sets the precision used
      * during path tweening to precision points. The precision is the length of each path
      * segment during tweening. If instead precision is a string containing '%', sets the
      * relative precision.
      * @param precision the precision as either a number of a string containing a percentage
      */
    def tweenPrecision(precision: Double): this.type = js.native
    
    // Controlling Shape Tweening
    /**
      * Enables or disables shape tweening during transitions. Implicitly sets path tweening
      * as enabled due to SVGs handling for them.
      * @param enable true if shape tweening should be enabled, false if it should be disabled
      */
    def tweenShapes(enable: Boolean): this.type = js.native
    
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
    def updateDrawnEdge(x1: Double, y1: Double, x2: Double, y2: Double): this.type = js.native
    def updateDrawnEdge(x1: Double, y1: Double, x2: Double, y2: Double, attributes: Unit, options: EdgeOptions): this.type = js.native
    def updateDrawnEdge(x1: Double, y1: Double, x2: Double, y2: Double, attributes: DotAttributes): this.type = js.native
    def updateDrawnEdge(x1: Double, y1: Double, x2: Double, y2: Double, attributes: DotAttributes, options: EdgeOptions): this.type = js.native
    
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
    def updateDrawnNode(x: Double, y: Double, nodeId: String): this.type = js.native
    def updateDrawnNode(x: Double, y: Double, nodeId: String, attributes: Unit, options: Any): this.type = js.native
    def updateDrawnNode(x: Double, y: Double, nodeId: String, attributes: DotAttributes): this.type = js.native
    def updateDrawnNode(x: Double, y: Double, nodeId: String, attributes: DotAttributes, options: Any): this.type = js.native
    
    // Controlling SVG and Graph Size
    /**
      * Sets the SVG width attribute.
      * @param width the width in pixels
      */
    def width(width: Double): this.type = js.native
    
    // Controlling Panning & Zooming
    /**
      * Enables or disables zooming and panning.
      * @param enable true if zooming should be enabled, false if it should be disabled.
      */
    def zoom(enable: Boolean): this.type = js.native
    
    /**
      * Returns the zoom behaviour of a graph. If the zoom is disable or the graph has not
      * yet been rendered then returns null.
      */
    def zoomBehavior(): (ZoomBehavior[Element, Datum]) | Null = js.native
    
    /**
      * Sets the scale extend for zooming where the first number is the minimum allowed zoom
      * and the second is the maximum.
      * @param extent a tuple containing the minimum and maximum allowed zoom
      */
    def zoomScaleExtent(): this.type = js.native
    def zoomScaleExtent(extent: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Returns the selection to which zoom behaviour has been applied. If zoom is disabled
      * or the graph has not yet been rendered then returns null.
      */
    def zoomSelection(): Element | Null = js.native
    
    /**
      * Sets the translate extent which restricts panning.
      * @param extent a tuple of the form ((x0, y0), (x1, y1)) where (x0, y0) is the top-left
      *               corner of the "world" and (x1, y1) is the bottom-right corner
      */
    def zoomTranslateExtent(): this.type = js.native
    def zoomTranslateExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.d3Graphviz.d3GraphvizStrings.title
    - typings.d3Graphviz.d3GraphvizStrings.id
    - typings.d3Graphviz.d3GraphvizStrings.`tag-index`
    - typings.d3Graphviz.d3GraphvizStrings.index
  */
  trait KeyMode extends StObject
  object KeyMode {
    
    inline def id: typings.d3Graphviz.d3GraphvizStrings.id = "id".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.id]
    
    inline def index: typings.d3Graphviz.d3GraphvizStrings.index = "index".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.index]
    
    inline def `tag-index`: typings.d3Graphviz.d3GraphvizStrings.`tag-index` = "tag-index".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.`tag-index`]
    
    inline def title: typings.d3Graphviz.d3GraphvizStrings.title = "title".asInstanceOf[typings.d3Graphviz.d3GraphvizStrings.title]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.d3Graphviz.d3GraphvizStrings.initEnd
    - typings.d3Graphviz.d3GraphvizStrings.start
    - typings.d3Graphviz.d3GraphvizStrings.layoutStart
    - typings.d3Graphviz.d3GraphvizStrings.layoutEnd
    - typings.d3Graphviz.d3GraphvizStrings.dataExtractEnd
    - typings.d3Graphviz.d3GraphvizStrings.dataProcessPass1End
    - typings.d3Graphviz.d3GraphvizStrings.dataProcessPass2End
    - typings.d3Graphviz.d3GraphvizStrings.dataProcessEnd
    - typings.d3Graphviz.d3GraphvizStrings.renderStart
    - typings.d3Graphviz.d3GraphvizStrings.renderEnd
    - typings.d3Graphviz.d3GraphvizStrings.transitionStart
    - typings.d3Graphviz.d3GraphvizStrings.transitionEnd
    - typings.d3Graphviz.d3GraphvizStrings.restoreEnd
    - typings.d3Graphviz.d3GraphvizStrings.end
    - java.lang.String
  */
  type TypeNames = _TypeNames | String
  
  trait _TypeNames extends StObject
  
  /**
    * Define methods which act as extensions to d3-selection
    */
  /* augmented module */
  object d3SelectionAugmentingMod {
    
    @js.native
    trait Selection[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends StObject {
      
      /**
        * Returns a new graphviz renderer instance on the first element in the given selection. If a graphviz renderer instance already exists
        * on that element, instead returns the existing graphviz renderer instance.
        * @param options either a GraphvizOptions object representing the options of the graphviz renderer or a boolean representing the
        *                  useWorker option.
        */
      def graphviz(): Graphviz_[GElement, Datum, PElement, PDatum] = js.native
      def graphviz(options: Boolean): Graphviz_[GElement, Datum, PElement, PDatum] = js.native
      def graphviz(options: GraphvizOptions): Graphviz_[GElement, Datum, PElement, PDatum] = js.native
      
      /**
        * For each selected element, selects the first descendant element that matches the specified selector string in the same ways as
        * d3-selection.select, but does not propagate any associated data from the current element to the corresponding selected element.
        */
      def selectWithoutDataPropagation(name: String): Selection[BaseType, Datum, PElement, PDatum] = js.native
    }
  }
}
