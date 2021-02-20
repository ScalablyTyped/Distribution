package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbSubnetGroupSubnet extends StObject {
  
  /**
    * Information about the Availability Zone for a subnet in the subnet group.
    */
  var SubnetAvailabilityZone: js.UndefOr[AwsRdsDbSubnetGroupSubnetAvailabilityZone] = js.native
  
  /**
    * The identifier of a subnet in the subnet group.
    */
  var SubnetIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of a subnet in the subnet group.
    */
  var SubnetStatus: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbSubnetGroupSubnet {
  
  @scala.inline
  def apply(): AwsRdsDbSubnetGroupSubnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSubnetGroupSubnet]
  }
  
  @scala.inline
  implicit class AwsRdsDbSubnetGroupSubnetMutableBuilder[Self <: AwsRdsDbSubnetGroupSubnet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetAvailabilityZone(value: AwsRdsDbSubnetGroupSubnetAvailabilityZone): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    @scala.inline
    def setSubnetIdentifier(value: NonEmptyString): Self = StObject.set(x, "SubnetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdentifierUndefined: Self = StObject.set(x, "SubnetIdentifier", js.undefined)
    
    @scala.inline
    def setSubnetStatus(value: NonEmptyString): Self = StObject.set(x, "SubnetStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetStatusUndefined: Self = StObject.set(x, "SubnetStatus", js.undefined)
  }
}
