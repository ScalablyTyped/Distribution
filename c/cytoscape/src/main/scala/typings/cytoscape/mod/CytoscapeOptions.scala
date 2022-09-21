package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.auto
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CytoscapeOptions extends StObject {
  
  /**
    * Whether nodes should be locked (not draggable at all) by default (if true, overrides individual node state).
    *
    * The default value is false.
    */
  var autolock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether nodes should be ungrabified (not grabbable by user) by default (if true, overrides individual node state).
    *
    * The default value is false.
    */
  var autoungrabify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether nodes should be unselectified (immutable selection state) by default (if true, overrides individual element state).
    *
    * The default value is false.
    */
  var autounselectify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether box selection (i.e. drag a box overlay around, and release it to select) is enabled. If enabled, the user must taphold to pan the graph.
    *
    * The default value is false.
    */
  var boxSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  ///////////////////////////////////////
  // very commonly used options:
  /**
    * A HTML DOM element in which the graph should be rendered.
    * This is optional if Cytoscape.js is run headlessly or if you initialise using jQuery (in which case your jQuery object already has an associated DOM element).
    *
    * The default is undefined.
    */
  var container: js.UndefOr[HTMLElement | Null] = js.undefined
  
  /**
    * A plain object that contains graph-level data (i.e. data that does not belong to any particular node or edge).
    */
  var data: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * A nonnegative integer that indicates the maximum allowable distance that a user may move during a tap gesture,
    * on touch devices and desktop devices respectively.
    *
    * This makes tapping easier for users.
    * These values have sane defaults,
    * so it is not advised to change these options unless you have very good reason for doing so.
    * Larger values will almost certainly have undesirable consequences.
    *
    * The default value is 4.
    */
  var desktopTapThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of [[Elements]] specified as plain objects. For convenience, this option can alternatively be specified as a promise that resolves to the elements JSON.
    */
  var elements: js.UndefOr[
    ElementsDefinition | js.Array[ElementDefinition] | (js.Promise[js.Array[ElementDefinition] | ElementsDefinition])
  ] = js.undefined
  
  ///////////////////////////////////////
  // rendering options:
  /**
    * A convenience option that initialises the Core to run headlessly.
    * You do not need to set this in environments that are implicitly headless (e.g. Node.js).
    * However, it is handy to set headless: true if you want a headless Core in a browser.
    *
    * The default value is false.
    */
  var headless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to true, the renderer does not render edges while the viewport is being manipulated.
    * This makes panning, zooming, dragging, et cetera more responsive for large graphs.
    *
    * The default value is false.
    */
  var hideEdgesOnViewport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when set to true, the renderer does not render labels while the viewport is being manipulated.
    * This makes panning, zooming, dragging, et cetera more responsive for large graphs.
    *
    * The default value is false.
    */
  var hideLabelsOnViewport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A plain object that specifies layout options.
    * Which layout is initially run is specified by the name field.
    * Refer to a layout's documentation for the options it supports.
    * If you want to specify your node positions yourself in your elements JSON,
    * you can use the preset layout — by default it does not set any positions,
    * leaving your nodes in their current positions
    * (e.g. specified in options.elements at initialisation time)
    */
  var layout: js.UndefOr[LayoutOptions] = js.undefined
  
  /**
    * A maximum bound on the zoom level of the graph. The viewport can not be scaled larger than this zoom level.
    *
    * The default value is 1e50.
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  ///////////////////////////////////////
  // interaction options?:
  /**
    * A minimum bound on the zoom level of the graph. The viewport can not be scaled smaller than this zoom level.
    *
    * The default value is 1e-50.
    */
  var minZoom: js.UndefOr[Double] = js.undefined
  
  /**
    * When set to true, the renderer will use a motion blur effect to make the transition between frames seem smoother.
    * This can significantly increase the perceived performance for a large graphs.
    *
    * The default value is false.
    */
  var motionBlur: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When motionBlur: true, this value controls the opacity of motion blur frames.
    * Higher values make the motion blur effect more pronounced.
    *
    * The default value is 0.2.
    */
  var motionBlurOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The initial panning position of the graph. Make sure to disable viewport manipulation options, such as fit,
    * in your layout so that it is not overridden when the layout is applied.
    */
  var pan: js.UndefOr[Position] = js.undefined
  
  /**
    * Whether panning the graph is enabled, both by user events and programmatically.
    *
    * The default value is true.
    */
  var panningEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overrides the screen pixel ratio with a manually set value (1.0 or 0.666 recommended, if set).
    * This can be used to increase performance on high density displays by reducing the effective area that needs to be rendered.
    * If you want to use the hardware's actual pixel ratio at the expense of performance, you can set pixelRatio: 'auto'.
    *
    * The default value is 1.
    */
  var pixelRatio: js.UndefOr[Double | auto] = js.undefined
  
  /**
    * A string indicating the selection behaviour from user input.
    * By default, this is set automatically for you based on the type of input device detected.
    * On touch devices, 'additive' is default — a new selection made by the user adds to the set of currenly selected elements.
    * On mouse-input devices, 'single' is default — a new selection made by the user becomes the entire set of currently selected elements (i.e. the previous elements are unselected).
    *
    * The default value is (isTouchDevice ? 'additive' : 'single').
    */
  var selectionType: js.UndefOr[SelectionType] = js.undefined
  
  /**
    * The [[Stylesheet]] used to style the graph. For convenience, this option can alternatively be specified as a promise that resolves to the stylesheet.
    */
  var style: js.UndefOr[js.Array[Stylesheet] | js.Promise[js.Array[Stylesheet]]] = js.undefined
  
  /**
    * A boolean that indicates whether styling should be used.
    * For headless (i.e. outside the browser) environments,
    * display is not necessary and so neither is styling necessary — thereby speeding up your code.
    * You can manually enable styling in headless environments if you require it for a special case.
    * Note that it does not make sense to disable style if you plan on rendering the graph.
    *
    * The default value is true.
    */
  var styleEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to true, the renderer uses a texture (if supported) during panning and zooming instead of drawing the elements,
    * making large graphs more responsive.
    *
    * The default value is false.
    */
  var textureOnViewport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A nonnegative integer that indicates the maximum allowable distance that a user may move during a tap gesture,
    * on touch devices and desktop devices respectively.
    *
    * This makes tapping easier for users.
    * These values have sane defaults, so it is not advised to change these options unless you have very good reason for doing so.
    * Larger values will almost certainly have undesirable consequences.
    *
    * The default value is is 8.
    */
  var touchTapThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether user events (e.g. dragging the graph background) are allowed to pan the graph. Programmatic changes to pan are unaffected by this option.
    *
    * The default value is true.
    */
  var userPanningEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether user events (e.g. mouse wheel, pinch-to-zoom) are allowed to zoom the graph. Programmatic changes to zoom are unaffected by this option.
    *
    * The default value is true.
    */
  var userZoomingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Changes the scroll wheel sensitivity when zooming. This is a multiplicative modifier.
    * So, a value between 0 and 1 reduces the sensitivity (zooms slower), and a value greater than 1 increases the sensitivity (zooms faster).
    *
    * The default value is 1.
    */
  var wheelSensitivity: js.UndefOr[Double] = js.undefined
  
  ///////////////////////////////////////
  // initial viewport state:
  /**
    * The initial zoom level of the graph.
    * Make sure to disable viewport manipulation options, such as fit, in your layout so that it is not overridden when the layout is applied.
    * You can set options.minZoom and options.maxZoom to set restrictions on the zoom level.
    *
    * The default value is 1.
    */
  var zoom: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether zooming the graph is enabled, both by user events and programmatically.
    *
    * The default value is true.
    */
  var zoomingEnabled: js.UndefOr[Boolean] = js.undefined
}
object CytoscapeOptions {
  
