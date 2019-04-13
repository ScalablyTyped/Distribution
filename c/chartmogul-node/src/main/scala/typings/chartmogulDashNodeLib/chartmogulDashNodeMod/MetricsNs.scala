package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics")
@js.native
object MetricsNs extends js.Object {
  trait ARPA extends js.Object {
    var arpa: scala.Double
    var date: java.lang.String
  }
  
  trait ARR extends js.Object {
    var arr: scala.Double
    var date: java.lang.String
  }
  
  trait ASP extends js.Object {
    var asp: scala.Double
    var date: java.lang.String
  }
  
  trait All extends js.Object {
    var entries: chartmogulDashNodeLib.Anon_Arpa
  }
  
  trait CustomerChurnRate extends js.Object {
    var `customer-churn-rate`: scala.Double
    var date: java.lang.String
  }
  
  trait CustomerCount extends js.Object {
    var customers: scala.Double
    var date: java.lang.String
  }
  
  trait LTV extends js.Object {
    var date: java.lang.String
    var ltv: scala.Double
  }
  
  trait MRR extends js.Object {
    var date: java.lang.String
    var mrr: scala.Double
    var `mrr-churn`: scala.Double
    var `mrr-contraction`: scala.Double
    var `mrr-expansion`: scala.Double
    var `mrr-new-business`: scala.Double
    var `mrr-reactivation`: scala.Double
  }
  
  trait MRRChurnRate extends js.Object {
    var date: java.lang.String
    var `mrr-churn-rate`: scala.Double
  }
  
  trait Params extends ParamsNoInterval {
    var interval: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ParamsNoInterval extends js.Object {
    var `end-date`: java.lang.String
    var geo: js.UndefOr[java.lang.String] = js.undefined
    var plans: js.UndefOr[java.lang.String] = js.undefined
    var `start-date`: java.lang.String
  }
  
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: Params): js.Promise[All] = js.native
  def arpa(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: Params): js.Promise[chartmogulDashNodeLib.commonMod.EntriesSummary[ARPA]] = js.native
  def arr(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: Params): js.Promise[chartmogulDashNodeLib.commonMod.EntriesSummary[ARR]] = js.native
  def asp(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: Params): js.Promise[chartmogulDashNodeLib.commonMod.EntriesSummary[ASP]] = js.native
  def customerChurnRate(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: ParamsNoInterval): js.Promise[chartmogulDashNodeLib.commonMod.EntriesSummary[CustomerChurnRate]] = js.native
  def customerCount(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: Params): js.Promise[chartmogulDashNodeLib.commonMod.EntriesSummary[CustomerCount]] = js.native
  def ltv(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: ParamsNoInterval): js.Promise[chartmogulDashNodeLib.commonMod.EntriesSummary[LTV]] = js.native
  def mrr(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: Params): js.Promise[chartmogulDashNodeLib.commonMod.EntriesSummary[MRR]] = js.native
  def mrrChurnRate(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: ParamsNoInterval): js.Promise[chartmogulDashNodeLib.commonMod.EntriesSummary[MRRChurnRate]] = js.native
  @JSName("Customer")
  @js.native
  object CustomerNs extends js.Object {
    trait MetricsActivity extends js.Object {
      var `activity-arr`: scala.Double
      var `activity-mrr`: scala.Double
      var `activity-mrr-movement`: scala.Double
      var currency: java.lang.String
      var `currency-sign`: java.lang.String
      var date: java.lang.String
      var description: java.lang.String
      var id: scala.Double
      var `type`: java.lang.String
    }
    
    trait MetricsSubscription extends js.Object {
      var arr: scala.Double
      var `billing-cycle`: java.lang.String
      var `billing-cycle-count`: scala.Double
      var currency: java.lang.String
      var `currency-sign`: java.lang.String
      var `end-date`: java.lang.String
      var external_id: java.lang.String
      var id: scala.Double
      var mrr: scala.Double
      var plan: java.lang.String
      var quantity: scala.Double
      var `start-date`: java.lang.String
      var status: java.lang.String
    }
    
    def activities(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[chartmogulDashNodeLib.commonMod.Entries[MetricsActivity]] = js.native
    def activities(
      config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
      uuid: java.lang.String,
      params: chartmogulDashNodeLib.commonMod.CursorParams
    ): js.Promise[chartmogulDashNodeLib.commonMod.Entries[MetricsActivity]] = js.native
    def subscriptions(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[chartmogulDashNodeLib.commonMod.Entries[MetricsSubscription]] = js.native
    def subscriptions(
      config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
      uuid: java.lang.String,
      params: chartmogulDashNodeLib.commonMod.CursorParams
    ): js.Promise[chartmogulDashNodeLib.commonMod.Entries[MetricsSubscription]] = js.native
  }
  
}

