package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetShippingLabelInput extends StObject {
  
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
  implicit class GetShippingLabelInputMutableBuilder[Self <: GetShippingLabelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    @scala.inline
    def setCity(value: city): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCompany(value: company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setCountry(value: country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setJobIds(value: JobIdList): Self = StObject.set(x, "jobIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdsVarargs(value: GenericString*): Self = StObject.set(x, "jobIds", js.Array(value :_*))
    
    @scala.inline
    def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: phoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPostalCode(value: postalCode): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setStateOrProvince(value: stateOrProvince): Self = StObject.set(x, "stateOrProvince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateOrProvinceUndefined: Self = StObject.set(x, "stateOrProvince", js.undefined)
    
    @scala.inline
    def setStreet1(value: street1): Self = StObject.set(x, "street1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet1Undefined: Self = StObject.set(x, "street1", js.undefined)
    
    @scala.inline
    def setStreet2(value: street2): Self = StObject.set(x, "street2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet2Undefined: Self = StObject.set(x, "street2", js.undefined)
    
    @scala.inline
    def setStreet3(value: street3): Self = StObject.set(x, "street3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet3Undefined: Self = StObject.set(x, "street3", js.undefined)
  }
}
