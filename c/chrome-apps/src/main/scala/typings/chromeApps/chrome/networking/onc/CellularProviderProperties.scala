package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellularProviderProperties extends js.Object {
  /** Cellular network ID as a simple concatenation of the network's MCC (Mobile Country Code) and MNC (Mobile Network Code). */
  var Code: String = js.native
  /** The two-letter country code. */
  var Country: js.UndefOr[String] = js.native
  /** The operator name. */
  var Name: String = js.native
}

object CellularProviderProperties {
  @scala.inline
  def apply(Code: String, Name: String): CellularProviderProperties = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellularProviderProperties]
  }
  @scala.inline
  implicit class CellularProviderPropertiesOps[Self <: CellularProviderProperties] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
  }
  
}

