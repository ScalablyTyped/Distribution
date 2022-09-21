package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledActionsMessage extends StObject {
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeScheduledActions request exceed the value specified in MaxRecords, Amazon Web Services returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * List of retrieved scheduled actions. 
    */
  var ScheduledActions: js.UndefOr[ScheduledActionList] = js.undefined
}
object ScheduledActionsMessage {
  
  inline def apply(): ScheduledActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionsMessage]
  }
  
  extension [Self <: ScheduledActionsMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setScheduledActions(value: ScheduledActionList): Self = StObject.set(x, "ScheduledActions", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionsUndefined: Self = StObject.set(x, "ScheduledActions", js.undefined)
    
    inline def setScheduledActionsVarargs(value: ScheduledAction*): Self = StObject.set(x, "ScheduledActions", js.Array(value*))
  }
}
