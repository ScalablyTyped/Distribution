package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProtectionGroupResponse extends StObject {
  
  /**
    * A grouping of protected resources that you and AWS Shield Advanced can monitor as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  var ProtectionGroup: typings.awsSdk.shieldMod.ProtectionGroup = js.native
}
object DescribeProtectionGroupResponse {
  
  @scala.inline
  def apply(ProtectionGroup: ProtectionGroup): DescribeProtectionGroupResponse = {
    val __obj = js.Dynamic.literal(ProtectionGroup = ProtectionGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProtectionGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeProtectionGroupResponseMutableBuilder[Self <: DescribeProtectionGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectionGroup(value: ProtectionGroup): Self = StObject.set(x, "ProtectionGroup", value.asInstanceOf[js.Any])
  }
}
