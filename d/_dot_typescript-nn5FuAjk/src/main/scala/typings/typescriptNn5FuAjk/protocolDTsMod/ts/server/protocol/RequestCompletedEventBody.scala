package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCompletedEventBody extends StObject {
  
  var request_seq: Double
}
object RequestCompletedEventBody {
  
  inline def apply(request_seq: Double): RequestCompletedEventBody = {
    val __obj = js.Dynamic.literal(request_seq = request_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCompletedEventBody]
  }
  
  extension [Self <: RequestCompletedEventBody](x: Self) {
    
    inline def setRequest_seq(value: Double): Self = StObject.set(x, "request_seq", value.asInstanceOf[js.Any])
  }
}
