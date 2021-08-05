package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActivitiesResponse extends StObject {
  
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
  
  /**
    * The list of activities for the specified user and time period.
    */
  var UserActivities: js.UndefOr[typings.awsSdk.workdocsMod.UserActivities] = js.undefined
}
object DescribeActivitiesResponse {
  
  inline def apply(): DescribeActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivitiesResponse]
  }
  
  extension [Self <: DescribeActivitiesResponse](x: Self) {
    
    inline def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setUserActivities(value: UserActivities): Self = StObject.set(x, "UserActivities", value.asInstanceOf[js.Any])
    
    inline def setUserActivitiesUndefined: Self = StObject.set(x, "UserActivities", js.undefined)
    
    inline def setUserActivitiesVarargs(value: Activity*): Self = StObject.set(x, "UserActivities", js.Array(value :_*))
  }
}
