package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Customer")
@js.native
object CustomerNs extends js.Object {
  
  trait Attributes extends js.Object {
    var clearbit: js.UndefOr[chartmogulDashNodeLib.commonMod.Map] = js.undefined
    var custom: js.UndefOr[chartmogulDashNodeLib.commonMod.Map] = js.undefined
    var stripe: js.UndefOr[chartmogulDashNodeLib.commonMod.Map] = js.undefined
    var tags: js.UndefOr[chartmogulDashNodeLib.commonMod.Strings] = js.undefined
  }
  
  
  trait Customer extends js.Object {
    var address: js.UndefOr[chartmogulDashNodeLib.Anon_City] = js.undefined
    var arr: js.UndefOr[scala.Double] = js.undefined
    var attributes: js.UndefOr[Attributes] = js.undefined
    var city: js.UndefOr[java.lang.String] = js.undefined
    var company: js.UndefOr[java.lang.String] = js.undefined
    var country: js.UndefOr[java.lang.String] = js.undefined
    var currency: js.UndefOr[java.lang.String] = js.undefined
    var data_source_uuid: js.UndefOr[java.lang.String] = js.undefined
    var data_source_uuids: js.UndefOr[chartmogulDashNodeLib.commonMod.Strings] = js.undefined
    var email: js.UndefOr[java.lang.String] = js.undefined
    var external_id: js.UndefOr[java.lang.String] = js.undefined
    var external_ids: js.UndefOr[chartmogulDashNodeLib.commonMod.Strings] = js.undefined
    var free_trial_started_at: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[scala.Double] = js.undefined
    var lead_created_at: js.UndefOr[java.lang.String] = js.undefined
    var mrr: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var state: js.UndefOr[java.lang.String] = js.undefined
    var status: js.UndefOr[java.lang.String] = js.undefined
    var uuid: js.UndefOr[java.lang.String] = js.undefined
    var zip: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListCustomersParams
    extends chartmogulDashNodeLib.commonMod.CursorParams {
    var data_source_uuid: js.UndefOr[java.lang.String] = js.undefined
    var external_id: js.UndefOr[java.lang.String] = js.undefined
    var status: js.UndefOr[java.lang.String] = js.undefined
    var system: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait MergeCustomersParams extends js.Object {
    var from: MergeID
    var into: MergeID
  }
  
  
  trait MergeID extends js.Object {
    var customer_uuid: js.UndefOr[java.lang.String] = js.undefined
    var external_id: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait NewAttributes extends js.Object {
    var custom: js.UndefOr[js.Array[NewCustomAttributes]] = js.undefined
    var tags: js.UndefOr[chartmogulDashNodeLib.commonMod.Strings] = js.undefined
  }
  
  
  trait NewCustomAttributes extends js.Object {
    var key: java.lang.String
    var source: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var value: js.Any
  }
  
  
  trait NewCustomer extends js.Object {
    var attributes: js.UndefOr[NewAttributes] = js.undefined
    var city: js.UndefOr[java.lang.String] = js.undefined
    var company: js.UndefOr[java.lang.String] = js.undefined
    var country: js.UndefOr[java.lang.String] = js.undefined
    var data_source_uuid: java.lang.String
    var email: js.UndefOr[java.lang.String] = js.undefined
    var external_id: java.lang.String
    var free_trial_started_at: js.UndefOr[java.lang.String] = js.undefined
    var lead_created_at: js.UndefOr[java.lang.String] = js.undefined
    var name: java.lang.String
    var state: js.UndefOr[java.lang.String] = js.undefined
    var zip: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait SearchCustomersParams
    extends chartmogulDashNodeLib.commonMod.CursorParams {
    var email: java.lang.String
  }
  
  
  trait UpdateCustomer extends js.Object {
    var attributes: js.UndefOr[NewAttributes] = js.undefined
    var city: js.UndefOr[java.lang.String] = js.undefined
    var company: js.UndefOr[java.lang.String] = js.undefined
    var country: js.UndefOr[java.lang.String] = js.undefined
    var email: js.UndefOr[java.lang.String] = js.undefined
    var free_trial_started_at: js.UndefOr[java.lang.String] = js.undefined
    var lead_created_at: js.UndefOr[java.lang.String] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var state: js.UndefOr[java.lang.String] = js.undefined
    var zip: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config): js.Promise[chartmogulDashNodeLib.commonMod.Entries[Customer]] = js.native
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: ListCustomersParams): js.Promise[chartmogulDashNodeLib.commonMod.Entries[Customer]] = js.native
  def attributes(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[Attributes] = js.native
  def create(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, data: NewCustomer): js.Promise[Customer] = js.native
  def destroy(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[js.Object] = js.native
  def merge(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config): js.Promise[js.Object] = js.native
  def merge(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: MergeCustomersParams): js.Promise[js.Object] = js.native
  def modify(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: UpdateCustomer
  ): js.Promise[Customer] = js.native
  def retrieve(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[Customer] = js.native
  def search(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config): js.Promise[chartmogulDashNodeLib.commonMod.Entries[Customer]] = js.native
  def search(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: SearchCustomersParams): js.Promise[chartmogulDashNodeLib.commonMod.Entries[Customer]] = js.native
}

