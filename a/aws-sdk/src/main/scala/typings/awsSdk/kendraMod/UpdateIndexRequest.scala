package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIndexRequest extends js.Object {
  /**
    * Sets the number of addtional storage and query capacity units that should be used by the index. You can change the capacity of the index up to 5 times per day. If you are using extra storage units, you can't reduce the storage capacity below that required to meet the storage needs for your index.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.native
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
    CapacityUnits: CapacityUnitsConfiguration = null,
    Description: Description = null,
    DocumentMetadataConfigurationUpdates: DocumentMetadataConfigurationList = null,
    Name: IndexName = null,
    RoleArn: RoleArn = null
  ): UpdateIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (CapacityUnits != null) __obj.updateDynamic("CapacityUnits")(CapacityUnits.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DocumentMetadataConfigurationUpdates != null) __obj.updateDynamic("DocumentMetadataConfigurationUpdates")(DocumentMetadataConfigurationUpdates.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIndexRequest]
  }
}

