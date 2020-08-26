package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchIndexesOptions extends js.Object {
  /**
    * Timeout for the operation in milliseconds.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object WatchIndexesOptions {
  @scala.inline
  def apply(): WatchIndexesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchIndexesOptions]
  }
  @scala.inline
  implicit class WatchIndexesOptionsOps[Self <: WatchIndexesOptions] (val x: Self) extends AnyVal {
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
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

