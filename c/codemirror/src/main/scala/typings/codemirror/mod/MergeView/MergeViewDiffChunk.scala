package typings.codemirror.mod.MergeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks changes in chunks from oroginal to new.
  */
@js.native
trait MergeViewDiffChunk extends js.Object {
  var editFrom: Double = js.native
  var editTo: Double = js.native
  var origFrom: Double = js.native
  var origTo: Double = js.native
}

object MergeViewDiffChunk {
  @scala.inline
  def apply(editFrom: Double, editTo: Double, origFrom: Double, origTo: Double): MergeViewDiffChunk = {
    val __obj = js.Dynamic.literal(editFrom = editFrom.asInstanceOf[js.Any], editTo = editTo.asInstanceOf[js.Any], origFrom = origFrom.asInstanceOf[js.Any], origTo = origTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeViewDiffChunk]
  }
  @scala.inline
  implicit class MergeViewDiffChunkOps[Self <: MergeViewDiffChunk] (val x: Self) extends AnyVal {
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
    def setEditFrom(value: Double): Self = this.set("editFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditTo(value: Double): Self = this.set("editTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigFrom(value: Double): Self = this.set("origFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigTo(value: Double): Self = this.set("origTo", value.asInstanceOf[js.Any])
  }
  
}

