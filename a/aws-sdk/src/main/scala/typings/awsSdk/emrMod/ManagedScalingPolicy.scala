package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedScalingPolicy extends js.Object {
  
  /**
    * The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not allowed to go above or below these limits. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
    */
  var ComputeLimits: js.UndefOr[typings.awsSdk.emrMod.ComputeLimits] = js.native
}
object ManagedScalingPolicy {
  
  @scala.inline
  def apply(): ManagedScalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedScalingPolicy]
  }
  
  @scala.inline
  implicit class ManagedScalingPolicyOps[Self <: ManagedScalingPolicy] (val x: Self) extends AnyVal {
    
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
    def setComputeLimits(value: ComputeLimits): Self = this.set("ComputeLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeLimits: Self = this.set("ComputeLimits", js.undefined)
  }
}
