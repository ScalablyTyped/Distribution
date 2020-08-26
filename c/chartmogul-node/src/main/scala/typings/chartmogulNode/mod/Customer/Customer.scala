package typings.chartmogulNode.mod.Customer

import typings.chartmogulNode.anon.Addresszip
import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customer extends js.Object {
  var address: js.UndefOr[Addresszip] = js.native
  var arr: js.UndefOr[Double] = js.native
  var attributes: js.UndefOr[Attributes_] = js.native
  var `billing-system-type`: js.UndefOr[String] = js.native
  var `billing-system-url`: js.UndefOr[String] = js.native
  var `chartmogul-url`: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var company: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var `currency-sign`: js.UndefOr[String] = js.native
  var `customer-since`: js.UndefOr[String] = js.native
  var data_source_uuid: js.UndefOr[String] = js.native
  var data_source_uuids: js.UndefOr[Strings] = js.native
  var email: js.UndefOr[String] = js.native
  var external_id: js.UndefOr[String] = js.native
  var external_ids: js.UndefOr[Strings] = js.native
  var free_trial_started_at: js.UndefOr[String] = js.native
  var id: js.UndefOr[Double] = js.native
  var lead_created_at: js.UndefOr[String] = js.native
  var mrr: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var uuid: js.UndefOr[String] = js.native
  var zip: js.UndefOr[String] = js.native
}

object Customer {
  @scala.inline
  def apply(): Customer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Customer]
  }
  @scala.inline
  implicit class CustomerOps[Self <: typings.chartmogulNode.mod.Customer.Customer] (val x: Self) extends AnyVal {
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
    def setAddress(value: Addresszip): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setArr(value: Double): Self = this.set("arr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArr: Self = this.set("arr", js.undefined)
    @scala.inline
    def setAttributes(value: Attributes_): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def `setBilling-system-type`(value: String): Self = this.set("billing-system-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBilling-system-type`: Self = this.set("billing-system-type", js.undefined)
    @scala.inline
    def `setBilling-system-url`(value: String): Self = this.set("billing-system-url", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBilling-system-url`: Self = this.set("billing-system-url", js.undefined)
    @scala.inline
    def `setChartmogul-url`(value: String): Self = this.set("chartmogul-url", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChartmogul-url`: Self = this.set("chartmogul-url", js.undefined)
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def `setCurrency-sign`(value: String): Self = this.set("currency-sign", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCurrency-sign`: Self = this.set("currency-sign", js.undefined)
    @scala.inline
    def `setCustomer-since`(value: String): Self = this.set("customer-since", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCustomer-since`: Self = this.set("customer-since", js.undefined)
    @scala.inline
    def setData_source_uuid(value: String): Self = this.set("data_source_uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_source_uuid: Self = this.set("data_source_uuid", js.undefined)
    @scala.inline
    def setData_source_uuidsVarargs(value: String*): Self = this.set("data_source_uuids", js.Array(value :_*))
    @scala.inline
    def setData_source_uuids(value: Strings): Self = this.set("data_source_uuids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_source_uuids: Self = this.set("data_source_uuids", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    @scala.inline
    def setExternal_idsVarargs(value: String*): Self = this.set("external_ids", js.Array(value :_*))
    @scala.inline
    def setExternal_ids(value: Strings): Self = this.set("external_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal_ids: Self = this.set("external_ids", js.undefined)
    @scala.inline
    def setFree_trial_started_at(value: String): Self = this.set("free_trial_started_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFree_trial_started_at: Self = this.set("free_trial_started_at", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLead_created_at(value: String): Self = this.set("lead_created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLead_created_at: Self = this.set("lead_created_at", js.undefined)
    @scala.inline
    def setMrr(value: Double): Self = this.set("mrr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMrr: Self = this.set("mrr", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
  
}

