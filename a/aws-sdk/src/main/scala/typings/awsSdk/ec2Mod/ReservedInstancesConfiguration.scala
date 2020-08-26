package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstancesConfiguration extends js.Object {
  /**
    * The Availability Zone for the modified Reserved Instances.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The number of modified Reserved Instances.  This is a required field for a request. 
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The instance type for the modified Reserved Instances.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * Whether the Reserved Instance is applied to instances in a Region or instances in a specific Availability Zone.
    */
  var Scope: js.UndefOr[scope] = js.native
}

object ReservedInstancesConfiguration {
  @scala.inline
  def apply(): ReservedInstancesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesConfiguration]
  }
  @scala.inline
  implicit class ReservedInstancesConfigurationOps[Self <: ReservedInstancesConfiguration] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setScope(value: scope): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("Scope", js.undefined)
  }
  
}

