package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAvailabilityOptionsRequest extends js.Object {
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true. Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by setting the Multi-AZ option to false. 
    */
  var MultiAZ: Boolean = js.native
}

object UpdateAvailabilityOptionsRequest {
  @scala.inline
  def apply(DomainName: DomainName, MultiAZ: Boolean): UpdateAvailabilityOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], MultiAZ = MultiAZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAvailabilityOptionsRequest]
  }
  @scala.inline
  implicit class UpdateAvailabilityOptionsRequestOps[Self <: UpdateAvailabilityOptionsRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiAZ(value: Boolean): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
  }
  
}

