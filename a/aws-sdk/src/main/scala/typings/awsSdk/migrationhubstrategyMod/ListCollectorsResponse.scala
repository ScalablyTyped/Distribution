package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectorsResponse extends StObject {
  
  /**
    *  The list of all the installed collectors. 
    */
  var Collectors: js.UndefOr[typings.awsSdk.migrationhubstrategyMod.Collectors] = js.undefined
  
  /**
    *  The token you use to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCollectorsResponse {
  
  inline def apply(): ListCollectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectorsResponse]
  }
  
  extension [Self <: ListCollectorsResponse](x: Self) {
    
    inline def setCollectors(value: Collectors): Self = StObject.set(x, "Collectors", value.asInstanceOf[js.Any])
    
    inline def setCollectorsUndefined: Self = StObject.set(x, "Collectors", js.undefined)
    
    inline def setCollectorsVarargs(value: Collector*): Self = StObject.set(x, "Collectors", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
