package typings.chartmogulNode.mod

import typings.chartmogulNode.anon.Arpa
import typings.chartmogulNode.commonMod.CursorParams
import typings.chartmogulNode.commonMod.Entries
import typings.chartmogulNode.commonMod.EntriesSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Metrics {
  
  object Customer {
    
    @JSImport("chartmogul-node", "Metrics.Customer.activities")
    @js.native
    def activities(config: Config, uuid: String): js.Promise[Entries[MetricsActivity]] = js.native
    @JSImport("chartmogul-node", "Metrics.Customer.activities")
    @js.native
    def activities(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsActivity]] = js.native
    
    @JSImport("chartmogul-node", "Metrics.Customer.subscriptions")
    @js.native
    def subscriptions(config: Config, uuid: String): js.Promise[Entries[MetricsSubscription]] = js.native
    @JSImport("chartmogul-node", "Metrics.Customer.subscriptions")
    @js.native
    def subscriptions(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsSubscription]] = js.native
    
    @js.native
    trait MetricsActivity extends StObject {
      
      var `activity-arr`: Double = js.native
      
      var `activity-mrr`: Double = js.native
      
      var `activity-mrr-movement`: Double = js.native
      
      var currency: String = js.native
      
      var `currency-sign`: String = js.native
      
      var date: String = js.native
      
      var description: String = js.native
      
      var id: Double = js.native
      
      var `type`: String = js.native
    }
    object MetricsActivity {
      
      @scala.inline
      def apply(
        `activity-arr`: Double,
        `activity-mrr`: Double,
        `activity-mrr-movement`: Double,
        currency: String,
        `currency-sign`: String,
        date: String,
        description: String,
        id: Double,
        `type`: String
      ): MetricsActivity = {
        val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.updateDynamic("activity-arr")(`activity-arr`.asInstanceOf[js.Any])
        __obj.updateDynamic("activity-mrr")(`activity-mrr`.asInstanceOf[js.Any])
        __obj.updateDynamic("activity-mrr-movement")(`activity-mrr-movement`.asInstanceOf[js.Any])
        __obj.updateDynamic("currency-sign")(`currency-sign`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[MetricsActivity]
      }
      
      @scala.inline
      implicit class MetricsActivityMutableBuilder[Self <: MetricsActivity] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setActivity-arr`(value: Double): Self = StObject.set(x, "activity-arr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setActivity-mrr`(value: Double): Self = StObject.set(x, "activity-mrr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setActivity-mrr-movement`(value: Double): Self = StObject.set(x, "activity-mrr-movement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCurrency-sign`(value: String): Self = StObject.set(x, "currency-sign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait MetricsSubscription extends StObject {
      
      var arr: Double = js.native
      
      var `billing-cycle`: String = js.native
      
      var `billing-cycle-count`: Double = js.native
      
      var currency: String = js.native
      
      var `currency-sign`: String = js.native
      
      var `end-date`: String = js.native
      
      var external_id: String = js.native
      
      var id: Double = js.native
      
      var mrr: Double = js.native
      
      var plan: String = js.native
      
      var quantity: Double = js.native
      
      var `start-date`: String = js.native
      
      var status: String = js.native
    }
    object MetricsSubscription {
      
      @scala.inline
      def apply(
        arr: Double,
        `billing-cycle`: String,
        `billing-cycle-count`: Double,
        currency: String,
        `currency-sign`: String,
        `end-date`: String,
        external_id: String,
        id: Double,
        mrr: Double,
        plan: String,
        quantity: Double,
        `start-date`: String,
        status: String
      ): MetricsSubscription = {
        val __obj = js.Dynamic.literal(arr = arr.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mrr = mrr.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("billing-cycle")(`billing-cycle`.asInstanceOf[js.Any])
        __obj.updateDynamic("billing-cycle-count")(`billing-cycle-count`.asInstanceOf[js.Any])
        __obj.updateDynamic("currency-sign")(`currency-sign`.asInstanceOf[js.Any])
        __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
        __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
        __obj.asInstanceOf[MetricsSubscription]
      }
      
      @scala.inline
      implicit class MetricsSubscriptionMutableBuilder[Self <: MetricsSubscription] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setBilling-cycle`(value: String): Self = StObject.set(x, "billing-cycle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setBilling-cycle-count`(value: Double): Self = StObject.set(x, "billing-cycle-count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCurrency-sign`(value: String): Self = StObject.set(x, "currency-sign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMrr(value: Double): Self = StObject.set(x, "mrr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("chartmogul-node", "Metrics.all")
  @js.native
  def all(config: Config, params: Params): js.Promise[All_] = js.native
  
  @JSImport("chartmogul-node", "Metrics.arpa")
  @js.native
  def arpa(config: Config, params: Params): js.Promise[EntriesSummary[ARPA_]] = js.native
  
  @JSImport("chartmogul-node", "Metrics.arr")
  @js.native
  def arr(config: Config, params: Params): js.Promise[EntriesSummary[ARR_]] = js.native
  
  @JSImport("chartmogul-node", "Metrics.asp")
  @js.native
  def asp(config: Config, params: Params): js.Promise[EntriesSummary[ASP_]] = js.native
  
  @JSImport("chartmogul-node", "Metrics.customerChurnRate")
  @js.native
  def customerChurnRate(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[CustomerChurnRate_]] = js.native
  
  @JSImport("chartmogul-node", "Metrics.customerCount")
  @js.native
  def customerCount(config: Config, params: Params): js.Promise[EntriesSummary[CustomerCount_]] = js.native
  
  @JSImport("chartmogul-node", "Metrics.ltv")
  @js.native
  def ltv(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[LTV_]] = js.native
  
  @JSImport("chartmogul-node", "Metrics.mrr")
  @js.native
  def mrr(config: Config, params: Params): js.Promise[EntriesSummary[MRR_]] = js.native
  
  @JSImport("chartmogul-node", "Metrics.mrrChurnRate")
  @js.native
  def mrrChurnRate(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[MRRChurnRate_]] = js.native
  
  @js.native
  trait ARPA_ extends StObject {
    
    var arpa: Double = js.native
    
    var date: String = js.native
  }
  object ARPA_ {
    
    @scala.inline
    def apply(arpa: Double, date: String): ARPA_ = {
      val __obj = js.Dynamic.literal(arpa = arpa.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARPA_]
    }
    
    @scala.inline
    implicit class ARPA_MutableBuilder[Self <: ARPA_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArpa(value: Double): Self = StObject.set(x, "arpa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ARR_ extends StObject {
    
    var arr: Double = js.native
    
    var date: String = js.native
  }
  object ARR_ {
    
    @scala.inline
    def apply(arr: Double, date: String): ARR_ = {
      val __obj = js.Dynamic.literal(arr = arr.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARR_]
    }
    
    @scala.inline
    implicit class ARR_MutableBuilder[Self <: ARR_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ASP_ extends StObject {
    
    var asp: Double = js.native
    
    var date: String = js.native
  }
  object ASP_ {
    
    @scala.inline
    def apply(asp: Double, date: String): ASP_ = {
      val __obj = js.Dynamic.literal(asp = asp.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASP_]
    }
    
    @scala.inline
    implicit class ASP_MutableBuilder[Self <: ASP_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsp(value: Double): Self = StObject.set(x, "asp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait All_ extends StObject {
    
    var entries: Arpa = js.native
  }
  object All_ {
    
    @scala.inline
    def apply(entries: Arpa): All_ = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
      __obj.asInstanceOf[All_]
    }
    
    @scala.inline
    implicit class All_MutableBuilder[Self <: All_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: Arpa): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomerChurnRate_ extends StObject {
    
    var `customer-churn-rate`: Double = js.native
    
    var date: String = js.native
  }
  object CustomerChurnRate_ {
    
    @scala.inline
    def apply(`customer-churn-rate`: Double, date: String): CustomerChurnRate_ = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerChurnRate_]
    }
    
    @scala.inline
    implicit class CustomerChurnRate_MutableBuilder[Self <: CustomerChurnRate_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setCustomer-churn-rate`(value: Double): Self = StObject.set(x, "customer-churn-rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomerCount_ extends StObject {
    
    var customers: Double = js.native
    
    var date: String = js.native
  }
  object CustomerCount_ {
    
    @scala.inline
    def apply(customers: Double, date: String): CustomerCount_ = {
      val __obj = js.Dynamic.literal(customers = customers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerCount_]
    }
    
    @scala.inline
    implicit class CustomerCount_MutableBuilder[Self <: CustomerCount_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomers(value: Double): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LTV_ extends StObject {
    
    var date: String = js.native
    
    var ltv: Double = js.native
  }
  object LTV_ {
    
    @scala.inline
    def apply(date: String, ltv: Double): LTV_ = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ltv = ltv.asInstanceOf[js.Any])
      __obj.asInstanceOf[LTV_]
    }
    
    @scala.inline
    implicit class LTV_MutableBuilder[Self <: LTV_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtv(value: Double): Self = StObject.set(x, "ltv", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MRRChurnRate_ extends StObject {
    
    var date: String = js.native
    
    var `mrr-churn-rate`: Double = js.native
  }
  object MRRChurnRate_ {
    
    @scala.inline
    def apply(date: String, `mrr-churn-rate`: Double): MRRChurnRate_ = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MRRChurnRate_]
    }
    
    @scala.inline
    implicit class MRRChurnRate_MutableBuilder[Self <: MRRChurnRate_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMrr-churn-rate`(value: Double): Self = StObject.set(x, "mrr-churn-rate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MRR_ extends StObject {
    
    var date: String = js.native
    
    var mrr: Double = js.native
    
    var `mrr-churn`: Double = js.native
    
    var `mrr-contraction`: Double = js.native
    
    var `mrr-expansion`: Double = js.native
    
    var `mrr-new-business`: Double = js.native
    
    var `mrr-reactivation`: Double = js.native
  }
  object MRR_ {
    
    @scala.inline
    def apply(
      date: String,
      mrr: Double,
      `mrr-churn`: Double,
      `mrr-contraction`: Double,
      `mrr-expansion`: Double,
      `mrr-new-business`: Double,
      `mrr-reactivation`: Double
    ): MRR_ = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], mrr = mrr.asInstanceOf[js.Any])
      __obj.updateDynamic("mrr-churn")(`mrr-churn`.asInstanceOf[js.Any])
      __obj.updateDynamic("mrr-contraction")(`mrr-contraction`.asInstanceOf[js.Any])
      __obj.updateDynamic("mrr-expansion")(`mrr-expansion`.asInstanceOf[js.Any])
      __obj.updateDynamic("mrr-new-business")(`mrr-new-business`.asInstanceOf[js.Any])
      __obj.updateDynamic("mrr-reactivation")(`mrr-reactivation`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MRR_]
    }
    
    @scala.inline
    implicit class MRR_MutableBuilder[Self <: MRR_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMrr(value: Double): Self = StObject.set(x, "mrr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMrr-churn`(value: Double): Self = StObject.set(x, "mrr-churn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMrr-contraction`(value: Double): Self = StObject.set(x, "mrr-contraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMrr-expansion`(value: Double): Self = StObject.set(x, "mrr-expansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMrr-new-business`(value: Double): Self = StObject.set(x, "mrr-new-business", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMrr-reactivation`(value: Double): Self = StObject.set(x, "mrr-reactivation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Params extends ParamsNoInterval {
    
    var interval: js.UndefOr[String] = js.native
  }
  object Params {
    
    @scala.inline
    def apply(`end-date`: String, `start-date`: String): Params = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
      __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  @js.native
  trait ParamsNoInterval extends StObject {
    
    var `end-date`: String = js.native
    
    var geo: js.UndefOr[String] = js.native
    
    var plans: js.UndefOr[String] = js.native
    
    var `start-date`: String = js.native
  }
  object ParamsNoInterval {
    
    @scala.inline
    def apply(`end-date`: String, `start-date`: String): ParamsNoInterval = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
      __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamsNoInterval]
    }
    
    @scala.inline
    implicit class ParamsNoIntervalMutableBuilder[Self <: ParamsNoInterval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeo(value: String): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      @scala.inline
      def setPlans(value: String): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlansUndefined: Self = StObject.set(x, "plans", js.undefined)
      
      @scala.inline
      def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
    }
  }
}
