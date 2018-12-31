package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs.MergeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeViewEditor
  extends codemirrorLib.codemirrorMod.CodeMirrorNs.Editor {
  /**
    * Left side of the merge view.
    */
  var left: DiffView = js.native
  /**
    * Right side of the merge view.
    */
  var right: DiffView = js.native
  /**
    * Returns the editor instance.
    */
  def editor(): codemirrorLib.codemirrorMod.CodeMirrorNs.Editor = js.native
  def leftChunks(): js.Array[MergeViewDiffChunk] = js.native
  def leftOriginal(): codemirrorLib.codemirrorMod.CodeMirrorNs.Editor = js.native
  def rightChunks(): js.Array[MergeViewDiffChunk] = js.native
  def rightOriginal(): codemirrorLib.codemirrorMod.CodeMirrorNs.Editor = js.native
  /**
    * Sets whether or not the merge view should show the differences between the editor views.
    */
  def setShowDifferences(showDifferences: scala.Boolean): scala.Unit = js.native
}

