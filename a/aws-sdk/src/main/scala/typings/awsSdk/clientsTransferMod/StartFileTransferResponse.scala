package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFileTransferResponse extends StObject {
  
  /**
    * Returns the unique identifier for this file transfer. 
    */
  var TransferId: typings.awsSdk.clientsTransferMod.TransferId
}
object StartFileTransferResponse {
  
  inline def apply(TransferId: TransferId): StartFileTransferResponse = {
    val __obj = js.Dynamic.literal(TransferId = TransferId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFileTransferResponse]
  }
  
  extension [Self <: StartFileTransferResponse](x: Self) {
    
    inline def setTransferId(value: TransferId): Self = StObject.set(x, "TransferId", value.asInstanceOf[js.Any])
  }
}
