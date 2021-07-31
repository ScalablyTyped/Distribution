package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkContourMeasureIter
  extends StObject
     with EmbindObject[SkContourMeasureIter] {
  
  /**
    *  Iterates through contours in path, returning a contour-measure object for each contour
    *  in the path. Returns null when it is done.
    *
    *  See SkContourMeasure.h for more details.
    */
  def next(): SkContourMeasure | Null
}
object SkContourMeasureIter {
  
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    next: () => SkContourMeasure | Null
  ): SkContourMeasureIter = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[SkContourMeasureIter]
  }
  
  @scala.inline
  implicit class SkContourMeasureIterMutableBuilder[Self <: SkContourMeasureIter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: () => SkContourMeasure | Null): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
