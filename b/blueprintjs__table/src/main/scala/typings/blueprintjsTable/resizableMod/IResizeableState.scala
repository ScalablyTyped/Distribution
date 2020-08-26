package typings.blueprintjsTable.resizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeableState extends js.Object {
  /**
    * The dimensional size, respecting minimum and maximum constraints.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * The dimensional size, ignoring minimum and maximum constraints.
    */
  var unclampedSize: js.UndefOr[Double] = js.native
}

object IResizeableState {
  @scala.inline
  def apply(): IResizeableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizeableState]
  }
  @scala.inline
  implicit class IResizeableStateOps[Self <: IResizeableState] (val x: Self) extends AnyVal {
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setUnclampedSize(value: Double): Self = this.set("unclampedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnclampedSize: Self = this.set("unclampedSize", js.undefined)
  }
  
}

