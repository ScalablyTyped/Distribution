package typings.chartJs.mod

import typings.chartJs.anon.Height
import typings.chartJs.distChunksHelpersDotcoreMod.c
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @typedef { import("../core/core.controller").default } Chart
  */
/**
  * Abstract class that allows abstracting platform dependencies away from the chart.
  */
@js.native
trait BasePlatform extends StObject {
  
  /**
    * Called at chart construction time, returns a context2d instance implementing
    * the [W3C Canvas 2D Context API standard]{@link https://www.w3.org/TR/2dcontext/}.
    * @param {HTMLCanvasElement} canvas - The canvas from which to acquire context (platform specific)
    * @param {number} [aspectRatio] - The chart options
    */
  def acquireContext(canvas: HTMLCanvasElement): scala.Unit = js.native
  def acquireContext(canvas: HTMLCanvasElement, aspectRatio: Double): scala.Unit = js.native
  
  /**
    * Registers the specified listener on the given chart.
    * @param {Chart} chart - Chart from which to listen for event
    * @param {string} type - The ({@link ChartEvent}) type to listen for
    * @param {function} listener - Receives a notification (an object that implements
    * the {@link ChartEvent} interface) when an event of the specified type occurs.
    */
  def addEventListener(chart: Chart1, `type`: String, listener: js.Function): scala.Unit = js.native
  
  /**
    * @returns {number} the current devicePixelRatio of the device this platform is connected to.
    */
  def getDevicePixelRatio(): Double = js.native
  
  /**
    * Returns the maximum size in pixels of given canvas element.
    * @param {HTMLCanvasElement} element
    * @param {number} [width] - content width of parent element
    * @param {number} [height] - content height of parent element
    * @param {number} [aspectRatio] - aspect ratio to maintain
    */
  def getMaximumSize(element: HTMLCanvasElement): Height = js.native
  def getMaximumSize(element: HTMLCanvasElement, width: Double): Height = js.native
  def getMaximumSize(element: HTMLCanvasElement, width: Double, height: Double): Height = js.native
  def getMaximumSize(element: HTMLCanvasElement, width: Double, height: Double, aspectRatio: Double): Height = js.native
  def getMaximumSize(element: HTMLCanvasElement, width: Double, height: scala.Unit, aspectRatio: Double): Height = js.native
  def getMaximumSize(element: HTMLCanvasElement, width: scala.Unit, height: Double): Height = js.native
  def getMaximumSize(element: HTMLCanvasElement, width: scala.Unit, height: Double, aspectRatio: Double): Height = js.native
  def getMaximumSize(element: HTMLCanvasElement, width: scala.Unit, height: scala.Unit, aspectRatio: Double): Height = js.native
  
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
    * @param {function} listener - The listener function to remove from the event target.
    */
  def removeEventListener(chart: Chart1, `type`: String, listener: js.Function): scala.Unit = js.native
  
  /**
    * Updates config with platform specific requirements
    * @param {import("../core/core.config").default} config
    */
  def updateConfig(config: c): scala.Unit = js.native
}
