package typings.codemirror.codemirrorMod.MergeViewNs

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
    val __obj = js.Dynamic.literal(editFrom = editFrom, editTo = editTo, origFrom = origFrom, origTo = origTo)
  
    __obj.asInstanceOf[MergeViewDiffChunk]
  }
}

