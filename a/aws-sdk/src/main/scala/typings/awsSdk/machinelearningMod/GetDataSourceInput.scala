package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataSourceInput extends js.Object {
  /**
    * The ID assigned to the DataSource at creation.
    */
  var DataSourceId: EntityId = js.native
  /**
    * Specifies whether the GetDataSource operation should return DataSourceSchema. If true, DataSourceSchema is returned. If false, DataSourceSchema is not returned.
    */
  var Verbose: js.UndefOr[typings.awsSdk.machinelearningMod.Verbose] = js.native
}

object GetDataSourceInput {
  @scala.inline
  def apply(DataSourceId: EntityId, Verbose: js.UndefOr[Boolean] = js.undefined): GetDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any])
    if (!js.isUndefined(Verbose)) __obj.updateDynamic("Verbose")(Verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSourceInput]
  }
}

