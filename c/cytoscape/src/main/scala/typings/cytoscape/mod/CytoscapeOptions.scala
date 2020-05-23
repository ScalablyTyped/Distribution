package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.auto
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CytoscapeOptions extends js.Object {
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
  @scala.inline
  def apply(
    autolock: js.UndefOr[Boolean] = js.undefined,
    autoungrabify: js.UndefOr[Boolean] = js.undefined,
    autounselectify: js.UndefOr[Boolean] = js.undefined,
    boxSelectionEnabled: js.UndefOr[Boolean] = js.undefined,
    container: js.UndefOr[Null | HTMLElement] = js.undefined,
    desktopTapThreshold: js.UndefOr[Double] = js.undefined,
    elements: ElementsDefinition | js.Array[ElementDefinition] | (js.Promise[js.Array[ElementDefinition] | ElementsDefinition]) = null,
    headless: js.UndefOr[Boolean] = js.undefined,
    hideEdgesOnViewport: js.UndefOr[Boolean] = js.undefined,
    hideLabelsOnViewport: js.UndefOr[Boolean] = js.undefined,
    layout: LayoutOptions = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    motionBlur: js.UndefOr[Boolean] = js.undefined,
    motionBlurOpacity: js.UndefOr[Double] = js.undefined,
    pan: Position = null,
    panningEnabled: js.UndefOr[Boolean] = js.undefined,
    pixelRatio: Double | auto = null,
    selectionType: SelectionType = null,
    style: js.Array[Stylesheet] | js.Promise[js.Array[Stylesheet]] = null,
    styleEnabled: js.UndefOr[Boolean] = js.undefined,
    textureOnViewport: js.UndefOr[Boolean] = js.undefined,
    touchTapThreshold: js.UndefOr[Double] = js.undefined,
    userPanningEnabled: js.UndefOr[Boolean] = js.undefined,
    userZoomingEnabled: js.UndefOr[Boolean] = js.undefined,
    wheelSensitivity: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined,
    zoomingEnabled: js.UndefOr[Boolean] = js.undefined
  ): CytoscapeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autolock)) __obj.updateDynamic("autolock")(autolock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoungrabify)) __obj.updateDynamic("autoungrabify")(autoungrabify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autounselectify)) __obj.updateDynamic("autounselectify")(autounselectify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boxSelectionEnabled)) __obj.updateDynamic("boxSelectionEnabled")(boxSelectionEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(desktopTapThreshold)) __obj.updateDynamic("desktopTapThreshold")(desktopTapThreshold.get.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEdgesOnViewport)) __obj.updateDynamic("hideEdgesOnViewport")(hideEdgesOnViewport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabelsOnViewport)) __obj.updateDynamic("hideLabelsOnViewport")(hideLabelsOnViewport.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionBlur)) __obj.updateDynamic("motionBlur")(motionBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionBlurOpacity)) __obj.updateDynamic("motionBlurOpacity")(motionBlurOpacity.get.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (!js.isUndefined(panningEnabled)) __obj.updateDynamic("panningEnabled")(panningEnabled.get.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(styleEnabled)) __obj.updateDynamic("styleEnabled")(styleEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textureOnViewport)) __obj.updateDynamic("textureOnViewport")(textureOnViewport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchTapThreshold)) __obj.updateDynamic("touchTapThreshold")(touchTapThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userPanningEnabled)) __obj.updateDynamic("userPanningEnabled")(userPanningEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userZoomingEnabled)) __obj.updateDynamic("userZoomingEnabled")(userZoomingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelSensitivity)) __obj.updateDynamic("wheelSensitivity")(wheelSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomingEnabled)) __obj.updateDynamic("zoomingEnabled")(zoomingEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CytoscapeOptions]
  }
}

