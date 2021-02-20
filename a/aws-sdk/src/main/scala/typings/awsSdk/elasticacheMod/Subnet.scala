package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subnet extends StObject {
  
  /**
    * The Availability Zone associated with the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.native
  
  /**
    * The unique identifier for the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The outpost ARN of the subnet.
    */
  var SubnetOutpost: js.UndefOr[typings.awsSdk.elasticacheMod.SubnetOutpost] = js.native
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
    def setSubnetOutpost(value: SubnetOutpost): Self = StObject.set(x, "SubnetOutpost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetOutpostUndefined: Self = StObject.set(x, "SubnetOutpost", js.undefined)
  }
}
