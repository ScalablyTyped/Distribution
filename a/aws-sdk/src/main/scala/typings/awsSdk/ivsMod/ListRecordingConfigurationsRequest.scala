package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecordingConfigurationsRequest extends StObject {
  
  /**
    * Maximum number of recording configurations to return. Default: your service quota or 100, whichever is smaller. 
    */
  var maxResults: js.UndefOr[MaxRecordingConfigurationResults] = js.undefined
  
  /**
    * The first recording configuration to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListRecordingConfigurationsRequest {
  
  inline def apply(): ListRecordingConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordingConfigurationsRequest]
  }
  
  extension [Self <: ListRecordingConfigurationsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxRecordingConfigurationResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
