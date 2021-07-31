package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedScalingPolicy extends StObject {
  
  /**
    * The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not allowed to go above or below these limits. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
    */
  var ComputeLimits: js.UndefOr[typings.awsSdk.emrMod.ComputeLimits] = js.undefined
}
object ManagedScalingPolicy {
  
  @scala.inline
  def apply(): ManagedScalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedScalingPolicy]
  }
  
  @scala.inline
  implicit class ManagedScalingPolicyMutableBuilder[Self <: ManagedScalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeLimits(value: ComputeLimits): Self = StObject.set(x, "ComputeLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeLimitsUndefined: Self = StObject.set(x, "ComputeLimits", js.undefined)
  }
}
