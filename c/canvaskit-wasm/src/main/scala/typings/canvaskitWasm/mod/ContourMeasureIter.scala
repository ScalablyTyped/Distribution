package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContourMeasureIter
  extends StObject
     with EmbindObject[ContourMeasureIter] {
  
  /**
    *  Iterates through contours in path, returning a contour-measure object for each contour
    *  in the path. Returns null when it is done.
    *
    *  See SkContourMeasure.h for more details.
    */
  def next(): ContourMeasure | Null
}
object ContourMeasureIter {
  
  inline def apply(
    delete: () => Unit,
    deleteLater: () => Unit,
    isAliasOf: Any => Boolean,
    isDeleted: () => Boolean,
    next: () => ContourMeasure | Null
  ): ContourMeasureIter = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[ContourMeasureIter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContourMeasureIter] (val x: Self) extends AnyVal {
    
    inline def setNext(value: () => ContourMeasure | Null): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
