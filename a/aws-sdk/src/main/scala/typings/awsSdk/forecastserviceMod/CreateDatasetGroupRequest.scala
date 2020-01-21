package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetGroupRequest extends js.Object {
  /**
    * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
    */
  var DatasetArns: js.UndefOr[ArnList] = js.native
  /**
    * A name for the dataset group.
    */
  var DatasetGroupName: Name = js.native
  /**
    * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value specified for the Domain parameter of the CreateDataset operation must match. The Domain and DatasetType that you choose determine the fields that must be present in training data that you import to a dataset. For example, if you choose the RETAIL domain and TARGET_TIME_SERIES as the DatasetType, Amazon Forecast requires that item_id, timestamp, and demand fields are present in your data. For more information, see howitworks-datasets-groups.
    */
  var Domain: typings.awsSdk.forecastserviceMod.Domain = js.native
}

object CreateDatasetGroupRequest {
  @scala.inline
  def apply(DatasetGroupName: Name, Domain: Domain, DatasetArns: ArnList = null): CreateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetGroupName = DatasetGroupName.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any])
    if (DatasetArns != null) __obj.updateDynamic("DatasetArns")(DatasetArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetGroupRequest]
  }
}

