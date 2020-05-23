package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesRequest extends js.Object {
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
  def apply(
    resourceOwner: ResourceOwner,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: String = null,
    principal: String = null,
    resourceArns: ResourceArnList = null,
    resourceShareArns: ResourceShareArnList = null,
    resourceType: String = null
  ): ListResourcesRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (resourceArns != null) __obj.updateDynamic("resourceArns")(resourceArns.asInstanceOf[js.Any])
    if (resourceShareArns != null) __obj.updateDynamic("resourceShareArns")(resourceShareArns.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesRequest]
  }
}

