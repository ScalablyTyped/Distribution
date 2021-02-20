package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourcesRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The principal.
    */
  var principal: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.native
  
  /**
    * The type of owner.
    */
  var resourceOwner: ResourceOwner = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.native
  
  /**
    * The resource type. Valid values: codebuild:Project | codebuild:ReportGroup | ec2:CapacityReservation | ec2:DedicatedHost | ec2:Subnet | ec2:TrafficMirrorTarget | ec2:TransitGateway | imagebuilder:Component | imagebuilder:Image | imagebuilder:ImageRecipe | license-manager:LicenseConfiguration I resource-groups:Group | rds:Cluster | route53resolver:ResolverRule 
    */
  var resourceType: js.UndefOr[String] = js.native
}
object ListResourcesRequest {
  
  @scala.inline
  def apply(resourceOwner: ResourceOwner): ListResourcesRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesRequest]
  }
  
  @scala.inline
  implicit class ListResourcesRequestMutableBuilder[Self <: ListResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsUndefined: Self = StObject.set(x, "resourceArns", js.undefined)
    
    @scala.inline
    def setResourceArnsVarargs(value: String*): Self = StObject.set(x, "resourceArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceOwner(value: ResourceOwner): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    @scala.inline
    def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
