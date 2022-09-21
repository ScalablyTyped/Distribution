package typings.cytoscape.mod

import typings.cytoscape.anon.H
import typings.cytoscape.anon.Pan
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#core/viewport-manipulation
  */
@js.native
trait CoreViewportManipulation extends StObject {
  
  /**
    * Set whether nodes are automatically locked
    * (i.e. if true, nodes are locked despite their individual state).
    * http://js.cytoscape.org/#cy.autolock
    *
    * @param bool A truthy value enables autolocking; a falsey value disables it.
    */
  def autolock(): this.type = js.native
  def autolock(bool: Boolean): this.type = js.native
  /**
    * Get whether nodes are automatically locked
    * (i.e. if true, nodes are locked despite their individual state).
    * http://js.cytoscape.org/#cy.autolock
    */
  @JSName("autolock")
  def autolock_Boolean(): Boolean = js.native
  
  /**
    * Set whether nodes are automatically ungrabified
    * (i.e. if true, nodes are ungrabbale despite their individual state).
    * http://js.cytoscape.org/#cy.autoungrabify
    *
    * @param bool A truthy value enables autolocking; a falsey value disables it.
    */
  def autoungrabify(): this.type = js.native
  def autoungrabify(bool: Boolean): this.type = js.native
  /**
    * Get whether nodes are automatically ungrabified
    * (i.e. if true, nodes are ungrabbale despite their individual state).
    * http://js.cytoscape.org/#cy.autoungrabify
    */
  @JSName("autoungrabify")
  def autoungrabify_Boolean(): Boolean = js.native
  
  /**
    * Set whether nodes are automatically unselectified
    * (i.e. if true, nodes are unselectable despite their individual state).
    * http://js.cytoscape.org/#cy.autounselectify
    *
    * @param bool A truthy value enables autolocking; a falsey value disables it.
    */
  def autounselectify(): this.type = js.native
  def autounselectify(bool: Boolean): this.type = js.native
  /**
    * Get whether nodes are automatically unselectified
    * (i.e. if true, nodes are unselectable despite their individual state).
    * http://js.cytoscape.org/#cy.autounselectify
    */
  @JSName("autounselectify")
  def autounselectify_Boolean(): Boolean = js.native
  
  /**
    * Set whether box selection is enabled.
    * If enabled, the user must hold left-click to initiate panning.
    * http://js.cytoscape.org/#cy.boxSelectionEnabled
    *
    * @param bool A truthy value enables box selection; a falsey value disables it.
    */
  def boxSelectionEnabled(): this.type = js.native
  def boxSelectionEnabled(bool: Boolean): this.type = js.native
  /**
    * Get whether box selection is enabled.
    * If enabled, the user must hold left-click to initiate panning.
    * http://js.cytoscape.org/#cy.boxSelectionEnabled
    */
  @JSName("boxSelectionEnabled")
  def boxSelectionEnabled_Boolean(): Boolean = js.native
  
  /**
    * Pan the graph to the centre of a collection.
    *
    * @param eles The collection to centre upon.
    */
  def center(): this.type = js.native
  def center(eles: CollectionArgument): this.type = js.native
  
  /**
    * Pan the graph to the centre of a collection.
    *
    * @param eles The collection to centre upon.
    */
  def centre(): this.type = js.native
  def centre(eles: CollectionArgument): this.type = js.native
  
  /**
    * Get the HTML DOM element in which the graph is visualised.
    * A null value is returned if the Core is headless.
    */
  def container(): HTMLElement | Null = js.native
  
  /**
    * Get the extent of the viewport, a bounding box in model
    * coordinates that lets you know what model
    * positions are visible in the viewport.
    * http://js.cytoscape.org/#cy.extent
    */
  def extent(): H = js.native
  
  /**
    * Pan and zooms the graph to fit to a collection.
    * http://js.cytoscape.org/#cy.fit
    *
    * @param eles [optional] The collection to fit to.
    * @param padding [optional] An amount of padding (in pixels) to have around the graph
    */
  def fit(): this.type = js.native
  def fit(eles: Unit, padding: Double): this.type = js.native
  def fit(eles: CollectionArgument): this.type = js.native
  def fit(eles: CollectionArgument, padding: Double): this.type = js.native
  
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
  def height(): Double = js.native
  
  def invalidateDimensions(): this.type = js.native
  
  /**
    * Get the maximum zoom level.
    * http://js.cytoscape.org/#cy.maxZoom
    */
  def maxZoom(): Double = js.native
  /**
    * Set the maximum zoom level.
    * http://js.cytoscape.org/#cy.maxZoom
    *
    * @param zoom The new maximum zoom level to use.
    */
  def maxZoom(zoom: Double): this.type = js.native
  
