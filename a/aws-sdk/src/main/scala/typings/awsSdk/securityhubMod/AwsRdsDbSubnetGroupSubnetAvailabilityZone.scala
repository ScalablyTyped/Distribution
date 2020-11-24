package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbSubnetGroupSubnetAvailabilityZone extends js.Object {
  
  /**
    * The name of the Availability Zone for a subnet in the subnet group.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbSubnetGroupSubnetAvailabilityZone {
  
  @scala.inline
  def apply(): AwsRdsDbSubnetGroupSubnetAvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSubnetGroupSubnetAvailabilityZone]
  }
  
  @scala.inline
  implicit class AwsRdsDbSubnetGroupSubnetAvailabilityZoneOps[Self <: AwsRdsDbSubnetGroupSubnetAvailabilityZone] (val x: Self) extends AnyVal {
    
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
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
