package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThemeAliasResponse extends StObject {
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * Information about the theme alias.
    */
  var ThemeAlias: js.UndefOr[typings.awsSdk.quicksightMod.ThemeAlias] = js.undefined
}
object UpdateThemeAliasResponse {
  
  inline def apply(): UpdateThemeAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThemeAliasResponse]
  }
  
  extension [Self <: UpdateThemeAliasResponse](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThemeAlias(value: ThemeAlias): Self = StObject.set(x, "ThemeAlias", value.asInstanceOf[js.Any])
    
    inline def setThemeAliasUndefined: Self = StObject.set(x, "ThemeAlias", js.undefined)
  }
}
