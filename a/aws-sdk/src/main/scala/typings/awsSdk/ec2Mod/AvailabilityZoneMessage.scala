package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailabilityZoneMessage extends StObject {
  
  /**
    * The message about the Availability Zone, Local Zone, or Wavelength Zone.
    */
  var Message: js.UndefOr[String] = js.native
}
object AvailabilityZoneMessage {
  
  @scala.inline
  def apply(): AvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZoneMessage]
  }
  
  @scala.inline
  implicit class AvailabilityZoneMessageMutableBuilder[Self <: AvailabilityZoneMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
