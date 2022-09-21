package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstalledComponentsResponse extends StObject {
  
  /**
    * A list that summarizes each component on the core device.  Accuracy of the lastStatusChangeTimestamp response depends on Greengrass nucleus v2.7.0. It performs best on Greengrass nucleus v2.7.0 and can be inaccurate on earlier versions. 
    */
  var installedComponents: js.UndefOr[InstalledComponentList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListInstalledComponentsResponse {
  
  inline def apply(): ListInstalledComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstalledComponentsResponse]
  }
  
  extension [Self <: ListInstalledComponentsResponse](x: Self) {
    
    inline def setInstalledComponents(value: InstalledComponentList): Self = StObject.set(x, "installedComponents", value.asInstanceOf[js.Any])
    
    inline def setInstalledComponentsUndefined: Self = StObject.set(x, "installedComponents", js.undefined)
    
    inline def setInstalledComponentsVarargs(value: InstalledComponent*): Self = StObject.set(x, "installedComponents", js.Array(value*))
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
