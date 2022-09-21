package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventConfigurationsRequest extends StObject {
  
  var MaxResults: js.UndefOr[typings.awsSdk.iotwirelessMod.MaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.iotwirelessMod.NextToken] = js.undefined
  
  /**
    * Resource type to filter event configurations.
    */
  var ResourceType: EventNotificationResourceType
}
object ListEventConfigurationsRequest {
  
  inline def apply(ResourceType: EventNotificationResourceType): ListEventConfigurationsRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventConfigurationsRequest]
  }
  
  extension [Self <: ListEventConfigurationsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceType(value: EventNotificationResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
