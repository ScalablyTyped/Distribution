package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveAddressToVpcResult extends StObject {
  
  /**
    * The allocation ID for the Elastic IP address.
    */
  var AllocationId: js.UndefOr[String] = js.native
  
  /**
    * The status of the move of the IP address.
    */
  var Status: js.UndefOr[typings.awsSdk.ec2Mod.Status] = js.native
}
object MoveAddressToVpcResult {
  
  @scala.inline
  def apply(): MoveAddressToVpcResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveAddressToVpcResult]
  }
  
  @scala.inline
  implicit class MoveAddressToVpcResultMutableBuilder[Self <: MoveAddressToVpcResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
