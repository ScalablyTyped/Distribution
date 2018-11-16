package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#core/viewport-manipulation
     */
@js.native
trait CoreViewportManipulation extends js.Object {
  /**
           * Get whether nodes are automatically locked
           * (i.e. if true, nodes are locked despite their individual state).
           * http://js.cytoscape.org/#cy.autolock
           */
  def autolock(): scala.Boolean = js.native
  /**
           * Set whether nodes are automatically locked
           * (i.e. if true, nodes are locked despite their individual state).
           * http://js.cytoscape.org/#cy.autolock
           *
           * @param bool A truthy value enables autolocking; a falsey value disables it.
           */
  def autolock(bool: scala.Boolean): this.type = js.native
  /**
           * Get whether nodes are automatically ungrabified
           * (i.e. if true, nodes are ungrabbale despite their individual state).
           * http://js.cytoscape.org/#cy.autoungrabify
           */
  def autoungrabify(): scala.Boolean = js.native
  /**
           * Set whether nodes are automatically ungrabified
           * (i.e. if true, nodes are ungrabbale despite their individual state).
           * http://js.cytoscape.org/#cy.autoungrabify
           *
           * @param bool A truthy value enables autolocking; a falsey value disables it.
           */
  def autoungrabify(bool: scala.Boolean): this.type = js.native
  /**
           * Get whether nodes are automatically unselectified
           * (i.e. if true, nodes are unselectable despite their individual state).
           * http://js.cytoscape.org/#cy.autounselectify
           */
  def autounselectify(): scala.Boolean = js.native
  /**
           * Set whether nodes are automatically unselectified
           * (i.e. if true, nodes are unselectable despite their individual state).
           * http://js.cytoscape.org/#cy.autounselectify
           *
           * @param bool A truthy value enables autolocking; a falsey value disables it.
           */
  def autounselectify(bool: scala.Boolean): this.type = js.native
  /**
           * Get whether box selection is enabled.
           * If enabled, the user must hold left-click to initiate panning.
           * http://js.cytoscape.org/#cy.boxSelectionEnabled
           */
  def boxSelectionEnabled(): scala.Boolean = js.native
  /**
           * Set whether box selection is enabled.
           * If enabled, the user must hold left-click to initiate panning.
           * http://js.cytoscape.org/#cy.boxSelectionEnabled
           *
           * @param bool A truthy value enables box selection; a falsey value disables it.
           */
  def boxSelectionEnabled(bool: scala.Boolean): this.type = js.native
  /**
           * Pan the graph to the centre of a collection.
           *
           * @param eles The collection to centre upon.
           */
  def center(): this.type = js.native
  /**
           * Pan the graph to the centre of a collection.
           *
           * @param eles The collection to centre upon.
           */
  def center(eles: CollectionArgument): this.type = js.native
  /**
           * Pan the graph to the centre of a collection.
           *
           * @param eles The collection to centre upon.
           */
  def centre(): this.type = js.native
  /**
           * Pan the graph to the centre of a collection.
           *
           * @param eles The collection to centre upon.
           */
  def centre(eles: CollectionArgument): this.type = js.native
  /**
           * Get the HTML DOM element in which the graph is visualised.
           * A null value is returned if the Core is headless.
           */
  def container(): stdLib.Element | scala.Null = js.native
  /**
           * Get the extent of the viewport, a bounding box in model
           * coordinates that lets you know what model
           * positions are visible in the viewport.
           * http://js.cytoscape.org/#cy.extent
           */
  def extent(): cytoscapeLib.Anon_X2 = js.native
  /**
           * Pan and zooms the graph to fit to a collection.
           * http://js.cytoscape.org/#cy.fit
           *
           * @param eles [optional] The collection to fit to.
           * @param padding [optional] An amount of padding (in pixels) to have around the graph
           */
  def fit(): this.type = js.native
  /**
           * Pan and zooms the graph to fit to a collection.
           * http://js.cytoscape.org/#cy.fit
           *
           * @param eles [optional] The collection to fit to.
           * @param padding [optional] An amount of padding (in pixels) to have around the graph
           */
  def fit(eles: CollectionArgument): this.type = js.native
  /**
           * Pan and zooms the graph to fit to a collection.
           * http://js.cytoscape.org/#cy.fit
           *
           * @param eles [optional] The collection to fit to.
           * @param padding [optional] An amount of padding (in pixels) to have around the graph
           */
  def fit(eles: CollectionArgument, padding: scala.Double): this.type = js.native
  /**
           * Force the renderer to redraw (i.e. draw a new frame).
           *
           * This function forces the renderer to draw a new frame.
           * It is useful for very specific edgecases, such as in certain UI plugins,
           * but it should not be needed for most developers.
           * http://js.cytoscape.org/#cy.forceRender
           */
  def forceRender(): this.type = js.native
  /**
           * Get the on-screen height of the viewport in pixels.
           * http://js.cytoscape.org/#cy.height
           */
  def height(): scala.Double = js.native
  def invalidateDimensions(): this.type = js.native
  /**
           * Get the maximum zoom level.
           * http://js.cytoscape.org/#cy.maxZoom
           */
  def maxZoom(): scala.Double = js.native
  /**
           * Set the maximum zoom level.
           * http://js.cytoscape.org/#cy.maxZoom
           *
           * @param zoom The new maximum zoom level to use.
           */
  def maxZoom(zoom: scala.Double): this.type = js.native
  /**
           * Get the minimum zoom level.
           * http://js.cytoscape.org/#cy.minZoom
           */
  def minZoom(): scala.Double = js.native
  /**
           * Set the minimum zoom level.
           * http://js.cytoscape.org/#cy.minZoom
           *
           * @param zoom The new minimum zoom level to use.
           */
  def minZoom(zoom: scala.Double): this.type = js.native
  /**
           * Set the panning position of the graph.
           * http://js.cytoscape.org/#cy.pan
           *
           * @param renderedPosition The rendered position to pan the graph to.
           */
  def pan(): this.type = js.native
  /**
           * Set the panning position of the graph.
           * http://js.cytoscape.org/#cy.pan
           *
           * @param renderedPosition The rendered position to pan the graph to.
           */
  def pan(renderedPosition: Position): this.type = js.native
  /**
           * Relatively pan the graph by a specified rendered position vector.
           * http://js.cytoscape.org/#cy.panBy
           *
           * @param renderedPosition The rendered position vector to pan the graph by.
           */
  def panBy(renderedPosition: Position): this.type = js.native
  /**
           * Get the panning position of the graph.
           * http://js.cytoscape.org/#cy.pan
           */
  @JSName("pan")
  def pan_Position(): Position = js.native
  /**
           * Get whether panning is enabled.
           * If cy.boxSelectionEnabled() === true, then the user
           * must taphold to initiate panning.
           * http://js.cytoscape.org/#cy.panningEnabled
           */
  def panningEnabled(): scala.Boolean = js.native
  /**
           * Set whether panning is enabled. If cy.boxSelectionEnabled() === true, then the user must taphold to initiate panning.
           * http://js.cytoscape.org/#cy.panningEnabled
           *
           * @param bool A truthy value enables panning; a falsey value disables it.
           */
  def panningEnabled(bool: scala.Boolean): this.type = js.native
  /**
           * Reset the graph to the default zoom level and panning position.
           * http://js.cytoscape.org/#cy.reset
           */
  def reset(): this.type = js.native
  /**
           * Force the renderer to recalculate the viewport bounds.
           *
           * If your code resizes the graph's dimensions or position
           * (i.e. by changing the style of the HTML DOM element that holds the graph),
           * you will want to call cy.resize() to have the graph resize and redraw itself.
           *
           * Cytoscape.js can not automatically monitor the bounding box of the viewport,
           * as querying the DOM for those dimensions can be expensive.
           * Although cy.resize() is automatically called for you on the window's resize event,
           * there is no resize or style event for arbitrary DOM elements.
           * http://js.cytoscape.org/#cy.resize
           */
  def resize(): this.type = js.native
  /**
           * Get whether panning by user events (e.g. dragging the graph background) is enabled. If cy.boxSelectionEnabled() === true, then the user must taphold to initiate panning.
           * http://js.cytoscape.org/#cy.userPanningEnabled
           */
  def userPanningEnabled(): scala.Boolean = js.native
  /**
           * Set whether panning by user events (e.g. dragging the graph background) is enabled. If cy.boxSelectionEnabled() === true, then the user must taphold to initiate panning.
           * http://js.cytoscape.org/#cy.userPanningEnabled
           *
           * @param bool A truthy value enables user panning; a falsey value disables it.
           */
  def userPanningEnabled(bool: scala.Boolean): this.type = js.native
  /**
           * Get whether zooming by user events (e.g. mouse wheel, pinch-to-zoom)
           * is enabled.
           * http://js.cytoscape.org/#cy.userZoomingEnabled
           */
  def userZoomingEnabled(): scala.Boolean = js.native
  /**
           * Get or set whether zooming by user events get if no parameter provided
           * (e.g. mouse wheel, pinch-to-zoom) is enabled.
           * http://js.cytoscape.org/#cy.userZoomingEnabled
           *
           * @param bool A truthy value enables user zooming; a falsey value disables it.
           */
  def userZoomingEnabled(bool: scala.Boolean): this.type = js.native
  /**
           * Get or set whether zooming by user events get if no parameter provided
           * (e.g. mouse wheel, pinch-to-zoom) is enabled.
           * http://js.cytoscape.org/#cy.userZoomingEnabled
           *
           * @param bool A truthy value enables user zooming; a falsey value disables it.
           */
  @JSName("userZoomingEnabled")
  def `userZoomingEnabled_<this>`(): this.type = js.native
  /**
           * Set the viewport state (pan & zoom) in one call.
           * http://js.cytoscape.org/#cy.viewport
           *
           * @param zoom The zoom level to set.
           * @param pan The pan to set (a rendered position).
           */
  def viewport(zoom: scala.Double, pan: Position): this.type = js.native
  /**
           * Get the on-screen width of the viewport in pixels.
           * http://js.cytoscape.org/#cy.width
           */
  def width(): scala.Double = js.native
  /**
           * Get the zoom level.
           * http://js.cytoscape.org/#cy.zoom
           */
  def zoom(): scala.Double = js.native
  /**
           * Set the zoom level.
           * http://js.cytoscape.org/#cy.zoom
           *
           * @param level The zoom level to set.
           * @param options The options for zooming.
           */
  def zoom(level: ZoomOptions): this.type = js.native
  /**
           * Set the zoom level.
           * http://js.cytoscape.org/#cy.zoom
           *
           * @param level The zoom level to set.
           * @param options The options for zooming.
           */
  def zoom(level: scala.Double): this.type = js.native
  /**
           * Set the zoom level.
           * http://js.cytoscape.org/#cy.zoom
           *
           * @param level The zoom level to set.
           * @param options The options for zooming.
           */
  @JSName("zoom")
  def `zoom_<this>`(): this.type = js.native
  /**
           * Set or get whether zooming is enabled. Get if no parameter provided.
           * http://js.cytoscape.org/#cy.zoomingEnabled
           *
           * @param bool A truthy value enables zooming; a falsey value disables it.
           */
  def zoomingEnabled(): this.type = js.native
  /**
           * Set or get whether zooming is enabled. Get if no parameter provided.
           * http://js.cytoscape.org/#cy.zoomingEnabled
           *
           * @param bool A truthy value enables zooming; a falsey value disables it.
           */
  def zoomingEnabled(bool: scala.Boolean): this.type = js.native
}

