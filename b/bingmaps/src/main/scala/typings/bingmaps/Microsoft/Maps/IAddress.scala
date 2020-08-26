package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddress extends js.Object {
  /**
    * The street line of an address. The addressLine property is the most precise, official line for an address relative to the postal agency
    * servicing the area specified by the locality or postalCode properties.
    */
  var addressLine: String = js.native
  /**
    * The subdivision name within the country or region for an address. This element is also commonly treated as the first order administrative
    * subdivision. An example is a US state, such as “Oregon”.
    */
  var adminDistrict: String = js.native
  /** The country or region name of the address. */
  var countryRegion: String = js.native
  /** A string specifying the two-letter ISO country code. */
  var countryRegionISO2: String = js.native
  /** The second, third, or fourth order subdivision within a country, dependency, or region. An example is a US county, such as “King”. */
  var district: String = js.native
  /** A nicely formatted address string for the result. */
  var formattedAddress: String = js.native
  /** The locality, such as the primary city, that corresponds to an address. An example is “Seattle”. */
  var locality: String = js.native
  /** The post code, postal code, or ZIP code of an address. An example is a US ZIP code, such as “98152”. */
  var postalCode: String = js.native
}

object IAddress {
  @scala.inline
  def apply(
    addressLine: String,
    adminDistrict: String,
    countryRegion: String,
    countryRegionISO2: String,
    district: String,
    formattedAddress: String,
    locality: String,
    postalCode: String
  ): IAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], adminDistrict = adminDistrict.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], countryRegionISO2 = countryRegionISO2.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddress]
  }
  @scala.inline
  implicit class IAddressOps[Self <: IAddress] (val x: Self) extends AnyVal {
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
    def setAddressLine(value: String): Self = this.set("addressLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdminDistrict(value: String): Self = this.set("adminDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryRegion(value: String): Self = this.set("countryRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryRegionISO2(value: String): Self = this.set("countryRegionISO2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedAddress(value: String): Self = this.set("formattedAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
  }
  
}

