package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobHeaders extends StObject {
  
  var cacheControl: js.UndefOr[String] = js.native
  
  var contentDisposition: js.UndefOr[String] = js.native
  
  var contentEncoding: js.UndefOr[String] = js.native
  
  var contentLanguage: js.UndefOr[String] = js.native
  
  var contentType: js.UndefOr[String] = js.native
}
object BlobHeaders {
  
  @scala.inline
  def apply(): BlobHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobHeaders]
  }
  
  @scala.inline
  implicit class BlobHeadersMutableBuilder[Self <: BlobHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
  }
}
