package typings.blueprintjsTable.headerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderState extends js.Object {
  /**
    * Whether the component has a valid selection specified either via props
    * (i.e. controlled mode) or via a completed drag-select interaction. When
    * true, DragReorderable will know that it can override the click-and-drag
    * interactions that would normally be reserved for drag-select behavior.
    */
  var hasValidSelection: js.UndefOr[Boolean] = js.native
}

object IHeaderState {
  @scala.inline
  def apply(): IHeaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderState]
  }
  @scala.inline
  implicit class IHeaderStateOps[Self <: IHeaderState] (val x: Self) extends AnyVal {
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
    def setHasValidSelection(value: Boolean): Self = this.set("hasValidSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasValidSelection: Self = this.set("hasValidSelection", js.undefined)
  }
  
}

