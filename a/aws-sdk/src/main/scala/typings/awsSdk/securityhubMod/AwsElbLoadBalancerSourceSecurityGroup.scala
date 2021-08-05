package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerSourceSecurityGroup extends StObject {
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The owner of the security group.
    */
  var OwnerAlias: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbLoadBalancerSourceSecurityGroup {
  
  inline def apply(): AwsElbLoadBalancerSourceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerSourceSecurityGroup]
  }
  
  extension [Self <: AwsElbLoadBalancerSourceSecurityGroup](x: Self) {
    
    inline def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setOwnerAlias(value: NonEmptyString): Self = StObject.set(x, "OwnerAlias", value.asInstanceOf[js.Any])
    
    inline def setOwnerAliasUndefined: Self = StObject.set(x, "OwnerAlias", js.undefined)
  }
}
