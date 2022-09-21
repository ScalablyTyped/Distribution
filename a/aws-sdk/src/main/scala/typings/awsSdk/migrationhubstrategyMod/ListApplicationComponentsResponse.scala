package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationComponentsResponse extends StObject {
  
  /**
    *  The list of application components with detailed information about each component. 
    */
  var applicationComponentInfos: js.UndefOr[ApplicationComponentDetails] = js.undefined
  
  /**
    *  The token you use to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationComponentsResponse {
  
  inline def apply(): ListApplicationComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationComponentsResponse]
  }
  
  extension [Self <: ListApplicationComponentsResponse](x: Self) {
    
    inline def setApplicationComponentInfos(value: ApplicationComponentDetails): Self = StObject.set(x, "applicationComponentInfos", value.asInstanceOf[js.Any])
    
    inline def setApplicationComponentInfosUndefined: Self = StObject.set(x, "applicationComponentInfos", js.undefined)
    
    inline def setApplicationComponentInfosVarargs(value: ApplicationComponentDetail*): Self = StObject.set(x, "applicationComponentInfos", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
