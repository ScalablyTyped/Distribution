package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkPictureRecorder
  extends StObject
     with EmbindObject[SkPicture] {
  
  /**
    * Returns a canvas on which to draw. When done drawing, call finishRecordingAsPicture()
    *
    * @param bounds - a rect to cull the results.
    */
  def beginRecording(bounds: InputRect): SkCanvas
  
  /**
    * Returns the captured draw commands as a picture and invalidates the canvas returned earlier.
    */
  def finishRecordingAsPicture(): SkPicture
}
object SkPictureRecorder {
  
  @scala.inline
  def apply(
    beginRecording: InputRect => SkCanvas,
    delete: () => Unit,
    deleteAfter: () => Unit,
    finishRecordingAsPicture: () => SkPicture,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean
  ): SkPictureRecorder = {
    val __obj = js.Dynamic.literal(beginRecording = js.Any.fromFunction1(beginRecording), delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), finishRecordingAsPicture = js.Any.fromFunction0(finishRecordingAsPicture), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[SkPictureRecorder]
  }
  
  @scala.inline
  implicit class SkPictureRecorderMutableBuilder[Self <: SkPictureRecorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginRecording(value: InputRect => SkCanvas): Self = StObject.set(x, "beginRecording", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinishRecordingAsPicture(value: () => SkPicture): Self = StObject.set(x, "finishRecordingAsPicture", js.Any.fromFunction0(value))
  }
}
