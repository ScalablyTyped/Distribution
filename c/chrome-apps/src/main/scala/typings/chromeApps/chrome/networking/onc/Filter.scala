package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes which networks to return. */
@js.native
trait Filter extends js.Object {
  /**
    * If true, only include configured (saved) networks.
    * @default false
    */
  var configured: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of networks to return.
    * Use 0 for no limit
    * @default 1000 if unspecified.
    * */
  var limit: js.UndefOr[integer] = js.native
  /** The type of networks to return. */
  var networkType: NetworkType = js.native
  /**
    * If true, only include visible (physically connected or in-range) networks.
    * @default false
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Filter {
  @scala.inline
  def apply(networkType: NetworkType): Filter = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def setNetworkType(value: NetworkType): Self = this.set("networkType", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigured(value: Boolean): Self = this.set("configured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigured: Self = this.set("configured", js.undefined)
    @scala.inline
    def setLimit(value: integer): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

