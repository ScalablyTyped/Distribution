package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVaultsOutput extends js.Object {
  /**
    * The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request to obtain more vaults in the list.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * List of vaults.
    */
  var VaultList: js.UndefOr[typings.awsSdk.glacierMod.VaultList] = js.native
}

object ListVaultsOutput {
  @scala.inline
  def apply(Marker: String = null, VaultList: VaultList = null): ListVaultsOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (VaultList != null) __obj.updateDynamic("VaultList")(VaultList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVaultsOutput]
  }
}

