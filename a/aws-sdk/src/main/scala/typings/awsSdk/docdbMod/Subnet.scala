package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subnet extends StObject {
  
  /**
    * Specifies the Availability Zone for the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
  
  /**
    * Specifies the identifier of the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the status of the subnet.
    */
  var SubnetStatus: js.UndefOr[String] = js.undefined
}
object Subnet {
  
  @scala.inline
  def apply(): Subnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnet]
  }
  
  @scala.inline
  implicit class SubnetMutableBuilder[Self <: Subnet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    @scala.inline
    def setSubnetIdentifier(value: String): Self = StObject.set(x, "SubnetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdentifierUndefined: Self = StObject.set(x, "SubnetIdentifier", js.undefined)
    
    @scala.inline
    def setSubnetStatus(value: String): Self = StObject.set(x, "SubnetStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetStatusUndefined: Self = StObject.set(x, "SubnetStatus", js.undefined)
  }
}
