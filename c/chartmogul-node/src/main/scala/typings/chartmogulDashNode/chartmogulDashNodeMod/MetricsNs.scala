package typings.chartmogulDashNode.chartmogulDashNodeMod

import typings.chartmogulDashNode.Anon_Arpa
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.ARPA
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.ARR
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.ASP
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.All
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.CustomerChurnRate
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.CustomerCount
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.CustomerNs.MetricsActivity
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.CustomerNs.MetricsSubscription
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.LTV
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.MRR
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.MRRChurnRate
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.Params
import typings.chartmogulDashNode.chartmogulDashNodeMod.MetricsNs.ParamsNoInterval
import typings.chartmogulDashNode.commonMod.CursorParams
import typings.chartmogulDashNode.commonMod.Entries
import typings.chartmogulDashNode.commonMod.EntriesSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics")
@js.native
object MetricsNs extends js.Object {
  trait ARPA extends js.Object {
    var arpa: Double
    var date: String
  }
  
  trait ARR extends js.Object {
    var arr: Double
    var date: String
  }
  
  trait ASP extends js.Object {
    var asp: Double
    var date: String
  }
  
  trait All extends js.Object {
    var entries: Anon_Arpa
  }
  
  trait CustomerChurnRate extends js.Object {
    var `customer-churn-rate`: Double
    var date: String
  }
  
  trait CustomerCount extends js.Object {
    var customers: Double
    var date: String
  }
  
  trait LTV extends js.Object {
    var date: String
    var ltv: Double
  }
  
  trait MRR extends js.Object {
    var date: String
    var mrr: Double
    var `mrr-churn`: Double
    var `mrr-contraction`: Double
    var `mrr-expansion`: Double
    var `mrr-new-business`: Double
    var `mrr-reactivation`: Double
  }
  
  trait MRRChurnRate extends js.Object {
    var date: String
    var `mrr-churn-rate`: Double
  }
  
  trait Params extends ParamsNoInterval {
    var interval: js.UndefOr[String] = js.undefined
  }
  
  trait ParamsNoInterval extends js.Object {
    var `end-date`: String
    var geo: js.UndefOr[String] = js.undefined
    var plans: js.UndefOr[String] = js.undefined
    var `start-date`: String
  }
  
  def all(config: Config, params: Params): js.Promise[All] = js.native
  def arpa(config: Config, params: Params): js.Promise[EntriesSummary[ARPA]] = js.native
  def arr(config: Config, params: Params): js.Promise[EntriesSummary[ARR]] = js.native
  def asp(config: Config, params: Params): js.Promise[EntriesSummary[ASP]] = js.native
  def customerChurnRate(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[CustomerChurnRate]] = js.native
  def customerCount(config: Config, params: Params): js.Promise[EntriesSummary[CustomerCount]] = js.native
  def ltv(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[LTV]] = js.native
  def mrr(config: Config, params: Params): js.Promise[EntriesSummary[MRR]] = js.native
  def mrrChurnRate(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[MRRChurnRate]] = js.native
  @JSName("Customer")
  @js.native
  object CustomerNs extends js.Object {
    trait MetricsActivity extends js.Object {
      var `activity-arr`: Double
      var `activity-mrr`: Double
      var `activity-mrr-movement`: Double
      var currency: String
      var `currency-sign`: String
      var date: String
      var description: String
      var id: Double
      var `type`: String
    }
    
    trait MetricsSubscription extends js.Object {
      var arr: Double
      var `billing-cycle`: String
      var `billing-cycle-count`: Double
      var currency: String
      var `currency-sign`: String
      var `end-date`: String
      var external_id: String
      var id: Double
      var mrr: Double
      var plan: String
      var quantity: Double
      var `start-date`: String
      var status: String
    }
    
    def activities(config: Config, uuid: String): js.Promise[Entries[MetricsActivity]] = js.native
    def activities(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsActivity]] = js.native
    def subscriptions(config: Config, uuid: String): js.Promise[Entries[MetricsSubscription]] = js.native
    def subscriptions(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsSubscription]] = js.native
  }
  
}

