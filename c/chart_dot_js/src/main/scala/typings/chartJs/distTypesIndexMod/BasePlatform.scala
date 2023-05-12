package typings.chartJs.distTypesIndexMod

import typings.chartJs.anon.Height
import typings.std.CanvasRenderingContext2D
import typings.std.CanvasRenderingContext2DSettings
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist/types/index", "BasePlatform")
@js.native
open class BasePlatform () extends StObject {
  
  /**
    * Called at chart construction time, returns a context2d instance implementing
    * the [W3C Canvas 2D Context API standard]{@link https://www.w3.org/TR/2dcontext/}.
    * @param {HTMLCanvasElement} canvas - The canvas from which to acquire context (platform specific)
    * @param options - The chart options
    */
  def acquireContext(canvas: HTMLCanvasElement): CanvasRenderingContext2D | Null = js.native
  def acquireContext(canvas: HTMLCanvasElement, options: CanvasRenderingContext2DSettings): CanvasRenderingContext2D | Null = js.native
  
  /**
    * Registers the specified listener on the given chart.
    * @param {Chart} chart - Chart from which to listen for event
    * @param {string} type - The ({@link ChartEvent}) type to listen for
    * @param listener - Receives a notification (an object that implements
    * the {@link ChartEvent} interface) when an event of the specified type occurs.
    */
  def addEventListener(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    `type`: String,
    listener: js.Function1[/* e */ ChartEvent, Unit]
  ): Unit = js.native
  
  /**
    * @returns {number} the current devicePixelRatio of the device this platform is connected to.
    */
  def getDevicePixelRatio(): Double = js.native
  
  /**
    * @param {HTMLCanvasElement} canvas - The canvas for which to calculate the maximum size
    * @param {number} [width] - Parent element's content width
    * @param {number} [height] - Parent element's content height
    * @param {number} [aspectRatio] - The aspect ratio to maintain
    * @returns { width: number, height: number } the maximum size available.
    */
  def getMaximumSize(canvas: HTMLCanvasElement): Height = js.native
  def getMaximumSize(canvas: HTMLCanvasElement, width: Double): Height = js.native
  def getMaximumSize(canvas: HTMLCanvasElement, width: Double, height: Double): Height = js.native
  def getMaximumSize(canvas: HTMLCanvasElement, width: Double, height: Double, aspectRatio: Double): Height = js.native
  def getMaximumSize(canvas: HTMLCanvasElement, width: Double, height: Unit, aspectRatio: Double): Height = js.native
  def getMaximumSize(canvas: HTMLCanvasElement, width: Unit, height: Double): Height = js.native
  def getMaximumSize(canvas: HTMLCanvasElement, width: Unit, height: Double, aspectRatio: Double): Height = js.native
  def getMaximumSize(canvas: HTMLCanvasElement, width: Unit, height: Unit, aspectRatio: Double): Height = js.native
  
  /**
    * @param {HTMLCanvasElement} canvas
    * @returns {boolean} true if the canvas is attached to the platform, false if not.
    */
  def isAttached(canvas: HTMLCanvasElement): Boolean = js.native
  
  /**
    * Called at chart destruction time, releases any resources associated to the context
    * previously returned by the acquireContext() method.
    * @param {CanvasRenderingContext2D} context - The context2d instance
    * @returns {boolean} true if the method succeeded, else false
    */
  def releaseContext(context: CanvasRenderingContext2D): Boolean = js.native
  
  /**
    * Removes the specified listener previously registered with addEventListener.
    * @param {Chart} chart - Chart from which to remove the listener
    * @param {string} type - The ({@link ChartEvent}) type to remove
    * @param listener - The listener function to remove from the event target.
    */
  def removeEventListener(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    `type`: String,
    listener: js.Function1[/* e */ ChartEvent, Unit]
  ): Unit = js.native
  
  /**
    * Updates config with platform specific requirements
    * @param {ChartConfiguration | ChartConfigurationCustomTypes} config
    */
  def updateConfig(config: ChartConfiguration[ChartType, DefaultDataPoint[ChartType], Any]): Unit = js.native
  def updateConfig(config: ChartConfigurationCustomTypesPerDataset[ChartType, DefaultDataPoint[ChartType], Any]): Unit = js.native
}
