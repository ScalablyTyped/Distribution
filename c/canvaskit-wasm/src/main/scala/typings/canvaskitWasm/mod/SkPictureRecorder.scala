package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkPictureRecorder extends SkObject[SkPictureRecorder] {
  def beginRecording(rect: SkRect): SkCanvas
  def finishRecordingAsPicture(): SkPicture
}

object SkPictureRecorder {
  @scala.inline
  def apply(
    beginRecording: SkRect => SkCanvas,
    delete: () => Unit,
    deleteAfter: () => Unit,
    finishRecordingAsPicture: () => SkPicture,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean
  ): SkPictureRecorder = {
    val __obj = js.Dynamic.literal(beginRecording = js.Any.fromFunction1(beginRecording), delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), finishRecordingAsPicture = js.Any.fromFunction0(finishRecordingAsPicture), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[SkPictureRecorder]
  }
}

