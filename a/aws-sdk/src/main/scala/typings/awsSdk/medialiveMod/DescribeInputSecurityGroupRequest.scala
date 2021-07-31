package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInputSecurityGroupRequest extends StObject {
  
  /**
    * The id of the Input Security Group to describe
    */
  var InputSecurityGroupId: string
}
object DescribeInputSecurityGroupRequest {
  
  @scala.inline
  def apply(InputSecurityGroupId: string): DescribeInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputSecurityGroupRequest]
  }
  
  @scala.inline
  implicit class DescribeInputSecurityGroupRequestMutableBuilder[Self <: DescribeInputSecurityGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputSecurityGroupId(value: string): Self = StObject.set(x, "InputSecurityGroupId", value.asInstanceOf[js.Any])
  }
}
