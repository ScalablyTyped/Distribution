package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstancesId extends js.Object {
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}

object ReservedInstancesId {
  @scala.inline
  def apply(): ReservedInstancesId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesId]
  }
  @scala.inline
  implicit class ReservedInstancesIdOps[Self <: ReservedInstancesId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReservedInstancesId(value: String): Self = this.set("ReservedInstancesId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedInstancesId: Self = this.set("ReservedInstancesId", js.undefined)
  }
  
}

