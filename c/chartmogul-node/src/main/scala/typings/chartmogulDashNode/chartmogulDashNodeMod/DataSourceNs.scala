package typings.chartmogulDashNode.chartmogulDashNodeMod

import typings.chartmogulDashNode.chartmogulDashNodeMod.DataSourceNs.DataSource
import typings.chartmogulDashNode.chartmogulDashNodeMod.DataSourceNs.DataSources
import typings.chartmogulDashNode.chartmogulDashNodeMod.DataSourceNs.ListDataSourcesParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "DataSource")
@js.native
object DataSourceNs extends js.Object {
  trait DataSource extends js.Object {
    var created_at: js.UndefOr[String] = js.undefined
    var name: String
    var status: js.UndefOr[String] = js.undefined
    var system: js.UndefOr[String] = js.undefined
    var uuid: js.UndefOr[String] = js.undefined
  }
  
  trait DataSources extends js.Object {
    var data_sources: js.Array[DataSource]
  }
  
  trait ListDataSourcesParams extends js.Object {
    var name: js.UndefOr[String] = js.undefined
    var system: js.UndefOr[String] = js.undefined
  }
  
  def all(config: Config): js.Promise[DataSources] = js.native
  def all(config: Config, params: ListDataSourcesParams): js.Promise[DataSources] = js.native
  def create(config: Config, data: DataSource): js.Promise[DataSource] = js.native
  def destroy(config: Config, uuid: String): js.Promise[js.Object] = js.native
  def retrieve(config: Config, uuid: String): js.Promise[DataSource] = js.native
}

