package typings.baseui.popoverMod

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverPrivateState extends js.Object {
  var arrowOffset: Offset = js.native
  var isAnimating: Boolean = js.native
  var isLayerMounted: Boolean = js.native
  var isMounted: Boolean = js.native
  var placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = js.native
  var popoverOffset: Offset = js.native
}

object PopoverPrivateState {
  @scala.inline
  def apply(
    arrowOffset: Offset,
    isAnimating: Boolean,
    isLayerMounted: Boolean,
    isMounted: Boolean,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top,
    popoverOffset: Offset
  ): PopoverPrivateState = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverPrivateState]
  }
  @scala.inline
  implicit class PopoverPrivateStateOps[Self <: PopoverPrivateState] (val x: Self) extends AnyVal {
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
    def setArrowOffset(value: Offset): Self = this.set("arrowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAnimating(value: Boolean): Self = this.set("isAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLayerMounted(value: Boolean): Self = this.set("isLayerMounted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMounted(value: Boolean): Self = this.set("isMounted", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopoverOffset(value: Offset): Self = this.set("popoverOffset", value.asInstanceOf[js.Any])
  }
  
}

