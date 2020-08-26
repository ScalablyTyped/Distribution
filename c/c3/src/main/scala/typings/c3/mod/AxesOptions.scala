package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxesOptions extends js.Object {
  /**
    * Switch x and y axis position.
    */
  var rotated: js.UndefOr[Boolean] = js.native
  /** x axis configuration. */
  var x: js.UndefOr[XAxisConfiguration] = js.native
  /** y axis configuration. */
  var y: js.UndefOr[YAxisConfigurationWithTime] = js.native
  /** y2 axis configuration. */
  var y2: js.UndefOr[YAxisConfiguration] = js.native
}

object AxesOptions {
  @scala.inline
  def apply(): AxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesOptions]
  }
  @scala.inline
  implicit class AxesOptionsOps[Self <: AxesOptions] (val x: Self) extends AnyVal {
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
    def setRotated(value: Boolean): Self = this.set("rotated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotated: Self = this.set("rotated", js.undefined)
    @scala.inline
    def setX(value: XAxisConfiguration): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: YAxisConfigurationWithTime): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setY2(value: YAxisConfiguration): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
  
}

