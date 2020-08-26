package typings.deoxxaContentType.ContentType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectOptions extends js.Object {
  var sortAccepted: js.UndefOr[Boolean] = js.native
  var sortAvailable: js.UndefOr[Boolean] = js.native
}

object SelectOptions {
  @scala.inline
  def apply(): SelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectOptions]
  }
  @scala.inline
  implicit class SelectOptionsOps[Self <: SelectOptions] (val x: Self) extends AnyVal {
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
    def setSortAccepted(value: Boolean): Self = this.set("sortAccepted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortAccepted: Self = this.set("sortAccepted", js.undefined)
    @scala.inline
    def setSortAvailable(value: Boolean): Self = this.set("sortAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortAvailable: Self = this.set("sortAvailable", js.undefined)
  }
  
}

