package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConnectorDefinitionRequest extends StObject {
  
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: string = js.native
}
object DeleteConnectorDefinitionRequest {
  
  @scala.inline
  def apply(ConnectorDefinitionId: string): DeleteConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectorDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteConnectorDefinitionRequestMutableBuilder[Self <: DeleteConnectorDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorDefinitionId(value: string): Self = StObject.set(x, "ConnectorDefinitionId", value.asInstanceOf[js.Any])
  }
}
