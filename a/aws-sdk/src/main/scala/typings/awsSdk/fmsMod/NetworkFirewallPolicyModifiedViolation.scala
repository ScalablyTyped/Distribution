package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallPolicyModifiedViolation extends StObject {
  
  /**
    * The policy that's currently in use in the individual account. 
    */
  var CurrentPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription] = js.undefined
  
  /**
    * The policy that should be in use in the individual account in order to be compliant. 
    */
  var ExpectedPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription] = js.undefined
  
  /**
    * The ID of the Network Firewall or VPC resource that's in violation.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.undefined
}
object NetworkFirewallPolicyModifiedViolation {
  
  inline def apply(): NetworkFirewallPolicyModifiedViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallPolicyModifiedViolation]
  }
  
  extension [Self <: NetworkFirewallPolicyModifiedViolation](x: Self) {
    
    inline def setCurrentPolicyDescription(value: NetworkFirewallPolicyDescription): Self = StObject.set(x, "CurrentPolicyDescription", value.asInstanceOf[js.Any])
    
    inline def setCurrentPolicyDescriptionUndefined: Self = StObject.set(x, "CurrentPolicyDescription", js.undefined)
    
    inline def setExpectedPolicyDescription(value: NetworkFirewallPolicyDescription): Self = StObject.set(x, "ExpectedPolicyDescription", value.asInstanceOf[js.Any])
    
    inline def setExpectedPolicyDescriptionUndefined: Self = StObject.set(x, "ExpectedPolicyDescription", js.undefined)
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
