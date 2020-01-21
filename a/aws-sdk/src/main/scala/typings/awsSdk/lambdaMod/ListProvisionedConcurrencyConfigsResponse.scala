package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisionedConcurrencyConfigsResponse extends js.Object {
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * A list of provisioned concurrency configurations.
    */
  var ProvisionedConcurrencyConfigs: js.UndefOr[ProvisionedConcurrencyConfigList] = js.native
}

object ListProvisionedConcurrencyConfigsResponse {
  @scala.inline
  def apply(NextMarker: String = null, ProvisionedConcurrencyConfigs: ProvisionedConcurrencyConfigList = null): ListProvisionedConcurrencyConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (ProvisionedConcurrencyConfigs != null) __obj.updateDynamic("ProvisionedConcurrencyConfigs")(ProvisionedConcurrencyConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisionedConcurrencyConfigsResponse]
  }
}

