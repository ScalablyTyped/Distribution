package typings.canvasRenderer

import typings.canvasRenderer.canvasMod.Canvas
import typings.canvasRenderer.canvasRendererStrings.evenodd
import typings.canvasRenderer.canvasRendererStrings.nonzero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasContextMod {
  
  @js.native
  trait CanvasContext extends StObject {
    
    /**
      * Adds an arc to the current path.
      * @param x  X coordinate of the center of the arc.
      * @param y  Y coordinate of the center of the arc.
      * @param radius  Radius of the arc.
      * @param startAngle  The angle in radians at which the arc starts, measured clockwise from the positive x axis.
      * @param endAngle  The angle in radians at which the arc end, measured clockwise from the positive x axis.
      * @param anticlockwise  Specifies whether the arc will be drawn counter clockwise. Default is clockwise.
      */
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    
    /**
      * Removes all existing subpaths and begins a new path.
      */
    def beginPath(): Unit = js.native
    
    /**
      * Gets the canvas for which the context was created.
      */
    val canvas: Canvas = js.native
    
    /**
      * Fills a specified rectangle with fully transparent black without blending with the background or affecting the current paths.
      * @param x  X coordinate of the left side of the rectangle.
      * @param y  Y coordinate of the top of the rectangle.
      * @param width  Width of the rectangle.
      * @param height  Height of the rectangle.
      */
    def clearRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * Starts a new subpath that begins in the same point as the start and end point of the previous one.
      */
    def closePath(): Unit = js.native
    
    /**
      * Fills the defined paths.
      * @param windingRule  The winding rule to be used for determining
      *     which areas are covered by the current path. Default is `"nonzero"`.
      */
    def fill(): Unit = js.native
    def fill(windingRule: nonzero | evenodd): Unit = js.native
    
    /**
      * Fills a specified rectangle without affecting the current paths.
      * @param x  X coordinate of the left side of the rectangle.
      * @param y  Y coordinate of the top of the rectangle.
      * @param width  Width of the rectangle.
      * @param height  Height of the rectangle.
      */
    def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * Specifies the fill color that is used when the fill method is called. Allowed values are:
      * - 32 bit integers on the format 0xRRGGBBAA
      * - strings on the format `"#RGB"`
      * - strings on the format `"#RGBA"`
      * - strings on the format `"#RRGGBB"`
      * - strings on the format `"#RRGGBBAA"`
      * - strings on the format `"rgb(255, 255, 255)"`
      * - strings on the format `"rgb(255, 255, 255, 0.5)"`
      * - strings on the format `"rgb(255, 255, 255, 50%)"`
      * - strings on the format `"rgba(255, 255, 255, 0.5)"`
      * - strings on the format `"rgba(255, 255, 255, 50%)"`
      * - strings on the format `"hsl(134, 50%, 50%)"`
      * - strings on the format `"hsl(134, 50%, 50%, 0.5)"`
      * - strings on the format `"hsl(134, 50%, 50%, 50%)"`
      * - strings on the format `"hsla(134, 50%, 50%, 0.5)"`
      * - strings on the format `"hsla(134, 50%, 50%, 50%)"`
      * - strings on the format `"hwb(134, 50%, 50%)"`
      * - strings on the format `"hwb(134, 50%, 50%, 0.5)"`
      * - strings on the format `"hwb(134, 50%, 50%, 50%)"`
      */
    var fillStyle: Double | String = js.native
    
    /**
      * Inserts an edge between the last and specified position.
      * @param x  Target X coordinate.
      * @param y  Target Y coordinate.
      */
    def lineTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Begins a new subpath by moving the cursor to the specified position.
      * @param x  X coordinate.
      * @param y  Y coordinate.
      */
    def moveTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Restores the current transformation to the identity matrix.
      */
    def resetTransform(): Unit = js.native
    
    /**
      * Restores the last drawing state that was saved with `CanvasContext.save()`, and then removes it from the state stack.
      */
    def restore(): Unit = js.native
    
    /**
      * Applies a rotation transformation on top of the current transform around the current canvas origo.
      * @param angle  Angle in radians measured clockwise from the positive x axis.
      */
    def rotate(angle: Double): Unit = js.native
    
    /**
      * Saves the current drawing state to a stack. The state can later be restored by calling `CanvasContext.restore()`.
      * 
      * The following state is included when being saved to the stack:
      * - Current transformation matrix
      * - Current fill style
      */
    def save(): Unit = js.native
    
    /**
      * Applies a scale transformation on top of the current transform.
      * @param x  Scale in the horizontal direction. `1` means no horizontal scaling.
      * @param y  Scale in the vertical direction. `1` means no vertical scaling.
      */
    def scale(x: Double, y: Double): Unit = js.native
    
    /**
      * Sets the transformation matrix to the specified matrix.
      */
    def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    /**
      * Multiplies the current transformation matrix with the specified values.
      */
    def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    /**
      * Applies a translation transformation on top of the current transform.
      * @param x  Distance to move in the horizontal direction in pixels.
      * @param y  Distance to move in the vertical direction in pixels.
      */
    def translate(x: Double, y: Double): Unit = js.native
  }
}
