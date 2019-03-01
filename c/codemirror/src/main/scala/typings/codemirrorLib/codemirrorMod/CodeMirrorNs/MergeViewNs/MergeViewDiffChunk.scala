package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs.MergeViewNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editFrom")(editFrom)
    __obj.updateDynamic("editTo")(editTo)
    __obj.updateDynamic("origFrom")(origFrom)
    __obj.updateDynamic("origTo")(origTo)
    __obj.asInstanceOf[MergeViewDiffChunk]
  }
}

