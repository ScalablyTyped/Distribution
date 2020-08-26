package typings.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalOptions extends js.Object {
  /**
    * Whether to allow setting the canvas image size, as well as keep it correctly sized if the window changes size
    * @default false
    */
  var resize: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use an asynchronous web worker to render the confetti animation, whenever possible
    * @default false
    */
  var useWorker: js.UndefOr[Boolean] = js.native
}

object GlobalOptions {
  @scala.inline
  def apply(): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalOptions]
  }
  @scala.inline
  implicit class GlobalOptionsOps[Self <: GlobalOptions] (val x: Self) extends AnyVal {
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
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setUseWorker(value: Boolean): Self = this.set("useWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseWorker: Self = this.set("useWorker", js.undefined)
  }
  
}

