package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMapStyleDescriptorResponse extends StObject {
  
  /**
    * Contains the body of the style descriptor.
    */
  var Blob: js.UndefOr[_Blob] = js.undefined
  
  /**
    * The style descriptor's content type. For example, application/json.
    */
  var ContentType: js.UndefOr[String] = js.undefined
}
object GetMapStyleDescriptorResponse {
  
  inline def apply(): GetMapStyleDescriptorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMapStyleDescriptorResponse]
  }
  
  extension [Self <: GetMapStyleDescriptorResponse](x: Self) {
    
    inline def setBlob(value: _Blob): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "Blob", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
  }
}
