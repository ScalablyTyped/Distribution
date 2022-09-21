package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpEndpointRequestConfiguration extends StObject {
  
  /**
    * Describes the metadata sent to the HTTP endpoint destination.
    */
  var CommonAttributes: js.UndefOr[HttpEndpointCommonAttributesList] = js.undefined
  
  /**
    * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to the destination. For more information, see Content-Encoding in MDN Web Docs, the official Mozilla documentation.
    */
  var ContentEncoding: js.UndefOr[typings.awsSdk.firehoseMod.ContentEncoding] = js.undefined
}
object HttpEndpointRequestConfiguration {
  
  inline def apply(): HttpEndpointRequestConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointRequestConfiguration]
  }
  
  extension [Self <: HttpEndpointRequestConfiguration](x: Self) {
    
    inline def setCommonAttributes(value: HttpEndpointCommonAttributesList): Self = StObject.set(x, "CommonAttributes", value.asInstanceOf[js.Any])
    
    inline def setCommonAttributesUndefined: Self = StObject.set(x, "CommonAttributes", js.undefined)
    
    inline def setCommonAttributesVarargs(value: HttpEndpointCommonAttribute*): Self = StObject.set(x, "CommonAttributes", js.Array(value*))
    
    inline def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
  }
}
