package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Participants extends StObject {
  
  /**
    * The list of user groups.
    */
  var Groups: js.UndefOr[GroupMetadataList] = js.native
  
  /**
    * The list of users.
    */
  var Users: js.UndefOr[UserMetadataList] = js.native
}
object Participants {
  
  @scala.inline
  def apply(): Participants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Participants]
  }
  
  @scala.inline
  implicit class ParticipantsMutableBuilder[Self <: Participants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: GroupMetadataList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: GroupMetadata*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: UserMetadataList): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserMetadata*): Self = StObject.set(x, "Users", js.Array(value :_*))
  }
}
