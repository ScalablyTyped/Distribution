package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeItem extends js.Object {
  var InstanceType: js.UndefOr[typings.awsSdk.outpostsMod.InstanceType] = js.native
}

object InstanceTypeItem {
  @scala.inline
  def apply(): InstanceTypeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeItem]
  }
  @scala.inline
  implicit class InstanceTypeItemOps[Self <: InstanceTypeItem] (val x: Self) extends AnyVal {
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
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
  }
  
}

