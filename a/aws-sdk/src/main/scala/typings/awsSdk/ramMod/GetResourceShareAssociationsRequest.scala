package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceShareAssociationsRequest extends StObject {
  
  /**
    * The association status.
    */
  var associationStatus: js.UndefOr[ResourceShareAssociationStatus] = js.native
  
  /**
    * The association type. Specify PRINCIPAL to list the principals that are associated with the specified resource share. Specify RESOURCE to list the resources that are associated with the specified resource share.
    */
  var associationType: ResourceShareAssociationType = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The principal. You cannot specify this parameter if the association type is RESOURCE.
    */
  var principal: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource. You cannot specify this parameter if the association type is PRINCIPAL.
    */
  var resourceArn: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.native
}
object GetResourceShareAssociationsRequest {
  
  @scala.inline
  def apply(associationType: ResourceShareAssociationType): GetResourceShareAssociationsRequest = {
    val __obj = js.Dynamic.literal(associationType = associationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareAssociationsRequest]
  }
  
  @scala.inline
  implicit class GetResourceShareAssociationsRequestMutableBuilder[Self <: GetResourceShareAssociationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationStatus(value: ResourceShareAssociationStatus): Self = StObject.set(x, "associationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationStatusUndefined: Self = StObject.set(x, "associationStatus", js.undefined)
    
    @scala.inline
    def setAssociationType(value: ResourceShareAssociationType): Self = StObject.set(x, "associationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    @scala.inline
    def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    @scala.inline
    def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value :_*))
  }
}
