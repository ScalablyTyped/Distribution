package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaCapabilities extends StObject {
  
  def decodingInfo(configuration: MediaDecodingConfiguration): Promise[MediaCapabilitiesDecodingInfo]
  
  def encodingInfo(configuration: MediaEncodingConfiguration): Promise[MediaCapabilitiesEncodingInfo]
}
object MediaCapabilities {
  
  inline def apply(
    decodingInfo: MediaDecodingConfiguration => Promise[MediaCapabilitiesDecodingInfo],
    encodingInfo: MediaEncodingConfiguration => Promise[MediaCapabilitiesEncodingInfo]
  ): MediaCapabilities = {
    val __obj = js.Dynamic.literal(decodingInfo = js.Any.fromFunction1(decodingInfo), encodingInfo = js.Any.fromFunction1(encodingInfo))
    __obj.asInstanceOf[MediaCapabilities]
  }
  
  extension [Self <: MediaCapabilities](x: Self) {
    
    inline def setDecodingInfo(value: MediaDecodingConfiguration => Promise[MediaCapabilitiesDecodingInfo]): Self = StObject.set(x, "decodingInfo", js.Any.fromFunction1(value))
    
    inline def setEncodingInfo(value: MediaEncodingConfiguration => Promise[MediaCapabilitiesEncodingInfo]): Self = StObject.set(x, "encodingInfo", js.Any.fromFunction1(value))
  }
}
