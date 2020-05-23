package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShare extends js.Object {
  /**
    * Indicates whether principals outside your AWS organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.native
  /**
    * The time when the resource share was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates how the resource share was created. Possible values include:    CREATED_FROM_POLICY - Indicates that the resource share was created from an AWS Identity and Access Management (AWS IAM) policy attached to a resource. These resource shares are visible only to the AWS account that created it. They cannot be modified in AWS RAM.    PROMOTING_TO_STANDARD - The resource share is in the process of being promoted. For more information, see PromoteResourceShareCreatedFromPolicy.    STANDARD - Indicates that the resource share was created in AWS RAM using the console or APIs. These resource shares are visible to all principals. They can be modified in AWS RAM.  
    */
  var featureSet: js.UndefOr[ResourceShareFeatureSet] = js.native
  /**
    * The time when the resource share was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the resource share.
    */
  var owningAccountId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
  /**
    * The status of the resource share.
    */
  var status: js.UndefOr[ResourceShareStatus] = js.native
  /**
    * A message about the status of the resource share.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The tags for the resource share.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object ResourceShare {
  @scala.inline
  def apply(
    allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
    creationTime: DateTime = null,
    featureSet: ResourceShareFeatureSet = null,
    lastUpdatedTime: DateTime = null,
    name: String = null,
    owningAccountId: String = null,
    resourceShareArn: String = null,
    status: ResourceShareStatus = null,
    statusMessage: String = null,
    tags: TagList = null
  ): ResourceShare = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowExternalPrincipals)) __obj.updateDynamic("allowExternalPrincipals")(allowExternalPrincipals.get.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (featureSet != null) __obj.updateDynamic("featureSet")(featureSet.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owningAccountId != null) __obj.updateDynamic("owningAccountId")(owningAccountId.asInstanceOf[js.Any])
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceShare]
  }
}

