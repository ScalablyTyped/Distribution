package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectorDefinitionRequest extends StObject {
  
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: string
}
object GetConnectorDefinitionRequest {
  
  @scala.inline
  def apply(ConnectorDefinitionId: string): GetConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectorDefinitionRequest]
  }
  
  @scala.inline
  implicit class GetConnectorDefinitionRequestMutableBuilder[Self <: GetConnectorDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorDefinitionId(value: string): Self = StObject.set(x, "ConnectorDefinitionId", value.asInstanceOf[js.Any])
  }
}
