package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContourMeasure
  extends StObject
     with EmbindObject[ContourMeasure] {
  
  /**
    * Returns the given position and tangent line for the distance on the given contour.
    * The return value is 4 floats in this order: posX, posY, vecX, vecY.
    * @param distance - will be pinned between 0 and length().
    * @param output - if provided, the four floats of the PosTan will be copied into this array
    *                 instead of allocating a new one.
    */
  def getPosTan(distance: Double): js.typedarray.Float32Array = js.native
  def getPosTan(distance: Double, output: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Returns an Path representing the segement of this contour.
    * @param startD - will be pinned between 0 and length()
    * @param stopD - will be pinned between 0 and length()
    * @param startWithMoveTo
    */
  def getSegment(startD: Double, stopD: Double, startWithMoveTo: Boolean): Path = js.native
  
  /**
    * Returns true if the contour is closed.
    */
  def isClosed(): Boolean = js.native
  
  /**
    * Returns the length of this contour.
    */
  def length(): Double = js.native
}
