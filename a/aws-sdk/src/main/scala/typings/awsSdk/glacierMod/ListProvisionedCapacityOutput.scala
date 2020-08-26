package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisionedCapacityOutput extends js.Object {
  /**
    * The response body contains the following JSON fields.
    */
  var ProvisionedCapacityList: js.UndefOr[typings.awsSdk.glacierMod.ProvisionedCapacityList] = js.native
}

object ListProvisionedCapacityOutput {
  @scala.inline
  def apply(): ListProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisionedCapacityOutput]
  }
  @scala.inline
  implicit class ListProvisionedCapacityOutputOps[Self <: ListProvisionedCapacityOutput] (val x: Self) extends AnyVal {
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
    def setProvisionedCapacityListVarargs(value: ProvisionedCapacityDescription*): Self = this.set("ProvisionedCapacityList", js.Array(value :_*))
    @scala.inline
    def setProvisionedCapacityList(value: ProvisionedCapacityList): Self = this.set("ProvisionedCapacityList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedCapacityList: Self = this.set("ProvisionedCapacityList", js.undefined)
  }
  
}

