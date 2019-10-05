package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataService")
@js.native
class DataService protected () extends js.Object {
  def this(config: DataServiceOptions) = this()
  var adapterInstance: DataServiceAdapter = js.native
  var adapterName: String = js.native
  var hasServerMetadata: Boolean = js.native
  var jsonResultsAdapter: JsonResultsAdapter = js.native
  var serviceName: String = js.native
  var uriBuilderName: String = js.native
  var useJsonp: Boolean = js.native
  def using(config: DataServiceOptions): DataService = js.native
}

