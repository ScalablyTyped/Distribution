package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInputSecurityGroupResponse extends StObject {
  
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.native
}
object CreateInputSecurityGroupResponse {
  
  @scala.inline
  def apply(): CreateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputSecurityGroupResponse]
  }
  
  @scala.inline
  implicit class CreateInputSecurityGroupResponseMutableBuilder[Self <: CreateInputSecurityGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroup(value: InputSecurityGroup): Self = StObject.set(x, "SecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupUndefined: Self = StObject.set(x, "SecurityGroup", js.undefined)
  }
}
