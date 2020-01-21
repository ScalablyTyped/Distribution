package typings.azureKustoData.mod

import typings.azureKustoData.AnonMgmt
import typings.azureKustoData.mod.Client.KustoResponseDataSetV2
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-kusto-data", "Client")
@js.native
class Client_ protected () extends js.Object {
  def this(kcsb: String) = this()
  def this(kcsb: KustoConnectionStringBuilder) = this()
  var aadHelper: js.Any = js.native
  var cluster: String = js.native
  var connectionString: KustoConnectionStringBuilder = js.native
  var endpoints: AnonMgmt = js.native
  def execute(
    db: js.Any,
    query: js.Any,
    callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[_], Unit]
  ): js.Any = js.native
  def execute(
    db: js.Any,
    query: js.Any,
    callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[_], Unit],
    properties: js.Any
  ): js.Any = js.native
  def executeMgmt(
    db: js.Any,
    query: js.Any,
    callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[_], Unit],
    properties: js.Any
  ): js.Any = js.native
  def executeQuery(
    db: js.Any,
    query: js.Any,
    callback: js.Function2[/* err */ Error, /* results */ KustoResponseDataSetV2[_], Unit],
    properties: js.Any
  ): js.Any = js.native
}

