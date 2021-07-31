package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectorDefinitionRequest extends StObject {
  
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: string
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object UpdateConnectorDefinitionRequest {
  
  @scala.inline
  def apply(ConnectorDefinitionId: string): UpdateConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectorDefinitionRequest]
  }
  
  @scala.inline
  implicit class UpdateConnectorDefinitionRequestMutableBuilder[Self <: UpdateConnectorDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorDefinitionId(value: string): Self = StObject.set(x, "ConnectorDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
