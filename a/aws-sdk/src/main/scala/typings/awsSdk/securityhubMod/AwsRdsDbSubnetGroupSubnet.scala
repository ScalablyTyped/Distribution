package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbSubnetGroupSubnet extends js.Object {
  
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
  implicit class AwsRdsDbSubnetGroupSubnetOps[Self <: AwsRdsDbSubnetGroupSubnet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubnetAvailabilityZone(value: AwsRdsDbSubnetGroupSubnetAvailabilityZone): Self = this.set("SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetAvailabilityZone: Self = this.set("SubnetAvailabilityZone", js.undefined)
    
    @scala.inline
    def setSubnetIdentifier(value: NonEmptyString): Self = this.set("SubnetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIdentifier: Self = this.set("SubnetIdentifier", js.undefined)
    
    @scala.inline
    def setSubnetStatus(value: NonEmptyString): Self = this.set("SubnetStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetStatus: Self = this.set("SubnetStatus", js.undefined)
  }
}
