package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUsersResult extends StObject {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. &gt;
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of users.
    */
  var Users: js.UndefOr[UserList] = js.undefined
}
object DescribeUsersResult {
  
  @scala.inline
  def apply(): DescribeUsersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsersResult]
  }
  
  @scala.inline
  implicit class DescribeUsersResultMutableBuilder[Self <: DescribeUsersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setUsers(value: UserList): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: User*): Self = StObject.set(x, "Users", js.Array(value :_*))
  }
}
