package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateHealthCheckRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the health check that is associated with the protection.
    */
  var HealthCheckArn: typings.awsSdk.shieldMod.HealthCheckArn = js.native
  /**
    * The unique identifier (ID) for the Protection object to remove the health check association from. 
    */
  var ProtectionId: typings.awsSdk.shieldMod.ProtectionId = js.native
}

object DisassociateHealthCheckRequest {
  @scala.inline
  def apply(HealthCheckArn: HealthCheckArn, ProtectionId: ProtectionId): DisassociateHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckArn = HealthCheckArn.asInstanceOf[js.Any], ProtectionId = ProtectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateHealthCheckRequest]
  }
}

