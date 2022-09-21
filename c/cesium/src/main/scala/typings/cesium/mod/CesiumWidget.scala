package typings.cesium.mod

import typings.cesium.anon.BlurActiveElementOnCanvasFocus
import typings.std.Element
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CesiumWidget")
@js.native
open class CesiumWidget protected () extends StObject {
  def this(container: String) = this()
  def this(container: Element) = this()
  def this(container: String, options: BlurActiveElementOnCanvasFocus) = this()
  def this(container: Element, options: BlurActiveElementOnCanvasFocus) = this()
  
  /**
    * Gets the camera.
    */
  val camera: Camera = js.native
  
  /**
    * Gets the canvas.
    */
  val canvas: HTMLCanvasElement = js.native
  
  /**
    * Gets the clock.
    */
  val clock: Clock = js.native
  
  /**
    * Gets the parent container.
    */
  val container: Element = js.native
  
  /**
    * Gets the credit container.
    */
  val creditContainer: Element = js.native
  
  /**
    * Gets the credit viewport
    */
  val creditViewport: Element = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the collection of image layers that will be rendered on the globe.
    */
  val imageryLayers: ImageryLayerCollection = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Renders the scene.  This function is called automatically
    * unless <code>useDefaultRenderLoop</code> is set to false;
    */
  def render(): Unit = js.native
  
  /**
    * Updates the canvas size, camera aspect ratio, and viewport size.
    * This function is called automatically as needed unless
    * <code>useDefaultRenderLoop</code> is set to false.
    */
  def resize(): Unit = js.native
  
  /**
    * Gets or sets a scaling factor for rendering resolution.  Values less than 1.0 can improve
    * performance on less powerful devices while values greater than 1.0 will render at a higher
    * resolution and then scale down, resulting in improved visual fidelity.
    * For example, if the widget is laid out at a size of 640x480, setting this value to 0.5
    * will cause the scene to be rendered at 320x240 and then scaled up while setting
    * it to 2.0 will cause the scene to be rendered at 1280x960 and then scaled down.
    */
  var resolutionScale: Double = js.native
  
  /**
    * Gets the scene.
    */
  val scene: Scene = js.native
  
  /**
    * Gets the screen space event handler.
    */
  val screenSpaceEventHandler: ScreenSpaceEventHandler = js.native
  
  /**
    * Show an error panel to the user containing a title and a longer error message,
    * which can be dismissed using an OK button.  This panel is displayed automatically
    * when a render loop error occurs, if showRenderLoopErrors was not false when the
    * widget was constructed.
    * @param title - The title to be displayed on the error panel.  This string is interpreted as text.
    * @param [message] - A helpful, user-facing message to display prior to the detailed error information.  This string is interpreted as HTML.
    * @param [error] - The error to be displayed on the error panel.  This string is formatted using {@link formatError} and then displayed as text.
    */
  def showErrorPanel(title: String): Unit = js.native
  def showErrorPanel(title: String, message: String): Unit = js.native
  def showErrorPanel(title: String, message: String, error: String): Unit = js.native
  def showErrorPanel(title: String, message: Unit, error: String): Unit = js.native
  
  /**
    * Gets or sets the target frame rate of the widget when <code>useDefaultRenderLoop</code>
    * is true. If undefined, the browser's requestAnimationFrame implementation
    * determines the frame rate.  If defined, this value must be greater than 0.  A value higher
    * than the underlying requestAnimationFrame implementation will have no effect.
    */
  var targetFrameRate: Double = js.native
  
  /**
    * The terrain provider providing surface geometry for the globe.
    */
  var terrainProvider: TerrainProvider = js.native
  
  /**
    * Boolean flag indicating if the browser's recommended resolution is used.
    * If true, the browser's device pixel ratio is ignored and 1.0 is used instead,
    * effectively rendering based on CSS pixels instead of device pixels. This can improve
    * performance on less powerful devices that have high pixel density. When false, rendering
    * will be in device pixels. {@link CesiumWidget#resolutionScale} will still take effect whether
    * this flag is true or false.
    */
  var useBrowserRecommendedResolution: Boolean = js.native
  
  /**
    * Gets or sets whether or not this widget should control the render loop.
    * If true the widget will use requestAnimationFrame to
    * perform rendering and resizing of the widget, as well as drive the
    * simulation clock. If set to false, you must manually call the
    * <code>resize</code>, <code>render</code> methods as part of a custom
    * render loop.  If an error occurs during rendering, {@link Scene}'s
    * <code>renderError</code> event will be raised and this property
    * will be set to false.  It must be set back to true to continue rendering
    * after the error.
    */
  var useDefaultRenderLoop: Boolean = js.native
}
