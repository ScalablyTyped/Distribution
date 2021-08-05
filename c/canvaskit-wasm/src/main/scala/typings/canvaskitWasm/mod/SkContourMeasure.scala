package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkContourMeasure
  extends StObject
     with EmbindObject[SkContourMeasure] {
  
  /**
    * Returns the given position and tangent line for the distance on the given contour.
    * @param distance - will be pinned between 0 and length().
    */
  def getPosTan(distance: Double): PosTan
  
  /**
    * Returns an SkPath representing the segement of this contour.
    * @param startD - will be pinned between 0 and length()
    * @param stopD - will be pinned between 0 and length()
    * @param startWithMoveTo
    */
  def getSegment(startD: Double, stopD: Double, startWithMoveTo: Boolean): SkPath
  
  /**
    * Returns true if the contour is closed.
    */
  def isClosed(): Boolean
  
  /**
    * Returns the length of this contour.
    */
  def length(): Double
}
object SkContourMeasure {
  
  inline def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    getPosTan: Double => PosTan,
    getSegment: (Double, Double, Boolean) => SkPath,
    isAliasOf: js.Any => Boolean,
    isClosed: () => Boolean,
    isDeleted: () => Boolean,
    length: () => Double
  ): SkContourMeasure = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getPosTan = js.Any.fromFunction1(getPosTan), getSegment = js.Any.fromFunction3(getSegment), isAliasOf = js.Any.fromFunction1(isAliasOf), isClosed = js.Any.fromFunction0(isClosed), isDeleted = js.Any.fromFunction0(isDeleted), length = js.Any.fromFunction0(length))
    __obj.asInstanceOf[SkContourMeasure]
  }
  
  extension [Self <: SkContourMeasure](x: Self) {
    
    inline def setGetPosTan(value: Double => PosTan): Self = StObject.set(x, "getPosTan", js.Any.fromFunction1(value))
    
    inline def setGetSegment(value: (Double, Double, Boolean) => SkPath): Self = StObject.set(x, "getSegment", js.Any.fromFunction3(value))
    
    inline def setIsClosed(value: () => Boolean): Self = StObject.set(x, "isClosed", js.Any.fromFunction0(value))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
  }
}
