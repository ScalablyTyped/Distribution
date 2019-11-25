package typings.codemirror.codemirrorMod.MergeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks changes in chunks from oroginal to new.
  */
trait MergeViewDiffChunk extends js.Object {
  var editFrom: Double
  var editTo: Double
  var origFrom: Double
  var origTo: Double
}

object MergeViewDiffChunk {
  @scala.inline
  def apply(editFrom: Double, editTo: Double, origFrom: Double, origTo: Double): MergeViewDiffChunk = {
    val __obj = js.Dynamic.literal(editFrom = editFrom.asInstanceOf[js.Any], editTo = editTo.asInstanceOf[js.Any], origFrom = origFrom.asInstanceOf[js.Any], origTo = origTo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MergeViewDiffChunk]
  }
}

