package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetShippingLabelInput extends js.Object {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  
  var city: js.UndefOr[typings.awsSdk.importexportMod.city] = js.native
  
  var company: js.UndefOr[typings.awsSdk.importexportMod.company] = js.native
  
  var country: js.UndefOr[typings.awsSdk.importexportMod.country] = js.native
  
  var jobIds: JobIdList = js.native
  
  var name: js.UndefOr[typings.awsSdk.importexportMod.name] = js.native
  
  var phoneNumber: js.UndefOr[typings.awsSdk.importexportMod.phoneNumber] = js.native
  
  var postalCode: js.UndefOr[typings.awsSdk.importexportMod.postalCode] = js.native
  
  var stateOrProvince: js.UndefOr[typings.awsSdk.importexportMod.stateOrProvince] = js.native
  
  var street1: js.UndefOr[typings.awsSdk.importexportMod.street1] = js.native
  
  var street2: js.UndefOr[typings.awsSdk.importexportMod.street2] = js.native
  
  var street3: js.UndefOr[typings.awsSdk.importexportMod.street3] = js.native
}
object GetShippingLabelInput {
  
  @scala.inline
  def apply(jobIds: JobIdList): GetShippingLabelInput = {
    val __obj = js.Dynamic.literal(jobIds = jobIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShippingLabelInput]
  }
  
  @scala.inline
  implicit class GetShippingLabelInputOps[Self <: GetShippingLabelInput] (val x: Self) extends AnyVal {
    
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
    def setJobIdsVarargs(value: GenericString*): Self = this.set("jobIds", js.Array(value :_*))
    
    @scala.inline
    def setJobIds(value: JobIdList): Self = this.set("jobIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPIVersion(value: APIVersion_): Self = this.set("APIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAPIVersion: Self = this.set("APIVersion", js.undefined)
    
    @scala.inline
    def setCity(value: city): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCompany(value: company): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setCountry(value: country): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setName(value: name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: phoneNumber): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setPostalCode(value: postalCode): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setStateOrProvince(value: stateOrProvince): Self = this.set("stateOrProvince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateOrProvince: Self = this.set("stateOrProvince", js.undefined)
    
    @scala.inline
    def setStreet1(value: street1): Self = this.set("street1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreet1: Self = this.set("street1", js.undefined)
    
    @scala.inline
    def setStreet2(value: street2): Self = this.set("street2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreet2: Self = this.set("street2", js.undefined)
    
    @scala.inline
    def setStreet3(value: street3): Self = this.set("street3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreet3: Self = this.set("street3", js.undefined)
  }
}
