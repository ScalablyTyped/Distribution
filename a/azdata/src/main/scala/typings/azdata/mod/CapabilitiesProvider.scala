package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapabilitiesProvider extends DataProvider {
  def getServerCapabilities(client: DataProtocolClientCapabilities): Thenable[DataProtocolServerCapabilities]
}

object CapabilitiesProvider {
  @scala.inline
  def apply(
    getServerCapabilities: DataProtocolClientCapabilities => Thenable[DataProtocolServerCapabilities],
    providerId: String,
    handle: js.UndefOr[Double] = js.undefined
  ): CapabilitiesProvider = {
    val __obj = js.Dynamic.literal(getServerCapabilities = js.Any.fromFunction1(getServerCapabilities), providerId = providerId.asInstanceOf[js.Any])
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitiesProvider]
  }
}

