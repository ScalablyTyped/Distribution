package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions extends StObject {
  
  /**
    * root url to resolve relative request urls with.
    */
  var baseUrl: String
}
object ClientOptions {
  
  inline def apply(baseUrl: String): ClientOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  extension [Self <: ClientOptions](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
  }
}
