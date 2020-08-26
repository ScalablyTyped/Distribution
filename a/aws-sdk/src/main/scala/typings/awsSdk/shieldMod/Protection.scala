package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Protection extends js.Object {
  /**
    * The unique identifier (ID) for the Route 53 health check that's associated with the protection. 
    */
  var HealthCheckIds: js.UndefOr[typings.awsSdk.shieldMod.HealthCheckIds] = js.native
  /**
    * The unique identifier (ID) of the protection.
    */
  var Id: js.UndefOr[ProtectionId] = js.native
  /**
    * The friendly name of the protection. For example, My CloudFront distributions.
    */
  var Name: js.UndefOr[ProtectionName] = js.native
  /**
    * The ARN (Amazon Resource Name) of the AWS resource that is protected.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.shieldMod.ResourceArn] = js.native
}

object Protection {
  @scala.inline
  def apply(): Protection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Protection]
  }
  @scala.inline
  implicit class ProtectionOps[Self <: Protection] (val x: Self) extends AnyVal {
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
    def setHealthCheckIdsVarargs(value: HealthCheckId*): Self = this.set("HealthCheckIds", js.Array(value :_*))
    @scala.inline
    def setHealthCheckIds(value: HealthCheckIds): Self = this.set("HealthCheckIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckIds: Self = this.set("HealthCheckIds", js.undefined)
    @scala.inline
    def setId(value: ProtectionId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: ProtectionName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
  }
  
}

