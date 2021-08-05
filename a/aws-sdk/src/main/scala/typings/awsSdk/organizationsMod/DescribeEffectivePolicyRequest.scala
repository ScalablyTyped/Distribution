package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEffectivePolicyRequest extends StObject {
  
  /**
    * The type of policy that you want information about. You can specify one of the following values:    AISERVICES_OPT_OUT_POLICY     BACKUP_POLICY     TAG_POLICY   
    */
  var PolicyType: EffectivePolicyType
  
  /**
    * When you're signed in as the management account, specify the ID of the account that you want details about. Specifying an organization root or organizational unit (OU) as the target is not supported.
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.undefined
}
object DescribeEffectivePolicyRequest {
  
  inline def apply(PolicyType: EffectivePolicyType): DescribeEffectivePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyType = PolicyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEffectivePolicyRequest]
  }
  
  extension [Self <: DescribeEffectivePolicyRequest](x: Self) {
    
    inline def setPolicyType(value: EffectivePolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: PolicyTargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
  }
}
