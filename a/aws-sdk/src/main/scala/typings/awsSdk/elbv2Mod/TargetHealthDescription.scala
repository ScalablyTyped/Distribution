package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHealthDescription extends js.Object {
  
  /**
    * The port to use to connect with the target.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  
  /**
    * The description of the target.
    */
  var Target: js.UndefOr[TargetDescription] = js.native
  
  /**
    * The health information for the target.
    */
  var TargetHealth: js.UndefOr[typings.awsSdk.elbv2Mod.TargetHealth] = js.native
}
object TargetHealthDescription {
  
  @scala.inline
  def apply(): TargetHealthDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHealthDescription]
  }
  
  @scala.inline
  implicit class TargetHealthDescriptionOps[Self <: TargetHealthDescription] (val x: Self) extends AnyVal {
    
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
    def setHealthCheckPort(value: HealthCheckPort): Self = this.set("HealthCheckPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckPort: Self = this.set("HealthCheckPort", js.undefined)
    
    @scala.inline
    def setTarget(value: TargetDescription): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
    
    @scala.inline
    def setTargetHealth(value: TargetHealth): Self = this.set("TargetHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetHealth: Self = this.set("TargetHealth", js.undefined)
  }
}
