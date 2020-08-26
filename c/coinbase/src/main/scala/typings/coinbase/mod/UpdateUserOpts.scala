package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserOpts extends js.Object {
  /**
    * User’s name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Local currency used to display amounts converted from BTC
    */
  var native_currency: js.UndefOr[String] = js.native
  /**
    * Time zone
    */
  var time_zone: js.UndefOr[String] = js.native
}

object UpdateUserOpts {
  @scala.inline
  def apply(): UpdateUserOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserOpts]
  }
  @scala.inline
  implicit class UpdateUserOptsOps[Self <: UpdateUserOpts] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNative_currency(value: String): Self = this.set("native_currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative_currency: Self = this.set("native_currency", js.undefined)
    @scala.inline
    def setTime_zone(value: String): Self = this.set("time_zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime_zone: Self = this.set("time_zone", js.undefined)
  }
  
}

