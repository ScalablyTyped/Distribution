package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOTAUpdatesResponse extends StObject {
  
  /**
    * A token to use to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of OTA update jobs.
    */
  var otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.undefined
}
object ListOTAUpdatesResponse {
  
  inline def apply(): ListOTAUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOTAUpdatesResponse]
  }
  
  extension [Self <: ListOTAUpdatesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOtaUpdates(value: OTAUpdatesSummary): Self = StObject.set(x, "otaUpdates", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdatesUndefined: Self = StObject.set(x, "otaUpdates", js.undefined)
    
    inline def setOtaUpdatesVarargs(value: OTAUpdateSummary*): Self = StObject.set(x, "otaUpdates", js.Array(value :_*))
  }
}
