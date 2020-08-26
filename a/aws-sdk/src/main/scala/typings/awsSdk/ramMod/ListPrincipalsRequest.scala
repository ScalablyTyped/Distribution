package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrincipalsRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var resourceArn: js.UndefOr[String] = js.native
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

object ListPrincipalsRequest {
  @scala.inline
  def apply(resourceOwner: ResourceOwner): ListPrincipalsRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalsRequest]
  }
  @scala.inline
  implicit class ListPrincipalsRequestOps[Self <: ListPrincipalsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceOwner(value: ResourceOwner): Self = this.set("resourceOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPrincipalsVarargs(value: String*): Self = this.set("principals", js.Array(value :_*))
    @scala.inline
    def setPrincipals(value: PrincipalArnOrIdList): Self = this.set("principals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipals: Self = this.set("principals", js.undefined)
    @scala.inline
    def setResourceArn(value: String): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
    @scala.inline
    def setResourceShareArnsVarargs(value: String*): Self = this.set("resourceShareArns", js.Array(value :_*))
    @scala.inline
    def setResourceShareArns(value: ResourceShareArnList): Self = this.set("resourceShareArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareArns: Self = this.set("resourceShareArns", js.undefined)
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

