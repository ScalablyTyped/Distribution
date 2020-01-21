package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIndexRequest extends js.Object {
  /**
    * A new description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  /**
    * The document metadata to update. 
    */
  var DocumentMetadataConfigurationUpdates: js.UndefOr[DocumentMetadataConfigurationList] = js.native
  /**
    * The identifier of the index to update.
    */
  var Id: IndexId = js.native
  /**
    * The name of the index to update.
    */
  var Name: js.UndefOr[IndexName] = js.native
  /**
    * A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
}

object UpdateIndexRequest {
  @scala.inline
  def apply(
    Id: IndexId,
    Description: Description = null,
    DocumentMetadataConfigurationUpdates: DocumentMetadataConfigurationList = null,
    Name: IndexName = null,
    RoleArn: RoleArn = null
  ): UpdateIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DocumentMetadataConfigurationUpdates != null) __obj.updateDynamic("DocumentMetadataConfigurationUpdates")(DocumentMetadataConfigurationUpdates.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIndexRequest]
  }
}

