package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathConstructorAndFactory
  extends StObject
     with DefaultConstructor[Path] {
  
  /**
    * Returns true if the two paths contain equal verbs and equal weights.
    * @param path1 first path to compate
    * @param path2 second path to compare
    * @return      true if Path can be interpolated equivalent
    */
  def CanInterpolate(path1: Path, path2: Path): Boolean = js.native
  
  /**
    * Creates a new path from the given list of path commands. If this fails, null will be
    * returned instead.
    * @param cmds
    */
  def MakeFromCmds(cmds: InputCommands): Path | Null = js.native
  
  /**
    * Creates a new path by combining the given paths according to op. If this fails, null will
    * be returned instead.
    * @param one
    * @param two
    * @param op
    */
  def MakeFromOp(one: Path, two: Path, op: PathOp): Path | Null = js.native
  
  /**
    * Interpolates between Path with point array of equal size.
    * Copy verb array and weights to result, and set result path to a weighted
    * average of this path array and ending path.
    *
    *  weight is most useful when between zero (ending path) and
    *  one (this path); will work with values outside of this
    *  range.
    *
    * interpolate() returns undefined if path is not
    * the same size as ending path. Call isInterpolatable() to check Path
    * compatibility prior to calling interpolate().
    *
    * @param start path to interpolate from
    * @param end  path to interpolate with
    * @param weight  contribution of this path, and
    *                 one minus contribution of ending path
    * @return        Path replaced by interpolated averages or null if
    *                not interpolatable
    */
  def MakeFromPathInterpolation(start: Path, end: Path, weight: Double): Path | Null = js.native
  
  /**
    * Creates a new path from the provided SVG string. If this fails, null will be
    * returned instead.
    * @param str
    */
  def MakeFromSVGString(str: String): Path | Null = js.native
  
  /**
    * Creates a new path using the provided verbs and associated points and weights. The process
    * reads the first verb from verbs and then the appropriate number of points from the
    * FlattenedPointArray (e.g. 2 points for moveTo, 4 points for quadTo, etc). If the verb is
    * a conic, a weight will be read from the WeightList.
    * If the data is malformed (e.g. not enough points), the resulting path will be incomplete.
    * @param verbs - the verbs that create this path, in the order of being drawn.
    * @param points - represents n points with 2n floats.
    * @param weights - used if any of the verbs are conics, can be omitted otherwise.
    */
  def MakeFromVerbsPointsWeights(verbs: VerbList, points: InputFlattenedPointArray): Path = js.native
  def MakeFromVerbsPointsWeights(verbs: VerbList, points: InputFlattenedPointArray, weights: WeightList): Path = js.native
}
