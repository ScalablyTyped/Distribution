package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectAttachmentResponse extends StObject {
  
  /**
    * The response to a Connect attachment request.
    */
  var ConnectAttachment: js.UndefOr[typings.awsSdk.networkmanagerMod.ConnectAttachment] = js.undefined
}
object CreateConnectAttachmentResponse {
  
  inline def apply(): CreateConnectAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectAttachmentResponse]
  }
  
  extension [Self <: CreateConnectAttachmentResponse](x: Self) {
    
    inline def setConnectAttachment(value: ConnectAttachment): Self = StObject.set(x, "ConnectAttachment", value.asInstanceOf[js.Any])
    
    inline def setConnectAttachmentUndefined: Self = StObject.set(x, "ConnectAttachment", js.undefined)
  }
}
