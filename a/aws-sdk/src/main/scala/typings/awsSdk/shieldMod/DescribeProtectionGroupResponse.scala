package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProtectionGroupResponse extends StObject {
  
  /**
    * A grouping of protected resources that you and Shield Advanced can monitor as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  var ProtectionGroup: typings.awsSdk.shieldMod.ProtectionGroup
}
object DescribeProtectionGroupResponse {
  
  inline def apply(ProtectionGroup: ProtectionGroup): DescribeProtectionGroupResponse = {
    val __obj = js.Dynamic.literal(ProtectionGroup = ProtectionGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProtectionGroupResponse]
  }
  
  extension [Self <: DescribeProtectionGroupResponse](x: Self) {
    
    inline def setProtectionGroup(value: ProtectionGroup): Self = StObject.set(x, "ProtectionGroup", value.asInstanceOf[js.Any])
  }
}
