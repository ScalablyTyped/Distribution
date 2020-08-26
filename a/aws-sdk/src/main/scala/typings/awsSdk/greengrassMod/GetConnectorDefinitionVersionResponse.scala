package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectorDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the connector definition version.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the connector definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  /**
    * Information about the connector definition version.
    */
  var Definition: js.UndefOr[ConnectorDefinitionVersion] = js.native
  /**
    * The ID of the connector definition version.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The version of the connector definition version.
    */
  var Version: js.UndefOr[string] = js.native
}

object GetConnectorDefinitionVersionResponse {
  @scala.inline
  def apply(): GetConnectorDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectorDefinitionVersionResponse]
  }
  @scala.inline
  implicit class GetConnectorDefinitionVersionResponseOps[Self <: GetConnectorDefinitionVersionResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: string): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    @scala.inline
    def setDefinition(value: ConnectorDefinitionVersion): Self = this.set("Definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("Definition", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVersion(value: string): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

