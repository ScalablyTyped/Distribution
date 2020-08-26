package typings.cpx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptions extends AsyncOptions {
  /** Flag to not copy at the initial time of watch. */
  var initialCopy: js.UndefOr[Boolean] = js.native
}

object WatchOptions {
  @scala.inline
  def apply(): WatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions]
  }
  @scala.inline
  implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
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
    def setInitialCopy(value: Boolean): Self = this.set("initialCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialCopy: Self = this.set("initialCopy", js.undefined)
  }
  
}

