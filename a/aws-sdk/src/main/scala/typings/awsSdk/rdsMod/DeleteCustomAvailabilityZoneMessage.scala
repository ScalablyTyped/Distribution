package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCustomAvailabilityZoneMessage extends js.Object {
  
  /**
    * The custom AZ identifier.
    */
  var CustomAvailabilityZoneId: String = js.native
}
object DeleteCustomAvailabilityZoneMessage {
  
  @scala.inline
  def apply(CustomAvailabilityZoneId: String): DeleteCustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal(CustomAvailabilityZoneId = CustomAvailabilityZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomAvailabilityZoneMessage]
  }
  
  @scala.inline
  implicit class DeleteCustomAvailabilityZoneMessageOps[Self <: DeleteCustomAvailabilityZoneMessage] (val x: Self) extends AnyVal {
    
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
    def setCustomAvailabilityZoneId(value: String): Self = this.set("CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
  }
}
