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
    forceUpdate: js.Function0[js.Function1[/* mode */ java.lang.String, scala.Unit]],
    setShowDifferences: js.Function1[scala.Boolean, scala.Unit]
  ): DiffView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceUpdate")(forceUpdate)
    __obj.updateDynamic("setShowDifferences")(setShowDifferences)
    __obj.asInstanceOf[DiffView]
  }
}

