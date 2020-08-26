package typings.c3.mod

import typings.c3.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOptions extends js.Object {
  /**
    * Set if null data point will be connected or not.
    * If `true` set, the region of null data will be connected without any data point.
    * If `false` set, the region of null data will not be connected and get empty.
    */
  var connectNull: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[`3`] = js.native
}

object LineOptions {
  @scala.inline
  def apply(): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOptions]
  }
  @scala.inline
  implicit class LineOptionsOps[Self <: LineOptions] (val x: Self) extends AnyVal {
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
    def setConnectNull(value: Boolean): Self = this.set("connectNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectNull: Self = this.set("connectNull", js.undefined)
    @scala.inline
    def setStep(value: `3`): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

