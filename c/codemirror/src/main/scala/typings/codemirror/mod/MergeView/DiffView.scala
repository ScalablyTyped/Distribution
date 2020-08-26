package typings.codemirror.mod.MergeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffView extends js.Object {
  /**
    * Forces the view to reload.
    */
  def forceUpdate(): js.Function1[/* mode */ String, Unit] = js.native
  /**
    * Sets whether or not the merge view should show the differences between the editor views.
    */
  def setShowDifferences(showDifferences: Boolean): Unit = js.native
}

object DiffView {
  @scala.inline
  def apply(forceUpdate: () => js.Function1[/* mode */ String, Unit], setShowDifferences: Boolean => Unit): DiffView = {
    val __obj = js.Dynamic.literal(forceUpdate = js.Any.fromFunction0(forceUpdate), setShowDifferences = js.Any.fromFunction1(setShowDifferences))
    __obj.asInstanceOf[DiffView]
  }
  @scala.inline
  implicit class DiffViewOps[Self <: DiffView] (val x: Self) extends AnyVal {
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
    def setForceUpdate(value: () => js.Function1[/* mode */ String, Unit]): Self = this.set("forceUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def setSetShowDifferences(value: Boolean => Unit): Self = this.set("setShowDifferences", js.Any.fromFunction1(value))
  }
  
}

