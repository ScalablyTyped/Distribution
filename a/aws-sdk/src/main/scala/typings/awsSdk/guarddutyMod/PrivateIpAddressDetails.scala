package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateIpAddressDetails extends StObject {
  
  /**
    * The private DNS name of the EC2 instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  
  /**
    * The private IP address of the EC2 instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}
object PrivateIpAddressDetails {
  
  @scala.inline
  def apply(): PrivateIpAddressDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateIpAddressDetails]
  }
  
  @scala.inline
  implicit class PrivateIpAddressDetailsMutableBuilder[Self <: PrivateIpAddressDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}
