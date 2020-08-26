package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDetails extends js.Object {
  /**
    * Details on the Amazon EC2 resource.
    */
  var EC2ResourceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.EC2ResourceDetails] = js.native
}

object ResourceDetails {
  @scala.inline
  def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  @scala.inline
  implicit class ResourceDetailsOps[Self <: ResourceDetails] (val x: Self) extends AnyVal {
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
    def setEC2ResourceDetails(value: EC2ResourceDetails): Self = this.set("EC2ResourceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2ResourceDetails: Self = this.set("EC2ResourceDetails", js.undefined)
  }
  
}

