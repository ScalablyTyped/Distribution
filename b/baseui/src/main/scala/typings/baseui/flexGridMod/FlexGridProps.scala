package typings.baseui.flexGridMod

import typings.baseui.blockMod.BlockProps
import typings.baseui.blockMod.Responsive
import typings.baseui.blockMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexGridProps extends BlockProps {
  var flexGridColumnCount: js.UndefOr[Responsive[Double]] = js.native
  var flexGridColumnGap: js.UndefOr[Responsive[Scale]] = js.native
  var flexGridRowGap: js.UndefOr[Responsive[Scale]] = js.native
}

object FlexGridProps {
  @scala.inline
  def apply(): FlexGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGridProps]
  }
  @scala.inline
  implicit class FlexGridPropsOps[Self <: FlexGridProps] (val x: Self) extends AnyVal {
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
    def setFlexGridColumnCountVarargs(value: Double*): Self = this.set("flexGridColumnCount", js.Array(value :_*))
    @scala.inline
    def setFlexGridColumnCount(value: Responsive[Double]): Self = this.set("flexGridColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexGridColumnCount: Self = this.set("flexGridColumnCount", js.undefined)
    @scala.inline
    def setFlexGridColumnGapVarargs(value: Scale*): Self = this.set("flexGridColumnGap", js.Array(value :_*))
    @scala.inline
    def setFlexGridColumnGap(value: Responsive[Scale]): Self = this.set("flexGridColumnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexGridColumnGap: Self = this.set("flexGridColumnGap", js.undefined)
    @scala.inline
    def setFlexGridRowGapVarargs(value: Scale*): Self = this.set("flexGridRowGap", js.Array(value :_*))
    @scala.inline
    def setFlexGridRowGap(value: Responsive[Scale]): Self = this.set("flexGridRowGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexGridRowGap: Self = this.set("flexGridRowGap", js.undefined)
  }
  
}

