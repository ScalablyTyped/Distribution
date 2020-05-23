package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataService extends js.Object {
  var adapterInstance: DataServiceAdapter
  var adapterName: String
  var hasServerMetadata: Boolean
  var jsonResultsAdapter: JsonResultsAdapter
  var serviceName: String
  var uriBuilderName: String
  var useJsonp: Boolean
  def using(config: DataServiceOptions): DataService
}

object DataService {
  @scala.inline
  def apply(
    adapterInstance: DataServiceAdapter,
    adapterName: String,
    hasServerMetadata: Boolean,
    jsonResultsAdapter: JsonResultsAdapter,
    serviceName: String,
    uriBuilderName: String,
    useJsonp: Boolean,
    using: DataServiceOptions => DataService
  ): DataService = {
    val __obj = js.Dynamic.literal(adapterInstance = adapterInstance.asInstanceOf[js.Any], adapterName = adapterName.asInstanceOf[js.Any], hasServerMetadata = hasServerMetadata.asInstanceOf[js.Any], jsonResultsAdapter = jsonResultsAdapter.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], uriBuilderName = uriBuilderName.asInstanceOf[js.Any], useJsonp = useJsonp.asInstanceOf[js.Any], using = js.Any.fromFunction1(using))
    __obj.asInstanceOf[DataService]
  }
}

