package typings.chartmogulDashNode.chartmogulDashNodeMod

import typings.chartmogulDashNode.Anon_Addresszip
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.Attributes
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.Customer
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.ListCustomersParams
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.MergeCustomersParams
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.MergeID
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.NewAttributes
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.NewCustomAttributes
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.NewCustomer
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.SearchCustomersParams
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.UpdateCustomer
import typings.chartmogulDashNode.commonMod.CursorParams
import typings.chartmogulDashNode.commonMod.Entries
import typings.chartmogulDashNode.commonMod.Map
import typings.chartmogulDashNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Customer")
@js.native
object CustomerNs extends js.Object {
  trait Attributes extends js.Object {
    var clearbit: js.UndefOr[Map] = js.undefined
    var custom: js.UndefOr[Map] = js.undefined
    var stripe: js.UndefOr[Map] = js.undefined
    var tags: js.UndefOr[Strings] = js.undefined
  }
  
  trait Customer extends js.Object {
    var address: js.UndefOr[Anon_Addresszip] = js.undefined
    var arr: js.UndefOr[Double] = js.undefined
    var attributes: js.UndefOr[Attributes] = js.undefined
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
  
  trait ListCustomersParams extends CursorParams {
    var data_source_uuid: js.UndefOr[String] = js.undefined
    var external_id: js.UndefOr[String] = js.undefined
    var status: js.UndefOr[String] = js.undefined
    var system: js.UndefOr[String] = js.undefined
  }
  
  trait MergeCustomersParams extends js.Object {
    var from: MergeID
    var into: MergeID
  }
  
  trait MergeID extends js.Object {
    var customer_uuid: js.UndefOr[String] = js.undefined
    var external_id: js.UndefOr[String] = js.undefined
  }
  
  trait NewAttributes extends js.Object {
    var custom: js.UndefOr[js.Array[NewCustomAttributes]] = js.undefined
    var tags: js.UndefOr[Strings] = js.undefined
  }
  
  trait NewCustomAttributes extends js.Object {
    var key: String
    var source: js.UndefOr[String] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
    var value: js.Any
  }
  
  trait NewCustomer extends js.Object {
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
  
  trait SearchCustomersParams extends CursorParams {
    var email: String
  }
  
  trait UpdateCustomer extends js.Object {
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
  
  def all(config: Config): js.Promise[Entries[Customer]] = js.native
  def all(config: Config, params: ListCustomersParams): js.Promise[Entries[Customer]] = js.native
  def attributes(config: Config, uuid: String): js.Promise[Attributes] = js.native
  def create(config: Config, data: NewCustomer): js.Promise[Customer] = js.native
  def destroy(config: Config, uuid: String): js.Promise[js.Object] = js.native
  def merge(config: Config): js.Promise[js.Object] = js.native
  def merge(config: Config, params: MergeCustomersParams): js.Promise[js.Object] = js.native
  def modify(config: Config, uuid: String, data: UpdateCustomer): js.Promise[Customer] = js.native
  def retrieve(config: Config, uuid: String): js.Promise[Customer] = js.native
  def search(config: Config): js.Promise[Entries[Customer]] = js.native
  def search(config: Config, params: SearchCustomersParams): js.Promise[Entries[Customer]] = js.native
}

