package typings.chartmogulNode.mod.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewCustomer extends js.Object {
  
  var attributes: js.UndefOr[NewAttributes] = js.native
  
  var city: js.UndefOr[String] = js.native
  
  var company: js.UndefOr[String] = js.native
  
  var country: js.UndefOr[String] = js.native
  
  var data_source_uuid: String = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var external_id: String = js.native
  
  var free_trial_started_at: js.UndefOr[String] = js.native
  
  var lead_created_at: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var zip: js.UndefOr[String] = js.native
}
object NewCustomer {
  
  @scala.inline
  def apply(data_source_uuid: String, external_id: String, name: String): NewCustomer = {
    val __obj = js.Dynamic.literal(data_source_uuid = data_source_uuid.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewCustomer]
  }
  
  @scala.inline
  implicit class NewCustomerOps[Self <: NewCustomer] (val x: Self) extends AnyVal {
    
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
    def setData_source_uuid(value: String): Self = this.set("data_source_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: NewAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFree_trial_started_at(value: String): Self = this.set("free_trial_started_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFree_trial_started_at: Self = this.set("free_trial_started_at", js.undefined)
    
    @scala.inline
    def setLead_created_at(value: String): Self = this.set("lead_created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLead_created_at: Self = this.set("lead_created_at", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
}
