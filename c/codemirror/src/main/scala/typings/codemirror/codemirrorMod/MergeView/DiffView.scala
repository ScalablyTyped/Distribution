package typings.codemirror.codemirrorMod.MergeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffView extends js.Object {
  /**
    * Forces the view to reload.
    */
  def forceUpdate(): js.Function1[/* mode */ String, Unit]
  /**
    * Sets whether or not the merge view should show the differences between the editor views.
    */
  def setShowDifferences(showDifferences: Boolean): Unit
}

object DiffView {
  @scala.inline
  def apply(forceUpdate: () => js.Function1[/* mode */ String, Unit], setShowDifferences: Boolean => Unit): DiffView = {
    val __obj = js.Dynamic.literal(forceUpdate = js.Any.fromFunction0(forceUpdate), setShowDifferences = js.Any.fromFunction1(setShowDifferences))
  
    __obj.asInstanceOf[DiffView]
  }
}

