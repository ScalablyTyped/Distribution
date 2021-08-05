package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamKeyResponse extends StObject {
  
  /**
    * Stream key used to authenticate an RTMPS stream for ingestion.
    */
  var streamKey: js.UndefOr[StreamKey] = js.undefined
}
object CreateStreamKeyResponse {
  
  inline def apply(): CreateStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamKeyResponse]
  }
  
  extension [Self <: CreateStreamKeyResponse](x: Self) {
    
    inline def setStreamKey(value: StreamKey): Self = StObject.set(x, "streamKey", value.asInstanceOf[js.Any])
    
    inline def setStreamKeyUndefined: Self = StObject.set(x, "streamKey", js.undefined)
  }
}
