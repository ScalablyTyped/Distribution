package typings.blueprintjsCore.progressBarMod

import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressBarProps
  extends IProps
     with IIntentProps {
  /**
    * Whether the background should animate.
    * @default true
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * Whether the background should be striped.
    * @default true
    */
  var stripes: js.UndefOr[Boolean] = js.native
  /**
    * A value between 0 and 1 (inclusive) representing how far along the operation is.
    * Values below 0 or above 1 will be interpreted as 0 or 1, respectively.
    * Omitting this prop will result in an "indeterminate" progress meter that fills the entire bar.
    */
  var value: js.UndefOr[Double] = js.native
}

object IProgressBarProps {
  @scala.inline
  def apply(): IProgressBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressBarProps]
  }
  @scala.inline
  implicit class IProgressBarPropsOps[Self <: IProgressBarProps] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setStripes(value: Boolean): Self = this.set("stripes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripes: Self = this.set("stripes", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

