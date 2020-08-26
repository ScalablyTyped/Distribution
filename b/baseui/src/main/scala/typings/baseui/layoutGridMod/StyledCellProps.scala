package typings.baseui.layoutGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledCellProps extends js.Object {
  @JSName("$align")
  var $align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
  @JSName("$gridColumns")
  var $gridColumns: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridGaps")
  var $gridGaps: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridGutters")
  var $gridGutters: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridUnit")
  var $gridUnit: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
  ] = js.native
  @JSName("$order")
  var $order: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$skip")
  var $skip: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$span")
  var $span: js.UndefOr[Responsive[Double]] = js.native
}

object StyledCellProps {
  @scala.inline
  def apply(): StyledCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledCellProps]
  }
  @scala.inline
  implicit class StyledCellPropsOps[Self <: StyledCellProps] (val x: Self) extends AnyVal {
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
    def set$alignVarargs(value: ALIGNMENT*): Self = this.set("$align", js.Array(value :_*))
    @scala.inline
    def set$align(value: Responsive[ALIGNMENT]): Self = this.set("$align", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$align: Self = this.set("$align", js.undefined)
    @scala.inline
    def set$gridColumnsVarargs(value: Double*): Self = this.set("$gridColumns", js.Array(value :_*))
    @scala.inline
    def set$gridColumns(value: Responsive[Double]): Self = this.set("$gridColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gridColumns: Self = this.set("$gridColumns", js.undefined)
    @scala.inline
    def set$gridGapsVarargs(value: Double*): Self = this.set("$gridGaps", js.Array(value :_*))
    @scala.inline
    def set$gridGaps(value: Responsive[Double]): Self = this.set("$gridGaps", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gridGaps: Self = this.set("$gridGaps", js.undefined)
    @scala.inline
    def set$gridGuttersVarargs(value: Double*): Self = this.set("$gridGutters", js.Array(value :_*))
    @scala.inline
    def set$gridGutters(value: Responsive[Double]): Self = this.set("$gridGutters", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gridGutters: Self = this.set("$gridGutters", js.undefined)
    @scala.inline
    def set$gridUnit(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
    ): Self = this.set("$gridUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gridUnit: Self = this.set("$gridUnit", js.undefined)
    @scala.inline
    def set$orderVarargs(value: Double*): Self = this.set("$order", js.Array(value :_*))
    @scala.inline
    def set$order(value: Responsive[Double]): Self = this.set("$order", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$order: Self = this.set("$order", js.undefined)
    @scala.inline
    def set$skipVarargs(value: Double*): Self = this.set("$skip", js.Array(value :_*))
    @scala.inline
    def set$skip(value: Responsive[Double]): Self = this.set("$skip", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$skip: Self = this.set("$skip", js.undefined)
    @scala.inline
    def set$spanVarargs(value: Double*): Self = this.set("$span", js.Array(value :_*))
    @scala.inline
    def set$span(value: Responsive[Double]): Self = this.set("$span", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$span: Self = this.set("$span", js.undefined)
  }
  
}

