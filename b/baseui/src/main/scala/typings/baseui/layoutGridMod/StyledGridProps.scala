package typings.baseui.layoutGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledGridProps extends js.Object {
  @JSName("$align")
  var $align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
  @JSName("$behavior")
  var $behavior: js.UndefOr[BEHAVIOR] = js.native
  @JSName("$gridGutters")
  var $gridGutters: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridMargins")
  var $gridMargins: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridMaxWidth")
  var $gridMaxWidth: js.UndefOr[Double] = js.native
  @JSName("$gridUnit")
  var $gridUnit: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
  ] = js.native
}

object StyledGridProps {
  @scala.inline
  def apply(): StyledGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledGridProps]
  }
  @scala.inline
  implicit class StyledGridPropsOps[Self <: StyledGridProps] (val x: Self) extends AnyVal {
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
    def set$behavior(value: BEHAVIOR): Self = this.set("$behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$behavior: Self = this.set("$behavior", js.undefined)
    @scala.inline
    def set$gridGuttersVarargs(value: Double*): Self = this.set("$gridGutters", js.Array(value :_*))
    @scala.inline
    def set$gridGutters(value: Responsive[Double]): Self = this.set("$gridGutters", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gridGutters: Self = this.set("$gridGutters", js.undefined)
    @scala.inline
    def set$gridMarginsVarargs(value: Double*): Self = this.set("$gridMargins", js.Array(value :_*))
    @scala.inline
    def set$gridMargins(value: Responsive[Double]): Self = this.set("$gridMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gridMargins: Self = this.set("$gridMargins", js.undefined)
    @scala.inline
    def set$gridMaxWidth(value: Double): Self = this.set("$gridMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gridMaxWidth: Self = this.set("$gridMaxWidth", js.undefined)
    @scala.inline
    def set$gridUnit(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
    ): Self = this.set("$gridUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gridUnit: Self = this.set("$gridUnit", js.undefined)
  }
  
}

