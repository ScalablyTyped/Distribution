package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateHealthCheckRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the health check to associate with the protection.
    */
  var HealthCheckArn: typings.awsSdk.shieldMod.HealthCheckArn = js.native
  /**
    * The unique identifier (ID) for the Protection object to add the health check association to. 
    */
  var ProtectionId: typings.awsSdk.shieldMod.ProtectionId = js.native
}

object AssociateHealthCheckRequest {
  @scala.inline
  def apply(HealthCheckArn: HealthCheckArn, ProtectionId: ProtectionId): AssociateHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckArn = HealthCheckArn.asInstanceOf[js.Any], ProtectionId = ProtectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateHealthCheckRequest]
  }
}

