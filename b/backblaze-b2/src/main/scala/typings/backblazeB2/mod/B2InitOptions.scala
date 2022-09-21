package typings.backblazeB2.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B2InitOptions extends StObject {
  
  var applicationKey: String
  
  var applicationKeyId: String
  
  var axios: js.UndefOr[Record[String, Any]] = js.undefined
  
  var retry: js.UndefOr[Record[String, Any]] = js.undefined
}
object B2InitOptions {
  
  inline def apply(applicationKey: String, applicationKeyId: String): B2InitOptions = {
    val __obj = js.Dynamic.literal(applicationKey = applicationKey.asInstanceOf[js.Any], applicationKeyId = applicationKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[B2InitOptions]
  }
  
  extension [Self <: B2InitOptions](x: Self) {
    
    inline def setApplicationKey(value: String): Self = StObject.set(x, "applicationKey", value.asInstanceOf[js.Any])
    
    inline def setApplicationKeyId(value: String): Self = StObject.set(x, "applicationKeyId", value.asInstanceOf[js.Any])
    
    inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
    
    inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
    
    inline def setRetry(value: Record[String, Any]): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
