package typings.chartmogulNode.mod

import typings.chartmogulNode.anon.Arpa
import typings.chartmogulNode.commonMod.CursorParams
import typings.chartmogulNode.commonMod.Entries
import typings.chartmogulNode.commonMod.EntriesSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Metrics {
  
  @JSImport("chartmogul-node", "Metrics")
  @js.native
  val ^ : js.Any = js.native
  
  object Customer {
    
    @JSImport("chartmogul-node", "Metrics.Customer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def activities(config: Config, uuid: String): js.Promise[Entries[MetricsActivity]] = (^.asInstanceOf[js.Dynamic].applyDynamic("activities")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries[MetricsActivity]]]
    inline def activities(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsActivity]] = (^.asInstanceOf[js.Dynamic].applyDynamic("activities")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries[MetricsActivity]]]
    
    inline def subscriptions(config: Config, uuid: String): js.Promise[Entries[MetricsSubscription]] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries[MetricsSubscription]]]
    inline def subscriptions(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsSubscription]] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries[MetricsSubscription]]]
    
    trait MetricsActivity extends StObject {
      
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
    object MetricsActivity {
      
      inline def apply(
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
      
      extension [Self <: MetricsActivity](x: Self) {
        
        inline def `setActivity-arr`(value: Double): Self = StObject.set(x, "activity-arr", value.asInstanceOf[js.Any])
        
        inline def `setActivity-mrr`(value: Double): Self = StObject.set(x, "activity-mrr", value.asInstanceOf[js.Any])
        
        inline def `setActivity-mrr-movement`(value: Double): Self = StObject.set(x, "activity-mrr-movement", value.asInstanceOf[js.Any])
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def `setCurrency-sign`(value: String): Self = StObject.set(x, "currency-sign", value.asInstanceOf[js.Any])
        
        inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait MetricsSubscription extends StObject {
      
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
    object MetricsSubscription {
      
      inline def apply(
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
      
      extension [Self <: MetricsSubscription](x: Self) {
        
        inline def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
        
        inline def `setBilling-cycle`(value: String): Self = StObject.set(x, "billing-cycle", value.asInstanceOf[js.Any])
        
        inline def `setBilling-cycle-count`(value: Double): Self = StObject.set(x, "billing-cycle-count", value.asInstanceOf[js.Any])
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def `setCurrency-sign`(value: String): Self = StObject.set(x, "currency-sign", value.asInstanceOf[js.Any])
        
        inline def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
        
        inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setMrr(value: Double): Self = StObject.set(x, "mrr", value.asInstanceOf[js.Any])
        
        inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
        
        inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
        
        inline def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def all(config: Config, params: Params): js.Promise[All_] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[All_]]
  
  inline def arpa(config: Config, params: Params): js.Promise[EntriesSummary[ARPA_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arpa")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EntriesSummary[ARPA_]]]
  
  inline def arr(config: Config, params: Params): js.Promise[EntriesSummary[ARR_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arr")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EntriesSummary[ARR_]]]
  
  inline def asp(config: Config, params: Params): js.Promise[EntriesSummary[ASP_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("asp")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EntriesSummary[ASP_]]]
  
  inline def customerChurnRate(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[CustomerChurnRate_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("customerChurnRate")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EntriesSummary[CustomerChurnRate_]]]
  
  inline def customerCount(config: Config, params: Params): js.Promise[EntriesSummary[CustomerCount_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("customerCount")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EntriesSummary[CustomerCount_]]]
  
  inline def ltv(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[LTV_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("ltv")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EntriesSummary[LTV_]]]
  
  inline def mrr(config: Config, params: Params): js.Promise[EntriesSummary[MRR_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mrr")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EntriesSummary[MRR_]]]
  
  inline def mrrChurnRate(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[MRRChurnRate_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mrrChurnRate")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EntriesSummary[MRRChurnRate_]]]
  
  trait ARPA_ extends StObject {
    
    var arpa: Double
    
    var date: String
  }
  object ARPA_ {
    
    inline def apply(arpa: Double, date: String): ARPA_ = {
      val __obj = js.Dynamic.literal(arpa = arpa.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARPA_]
    }
    
    extension [Self <: ARPA_](x: Self) {
      
      inline def setArpa(value: Double): Self = StObject.set(x, "arpa", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait ARR_ extends StObject {
    
    var arr: Double
    
    var date: String
  }
  object ARR_ {
    
    inline def apply(arr: Double, date: String): ARR_ = {
      val __obj = js.Dynamic.literal(arr = arr.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARR_]
    }
    
    extension [Self <: ARR_](x: Self) {
      
      inline def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait ASP_ extends StObject {
    
    var asp: Double
    
    var date: String
  }
  object ASP_ {
    
    inline def apply(asp: Double, date: String): ASP_ = {
      val __obj = js.Dynamic.literal(asp = asp.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASP_]
    }
    
    extension [Self <: ASP_](x: Self) {
      
      inline def setAsp(value: Double): Self = StObject.set(x, "asp", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait All_ extends StObject {
    
    var entries: Arpa
  }
  object All_ {
    
    inline def apply(entries: Arpa): All_ = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
      __obj.asInstanceOf[All_]
    }
    
    extension [Self <: All_](x: Self) {
      
      inline def setEntries(value: Arpa): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomerChurnRate_ extends StObject {
    
    var `customer-churn-rate`: Double
    
    var date: String
  }
  object CustomerChurnRate_ {
    
    inline def apply(`customer-churn-rate`: Double, date: String): CustomerChurnRate_ = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerChurnRate_]
    }
    
    extension [Self <: CustomerChurnRate_](x: Self) {
      
      inline def `setCustomer-churn-rate`(value: Double): Self = StObject.set(x, "customer-churn-rate", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomerCount_ extends StObject {
    
    var customers: Double
    
    var date: String
  }
  object CustomerCount_ {
    
    inline def apply(customers: Double, date: String): CustomerCount_ = {
      val __obj = js.Dynamic.literal(customers = customers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerCount_]
    }
    
    extension [Self <: CustomerCount_](x: Self) {
      
      inline def setCustomers(value: Double): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait LTV_ extends StObject {
    
    var date: String
    
    var ltv: Double
  }
  object LTV_ {
    
    inline def apply(date: String, ltv: Double): LTV_ = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ltv = ltv.asInstanceOf[js.Any])
      __obj.asInstanceOf[LTV_]
    }
    
    extension [Self <: LTV_](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setLtv(value: Double): Self = StObject.set(x, "ltv", value.asInstanceOf[js.Any])
    }
  }
  
  trait MRRChurnRate_ extends StObject {
    
    var date: String
    
    var `mrr-churn-rate`: Double
  }
  object MRRChurnRate_ {
    
    inline def apply(date: String, `mrr-churn-rate`: Double): MRRChurnRate_ = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MRRChurnRate_]
    }
    
    extension [Self <: MRRChurnRate_](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def `setMrr-churn-rate`(value: Double): Self = StObject.set(x, "mrr-churn-rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait MRR_ extends StObject {
    
    var date: String
    
    var mrr: Double
    
    var `mrr-churn`: Double
    
    var `mrr-contraction`: Double
    
    var `mrr-expansion`: Double
    
    var `mrr-new-business`: Double
    
    var `mrr-reactivation`: Double
  }
  object MRR_ {
    
    inline def apply(
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
    
    extension [Self <: MRR_](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setMrr(value: Double): Self = StObject.set(x, "mrr", value.asInstanceOf[js.Any])
      
      inline def `setMrr-churn`(value: Double): Self = StObject.set(x, "mrr-churn", value.asInstanceOf[js.Any])
      
      inline def `setMrr-contraction`(value: Double): Self = StObject.set(x, "mrr-contraction", value.asInstanceOf[js.Any])
      
      inline def `setMrr-expansion`(value: Double): Self = StObject.set(x, "mrr-expansion", value.asInstanceOf[js.Any])
      
      inline def `setMrr-new-business`(value: Double): Self = StObject.set(x, "mrr-new-business", value.asInstanceOf[js.Any])
      
      inline def `setMrr-reactivation`(value: Double): Self = StObject.set(x, "mrr-reactivation", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params
    extends StObject
       with ParamsNoInterval {
    
    var interval: js.UndefOr[String] = js.undefined
  }
  object Params {
    
    inline def apply(`end-date`: String, `start-date`: String): Params = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
      __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  trait ParamsNoInterval extends StObject {
    
    var `end-date`: String
    
    var geo: js.UndefOr[String] = js.undefined
    
    var plans: js.UndefOr[String] = js.undefined
    
    var `start-date`: String
  }
  object ParamsNoInterval {
    
    inline def apply(`end-date`: String, `start-date`: String): ParamsNoInterval = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
      __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamsNoInterval]
    }
    
    extension [Self <: ParamsNoInterval](x: Self) {
      
      inline def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
      
      inline def setGeo(value: String): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      inline def setPlans(value: String): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
      
      inline def setPlansUndefined: Self = StObject.set(x, "plans", js.undefined)
      
      inline def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
    }
  }
}
