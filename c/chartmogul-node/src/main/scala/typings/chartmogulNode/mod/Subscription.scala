package typings.chartmogulNode.mod

import typings.chartmogulNode.commonMod.Cursor
import typings.chartmogulNode.commonMod.CursorParams
import typings.chartmogulNode.commonMod.Strings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Subscription {
  
  @JSImport("chartmogul-node", "Subscription")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(config: Config, uuid: String, data: CursorParams): js.Promise[Subscriptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Subscriptions]]
  
  inline def cancel(config: Config, uuid: String, data: CancelSubscriptionParams): js.Promise[typings.chartmogulNode.mod.Subscription.Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Subscription.Subscription]]
  
  trait CancelSubscriptionParams extends StObject {
    
    var cancellation_dates: js.UndefOr[Strings] = js.undefined
    
    var cancelled_at: js.UndefOr[String] = js.undefined
  }
  object CancelSubscriptionParams {
    
    inline def apply(): CancelSubscriptionParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelSubscriptionParams]
    }
    
    extension [Self <: CancelSubscriptionParams](x: Self) {
      
      inline def setCancellation_dates(value: Strings): Self = StObject.set(x, "cancellation_dates", value.asInstanceOf[js.Any])
      
      inline def setCancellation_datesUndefined: Self = StObject.set(x, "cancellation_dates", js.undefined)
      
      inline def setCancellation_datesVarargs(value: String*): Self = StObject.set(x, "cancellation_dates", js.Array(value*))
      
      inline def setCancelled_at(value: String): Self = StObject.set(x, "cancelled_at", value.asInstanceOf[js.Any])
      
      inline def setCancelled_atUndefined: Self = StObject.set(x, "cancelled_at", js.undefined)
    }
  }
  
  trait Subscription extends StObject {
    
    var cancellation_dates: Strings
    
    var customer_uuid: String
    
    var data_source_uuid: String
    
    var external_id: String
    
    var plan_uuid: String
    
    var uuid: String
  }
  object Subscription {
    
    inline def apply(
      cancellation_dates: Strings,
      customer_uuid: String,
      data_source_uuid: String,
      external_id: String,
      plan_uuid: String,
      uuid: String
    ): typings.chartmogulNode.mod.Subscription.Subscription = {
      val __obj = js.Dynamic.literal(cancellation_dates = cancellation_dates.asInstanceOf[js.Any], customer_uuid = customer_uuid.asInstanceOf[js.Any], data_source_uuid = data_source_uuid.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], plan_uuid = plan_uuid.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chartmogulNode.mod.Subscription.Subscription]
    }
    
    extension [Self <: typings.chartmogulNode.mod.Subscription.Subscription](x: Self) {
      
      inline def setCancellation_dates(value: Strings): Self = StObject.set(x, "cancellation_dates", value.asInstanceOf[js.Any])
      
      inline def setCancellation_datesVarargs(value: String*): Self = StObject.set(x, "cancellation_dates", js.Array(value*))
      
      inline def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      inline def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setPlan_uuid(value: String): Self = StObject.set(x, "plan_uuid", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscriptions
    extends StObject
       with Cursor {
    
    var customer_uuid: js.UndefOr[String] = js.undefined
    
    var subscriptions: js.Array[typings.chartmogulNode.mod.Subscription.Subscription]
  }
  object Subscriptions {
    
    inline def apply(subscriptions: js.Array[typings.chartmogulNode.mod.Subscription.Subscription]): Subscriptions = {
      val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscriptions]
    }
    
    extension [Self <: Subscriptions](x: Self) {
      
      inline def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      inline def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      inline def setSubscriptions(value: js.Array[typings.chartmogulNode.mod.Subscription.Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsVarargs(value: typings.chartmogulNode.mod.Subscription.Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
    }
  }
}
