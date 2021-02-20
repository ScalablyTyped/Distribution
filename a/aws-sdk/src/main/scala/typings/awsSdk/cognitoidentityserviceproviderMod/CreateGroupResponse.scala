package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGroupResponse extends StObject {
  
  /**
    * The group object for the group.
    */
  var Group: js.UndefOr[GroupType] = js.native
}
object CreateGroupResponse {
  
  @scala.inline
  def apply(): CreateGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupResponse]
  }
  
  @scala.inline
  implicit class CreateGroupResponseMutableBuilder[Self <: CreateGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: GroupType): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
