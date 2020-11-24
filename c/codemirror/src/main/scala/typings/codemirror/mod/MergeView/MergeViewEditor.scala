package typings.codemirror.mod.MergeView

import typings.codemirror.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeViewEditor extends Editor {
  
  /**
    * Returns the editor instance.
    */
  def editor(): Editor = js.native
  
  /**
    * Left side of the merge view.
    */
  var left: DiffView = js.native
  
  def leftChunks(): js.Array[MergeViewDiffChunk] = js.native
  
  def leftOriginal(): Editor = js.native
  
  /**
    * Right side of the merge view.
    */
  var right: DiffView = js.native
  
  def rightChunks(): js.Array[MergeViewDiffChunk] = js.native
  
  def rightOriginal(): Editor = js.native
  
  /**
    * Sets whether or not the merge view should show the differences between the editor views.
    */
  def setShowDifferences(showDifferences: Boolean): Unit = js.native
}
