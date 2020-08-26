package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConnectorDefinitionRequest extends js.Object {
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
  implicit class DeleteConnectorDefinitionRequestOps[Self <: DeleteConnectorDefinitionRequest] (val x: Self) extends AnyVal {
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

