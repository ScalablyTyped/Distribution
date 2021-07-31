package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureContentTypeHeader extends StObject {
  
  /**
    * 
    */
  var CsvContentTypes: js.UndefOr[typings.awsSdk.sagemakerMod.CsvContentTypes] = js.undefined
  
  /**
    * 
    */
  var JsonContentTypes: js.UndefOr[typings.awsSdk.sagemakerMod.JsonContentTypes] = js.undefined
}
object CaptureContentTypeHeader {
  
  @scala.inline
  def apply(): CaptureContentTypeHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureContentTypeHeader]
  }
  
  @scala.inline
  implicit class CaptureContentTypeHeaderMutableBuilder[Self <: CaptureContentTypeHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvContentTypes(value: CsvContentTypes): Self = StObject.set(x, "CsvContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvContentTypesUndefined: Self = StObject.set(x, "CsvContentTypes", js.undefined)
    
    @scala.inline
    def setCsvContentTypesVarargs(value: CsvContentType*): Self = StObject.set(x, "CsvContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setJsonContentTypes(value: JsonContentTypes): Self = StObject.set(x, "JsonContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonContentTypesUndefined: Self = StObject.set(x, "JsonContentTypes", js.undefined)
    
    @scala.inline
    def setJsonContentTypesVarargs(value: JsonContentType*): Self = StObject.set(x, "JsonContentTypes", js.Array(value :_*))
  }
}
