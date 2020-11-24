package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectorDefinitionVersionRequest extends js.Object {
  
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: string = js.native
  
  /**
    * The ID of the connector definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListConnectorDefinitionVersions'' requests. If the version is the last one that was associated with a connector definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var ConnectorDefinitionVersionId: string = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object GetConnectorDefinitionVersionRequest {
  
  @scala.inline
  def apply(ConnectorDefinitionId: string, ConnectorDefinitionVersionId: string): GetConnectorDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any], ConnectorDefinitionVersionId = ConnectorDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectorDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class GetConnectorDefinitionVersionRequestOps[Self <: GetConnectorDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setConnectorDefinitionVersionId(value: string): Self = this.set("ConnectorDefinitionVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
