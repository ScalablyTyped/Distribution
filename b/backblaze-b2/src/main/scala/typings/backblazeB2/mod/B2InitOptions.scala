package typings.backblazeB2.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B2InitOptions extends StObject {
  
  var applicationKey: String
  
  var applicationKeyId: String
  
  var axios: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var retry: js.UndefOr[Record[String, js.Any]] = js.undefined
}
object B2InitOptions {
  
  @scala.inline
  def apply(applicationKey: String, applicationKeyId: String): B2InitOptions = {
    val __obj = js.Dynamic.literal(applicationKey = applicationKey.asInstanceOf[js.Any], applicationKeyId = applicationKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[B2InitOptions]
  }
  
  @scala.inline
  implicit class B2InitOptionsMutableBuilder[Self <: B2InitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationKey(value: String): Self = StObject.set(x, "applicationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationKeyId(value: String): Self = StObject.set(x, "applicationKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxios(value: Record[String, js.Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
    
    @scala.inline
    def setRetry(value: Record[String, js.Any]): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
