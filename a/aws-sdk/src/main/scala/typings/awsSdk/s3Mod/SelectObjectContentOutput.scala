package typings.awsSdk.s3Mod

import typings.awsSdk.anon.Cont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectObjectContentOutput extends StObject {
  
  /**
    * The array of results.
    */
  var Payload: js.UndefOr[SelectObjectContentEventStream] = js.undefined
}
object SelectObjectContentOutput {
  
  inline def apply(): SelectObjectContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectObjectContentOutput]
  }
  
  extension [Self <: SelectObjectContentOutput](x: Self) {
    
    inline def setPayload(value: SelectObjectContentEventStream): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    
    inline def setPayloadVarargs(value: Cont*): Self = StObject.set(x, "Payload", js.Array(value :_*))
  }
}
