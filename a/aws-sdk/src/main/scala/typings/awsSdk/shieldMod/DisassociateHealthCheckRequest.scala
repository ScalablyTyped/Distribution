package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DisassociateHealthCheckRequestOps[Self <: DisassociateHealthCheckRequest] (val x: Self) extends AnyVal {
    
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
    def setHealthCheckArn(value: HealthCheckArn): Self = this.set("HealthCheckArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionId(value: ProtectionId): Self = this.set("ProtectionId", value.asInstanceOf[js.Any])
  }
}
