package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserGroupsResult extends StObject {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. &gt;
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * Returns a list of user groups.
    */
  var UserGroups: js.UndefOr[UserGroupList] = js.undefined
}
object DescribeUserGroupsResult {
  
  inline def apply(): DescribeUserGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserGroupsResult]
  }
  
  extension [Self <: DescribeUserGroupsResult](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setUserGroups(value: UserGroupList): Self = StObject.set(x, "UserGroups", value.asInstanceOf[js.Any])
    
    inline def setUserGroupsUndefined: Self = StObject.set(x, "UserGroups", js.undefined)
    
    inline def setUserGroupsVarargs(value: UserGroup*): Self = StObject.set(x, "UserGroups", js.Array(value :_*))
  }
}
