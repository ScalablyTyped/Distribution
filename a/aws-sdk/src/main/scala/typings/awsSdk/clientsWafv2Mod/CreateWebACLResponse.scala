package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWebACLResponse extends StObject {
  
  /**
    * High-level information about a WebACL, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a WebACL, and the ARN, that you provide to operations like AssociateWebACL.
    */
  var Summary: js.UndefOr[WebACLSummary] = js.undefined
}
object CreateWebACLResponse {
  
  inline def apply(): CreateWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWebACLResponse]
  }
  
  extension [Self <: CreateWebACLResponse](x: Self) {
    
    inline def setSummary(value: WebACLSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
  }
}
