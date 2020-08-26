package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAvailabilityOptionsResponse extends js.Object {
  /**
    * The newly-configured availability options. Indicates whether Multi-AZ is enabled for the domain. 
    */
  var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.native
}

object UpdateAvailabilityOptionsResponse {
  @scala.inline
  def apply(): UpdateAvailabilityOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAvailabilityOptionsResponse]
  }
  @scala.inline
  implicit class UpdateAvailabilityOptionsResponseOps[Self <: UpdateAvailabilityOptionsResponse] (val x: Self) extends AnyVal {
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

