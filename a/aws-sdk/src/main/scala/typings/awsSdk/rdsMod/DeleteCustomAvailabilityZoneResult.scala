package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCustomAvailabilityZoneResult extends js.Object {
  
  var CustomAvailabilityZone: js.UndefOr[typings.awsSdk.rdsMod.CustomAvailabilityZone] = js.native
}
object DeleteCustomAvailabilityZoneResult {
  
  @scala.inline
  def apply(): DeleteCustomAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCustomAvailabilityZoneResult]
  }
  
  @scala.inline
  implicit class DeleteCustomAvailabilityZoneResultOps[Self <: DeleteCustomAvailabilityZoneResult] (val x: Self) extends AnyVal {
    
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
    def setCustomAvailabilityZone(value: CustomAvailabilityZone): Self = this.set("CustomAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAvailabilityZone: Self = this.set("CustomAvailabilityZone", js.undefined)
  }
}
