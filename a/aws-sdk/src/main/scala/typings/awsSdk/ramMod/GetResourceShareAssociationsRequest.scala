package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceShareAssociationsRequest extends StObject {
  
  /**
    * Specifies that you want to retrieve only associations with this status.
    */
  var associationStatus: js.UndefOr[ResourceShareAssociationStatus] = js.undefined
  
  /**
    * Specifies whether you want to retrieve the associations that involve a specified resource or principal.    PRINCIPAL – list the principals that are associated with the specified resource share.    RESOURCE – list the resources that are associated with the specified resource share.  
    */
  var associationType: ResourceShareAssociationType
  
  /**
    * Specifies the total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the number you specify, the NextToken response element is returned with a value (not null). Include the specified value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the ID of the principal whose resource shares you want to retrieve. This can be an Amazon Web Services account ID, an organization ID, an organizational unit ID, or the Amazon Resoure Name (ARN) of an individual IAM user or role. You cannot specify this parameter if the association type is RESOURCE.
    */
  var principal: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Resoure Name (ARN) of the resource whose resource shares you want to retrieve. You cannot specify this parameter if the association type is PRINCIPAL.
    */
  var resourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a list of Amazon Resource Names (ARNs) of the resource share whose associations you want to retrieve.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
}
object GetResourceShareAssociationsRequest {
  
  inline def apply(associationType: ResourceShareAssociationType): GetResourceShareAssociationsRequest = {
    val __obj = js.Dynamic.literal(associationType = associationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareAssociationsRequest]
  }
  
  extension [Self <: GetResourceShareAssociationsRequest](x: Self) {
    
    inline def setAssociationStatus(value: ResourceShareAssociationStatus): Self = StObject.set(x, "associationStatus", value.asInstanceOf[js.Any])
    
    inline def setAssociationStatusUndefined: Self = StObject.set(x, "associationStatus", js.undefined)
    
    inline def setAssociationType(value: ResourceShareAssociationType): Self = StObject.set(x, "associationType", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    inline def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value*))
  }
}
