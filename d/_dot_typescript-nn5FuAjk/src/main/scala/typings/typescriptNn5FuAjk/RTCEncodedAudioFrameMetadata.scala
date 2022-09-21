package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCEncodedAudioFrameMetadata extends StObject {
  
  var contributingSources: js.UndefOr[Array[Double]] = js.undefined
  
  var synchronizationSource: js.UndefOr[Double] = js.undefined
}
object RTCEncodedAudioFrameMetadata {
  
  inline def apply(): RTCEncodedAudioFrameMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCEncodedAudioFrameMetadata]
  }
  
  extension [Self <: RTCEncodedAudioFrameMetadata](x: Self) {
    
    inline def setContributingSources(value: Array[Double]): Self = StObject.set(x, "contributingSources", value.asInstanceOf[js.Any])
    
    inline def setContributingSourcesUndefined: Self = StObject.set(x, "contributingSources", js.undefined)
    
    inline def setSynchronizationSource(value: Double): Self = StObject.set(x, "synchronizationSource", value.asInstanceOf[js.Any])
    
    inline def setSynchronizationSourceUndefined: Self = StObject.set(x, "synchronizationSource", js.undefined)
  }
}