  /**
    * Get the minimum zoom level.
    * http://js.cytoscape.org/#cy.minZoom
    */
  def minZoom(): Double = js.native
  /**
    * Set the minimum zoom level.
    * http://js.cytoscape.org/#cy.minZoom
    *
    * @param zoom The new minimum zoom level to use.
    */
  def minZoom(zoom: Double): this.type = js.native
  
  /**
    * Get the panning position of the graph.
    * http://js.cytoscape.org/#cy.pan
    */
  def pan(): Position = js.native
  def pan(renderedPosition: Position): this.type = js.native
  
  /**
    * Relatively pan the graph by a specified rendered position vector.
    * http://js.cytoscape.org/#cy.panBy
    *
    * @param renderedPosition The rendered position vector to pan the graph by.
    */
  def panBy(renderedPosition: Position): this.type = js.native
  
  /**
    * Set the panning position of the graph.
    * http://js.cytoscape.org/#cy.pan
    *
    * @param renderedPosition The rendered position to pan the graph to.
    */
  @JSName("pan")
  def pan_This(): this.type = js.native
  
  /**
    * Set whether panning is enabled. If cy.boxSelectionEnabled() === true, then the user must taphold to initiate panning.
    * http://js.cytoscape.org/#cy.panningEnabled
    *
    * @param bool A truthy value enables panning; a falsey value disables it.
    */
  def panningEnabled(): this.type = js.native
  def panningEnabled(bool: Boolean): this.type = js.native
  /**
    * Get whether panning is enabled.
    * If cy.boxSelectionEnabled() === true, then the user
    * must taphold to initiate panning.
    * http://js.cytoscape.org/#cy.panningEnabled
    */
  @JSName("panningEnabled")
  def panningEnabled_Boolean(): Boolean = js.native
  
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
    * Get the selection type.
    * http://js.cytoscape.org/#cy.selectionType
    */
  def selectionType(): SelectionType = js.native
  /**
    * Set the selection type.
    * http://js.cytoscape.org/#cy.selectionType
    *
    * @param type The selection type string; one of 'single' (default) or 'additive'.
    */
  def selectionType(`type`: SelectionType): this.type = js.native
  
  /**
    * Set whether panning by user events (e.g. dragging the graph background) is enabled. If cy.boxSelectionEnabled() === true, then the user must taphold to initiate panning.
    * http://js.cytoscape.org/#cy.userPanningEnabled
    *
    * @param bool A truthy value enables user panning; a falsey value disables it.
    */
  def userPanningEnabled(): this.type = js.native
  def userPanningEnabled(bool: Boolean): this.type = js.native
  /**
    * Get whether panning by user events (e.g. dragging the graph background) is enabled. If cy.boxSelectionEnabled() === true, then the user must taphold to initiate panning.
    * http://js.cytoscape.org/#cy.userPanningEnabled
    */
  @JSName("userPanningEnabled")
  def userPanningEnabled_Boolean(): Boolean = js.native
  
  /**
    * Get or set whether zooming by user events get if no parameter provided
    * (e.g. mouse wheel, pinch-to-zoom) is enabled.
    * http://js.cytoscape.org/#cy.userZoomingEnabled
    *
    * @param bool A truthy value enables user zooming; a falsey value disables it.
    */
  def userZoomingEnabled(): this.type = js.native
  def userZoomingEnabled(bool: Boolean): this.type = js.native
  /**
    * Get whether zooming by user events (e.g. mouse wheel, pinch-to-zoom)
    * is enabled.
    * http://js.cytoscape.org/#cy.userZoomingEnabled
    */
  @JSName("userZoomingEnabled")
  def userZoomingEnabled_Boolean(): Boolean = js.native
  
  /**
    * Set the viewport state (pan & zoom) in one call.
    * http://js.cytoscape.org/#cy.viewport
    *
    * @param options The viewport options.
    * @param options.zoom The zoom level to set.
    * @param options.pan The pan to set (a rendered position).
    */
  def viewport(options: Pan): this.type = js.native
  
  /**
    * Get the on-screen width of the viewport in pixels.
    * http://js.cytoscape.org/#cy.width
    */
  def width(): Double = js.native
  
  /**
    * Set the zoom level.
    * http://js.cytoscape.org/#cy.zoom
    *
    * @param level The zoom level to set.
    * @param options The options for zooming.
    */
  def zoom(): this.type = js.native
  def zoom(level: Double): this.type = js.native
  def zoom(level: ZoomOptions): this.type = js.native
  /**
    * Get the zoom level.
    * http://js.cytoscape.org/#cy.zoom
    */
  @JSName("zoom")
  def zoom_Double(): Double = js.native
  
  /**
    * Set or get whether zooming is enabled. Get if no parameter provided.
    * http://js.cytoscape.org/#cy.zoomingEnabled
    *
    * @param bool A truthy value enables zooming; a falsey value disables it.
    */
  def zoomingEnabled(): this.type = js.native
  def zoomingEnabled(bool: Boolean): this.type = js.native
}
