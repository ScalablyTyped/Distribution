package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamResponse extends StObject {
  
  /**
    * 
    */
  var stream: js.UndefOr[Stream] = js.undefined
}
object GetStreamResponse {
  
  inline def apply(): GetStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamResponse]
  }
  
  extension [Self <: GetStreamResponse](x: Self) {
    
    inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
