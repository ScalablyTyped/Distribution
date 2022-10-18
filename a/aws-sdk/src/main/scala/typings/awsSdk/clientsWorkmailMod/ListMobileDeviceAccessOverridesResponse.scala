package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMobileDeviceAccessOverridesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. The value is “null” when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorkmailMod.NextToken] = js.undefined
  
  /**
    * The list of mobile device access overrides that exist for the specified WorkMail organization and user.
    */
  var Overrides: js.UndefOr[MobileDeviceAccessOverridesList] = js.undefined
}
object ListMobileDeviceAccessOverridesResponse {
  
  inline def apply(): ListMobileDeviceAccessOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMobileDeviceAccessOverridesResponse]
  }
  
  extension [Self <: ListMobileDeviceAccessOverridesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOverrides(value: MobileDeviceAccessOverridesList): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
    
    inline def setOverridesVarargs(value: MobileDeviceAccessOverride*): Self = StObject.set(x, "Overrides", js.Array(value*))
  }
}
