package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCustomAvailabilityZoneMessage extends StObject {
  
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
  implicit class DeleteCustomAvailabilityZoneMessageMutableBuilder[Self <: DeleteCustomAvailabilityZoneMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAvailabilityZoneId(value: String): Self = StObject.set(x, "CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
  }
}
