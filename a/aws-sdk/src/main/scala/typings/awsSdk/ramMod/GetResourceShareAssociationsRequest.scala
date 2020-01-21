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
  def apply(
    associationType: ResourceShareAssociationType,
    associationStatus: ResourceShareAssociationStatus = null,
    maxResults: Int | Double = null,
    nextToken: String = null,
    principal: String = null,
    resourceArn: String = null,
    resourceShareArns: ResourceShareArnList = null
  ): GetResourceShareAssociationsRequest = {
    val __obj = js.Dynamic.literal(associationType = associationType.asInstanceOf[js.Any])
    if (associationStatus != null) __obj.updateDynamic("associationStatus")(associationStatus.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    if (resourceShareArns != null) __obj.updateDynamic("resourceShareArns")(resourceShareArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareAssociationsRequest]
  }
}

