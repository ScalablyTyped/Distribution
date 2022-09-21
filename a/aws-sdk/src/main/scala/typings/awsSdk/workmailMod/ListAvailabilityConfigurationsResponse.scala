package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailabilityConfigurationsResponse extends StObject {
  
  /**
    * The list of AvailabilityConfiguration's that exist for the specified Amazon WorkMail organization.
    */
  var AvailabilityConfigurations: js.UndefOr[AvailabilityConfigurationList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no further results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.undefined
}
object ListAvailabilityConfigurationsResponse {
  
  inline def apply(): ListAvailabilityConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailabilityConfigurationsResponse]
  }
  
  extension [Self <: ListAvailabilityConfigurationsResponse](x: Self) {
    
    inline def setAvailabilityConfigurations(value: AvailabilityConfigurationList): Self = StObject.set(x, "AvailabilityConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityConfigurationsUndefined: Self = StObject.set(x, "AvailabilityConfigurations", js.undefined)
    
    inline def setAvailabilityConfigurationsVarargs(value: AvailabilityConfiguration*): Self = StObject.set(x, "AvailabilityConfigurations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
