package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartElasticsearchServiceSoftwareUpdateResponse extends js.Object {
  /**
    * The current status of the Elasticsearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.esMod.ServiceSoftwareOptions] = js.native
}

object StartElasticsearchServiceSoftwareUpdateResponse {
  @scala.inline
  def apply(ServiceSoftwareOptions: ServiceSoftwareOptions = null): StartElasticsearchServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceSoftwareOptions != null) __obj.updateDynamic("ServiceSoftwareOptions")(ServiceSoftwareOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateResponse]
  }
}

