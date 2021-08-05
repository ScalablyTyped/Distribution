package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveAddressToVpcResult extends StObject {
  
  /**
    * The allocation ID for the Elastic IP address.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the move of the IP address.
    */
  var Status: js.UndefOr[typings.awsSdk.ec2Mod.Status] = js.undefined
}
object MoveAddressToVpcResult {
  
  inline def apply(): MoveAddressToVpcResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveAddressToVpcResult]
  }
  
  extension [Self <: MoveAddressToVpcResult](x: Self) {
    
    inline def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
