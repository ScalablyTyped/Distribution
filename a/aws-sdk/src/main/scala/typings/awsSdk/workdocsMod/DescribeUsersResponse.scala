package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUsersResponse extends StObject {
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  
  /**
    * The total number of users included in the results.
    */
  var TotalNumberOfUsers: js.UndefOr[SizeType] = js.undefined
  
  /**
    * The users.
    */
  var Users: js.UndefOr[OrganizationUserList] = js.undefined
}
object DescribeUsersResponse {
  
  @scala.inline
  def apply(): DescribeUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsersResponse]
  }
  
  @scala.inline
  implicit class DescribeUsersResponseMutableBuilder[Self <: DescribeUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setTotalNumberOfUsers(value: SizeType): Self = StObject.set(x, "TotalNumberOfUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNumberOfUsersUndefined: Self = StObject.set(x, "TotalNumberOfUsers", js.undefined)
    
    @scala.inline
    def setUsers(value: OrganizationUserList): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: User*): Self = StObject.set(x, "Users", js.Array(value :_*))
  }
}
