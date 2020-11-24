package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectorDefinitionRequest extends js.Object {
  
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: string = js.native
}
object GetConnectorDefinitionRequest {
  
  @scala.inline
  def apply(ConnectorDefinitionId: string): GetConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectorDefinitionRequest]
  }
  
  @scala.inline
  implicit class GetConnectorDefinitionRequestOps[Self <: GetConnectorDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectorDefinitionId(value: string): Self = this.set("ConnectorDefinitionId", value.asInstanceOf[js.Any])
  }
}
