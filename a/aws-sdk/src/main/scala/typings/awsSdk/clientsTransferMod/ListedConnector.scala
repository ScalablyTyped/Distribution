package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedConnector extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the specified connector.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsTransferMod.Arn] = js.undefined
  
  /**
    * The unique identifier for the connector.
    */
  var ConnectorId: js.UndefOr[typings.awsSdk.clientsTransferMod.ConnectorId] = js.undefined
  
  /**
    * The URL of the partner's AS2 endpoint.
    */
  var Url: js.UndefOr[typings.awsSdk.clientsTransferMod.Url] = js.undefined
}
object ListedConnector {
  
  inline def apply(): ListedConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListedConnector]
  }
  
  extension [Self <: ListedConnector](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "ConnectorId", value.asInstanceOf[js.Any])
    
    inline def setConnectorIdUndefined: Self = StObject.set(x, "ConnectorId", js.undefined)
    
    inline def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
