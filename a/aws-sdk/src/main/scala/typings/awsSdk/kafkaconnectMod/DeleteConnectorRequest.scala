package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the connector that you want to delete.
    */
  var connectorArn: string
  
  /**
    * The current version of the connector that you want to delete.
    */
  var currentVersion: js.UndefOr[string] = js.undefined
}
object DeleteConnectorRequest {
  
  inline def apply(connectorArn: string): DeleteConnectorRequest = {
    val __obj = js.Dynamic.literal(connectorArn = connectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectorRequest]
  }
  
  extension [Self <: DeleteConnectorRequest](x: Self) {
    
    inline def setConnectorArn(value: string): Self = StObject.set(x, "connectorArn", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
  }
}
