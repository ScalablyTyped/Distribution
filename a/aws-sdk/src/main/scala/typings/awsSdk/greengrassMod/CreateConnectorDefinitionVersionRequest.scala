package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectorDefinitionVersionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: string
  
  /**
    * A list of references to connectors in this version, with their corresponding configuration settings.
    */
  var Connectors: js.UndefOr[listOfConnector] = js.undefined
}
object CreateConnectorDefinitionVersionRequest {
  
  @scala.inline
  def apply(ConnectorDefinitionId: string): CreateConnectorDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectorDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class CreateConnectorDefinitionVersionRequestMutableBuilder[Self <: CreateConnectorDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setConnectorDefinitionId(value: string): Self = StObject.set(x, "ConnectorDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectors(value: listOfConnector): Self = StObject.set(x, "Connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorsUndefined: Self = StObject.set(x, "Connectors", js.undefined)
    
    @scala.inline
    def setConnectorsVarargs(value: Connector*): Self = StObject.set(x, "Connectors", js.Array(value :_*))
  }
}
