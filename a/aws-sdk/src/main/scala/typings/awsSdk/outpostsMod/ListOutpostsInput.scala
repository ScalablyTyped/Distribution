package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOutpostsInput extends StObject {
  
  /**
    *  A filter for the Availability Zone (us-east-1a) of the Outpost.  Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an OR, and the request returns all results that match any of the specified values.
    */
  var AvailabilityZoneFilter: js.UndefOr[AvailabilityZoneList] = js.undefined
  
  /**
    *  A filter for the AZ IDs (use1-az1) of the Outpost.  Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an OR, and the request returns all results that match any of the specified values.
    */
  var AvailabilityZoneIdFilter: js.UndefOr[AvailabilityZoneIdList] = js.undefined
  
  /**
    *  A filter for the lifecycle status of the Outpost.  Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an OR, and the request returns all results that match any of the specified values.
    */
  var LifeCycleStatusFilter: js.UndefOr[LifeCycleStatusList] = js.undefined
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListOutpostsInput {
  
  inline def apply(): ListOutpostsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutpostsInput]
  }
  
  extension [Self <: ListOutpostsInput](x: Self) {
    
    inline def setAvailabilityZoneFilter(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZoneFilter", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneFilterUndefined: Self = StObject.set(x, "AvailabilityZoneFilter", js.undefined)
    
    inline def setAvailabilityZoneFilterVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZoneFilter", js.Array(value*))
    
    inline def setAvailabilityZoneIdFilter(value: AvailabilityZoneIdList): Self = StObject.set(x, "AvailabilityZoneIdFilter", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdFilterUndefined: Self = StObject.set(x, "AvailabilityZoneIdFilter", js.undefined)
    
    inline def setAvailabilityZoneIdFilterVarargs(value: AvailabilityZoneId*): Self = StObject.set(x, "AvailabilityZoneIdFilter", js.Array(value*))
    
    inline def setLifeCycleStatusFilter(value: LifeCycleStatusList): Self = StObject.set(x, "LifeCycleStatusFilter", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleStatusFilterUndefined: Self = StObject.set(x, "LifeCycleStatusFilter", js.undefined)
    
    inline def setLifeCycleStatusFilterVarargs(value: LifeCycleStatus*): Self = StObject.set(x, "LifeCycleStatusFilter", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
