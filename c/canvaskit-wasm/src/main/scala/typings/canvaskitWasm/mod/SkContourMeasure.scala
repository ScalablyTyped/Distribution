package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkContourMeasure extends EmbindObject[SkContourMeasure] {
  
  /**
    * Returns the given position and tangent line for the distance on the given contour.
    * @param distance - will be pinned between 0 and length().
    */
  def getPosTan(distance: Double): PosTan = js.native
  
  /**
    * Returns an SkPath representing the segement of this contour.
    * @param startD - will be pinned between 0 and length()
    * @param stopD - will be pinned between 0 and length()
    * @param startWithMoveTo
    */
  def getSegment(startD: Double, stopD: Double, startWithMoveTo: Boolean): SkPath = js.native
  
  /**
    * Returns true if the contour is closed.
    */
  def isClosed(): Boolean = js.native
  
  /**
    * Returns the length of this contour.
    */
  def length(): Double = js.native
}
object SkContourMeasure {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SkContourMeasureOps[Self <: SkContourMeasure] (val x: Self) extends AnyVal {
    
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
    def setGetPosTan(value: Double => PosTan): Self = this.set("getPosTan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSegment(value: (Double, Double, Boolean) => SkPath): Self = this.set("getSegment", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsClosed(value: () => Boolean): Self = this.set("isClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
  }
}
