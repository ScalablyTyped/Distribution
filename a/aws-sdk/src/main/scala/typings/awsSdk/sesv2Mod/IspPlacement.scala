package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IspPlacement extends js.Object {
  /**
    * The name of the email provider that the inbox placement data applies to.
    */
  var IspName: js.UndefOr[typings.awsSdk.sesv2Mod.IspName] = js.native
  /**
    * An object that contains inbox placement metrics for a specific email provider.
    */
  var PlacementStatistics: js.UndefOr[typings.awsSdk.sesv2Mod.PlacementStatistics] = js.native
}

object IspPlacement {
  @scala.inline
  def apply(): IspPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IspPlacement]
  }
  @scala.inline
  implicit class IspPlacementOps[Self <: IspPlacement] (val x: Self) extends AnyVal {
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
    def setIspName(value: IspName): Self = this.set("IspName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIspName: Self = this.set("IspName", js.undefined)
    @scala.inline
    def setPlacementStatistics(value: PlacementStatistics): Self = this.set("PlacementStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementStatistics: Self = this.set("PlacementStatistics", js.undefined)
  }
  
}

