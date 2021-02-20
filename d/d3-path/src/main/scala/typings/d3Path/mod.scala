package typings.d3Path

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-path", "path")
  @js.native
  def path(): Path_ = js.native
  
  @js.native
  trait Path_ extends StObject {
    
    /**
      * Draws a circular arc segment with the specified center ⟨x, y⟩, radius, startAngle and endAngle. If anticlockwise is true,
      * the arc is drawn in the anticlockwise direction; otherwise, it is drawn in the clockwise direction.
      * If the current point is not equal to the starting point of the arc, a straight line is drawn from the current point to the start of the arc.
      * Equivalent to context.arc and uses SVG’s elliptical arc curve commands.
      *
      * @param x x-Coordinate of the center point of the arc segment
      * @param y y-Coordinate of the center point of the arc segment
      * @param startAngle Start angle of arc segment
      * @param endAngle End angle of arc segment
      * @param anticlockwise Flag indicating directionality (true = anti-clockwise, false = clockwise)
      */
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    
    /**
      * Draws a circular arc segment with the specified radius that starts tangent to the line between the current point and the specified point ⟨x1, y1⟩
      * and ends tangent to the line between the specified points ⟨x1, y1⟩ and ⟨x2, y2⟩. If the first tangent point is not equal to the current point,
      * a straight line is drawn between the current point and the first tangent point. Equivalent to context.arcTo and uses SVG’s elliptical arc curve commands.
      *
      * @param x1 x-Coordinate of the first tangent point
      * @param y1 y-Coordinate of the first tangent point
      * @param x2 x-Coordinate of the second tangent point
      * @param y2 y-Coordinate of the second tangent point
      * @param r  Radius of the arc segment
      */
    def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
    
    /**
      * Draws a cubic Bézier segment from the current point to the specified point ⟨x, y⟩, with the specified control points ⟨cpx1, cpy1⟩ and ⟨cpx2, cpy2⟩.
      * Equivalent to context.bezierCurveTo and SVG’s cubic Bézier curve commands.
      *
      * @param cpx1 x-Coordinate of the first control point for the Bézier curve
      * @param cpy1 y-Coordinate of the first control point for the Bézier curve
      * @param cpx2 x-Coordinate of the second control point for the Bézier curve
      * @param cpy2 y-Coordinate of the second control point for the Bézier curve
      * @param x x-Coordinate of point to draw the curve to
      * @param y y-Coordinate of point to draw the curve to
      */
    def bezierCurveTo(cpx1: Double, cpy1: Double, cpx2: Double, cpy2: Double, x: Double, y: Double): Unit = js.native
    
    /**
      * Ends the current subpath and causes an automatic straight line to be drawn from the current point to the initial point of the current subpath.
      * Equivalent to context.closePath and SVG’s “closepath” command.
      */
    def closePath(): Unit = js.native
    
    /**
      * Draws a straight line from the current point to the specified point ⟨x, y⟩.
      * Equivalent to context.lineTo and SVG’s “lineto” command.
      *
      * @param x x-Coordinate of point to draw the line to
      * @param y y-Coordinate of point to draw the line to
      */
    def lineTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Move to the specified point ⟨x, y⟩. Equivalent to context.moveTo and SVG’s “moveto” command.
      *
      * @param x x-Coordinate of point to move to
      * @param y y-Coordinate of point to move to
      */
    def moveTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Draws a quadratic Bézier segment from the current point to the specified point ⟨x, y⟩, with the specified control point ⟨cpx, cpy⟩.
      * Equivalent to context.quadraticCurveTo and SVG’s quadratic Bézier curve commands.
      *
      * @param cpx x-Coordinate of the control point for the quadratic Bézier curve
      * @param cpy y-Coordinate of the control point for the quadratic Bézier curve
      * @param x x-Coordinate of point to draw the curve to
      * @param y y-Coordinate of point to draw the curve to
      */
    def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
    
    /**
      * Creates a new subpath containing just the four points ⟨x, y⟩, ⟨x + w, y⟩, ⟨x + w, y + h⟩, ⟨x, y + h⟩,
      * with those four points connected by straight lines, and then marks the subpath as closed. Equivalent to context.rect and uses SVG’s “lineto” commands.
      *
      * @param x x-Coordinate of starting point for drawing the rectangle
      * @param y y-Coordinate of starting point for drawing the rectangle
      * @param w Width of rectangle
      * @param h Height of rectangle
      */
    def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  }
}
