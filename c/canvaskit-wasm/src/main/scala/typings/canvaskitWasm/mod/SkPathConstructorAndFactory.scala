package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkPathConstructorAndFactory
  extends StObject
     with DefaultConstructor[SkPath] {
  
  /**
    * Creates a new path from the given list of path commands.
    * @param cmds
    */
  def MakeFromCmds(cmds: js.Array[PathCommand]): SkPath = js.native
  
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
  def MakeFromVerbsPointsWeights(verbs: VerbList, points: InputFlattenedPointArray): SkPath = js.native
  def MakeFromVerbsPointsWeights(verbs: VerbList, points: InputFlattenedPointArray, weights: WeightList): SkPath = js.native
}
