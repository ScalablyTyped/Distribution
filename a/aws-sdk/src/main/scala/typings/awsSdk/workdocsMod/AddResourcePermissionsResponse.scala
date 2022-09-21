package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddResourcePermissionsResponse extends StObject {
  
  /**
    * The share results.
    */
  var ShareResults: js.UndefOr[ShareResultsList] = js.undefined
}
object AddResourcePermissionsResponse {
  
  inline def apply(): AddResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddResourcePermissionsResponse]
  }
  
  extension [Self <: AddResourcePermissionsResponse](x: Self) {
    
    inline def setShareResults(value: ShareResultsList): Self = StObject.set(x, "ShareResults", value.asInstanceOf[js.Any])
    
    inline def setShareResultsUndefined: Self = StObject.set(x, "ShareResults", js.undefined)
    
    inline def setShareResultsVarargs(value: ShareResult*): Self = StObject.set(x, "ShareResults", js.Array(value*))
  }
}
