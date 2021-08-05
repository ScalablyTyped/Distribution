package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBlobPropertiesOptions
  extends StObject
     with LeaseAccessConditionsOptions {
  
  var cacheControl: js.UndefOr[String] = js.undefined
  
  var contentDisposition: js.UndefOr[String] = js.undefined
  
  var contentEncoding: js.UndefOr[String] = js.undefined
  
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  var contentMD5: js.UndefOr[String] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
}
object SetBlobPropertiesOptions {
  
  inline def apply(): SetBlobPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBlobPropertiesOptions]
  }
  
  extension [Self <: SetBlobPropertiesOptions](x: Self) {
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setContentMD5(value: String): Self = StObject.set(x, "contentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "contentMD5", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
  }
}
