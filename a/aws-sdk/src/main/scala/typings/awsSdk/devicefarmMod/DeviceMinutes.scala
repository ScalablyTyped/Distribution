package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMinutes extends js.Object {
  /**
    * When specified, represents only the sum of metered minutes used by the resource to run tests.
    */
  var metered: js.UndefOr[Double] = js.native
  /**
    * When specified, represents the total minutes used by the resource to run tests.
    */
  var total: js.UndefOr[Double] = js.native
  /**
    * When specified, represents only the sum of unmetered minutes used by the resource to run tests.
    */
  var unmetered: js.UndefOr[Double] = js.native
}

object DeviceMinutes {
  @scala.inline
  def apply(): DeviceMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMinutes]
  }
  @scala.inline
  implicit class DeviceMinutesOps[Self <: DeviceMinutes] (val x: Self) extends AnyVal {
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
    def setMetered(value: Double): Self = this.set("metered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetered: Self = this.set("metered", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    @scala.inline
    def setUnmetered(value: Double): Self = this.set("unmetered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmetered: Self = this.set("unmetered", js.undefined)
  }
  
}

