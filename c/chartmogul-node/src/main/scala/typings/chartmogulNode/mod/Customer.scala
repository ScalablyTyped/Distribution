package typings.chartmogulNode.mod

import typings.chartmogulNode.anon.Addresszip
import typings.chartmogulNode.commonMod.CursorParams
import typings.chartmogulNode.commonMod.Entries
import typings.chartmogulNode.commonMod.Map
import typings.chartmogulNode.commonMod.Strings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Customer {
  
  @JSImport("chartmogul-node", "Customer.all")
  @js.native
  def all(config: Config): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = js.native
  @JSImport("chartmogul-node", "Customer.all")
  @js.native
  def all(config: Config, params: ListCustomersParams): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = js.native
  
  @JSImport("chartmogul-node", "Customer.attributes")
  @js.native
  def attributes(config: Config, uuid: String): js.Promise[Attributes_] = js.native
  
  @JSImport("chartmogul-node", "Customer.create")
  @js.native
  def create(config: Config, data: NewCustomer): js.Promise[typings.chartmogulNode.mod.Customer.Customer] = js.native
  
  @JSImport("chartmogul-node", "Customer.destroy")
  @js.native
  def destroy(config: Config, uuid: String): js.Promise[js.Object] = js.native
  
  @JSImport("chartmogul-node", "Customer.merge")
  @js.native
  def merge(config: Config): js.Promise[js.Object] = js.native
  @JSImport("chartmogul-node", "Customer.merge")
  @js.native
  def merge(config: Config, params: MergeCustomersParams): js.Promise[js.Object] = js.native
  
  @JSImport("chartmogul-node", "Customer.modify")
  @js.native
  def modify(config: Config, uuid: String, data: UpdateCustomer): js.Promise[typings.chartmogulNode.mod.Customer.Customer] = js.native
  
  @JSImport("chartmogul-node", "Customer.retrieve")
  @js.native
  def retrieve(config: Config, uuid: String): js.Promise[typings.chartmogulNode.mod.Customer.Customer] = js.native
  
  @JSImport("chartmogul-node", "Customer.search")
  @js.native
  def search(config: Config): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = js.native
  @JSImport("chartmogul-node", "Customer.search")
  @js.native
  def search(config: Config, params: SearchCustomersParams): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = js.native
  
  @js.native
  trait Attributes_ extends StObject {
    
    var clearbit: js.UndefOr[Map] = js.native
    
    var custom: js.UndefOr[Map] = js.native
    
    var stripe: js.UndefOr[Map] = js.native
    
    var tags: js.UndefOr[Strings] = js.native
  }
  object Attributes_ {
    
    @scala.inline
    def apply(): Attributes_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes_]
    }
    
    @scala.inline
    implicit class Attributes_MutableBuilder[Self <: Attributes_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearbit(value: Map): Self = StObject.set(x, "clearbit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearbitUndefined: Self = StObject.set(x, "clearbit", js.undefined)
      
      @scala.inline
      def setCustom(value: Map): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setStripe(value: Map): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripeUndefined: Self = StObject.set(x, "stripe", js.undefined)
      
      @scala.inline
      def setTags(value: Strings): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Customer extends StObject {
    
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
    def apply(): typings.chartmogulNode.mod.Customer.Customer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.chartmogulNode.mod.Customer.Customer]
    }
    
    @scala.inline
    implicit class CustomerMutableBuilder[Self <: typings.chartmogulNode.mod.Customer.Customer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Addresszip): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrUndefined: Self = StObject.set(x, "arr", js.undefined)
      
      @scala.inline
      def setAttributes(value: Attributes_): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def `setBilling-system-type`(value: String): Self = StObject.set(x, "billing-system-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBilling-system-typeUndefined`: Self = StObject.set(x, "billing-system-type", js.undefined)
      
      @scala.inline
      def `setBilling-system-url`(value: String): Self = StObject.set(x, "billing-system-url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBilling-system-urlUndefined`: Self = StObject.set(x, "billing-system-url", js.undefined)
      
      @scala.inline
      def `setChartmogul-url`(value: String): Self = StObject.set(x, "chartmogul-url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setChartmogul-urlUndefined`: Self = StObject.set(x, "chartmogul-url", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrency-sign`(value: String): Self = StObject.set(x, "currency-sign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrency-signUndefined`: Self = StObject.set(x, "currency-sign", js.undefined)
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def `setCustomer-since`(value: String): Self = StObject.set(x, "customer-since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCustomer-sinceUndefined`: Self = StObject.set(x, "customer-since", js.undefined)
      
      @scala.inline
      def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      @scala.inline
      def setData_source_uuids(value: Strings): Self = StObject.set(x, "data_source_uuids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_source_uuidsUndefined: Self = StObject.set(x, "data_source_uuids", js.undefined)
      
      @scala.inline
      def setData_source_uuidsVarargs(value: String*): Self = StObject.set(x, "data_source_uuids", js.Array(value :_*))
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      @scala.inline
      def setExternal_ids(value: Strings): Self = StObject.set(x, "external_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idsUndefined: Self = StObject.set(x, "external_ids", js.undefined)
      
      @scala.inline
      def setExternal_idsVarargs(value: String*): Self = StObject.set(x, "external_ids", js.Array(value :_*))
      
      @scala.inline
      def setFree_trial_started_at(value: String): Self = StObject.set(x, "free_trial_started_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFree_trial_started_atUndefined: Self = StObject.set(x, "free_trial_started_at", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLead_created_at(value: String): Self = StObject.set(x, "lead_created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLead_created_atUndefined: Self = StObject.set(x, "lead_created_at", js.undefined)
      
      @scala.inline
      def setMrr(value: Double): Self = StObject.set(x, "mrr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMrrUndefined: Self = StObject.set(x, "mrr", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      @scala.inline
      def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  @js.native
  trait ListCustomersParams extends CursorParams {
    
    var data_source_uuid: js.UndefOr[String] = js.native
    
    var external_id: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var system: js.UndefOr[String] = js.native
  }
  object ListCustomersParams {
    
    @scala.inline
    def apply(): ListCustomersParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListCustomersParams]
    }
    
    @scala.inline
    implicit class ListCustomersParamsMutableBuilder[Self <: ListCustomersParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
  
  @js.native
  trait MergeCustomersParams extends StObject {
    
    var from: MergeID = js.native
    
    var into: MergeID = js.native
  }
  object MergeCustomersParams {
    
    @scala.inline
    def apply(from: MergeID, into: MergeID): MergeCustomersParams = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], into = into.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeCustomersParams]
    }
    
    @scala.inline
    implicit class MergeCustomersParamsMutableBuilder[Self <: MergeCustomersParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: MergeID): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInto(value: MergeID): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MergeID extends StObject {
    
    var customer_uuid: js.UndefOr[String] = js.native
    
    var external_id: js.UndefOr[String] = js.native
  }
  object MergeID {
    
    @scala.inline
    def apply(): MergeID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeID]
    }
    
    @scala.inline
    implicit class MergeIDMutableBuilder[Self <: MergeID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    }
  }
  
  @js.native
  trait NewAttributes extends StObject {
    
    var custom: js.UndefOr[js.Array[NewCustomAttributes]] = js.native
    
    var tags: js.UndefOr[Strings] = js.native
  }
  object NewAttributes {
    
    @scala.inline
    def apply(): NewAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewAttributes]
    }
    
    @scala.inline
    implicit class NewAttributesMutableBuilder[Self <: NewAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: js.Array[NewCustomAttributes]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setCustomVarargs(value: NewCustomAttributes*): Self = StObject.set(x, "custom", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Strings): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NewCustomAttributes extends StObject {
    
    var key: String = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.Any = js.native
  }
  object NewCustomAttributes {
    
    @scala.inline
    def apply(key: String, value: js.Any): NewCustomAttributes = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewCustomAttributes]
    }
    
    @scala.inline
    implicit class NewCustomAttributesMutableBuilder[Self <: NewCustomAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewCustomer extends StObject {
    
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
    implicit class NewCustomerMutableBuilder[Self <: NewCustomer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: NewAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFree_trial_started_at(value: String): Self = StObject.set(x, "free_trial_started_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFree_trial_started_atUndefined: Self = StObject.set(x, "free_trial_started_at", js.undefined)
      
      @scala.inline
      def setLead_created_at(value: String): Self = StObject.set(x, "lead_created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLead_created_atUndefined: Self = StObject.set(x, "lead_created_at", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  @js.native
  trait SearchCustomersParams extends CursorParams {
    
    var email: String = js.native
  }
  object SearchCustomersParams {
    
    @scala.inline
    def apply(email: String): SearchCustomersParams = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchCustomersParams]
    }
    
    @scala.inline
    implicit class SearchCustomersParamsMutableBuilder[Self <: SearchCustomersParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateCustomer extends StObject {
    
    var attributes: js.UndefOr[NewAttributes] = js.native
    
    var city: js.UndefOr[String] = js.native
    
    var company: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var free_trial_started_at: js.UndefOr[String] = js.native
    
    var lead_created_at: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var zip: js.UndefOr[String] = js.native
  }
  object UpdateCustomer {
    
    @scala.inline
    def apply(): UpdateCustomer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCustomer]
    }
    
    @scala.inline
    implicit class UpdateCustomerMutableBuilder[Self <: UpdateCustomer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: NewAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFree_trial_started_at(value: String): Self = StObject.set(x, "free_trial_started_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFree_trial_started_atUndefined: Self = StObject.set(x, "free_trial_started_at", js.undefined)
      
      @scala.inline
      def setLead_created_at(value: String): Self = StObject.set(x, "lead_created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLead_created_atUndefined: Self = StObject.set(x, "lead_created_at", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
}
