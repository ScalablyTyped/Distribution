package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "DataSource")
@js.native
object DataSourceNs extends js.Object {
  
  trait DataSource extends js.Object {
    var created_at: js.UndefOr[java.lang.String] = js.undefined
    var name: java.lang.String
    var status: js.UndefOr[java.lang.String] = js.undefined
    var system: js.UndefOr[java.lang.String] = js.undefined
    var uuid: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait DataSources extends js.Object {
    var data_sources: js.Array[DataSource]
  }
  
  
  trait ListDataSourcesParams extends js.Object {
    var name: js.UndefOr[java.lang.String] = js.undefined
    var system: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config): js.Promise[DataSources] = js.native
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: ListDataSourcesParams): js.Promise[DataSources] = js.native
  def create(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, data: DataSource): js.Promise[DataSource] = js.native
  def destroy(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[js.Object] = js.native
  def retrieve(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[DataSource] = js.native
}

