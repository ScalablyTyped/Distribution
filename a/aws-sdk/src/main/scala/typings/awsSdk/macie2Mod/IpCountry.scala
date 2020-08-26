package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpCountry extends js.Object {
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country that the IP address originated from. For example, US for the United States.
    */
  var code: js.UndefOr[string] = js.native
  /**
    * The name of the country that the IP address originated from.
    */
  var name: js.UndefOr[string] = js.native
}

object IpCountry {
  @scala.inline
  def apply(): IpCountry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpCountry]
  }
  @scala.inline
  implicit class IpCountryOps[Self <: IpCountry] (val x: Self) extends AnyVal {
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
    def setCode(value: string): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

