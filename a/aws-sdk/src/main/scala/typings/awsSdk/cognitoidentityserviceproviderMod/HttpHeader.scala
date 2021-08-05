package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpHeader extends StObject {
  
  /**
    * The header name
    */
  var headerName: js.UndefOr[StringType] = js.undefined
  
  /**
    * The header value.
    */
  var headerValue: js.UndefOr[StringType] = js.undefined
}
object HttpHeader {
  
  inline def apply(): HttpHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpHeader]
  }
  
  extension [Self <: HttpHeader](x: Self) {
    
    inline def setHeaderName(value: StringType): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
    
    inline def setHeaderValue(value: StringType): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    inline def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
  }
}
