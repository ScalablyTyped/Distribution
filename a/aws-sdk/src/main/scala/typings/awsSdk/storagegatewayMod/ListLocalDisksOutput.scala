package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLocalDisksOutput extends js.Object {
  /**
    * A JSON object containing the following fields:    ListLocalDisksOutput$Disks   
    */
  var Disks: js.UndefOr[typings.awsSdk.storagegatewayMod.Disks] = js.native
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object ListLocalDisksOutput {
  @scala.inline
  def apply(): ListLocalDisksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocalDisksOutput]
  }
  @scala.inline
  implicit class ListLocalDisksOutputOps[Self <: ListLocalDisksOutput] (val x: Self) extends AnyVal {
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
    def setDisksVarargs(value: Disk*): Self = this.set("Disks", js.Array(value :_*))
    @scala.inline
    def setDisks(value: Disks): Self = this.set("Disks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisks: Self = this.set("Disks", js.undefined)
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
  }
  
}

