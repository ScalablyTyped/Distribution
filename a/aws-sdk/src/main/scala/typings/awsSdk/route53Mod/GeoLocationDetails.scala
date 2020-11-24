package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoLocationDetails extends js.Object {
  
  /**
    * The two-letter code for the continent.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  
  /**
    * The full name of the continent.
    */
  var ContinentName: js.UndefOr[GeoLocationContinentName] = js.native
  
  /**
    * The two-letter code for the country.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  
  /**
    * The name of the country.
    */
  var CountryName: js.UndefOr[GeoLocationCountryName] = js.native
  
  /**
    * The code for the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
  
  /**
    * The full name of the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.native
}
object GeoLocationDetails {
  
  @scala.inline
  def apply(): GeoLocationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocationDetails]
  }
  
  @scala.inline
  implicit class GeoLocationDetailsOps[Self <: GeoLocationDetails] (val x: Self) extends AnyVal {
    
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
    def setContinentCode(value: GeoLocationContinentCode): Self = this.set("ContinentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinentCode: Self = this.set("ContinentCode", js.undefined)
    
    @scala.inline
    def setContinentName(value: GeoLocationContinentName): Self = this.set("ContinentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinentName: Self = this.set("ContinentName", js.undefined)
    
    @scala.inline
    def setCountryCode(value: GeoLocationCountryCode): Self = this.set("CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("CountryCode", js.undefined)
    
    @scala.inline
    def setCountryName(value: GeoLocationCountryName): Self = this.set("CountryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryName: Self = this.set("CountryName", js.undefined)
    
    @scala.inline
    def setSubdivisionCode(value: GeoLocationSubdivisionCode): Self = this.set("SubdivisionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisionCode: Self = this.set("SubdivisionCode", js.undefined)
    
    @scala.inline
    def setSubdivisionName(value: GeoLocationSubdivisionName): Self = this.set("SubdivisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisionName: Self = this.set("SubdivisionName", js.undefined)
  }
}
