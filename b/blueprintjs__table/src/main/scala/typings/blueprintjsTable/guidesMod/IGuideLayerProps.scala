package typings.blueprintjsTable.guidesMod

import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGuideLayerProps extends IProps {
  /**
    *  The top-offset location of the horizontal guides
    */
  var horizontalGuides: js.UndefOr[js.Array[Double]] = js.native
  /**
    *  The left-offset location of the vertical guides
    */
  var verticalGuides: js.UndefOr[js.Array[Double]] = js.native
}

object IGuideLayerProps {
  @scala.inline
  def apply(): IGuideLayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGuideLayerProps]
  }
  @scala.inline
  implicit class IGuideLayerPropsOps[Self <: IGuideLayerProps] (val x: Self) extends AnyVal {
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
    def setHorizontalGuidesVarargs(value: Double*): Self = this.set("horizontalGuides", js.Array(value :_*))
    @scala.inline
    def setHorizontalGuides(value: js.Array[Double]): Self = this.set("horizontalGuides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalGuides: Self = this.set("horizontalGuides", js.undefined)
    @scala.inline
    def setVerticalGuidesVarargs(value: Double*): Self = this.set("verticalGuides", js.Array(value :_*))
    @scala.inline
    def setVerticalGuides(value: js.Array[Double]): Self = this.set("verticalGuides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalGuides: Self = this.set("verticalGuides", js.undefined)
  }
  
}

