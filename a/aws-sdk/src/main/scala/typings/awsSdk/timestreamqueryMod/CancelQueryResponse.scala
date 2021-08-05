package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelQueryResponse extends StObject {
  
  /**
    *  A CancellationMessage is returned when a CancelQuery request for the query specified by QueryId has already been issued. 
    */
  var CancellationMessage: js.UndefOr[String] = js.undefined
}
object CancelQueryResponse {
  
  inline def apply(): CancelQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelQueryResponse]
  }
  
  extension [Self <: CancelQueryResponse](x: Self) {
    
    inline def setCancellationMessage(value: String): Self = StObject.set(x, "CancellationMessage", value.asInstanceOf[js.Any])
    
    inline def setCancellationMessageUndefined: Self = StObject.set(x, "CancellationMessage", js.undefined)
  }
}
