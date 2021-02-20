package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subnet extends StObject {
  
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.native
  
  /**
    * The identifier of the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.native
  
  /**
    * If the subnet is associated with an Outpost, this value specifies the Outpost. For more information about RDS on Outposts, see Amazon RDS on AWS Outposts in the Amazon RDS User Guide. 
    */
  var SubnetOutpost: js.UndefOr[Outpost] = js.native
  
  /**
    * The status of the subnet.
    */
  var SubnetStatus: js.UndefOr[String] = js.native
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
    def setSubnetOutpost(value: Outpost): Self = StObject.set(x, "SubnetOutpost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetOutpostUndefined: Self = StObject.set(x, "SubnetOutpost", js.undefined)
    
    @scala.inline
    def setSubnetStatus(value: String): Self = StObject.set(x, "SubnetStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetStatusUndefined: Self = StObject.set(x, "SubnetStatus", js.undefined)
  }
}
