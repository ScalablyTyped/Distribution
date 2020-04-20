package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDataSourceInput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the DataSource.
    */
  var DataSourceId: EntityId = js.native
}

object DeleteDataSourceInput {
  @scala.inline
  def apply(DataSourceId: EntityId): DeleteDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataSourceInput]
  }
}