  inline def apply(): CytoscapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CytoscapeOptions]
  }
  
  extension [Self <: CytoscapeOptions](x: Self) {
    
    inline def setAutolock(value: Boolean): Self = StObject.set(x, "autolock", value.asInstanceOf[js.Any])
    
    inline def setAutolockUndefined: Self = StObject.set(x, "autolock", js.undefined)
    
    inline def setAutoungrabify(value: Boolean): Self = StObject.set(x, "autoungrabify", value.asInstanceOf[js.Any])
    
    inline def setAutoungrabifyUndefined: Self = StObject.set(x, "autoungrabify", js.undefined)
    
    inline def setAutounselectify(value: Boolean): Self = StObject.set(x, "autounselectify", value.asInstanceOf[js.Any])
    
    inline def setAutounselectifyUndefined: Self = StObject.set(x, "autounselectify", js.undefined)
    
    inline def setBoxSelectionEnabled(value: Boolean): Self = StObject.set(x, "boxSelectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setBoxSelectionEnabledUndefined: Self = StObject.set(x, "boxSelectionEnabled", js.undefined)
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDesktopTapThreshold(value: Double): Self = StObject.set(x, "desktopTapThreshold", value.asInstanceOf[js.Any])
    
    inline def setDesktopTapThresholdUndefined: Self = StObject.set(x, "desktopTapThreshold", js.undefined)
    
    inline def setElements(
      value: ElementsDefinition | js.Array[ElementDefinition] | (js.Promise[js.Array[ElementDefinition] | ElementsDefinition])
    ): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: ElementDefinition*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setHideEdgesOnViewport(value: Boolean): Self = StObject.set(x, "hideEdgesOnViewport", value.asInstanceOf[js.Any])
    
    inline def setHideEdgesOnViewportUndefined: Self = StObject.set(x, "hideEdgesOnViewport", js.undefined)
    
    inline def setHideLabelsOnViewport(value: Boolean): Self = StObject.set(x, "hideLabelsOnViewport", value.asInstanceOf[js.Any])
    
    inline def setHideLabelsOnViewportUndefined: Self = StObject.set(x, "hideLabelsOnViewport", js.undefined)
    
    inline def setLayout(value: LayoutOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setMotionBlur(value: Boolean): Self = StObject.set(x, "motionBlur", value.asInstanceOf[js.Any])
    
    inline def setMotionBlurOpacity(value: Double): Self = StObject.set(x, "motionBlurOpacity", value.asInstanceOf[js.Any])
    
    inline def setMotionBlurOpacityUndefined: Self = StObject.set(x, "motionBlurOpacity", js.undefined)
    
    inline def setMotionBlurUndefined: Self = StObject.set(x, "motionBlur", js.undefined)
    
    inline def setPan(value: Position): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setPanningEnabled(value: Boolean): Self = StObject.set(x, "panningEnabled", value.asInstanceOf[js.Any])
    
    inline def setPanningEnabledUndefined: Self = StObject.set(x, "panningEnabled", js.undefined)
    
    inline def setPixelRatio(value: Double | auto): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setSelectionType(value: SelectionType): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
    
    inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    
    inline def setStyle(value: js.Array[Stylesheet] | js.Promise[js.Array[Stylesheet]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleEnabled(value: Boolean): Self = StObject.set(x, "styleEnabled", value.asInstanceOf[js.Any])
    
    inline def setStyleEnabledUndefined: Self = StObject.set(x, "styleEnabled", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Stylesheet*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setTextureOnViewport(value: Boolean): Self = StObject.set(x, "textureOnViewport", value.asInstanceOf[js.Any])
    
    inline def setTextureOnViewportUndefined: Self = StObject.set(x, "textureOnViewport", js.undefined)
    
    inline def setTouchTapThreshold(value: Double): Self = StObject.set(x, "touchTapThreshold", value.asInstanceOf[js.Any])
    
    inline def setTouchTapThresholdUndefined: Self = StObject.set(x, "touchTapThreshold", js.undefined)
    
    inline def setUserPanningEnabled(value: Boolean): Self = StObject.set(x, "userPanningEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserPanningEnabledUndefined: Self = StObject.set(x, "userPanningEnabled", js.undefined)
    
    inline def setUserZoomingEnabled(value: Boolean): Self = StObject.set(x, "userZoomingEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserZoomingEnabledUndefined: Self = StObject.set(x, "userZoomingEnabled", js.undefined)
    
    inline def setWheelSensitivity(value: Double): Self = StObject.set(x, "wheelSensitivity", value.asInstanceOf[js.Any])
    
    inline def setWheelSensitivityUndefined: Self = StObject.set(x, "wheelSensitivity", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    inline def setZoomingEnabled(value: Boolean): Self = StObject.set(x, "zoomingEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoomingEnabledUndefined: Self = StObject.set(x, "zoomingEnabled", js.undefined)
  }
}
