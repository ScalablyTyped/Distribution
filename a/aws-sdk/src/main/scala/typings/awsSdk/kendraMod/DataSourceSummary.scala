package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSummary extends js.Object {
  /**
    * The UNIX datetime that the data source was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier for the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.native
  /**
    * The name of the data source.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  /**
    * The status of the data source. When the status is ATIVE the data source is ready to use.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.native
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.native
  /**
    * The UNIX datetime that the data source was lasted updated. 
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object DataSourceSummary {
  @scala.inline
  def apply(
    CreatedAt: Timestamp = null,
    Id: DataSourceId = null,
    Name: DataSourceName = null,
    Status: DataSourceStatus = null,
    Type: DataSourceType = null,
    UpdatedAt: Timestamp = null
  ): DataSourceSummary = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSummary]
  }
}

