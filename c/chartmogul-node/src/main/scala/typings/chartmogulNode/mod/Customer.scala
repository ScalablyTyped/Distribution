package typings.chartmogulNode.mod

import typings.chartmogulNode.anon.Addresszip
import typings.chartmogulNode.commonMod.CursorParams
import typings.chartmogulNode.commonMod.Entries
import typings.chartmogulNode.commonMod.Map
import typings.chartmogulNode.commonMod.Strings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Customer {
  
  @JSImport("chartmogul-node", "Customer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(config: Config): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]]]
  inline def all(config: Config, params: ListCustomersParams): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]]]
  
  inline def attributes(config: Config, uuid: String): js.Promise[Attributes_] = (^.asInstanceOf[js.Dynamic].applyDynamic("attributes")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Attributes_]]
  
  inline def create(config: Config, data: NewCustomer): js.Promise[typings.chartmogulNode.mod.Customer.Customer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Customer.Customer]]
  
  inline def destroy(config: Config, uuid: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  inline def merge(config: Config): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  inline def merge(config: Config, params: MergeCustomersParams): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  inline def modify(config: Config, uuid: String, data: UpdateCustomer): js.Promise[typings.chartmogulNode.mod.Customer.Customer] = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Customer.Customer]]
  
  inline def retrieve(config: Config, uuid: String): js.Promise[typings.chartmogulNode.mod.Customer.Customer] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Customer.Customer]]
  
  inline def search(config: Config): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]]]
  inline def search(config: Config, params: SearchCustomersParams): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]]]
  
  trait Attributes_ extends StObject {
    
    var clearbit: js.UndefOr[Map] = js.undefined
    
    var custom: js.UndefOr[Map] = js.undefined
    
    var stripe: js.UndefOr[Map] = js.undefined
    
    var tags: js.UndefOr[Strings] = js.undefined
  }
  object Attributes_ {
    
    inline def apply(): Attributes_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes_]
    }
    
    extension [Self <: Attributes_](x: Self) {
      
      inline def setClearbit(value: Map): Self = StObject.set(x, "clearbit", value.asInstanceOf[js.Any])
      
      inline def setClearbitUndefined: Self = StObject.set(x, "clearbit", js.undefined)
      
      inline def setCustom(value: Map): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setStripe(value: Map): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
      
      inline def setStripeUndefined: Self = StObject.set(x, "stripe", js.undefined)
      
      inline def setTags(value: Strings): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait Customer extends StObject {
    
    var address: js.UndefOr[Addresszip] = js.undefined
    
    var arr: js.UndefOr[Double] = js.undefined
    
    var attributes: js.UndefOr[Attributes_] = js.undefined
    
    var `billing-system-type`: js.UndefOr[String] = js.undefined
    
    var `billing-system-url`: js.UndefOr[String] = js.undefined
    
    var `chartmogul-url`: js.UndefOr[String] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var `currency-sign`: js.UndefOr[String] = js.undefined
    
    var `customer-since`: js.UndefOr[String] = js.undefined
    
    var data_source_uuid: js.UndefOr[String] = js.undefined
    
    var data_source_uuids: js.UndefOr[Strings] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var external_id: js.UndefOr[String] = js.undefined
    
    var external_ids: js.UndefOr[Strings] = js.undefined
    
    var free_trial_started_at: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var lead_created_at: js.UndefOr[String] = js.undefined
    
    var mrr: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
    
    var zip: js.UndefOr[String] = js.undefined
  }
  object Customer {
    
    inline def apply(): typings.chartmogulNode.mod.Customer.Customer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.chartmogulNode.mod.Customer.Customer]
    }
    
    extension [Self <: typings.chartmogulNode.mod.Customer.Customer](x: Self) {
      
      inline def setAddress(value: Addresszip): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
      
      inline def setArrUndefined: Self = StObject.set(x, "arr", js.undefined)
      
      inline def setAttributes(value: Attributes_): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def `setBilling-system-type`(value: String): Self = StObject.set(x, "billing-system-type", value.asInstanceOf[js.Any])
      
      inline def `setBilling-system-typeUndefined`: Self = StObject.set(x, "billing-system-type", js.undefined)
      
      inline def `setBilling-system-url`(value: String): Self = StObject.set(x, "billing-system-url", value.asInstanceOf[js.Any])
      
      inline def `setBilling-system-urlUndefined`: Self = StObject.set(x, "billing-system-url", js.undefined)
      
      inline def `setChartmogul-url`(value: String): Self = StObject.set(x, "chartmogul-url", value.asInstanceOf[js.Any])
      
      inline def `setChartmogul-urlUndefined`: Self = StObject.set(x, "chartmogul-url", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def `setCurrency-sign`(value: String): Self = StObject.set(x, "currency-sign", value.asInstanceOf[js.Any])
      
      inline def `setCurrency-signUndefined`: Self = StObject.set(x, "currency-sign", js.undefined)
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def `setCustomer-since`(value: String): Self = StObject.set(x, "customer-since", value.asInstanceOf[js.Any])
      
      inline def `setCustomer-sinceUndefined`: Self = StObject.set(x, "customer-since", js.undefined)
      
      inline def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      inline def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      inline def setData_source_uuids(value: Strings): Self = StObject.set(x, "data_source_uuids", value.asInstanceOf[js.Any])
      
      inline def setData_source_uuidsUndefined: Self = StObject.set(x, "data_source_uuids", js.undefined)
      
      inline def setData_source_uuidsVarargs(value: String*): Self = StObject.set(x, "data_source_uuids", js.Array(value*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setExternal_ids(value: Strings): Self = StObject.set(x, "external_ids", value.asInstanceOf[js.Any])
      
      inline def setExternal_idsUndefined: Self = StObject.set(x, "external_ids", js.undefined)
      
      inline def setExternal_idsVarargs(value: String*): Self = StObject.set(x, "external_ids", js.Array(value*))
      
      inline def setFree_trial_started_at(value: String): Self = StObject.set(x, "free_trial_started_at", value.asInstanceOf[js.Any])
      
      inline def setFree_trial_started_atUndefined: Self = StObject.set(x, "free_trial_started_at", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLead_created_at(value: String): Self = StObject.set(x, "lead_created_at", value.asInstanceOf[js.Any])
      
      inline def setLead_created_atUndefined: Self = StObject.set(x, "lead_created_at", js.undefined)
      
      inline def setMrr(value: Double): Self = StObject.set(x, "mrr", value.asInstanceOf[js.Any])
      
      inline def setMrrUndefined: Self = StObject.set(x, "mrr", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  trait ListCustomersParams
    extends StObject
       with CursorParams {
    
    var data_source_uuid: js.UndefOr[String] = js.undefined
    
    var external_id: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var system: js.UndefOr[String] = js.undefined
  }
  object ListCustomersParams {
    
    inline def apply(): ListCustomersParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListCustomersParams]
    }
    
    extension [Self <: ListCustomersParams](x: Self) {
      
      inline def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      inline def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
  
  trait MergeCustomersParams extends StObject {
    
    var from: MergeID
    
    var into: MergeID
  }
  object MergeCustomersParams {
    
    inline def apply(from: MergeID, into: MergeID): MergeCustomersParams = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], into = into.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeCustomersParams]
    }
    
    extension [Self <: MergeCustomersParams](x: Self) {
      
      inline def setFrom(value: MergeID): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setInto(value: MergeID): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
    }
  }
  
  trait MergeID extends StObject {
    
    var customer_uuid: js.UndefOr[String] = js.undefined
    
    var external_id: js.UndefOr[String] = js.undefined
  }
  object MergeID {
    
    inline def apply(): MergeID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeID]
    }
    
    extension [Self <: MergeID](x: Self) {
      
      inline def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      inline def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    }
  }
  
  trait NewAttributes extends StObject {
    
    var custom: js.UndefOr[js.Array[NewCustomAttributes]] = js.undefined
    
    var tags: js.UndefOr[Strings] = js.undefined
  }
  object NewAttributes {
    
    inline def apply(): NewAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewAttributes]
    }
    
    extension [Self <: NewAttributes](x: Self) {
      
      inline def setCustom(value: js.Array[NewCustomAttributes]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setCustomVarargs(value: NewCustomAttributes*): Self = StObject.set(x, "custom", js.Array(value*))
      
      inline def setTags(value: Strings): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait NewCustomAttributes extends StObject {
    
    var key: String
    
    var source: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: Any
  }
  object NewCustomAttributes {
    
    inline def apply(key: String, value: Any): NewCustomAttributes = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewCustomAttributes]
    }
    
    extension [Self <: NewCustomAttributes](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewCustomer extends StObject {
    
    var attributes: js.UndefOr[NewAttributes] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var data_source_uuid: String
    
    var email: js.UndefOr[String] = js.undefined
    
    var external_id: String
    
    var free_trial_started_at: js.UndefOr[String] = js.undefined
    
    var lead_created_at: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var state: js.UndefOr[String] = js.undefined
    
    var zip: js.UndefOr[String] = js.undefined
  }
  object NewCustomer {
    
    inline def apply(data_source_uuid: String, external_id: String, name: String): NewCustomer = {
      val __obj = js.Dynamic.literal(data_source_uuid = data_source_uuid.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewCustomer]
    }
    
    extension [Self <: NewCustomer](x: Self) {
      
      inline def setAttributes(value: NewAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setFree_trial_started_at(value: String): Self = StObject.set(x, "free_trial_started_at", value.asInstanceOf[js.Any])
      
      inline def setFree_trial_started_atUndefined: Self = StObject.set(x, "free_trial_started_at", js.undefined)
      
      inline def setLead_created_at(value: String): Self = StObject.set(x, "lead_created_at", value.asInstanceOf[js.Any])
      
      inline def setLead_created_atUndefined: Self = StObject.set(x, "lead_created_at", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  trait SearchCustomersParams
    extends StObject
       with CursorParams {
    
    var email: String
  }
  object SearchCustomersParams {
    
    inline def apply(email: String): SearchCustomersParams = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchCustomersParams]
    }
    
    extension [Self <: SearchCustomersParams](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateCustomer extends StObject {
    
    var attributes: js.UndefOr[NewAttributes] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var free_trial_started_at: js.UndefOr[String] = js.undefined
    
    var lead_created_at: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var zip: js.UndefOr[String] = js.undefined
  }
  object UpdateCustomer {
    
    inline def apply(): UpdateCustomer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCustomer]
    }
    
    extension [Self <: UpdateCustomer](x: Self) {
      
      inline def setAttributes(value: NewAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFree_trial_started_at(value: String): Self = StObject.set(x, "free_trial_started_at", value.asInstanceOf[js.Any])
      
      inline def setFree_trial_started_atUndefined: Self = StObject.set(x, "free_trial_started_at", js.undefined)
      
      inline def setLead_created_at(value: String): Self = StObject.set(x, "lead_created_at", value.asInstanceOf[js.Any])
      
      inline def setLead_created_atUndefined: Self = StObject.set(x, "lead_created_at", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
}
