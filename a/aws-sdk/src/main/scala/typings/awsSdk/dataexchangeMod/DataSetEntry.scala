package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetEntry extends js.Object {
  /**
    * The ARN for the data set.
    */
  var Arn: typings.awsSdk.dataexchangeMod.Arn = js.native
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: typings.awsSdk.dataexchangeMod.AssetType = js.native
  /**
    * The date and time that the data set was created, in ISO 8601 format.
    */
  var CreatedAt: Timestamp = js.native
  /**
    * The description for the data set.
    */
  var Description: typings.awsSdk.dataexchangeMod.Description = js.native
  /**
    * The unique identifier for the data set.
    */
  var Id: typings.awsSdk.dataexchangeMod.Id = js.native
  /**
    * The name of the data set.
    */
  var Name: typings.awsSdk.dataexchangeMod.Name = js.native
  /**
    * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers).
    */
  var Origin: typings.awsSdk.dataexchangeMod.Origin = js.native
  /**
    * If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
    */
  var OriginDetails: js.UndefOr[typings.awsSdk.dataexchangeMod.OriginDetails] = js.native
  /**
    * The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter is returned when a data set owner is viewing the entitled copy of its owned data set.
    */
  var SourceId: js.UndefOr[Id] = js.native
  /**
    * The date and time that the data set was last updated, in ISO 8601 format.
    */
  var UpdatedAt: Timestamp = js.native
}

object DataSetEntry {
  @scala.inline
  def apply(
    Arn: Arn,
    AssetType: AssetType,
    CreatedAt: Timestamp,
    Description: Description,
    Id: Id,
    Name: Name,
    Origin: Origin,
    UpdatedAt: Timestamp,
    OriginDetails: OriginDetails = null,
    SourceId: Id = null
  ): DataSetEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], AssetType = AssetType.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    if (OriginDetails != null) __obj.updateDynamic("OriginDetails")(OriginDetails.asInstanceOf[js.Any])
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetEntry]
  }
}

