package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlueprintsRequest extends StObject {
  
  /**
    * A Boolean value indicating whether to include inactive results in your request.
    */
  var includeInactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetBlueprints request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object GetBlueprintsRequest {
  
  inline def apply(): GetBlueprintsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBlueprintsRequest]
  }
  
  extension [Self <: GetBlueprintsRequest](x: Self) {
    
    inline def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
    
    inline def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
