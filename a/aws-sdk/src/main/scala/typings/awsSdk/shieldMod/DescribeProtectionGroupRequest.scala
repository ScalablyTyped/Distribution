package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProtectionGroupRequest extends StObject {
  
  /**
    * The name of the protection group. You use this to identify the protection group in lists and to manage the protection group, for example to update, delete, or describe it. 
    */
  var ProtectionGroupId: typings.awsSdk.shieldMod.ProtectionGroupId
}
object DescribeProtectionGroupRequest {
  
  inline def apply(ProtectionGroupId: ProtectionGroupId): DescribeProtectionGroupRequest = {
    val __obj = js.Dynamic.literal(ProtectionGroupId = ProtectionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProtectionGroupRequest]
  }
  
  extension [Self <: DescribeProtectionGroupRequest](x: Self) {
    
    inline def setProtectionGroupId(value: ProtectionGroupId): Self = StObject.set(x, "ProtectionGroupId", value.asInstanceOf[js.Any])
  }
}
