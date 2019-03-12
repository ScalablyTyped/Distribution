package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs.MergeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffView extends js.Object {
  /**
    * Forces the view to reload.
    */
  def forceUpdate(): js.Function1[/* mode */ java.lang.String, scala.Unit]
  /**
    * Sets whether or not the merge view should show the differences between the editor views.
    */
  def setShowDifferences(showDifferences: scala.Boolean): scala.Unit
}

object DiffView {
  @scala.inline
  def apply(
    forceUpdate: () => js.Function1[/* mode */ java.lang.String, scala.Unit],
    setShowDifferences: scala.Boolean => scala.Unit
  ): DiffView = {
    val __obj = js.Dynamic.literal(forceUpdate = js.Any.fromFunction0(forceUpdate), setShowDifferences = js.Any.fromFunction1(setShowDifferences))
  
    __obj.asInstanceOf[DiffView]
  }
}

