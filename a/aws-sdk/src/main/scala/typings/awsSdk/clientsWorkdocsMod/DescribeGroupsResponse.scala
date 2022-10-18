package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGroupsResponse extends StObject {
  
  /**
    * The list of groups.
    */
  var Groups: js.UndefOr[GroupMetadataList] = js.undefined
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
}
object DescribeGroupsResponse {
  
  inline def apply(): DescribeGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGroupsResponse]
  }
  
  extension [Self <: DescribeGroupsResponse](x: Self) {
    
    inline def setGroups(value: GroupMetadataList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupMetadata*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
