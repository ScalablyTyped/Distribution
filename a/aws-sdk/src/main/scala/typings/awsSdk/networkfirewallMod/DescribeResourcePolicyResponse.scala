package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePolicyResponse extends StObject {
  
  /**
    * The AWS Identity and Access Management policy for the resource. 
    */
  var Policy: js.UndefOr[PolicyString] = js.undefined
}
object DescribeResourcePolicyResponse {
  
  inline def apply(): DescribeResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePolicyResponse]
  }
  
  extension [Self <: DescribeResourcePolicyResponse](x: Self) {
    
    inline def setPolicy(value: PolicyString): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
