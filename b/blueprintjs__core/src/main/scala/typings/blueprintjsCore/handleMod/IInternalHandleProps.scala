package typings.blueprintjsCore.handleMod

import typings.blueprintjsCore.handlePropsMod.IHandleProps
import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInternalHandleProps extends IHandleProps {
  var disabled: js.UndefOr[Boolean] = js.native
  var label: ReactChild = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var stepSize: js.UndefOr[Double] = js.native
  var tickSize: js.UndefOr[Double] = js.native
  var tickSizeRatio: js.UndefOr[Double] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object IInternalHandleProps {
  @scala.inline
  def apply(label: ReactChild, value: Double): IInternalHandleProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInternalHandleProps]
  }
  @scala.inline
  implicit class IInternalHandlePropsOps[Self <: IInternalHandleProps] (val x: Self) extends AnyVal {
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
    def setLabel(value: ReactChild): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setStepSize(value: Double): Self = this.set("stepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepSize: Self = this.set("stepSize", js.undefined)
    @scala.inline
    def setTickSize(value: Double): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickSize: Self = this.set("tickSize", js.undefined)
    @scala.inline
    def setTickSizeRatio(value: Double): Self = this.set("tickSizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickSizeRatio: Self = this.set("tickSizeRatio", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

