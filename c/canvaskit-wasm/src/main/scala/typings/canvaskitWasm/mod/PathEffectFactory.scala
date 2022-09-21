package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathEffectFactory extends StObject {
  
  /**
    * Returns a PathEffect that can turn sharp corners into rounded corners.
    * @param radius - if <=0, returns null
    */
  def MakeCorner(radius: Double): PathEffect | Null = js.native
  
  /**
    * Returns a PathEffect that add dashes to the path.
    *
    * See SkDashPathEffect.h for more details.
    *
    * @param intervals - even number of entries with even indicies specifying the length of
    *                    the "on" intervals, and the odd indices specifying the length of "off".
    * @param phase - offset length into the intervals array. Defaults to 0.
    */
  def MakeDash(intervals: js.Array[Double]): PathEffect = js.native
  def MakeDash(intervals: js.Array[Double], phase: Double): PathEffect = js.native
  
  /**
    * Returns a PathEffect that breaks path into segments of segLength length, and randomly move
    * the endpoints away from the original path by a maximum of deviation.
    * @param segLength - length of the subsegments.
    * @param dev - limit of the movement of the endpoints.
    * @param seedAssist - modifies the randomness. See SkDiscretePathEffect.h for more.
    */
  def MakeDiscrete(segLength: Double, dev: Double, seedAssist: Double): PathEffect = js.native
  
  /**
    * Returns a PathEffect that will fill the drawing path with a pattern made by applying
    * the given matrix to a repeating set of infinitely long lines of the given width.
    * For example, the scale of the provided matrix will determine how far apart the lines
    * should be drawn its rotation affects the lines' orientation.
    * @param width - must be >= 0
    * @param matrix
    */
  def MakeLine2D(width: Double, matrix: InputMatrix): PathEffect | Null = js.native
  
  /**
    * Returns a PathEffect which implements dashing by replicating the specified path.
    *   @param path The path to replicate (dash)
    *   @param advance The space between instances of path
    *   @param phase distance (mod advance) along path for its initial position
    *   @param style how to transform path at each point (based on the current
    *                position and tangent)
    */
  def MakePath1D(path: Path, advance: Double, phase: Double, style: Path1DEffectStyle): PathEffect | Null = js.native
  
  /**
    * Returns a PathEffect that will fill the drawing path with a pattern by repeating the
    * given path according to the provided matrix. For example, the scale of the matrix
    * determines how far apart the path instances should be drawn.
    * @param matrix
    * @param path
    */
  def MakePath2D(matrix: InputMatrix, path: Path): PathEffect | Null = js.native
}
