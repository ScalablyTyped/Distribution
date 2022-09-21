package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentVersionsResponse extends StObject {
  
  /**
    * A list of versions that exist for the component.
    */
  var componentVersions: js.UndefOr[ComponentVersionList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListComponentVersionsResponse {
  
  inline def apply(): ListComponentVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentVersionsResponse]
  }
  
  extension [Self <: ListComponentVersionsResponse](x: Self) {
    
    inline def setComponentVersions(value: ComponentVersionList): Self = StObject.set(x, "componentVersions", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionsUndefined: Self = StObject.set(x, "componentVersions", js.undefined)
    
    inline def setComponentVersionsVarargs(value: ComponentVersionListItem*): Self = StObject.set(x, "componentVersions", js.Array(value*))
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
