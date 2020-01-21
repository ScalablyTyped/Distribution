package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShareAssociation extends js.Object {
  /**
    * The associated entity. For resource associations, this is the ARN of the resource. For principal associations, this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
    */
  var associatedEntity: js.UndefOr[String] = js.native
  /**
    * The association type.
    */
  var associationType: js.UndefOr[ResourceShareAssociationType] = js.native
  /**
    * The time when the association was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates whether the principal belongs to the same AWS organization as the AWS account that owns the resource share.
    */
  var external: js.UndefOr[Boolean] = js.native
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[String] = js.native
  /**
    * The status of the association.
    */
  var status: js.UndefOr[ResourceShareAssociationStatus] = js.native
  /**
    * A message about the status of the association.
    */
  var statusMessage: js.UndefOr[String] = js.native
}

object ResourceShareAssociation {
  @scala.inline
  def apply(
    associatedEntity: String = null,
    associationType: ResourceShareAssociationType = null,
    creationTime: DateTime = null,
    external: js.UndefOr[scala.Boolean] = js.undefined,
    lastUpdatedTime: DateTime = null,
    resourceShareArn: String = null,
    resourceShareName: String = null,
    status: ResourceShareAssociationStatus = null,
    statusMessage: String = null
  ): ResourceShareAssociation = {
    val __obj = js.Dynamic.literal()
    if (associatedEntity != null) __obj.updateDynamic("associatedEntity")(associatedEntity.asInstanceOf[js.Any])
    if (associationType != null) __obj.updateDynamic("associationType")(associationType.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn.asInstanceOf[js.Any])
    if (resourceShareName != null) __obj.updateDynamic("resourceShareName")(resourceShareName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceShareAssociation]
  }
}

