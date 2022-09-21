package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentSummaryResponse extends StObject {
  
  /**
    * The content summary.
    */
  var contentSummary: js.UndefOr[ContentSummary] = js.undefined
}
object GetContentSummaryResponse {
  
  inline def apply(): GetContentSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContentSummaryResponse]
  }
  
  extension [Self <: GetContentSummaryResponse](x: Self) {
    
    inline def setContentSummary(value: ContentSummary): Self = StObject.set(x, "contentSummary", value.asInstanceOf[js.Any])
    
    inline def setContentSummaryUndefined: Self = StObject.set(x, "contentSummary", js.undefined)
  }
}
