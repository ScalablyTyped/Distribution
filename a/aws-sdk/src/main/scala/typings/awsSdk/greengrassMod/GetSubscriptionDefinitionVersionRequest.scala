package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubscriptionDefinitionVersionRequest extends StObject {
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string
  
  /**
    * The ID of the subscription definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListSubscriptionDefinitionVersions'' requests. If the version is the last one that was associated with a subscription definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var SubscriptionDefinitionVersionId: string
}
object GetSubscriptionDefinitionVersionRequest {
  
  inline def apply(SubscriptionDefinitionId: string, SubscriptionDefinitionVersionId: string): GetSubscriptionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any], SubscriptionDefinitionVersionId = SubscriptionDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionDefinitionVersionRequest]
  }
  
  extension [Self <: GetSubscriptionDefinitionVersionRequest](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubscriptionDefinitionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionDefinitionVersionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionVersionId", value.asInstanceOf[js.Any])
  }
}
