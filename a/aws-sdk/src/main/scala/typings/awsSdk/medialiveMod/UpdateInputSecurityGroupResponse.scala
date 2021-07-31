package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInputSecurityGroupResponse extends StObject {
  
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
}
object UpdateInputSecurityGroupResponse {
  
  @scala.inline
  def apply(): UpdateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInputSecurityGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateInputSecurityGroupResponseMutableBuilder[Self <: UpdateInputSecurityGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroup(value: InputSecurityGroup): Self = StObject.set(x, "SecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupUndefined: Self = StObject.set(x, "SecurityGroup", js.undefined)
  }
}
