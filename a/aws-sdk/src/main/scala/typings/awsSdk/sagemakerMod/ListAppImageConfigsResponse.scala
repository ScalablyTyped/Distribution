package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppImageConfigsResponse extends StObject {
  
  /**
    * A list of AppImageConfigs and their properties.
    */
  var AppImageConfigs: js.UndefOr[AppImageConfigList] = js.undefined
  
  /**
    * A token for getting the next set of AppImageConfigs, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListAppImageConfigsResponse {
  
  inline def apply(): ListAppImageConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppImageConfigsResponse]
  }
  
  extension [Self <: ListAppImageConfigsResponse](x: Self) {
    
    inline def setAppImageConfigs(value: AppImageConfigList): Self = StObject.set(x, "AppImageConfigs", value.asInstanceOf[js.Any])
    
    inline def setAppImageConfigsUndefined: Self = StObject.set(x, "AppImageConfigs", js.undefined)
    
    inline def setAppImageConfigsVarargs(value: AppImageConfigDetails*): Self = StObject.set(x, "AppImageConfigs", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
