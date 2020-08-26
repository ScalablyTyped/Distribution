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
  def apply(DataSourceId: EntityId): GetDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSourceInput]
  }
  @scala.inline
  implicit class GetDataSourceInputOps[Self <: GetDataSourceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSourceId(value: EntityId): Self = this.set("DataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Verbose): Self = this.set("Verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("Verbose", js.undefined)
  }
  
}

