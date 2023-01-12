package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Participants extends StObject {
  
  /**
    * The list of user groups.
    */
  var Groups: js.UndefOr[GroupMetadataList] = js.undefined
  
  /**
    * The list of users.
    */
  var Users: js.UndefOr[UserMetadataList] = js.undefined
}
object Participants {
  
  inline def apply(): Participants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Participants]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Participants] (val x: Self) extends AnyVal {
    
    inline def setGroups(value: GroupMetadataList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupMetadata*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setUsers(value: UserMetadataList): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    inline def setUsersVarargs(value: UserMetadata*): Self = StObject.set(x, "Users", js.Array(value*))
  }
}
