package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupResponse extends StObject {
  
  /**
    * The group object for the group.
    */
  var Group: js.UndefOr[GroupType] = js.native
}
object GetGroupResponse {
  
  @scala.inline
  def apply(): GetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupResponse]
  }
  
  @scala.inline
  implicit class GetGroupResponseMutableBuilder[Self <: GetGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: GroupType): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
