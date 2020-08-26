package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContainerPropertiesOptions extends TimeoutIntervalOptions {
  var leaseId: js.UndefOr[String] = js.native
}

object GetContainerPropertiesOptions {
  @scala.inline
  def apply(): GetContainerPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerPropertiesOptions]
  }
  @scala.inline
  implicit class GetContainerPropertiesOptionsOps[Self <: GetContainerPropertiesOptions] (val x: Self) extends AnyVal {
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
    def setLeaseId(value: String): Self = this.set("leaseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaseId: Self = this.set("leaseId", js.undefined)
  }
  
}

