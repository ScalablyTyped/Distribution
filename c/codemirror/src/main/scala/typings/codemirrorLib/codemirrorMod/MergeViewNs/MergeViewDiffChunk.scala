package typings
package codemirrorLib.codemirrorMod.MergeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks changes in chunks from oroginal to new.
  */
trait MergeViewDiffChunk extends js.Object {
  var editFrom: scala.Double
  var editTo: scala.Double
  var origFrom: scala.Double
  var origTo: scala.Double
}

object MergeViewDiffChunk {
  @scala.inline
  def apply(editFrom: scala.Double, editTo: scala.Double, origFrom: scala.Double, origTo: scala.Double): MergeViewDiffChunk = {
    val __obj = js.Dynamic.literal(editFrom = editFrom, editTo = editTo, origFrom = origFrom, origTo = origTo)
  
    __obj.asInstanceOf[MergeViewDiffChunk]
  }
}

