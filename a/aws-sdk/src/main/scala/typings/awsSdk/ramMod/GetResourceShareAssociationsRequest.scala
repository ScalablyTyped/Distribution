package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareAssociationsRequest extends js.Object {
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
  implicit class GetResourceShareAssociationsRequestOps[Self <: GetResourceShareAssociationsRequest] (val x: Self) extends AnyVal {
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
    def setAssociationType(value: ResourceShareAssociationType): Self = this.set("associationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociationStatus(value: ResourceShareAssociationStatus): Self = this.set("associationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationStatus: Self = this.set("associationStatus", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPrincipal(value: String): Self = this.set("principal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipal: Self = this.set("principal", js.undefined)
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
  }
  
}

