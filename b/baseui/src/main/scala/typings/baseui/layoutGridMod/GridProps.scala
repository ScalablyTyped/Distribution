package typings.baseui.layoutGridMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps extends js.Object {
  var align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
  var behavior: js.UndefOr[BEHAVIOR] = js.native
  var children: ReactNode = js.native
  var gridColumns: js.UndefOr[Responsive[Double]] = js.native
  var gridGaps: js.UndefOr[Responsive[Double]] = js.native
  var gridGutters: js.UndefOr[Responsive[Double]] = js.native
  var gridMargins: js.UndefOr[Responsive[Double]] = js.native
  var gridMaxWidth: js.UndefOr[Double] = js.native
  var gridUnit: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
  ] = js.native
  var overrides: js.UndefOr[typings.baseui.anon.Grid] = js.native
}

object GridProps {
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
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
    def setAlignVarargs(value: ALIGNMENT*): Self = this.set("align", js.Array(value :_*))
    @scala.inline
    def setAlign(value: Responsive[ALIGNMENT]): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBehavior(value: BEHAVIOR): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setGridColumnsVarargs(value: Double*): Self = this.set("gridColumns", js.Array(value :_*))
    @scala.inline
    def setGridColumns(value: Responsive[Double]): Self = this.set("gridColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumns: Self = this.set("gridColumns", js.undefined)
    @scala.inline
    def setGridGapsVarargs(value: Double*): Self = this.set("gridGaps", js.Array(value :_*))
    @scala.inline
    def setGridGaps(value: Responsive[Double]): Self = this.set("gridGaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridGaps: Self = this.set("gridGaps", js.undefined)
    @scala.inline
    def setGridGuttersVarargs(value: Double*): Self = this.set("gridGutters", js.Array(value :_*))
    @scala.inline
    def setGridGutters(value: Responsive[Double]): Self = this.set("gridGutters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridGutters: Self = this.set("gridGutters", js.undefined)
    @scala.inline
    def setGridMarginsVarargs(value: Double*): Self = this.set("gridMargins", js.Array(value :_*))
    @scala.inline
    def setGridMargins(value: Responsive[Double]): Self = this.set("gridMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridMargins: Self = this.set("gridMargins", js.undefined)
    @scala.inline
    def setGridMaxWidth(value: Double): Self = this.set("gridMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridMaxWidth: Self = this.set("gridMaxWidth", js.undefined)
    @scala.inline
    def setGridUnit(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
    ): Self = this.set("gridUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridUnit: Self = this.set("gridUnit", js.undefined)
    @scala.inline
    def setOverrides(value: typings.baseui.anon.Grid): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

