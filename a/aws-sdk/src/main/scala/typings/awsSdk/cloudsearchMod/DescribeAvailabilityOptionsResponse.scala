package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAvailabilityOptionsResponse extends js.Object {
  /**
    * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain. 
    */
  var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.native
}

object DescribeAvailabilityOptionsResponse {
  @scala.inline
  def apply(): DescribeAvailabilityOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailabilityOptionsResponse]
  }
  @scala.inline
  implicit class DescribeAvailabilityOptionsResponseOps[Self <: DescribeAvailabilityOptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailabilityOptions(value: AvailabilityOptionsStatus): Self = this.set("AvailabilityOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityOptions: Self = this.set("AvailabilityOptions", js.undefined)
  }
  
}

