package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkContourMeasureIter extends EmbindObject[SkContourMeasureIter] {
  
  /**
    *  Iterates through contours in path, returning a contour-measure object for each contour
    *  in the path. Returns null when it is done.
    *
    *  See SkContourMeasure.h for more details.
    */
  def next(): SkContourMeasure | Null = js.native
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
  implicit class SkContourMeasureIterOps[Self <: SkContourMeasureIter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNext(value: () => SkContourMeasure | Null): Self = this.set("next", js.Any.fromFunction0(value))
  }
}
