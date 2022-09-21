package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamKeyResponse extends StObject {
  
  /**
    * 
    */
  var streamKey: js.UndefOr[StreamKey] = js.undefined
}
object GetStreamKeyResponse {
  
  inline def apply(): GetStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamKeyResponse]
  }
  
  extension [Self <: GetStreamKeyResponse](x: Self) {
    
    inline def setStreamKey(value: StreamKey): Self = StObject.set(x, "streamKey", value.asInstanceOf[js.Any])
    
    inline def setStreamKeyUndefined: Self = StObject.set(x, "streamKey", js.undefined)
  }
}
