package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputLocationRef extends js.Object {
  var DestinationRefId: js.UndefOr[string] = js.native
}

object OutputLocationRef {
  @scala.inline
  def apply(): OutputLocationRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocationRef]
  }
  @scala.inline
  implicit class OutputLocationRefOps[Self <: OutputLocationRef] (val x: Self) extends AnyVal {
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
    def setDestinationRefId(value: string): Self = this.set("DestinationRefId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationRefId: Self = this.set("DestinationRefId", js.undefined)
  }
  
}

