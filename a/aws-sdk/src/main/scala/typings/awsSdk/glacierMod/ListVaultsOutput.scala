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
  def apply(): ListVaultsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVaultsOutput]
  }
  @scala.inline
  implicit class ListVaultsOutputOps[Self <: ListVaultsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setVaultListVarargs(value: DescribeVaultOutput*): Self = this.set("VaultList", js.Array(value :_*))
    @scala.inline
    def setVaultList(value: VaultList): Self = this.set("VaultList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVaultList: Self = this.set("VaultList", js.undefined)
  }
  
}

