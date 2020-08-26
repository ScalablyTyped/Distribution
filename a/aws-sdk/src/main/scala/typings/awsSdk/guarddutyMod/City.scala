package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait City extends js.Object {
  /**
    * The city name of the remote IP address.
    */
  var CityName: js.UndefOr[String] = js.native
}

object City {
  @scala.inline
  def apply(): City = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[City]
  }
  @scala.inline
  implicit class CityOps[Self <: City] (val x: Self) extends AnyVal {
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
    def setCityName(value: String): Self = this.set("CityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCityName: Self = this.set("CityName", js.undefined)
  }
  
}

