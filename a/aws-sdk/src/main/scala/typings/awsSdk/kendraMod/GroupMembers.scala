package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMembers extends StObject {
  
  /**
    * A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and "Sales and Marketing" all belong to the group "Company".
    */
  var MemberGroups: js.UndefOr[typings.awsSdk.kendraMod.MemberGroups] = js.undefined
  
  /**
    * A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
    */
  var MemberUsers: js.UndefOr[typings.awsSdk.kendraMod.MemberUsers] = js.undefined
  
  /**
    * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000. You can download this example S3 file that uses the correct format for listing group members. Note, dataSourceId is optional. The value of type for a group is always GROUP and for a user it is always USER.
    */
  var S3PathforGroupMembers: js.UndefOr[S3Path] = js.undefined
}
object GroupMembers {
  
  inline def apply(): GroupMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupMembers]
  }
  
  extension [Self <: GroupMembers](x: Self) {
    
    inline def setMemberGroups(value: MemberGroups): Self = StObject.set(x, "MemberGroups", value.asInstanceOf[js.Any])
    
    inline def setMemberGroupsUndefined: Self = StObject.set(x, "MemberGroups", js.undefined)
    
    inline def setMemberGroupsVarargs(value: MemberGroup*): Self = StObject.set(x, "MemberGroups", js.Array(value*))
    
    inline def setMemberUsers(value: MemberUsers): Self = StObject.set(x, "MemberUsers", value.asInstanceOf[js.Any])
    
    inline def setMemberUsersUndefined: Self = StObject.set(x, "MemberUsers", js.undefined)
    
    inline def setMemberUsersVarargs(value: MemberUser*): Self = StObject.set(x, "MemberUsers", js.Array(value*))
    
    inline def setS3PathforGroupMembers(value: S3Path): Self = StObject.set(x, "S3PathforGroupMembers", value.asInstanceOf[js.Any])
    
    inline def setS3PathforGroupMembersUndefined: Self = StObject.set(x, "S3PathforGroupMembers", js.undefined)
  }
}
