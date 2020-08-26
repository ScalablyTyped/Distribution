package typings.blueprintjsCore.popoverArrowMod

import typings.popperJs.mod.Placement
import typings.reactPopper.mod.PopperArrowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopoverArrowProps extends js.Object {
  var arrowProps: PopperArrowProps = js.native
  var placement: Placement = js.native
}

object IPopoverArrowProps {
  @scala.inline
  def apply(arrowProps: PopperArrowProps, placement: Placement): IPopoverArrowProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopoverArrowProps]
  }
  @scala.inline
  implicit class IPopoverArrowPropsOps[Self <: IPopoverArrowProps] (val x: Self) extends AnyVal {
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
    def setArrowProps(value: PopperArrowProps): Self = this.set("arrowProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
  }
  
}

