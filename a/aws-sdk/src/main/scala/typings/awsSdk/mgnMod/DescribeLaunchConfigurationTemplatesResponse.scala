package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLaunchConfigurationTemplatesResponse extends StObject {
  
  /**
    * Request to disconnect Source Server from service by Server ID.
    */
  var items: js.UndefOr[LaunchConfigurationTemplates] = js.undefined
  
  /**
    * Request to disconnect Source Server from service by Server ID.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeLaunchConfigurationTemplatesResponse {
  
  inline def apply(): DescribeLaunchConfigurationTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchConfigurationTemplatesResponse]
  }
  
  extension [Self <: DescribeLaunchConfigurationTemplatesResponse](x: Self) {
    
    inline def setItems(value: LaunchConfigurationTemplates): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: LaunchConfigurationTemplate*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
