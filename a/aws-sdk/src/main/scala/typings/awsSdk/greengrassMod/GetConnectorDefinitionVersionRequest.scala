package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectorDefinitionVersionRequest extends StObject {
  
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: string
  
  /**
    * The ID of the connector definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListConnectorDefinitionVersions'' requests. If the version is the last one that was associated with a connector definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var ConnectorDefinitionVersionId: string
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object GetConnectorDefinitionVersionRequest {
  
  inline def apply(ConnectorDefinitionId: string, ConnectorDefinitionVersionId: string): GetConnectorDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any], ConnectorDefinitionVersionId = ConnectorDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectorDefinitionVersionRequest]
  }
  
  extension [Self <: GetConnectorDefinitionVersionRequest](x: Self) {
    
    inline def setConnectorDefinitionId(value: string): Self = StObject.set(x, "ConnectorDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setConnectorDefinitionVersionId(value: string): Self = StObject.set(x, "ConnectorDefinitionVersionId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
