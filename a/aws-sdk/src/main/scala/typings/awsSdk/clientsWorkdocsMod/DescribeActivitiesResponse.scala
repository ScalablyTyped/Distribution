package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActivitiesResponse extends StObject {
  
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[SearchMarkerType] = js.undefined
  
  /**
    * The list of activities for the specified user and time period.
    */
  var UserActivities: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.UserActivities] = js.undefined
}
object DescribeActivitiesResponse {
  
  inline def apply(): DescribeActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivitiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeActivitiesResponse] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: SearchMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setUserActivities(value: UserActivities): Self = StObject.set(x, "UserActivities", value.asInstanceOf[js.Any])
    
    inline def setUserActivitiesUndefined: Self = StObject.set(x, "UserActivities", js.undefined)
    
    inline def setUserActivitiesVarargs(value: Activity*): Self = StObject.set(x, "UserActivities", js.Array(value*))
  }
}
