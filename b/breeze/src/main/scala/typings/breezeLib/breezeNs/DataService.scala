package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataService")
@js.native
class DataService protected () extends js.Object {
  def this(config: DataServiceOptions) = this()
  var adapterInstance: DataServiceAdapter = js.native
  var adapterName: java.lang.String = js.native
  var hasServerMetadata: scala.Boolean = js.native
  var jsonResultsAdapter: JsonResultsAdapter = js.native
  var serviceName: java.lang.String = js.native
  var uriBuilderName: java.lang.String = js.native
  var useJsonp: scala.Boolean = js.native
  def using(config: DataServiceOptions): DataService = js.native
}

