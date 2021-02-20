package typings.chartmogulNode.mod

import typings.chartmogulNode.commonMod.Cursor
import typings.chartmogulNode.commonMod.CursorParams
import typings.chartmogulNode.commonMod.Strings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Subscription {
  
  @JSImport("chartmogul-node", "Subscription.all")
  @js.native
  def all(config: Config, uuid: String, data: CursorParams): js.Promise[Subscriptions] = js.native
  
  @JSImport("chartmogul-node", "Subscription.cancel")
  @js.native
  def cancel(config: Config, uuid: String, data: CancelSubscriptionParams): js.Promise[typings.chartmogulNode.mod.Subscription.Subscription] = js.native
  
  @js.native
  trait CancelSubscriptionParams extends StObject {
    
    var cancellation_dates: js.UndefOr[Strings] = js.native
    
    var cancelled_at: js.UndefOr[String] = js.native
  }
  object CancelSubscriptionParams {
    
    @scala.inline
    def apply(): CancelSubscriptionParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelSubscriptionParams]
    }
    
    @scala.inline
    implicit class CancelSubscriptionParamsMutableBuilder[Self <: CancelSubscriptionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancellation_dates(value: Strings): Self = StObject.set(x, "cancellation_dates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancellation_datesUndefined: Self = StObject.set(x, "cancellation_dates", js.undefined)
      
      @scala.inline
      def setCancellation_datesVarargs(value: String*): Self = StObject.set(x, "cancellation_dates", js.Array(value :_*))
      
      @scala.inline
      def setCancelled_at(value: String): Self = StObject.set(x, "cancelled_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelled_atUndefined: Self = StObject.set(x, "cancelled_at", js.undefined)
    }
  }
  
  @js.native
  trait Subscription extends StObject {
    
    var cancellation_dates: Strings = js.native
    
    var customer_uuid: String = js.native
    
    var data_source_uuid: String = js.native
    
    var external_id: String = js.native
    
    var plan_uuid: String = js.native
    
    var uuid: String = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: typings.chartmogulNode.mod.Subscription.Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancellation_dates(value: Strings): Self = StObject.set(x, "cancellation_dates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancellation_datesVarargs(value: String*): Self = StObject.set(x, "cancellation_dates", js.Array(value :_*))
      
      @scala.inline
      def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlan_uuid(value: String): Self = StObject.set(x, "plan_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Subscriptions extends Cursor {
    
    var customer_uuid: js.UndefOr[String] = js.native
    
    var subscriptions: js.Array[typings.chartmogulNode.mod.Subscription.Subscription] = js.native
  }
  object Subscriptions {
    
    @scala.inline
    def apply(subscriptions: js.Array[typings.chartmogulNode.mod.Subscription.Subscription]): Subscriptions = {
      val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscriptions]
    }
    
    @scala.inline
    implicit class SubscriptionsMutableBuilder[Self <: Subscriptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      @scala.inline
      def setSubscriptions(value: js.Array[typings.chartmogulNode.mod.Subscription.Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionsVarargs(value: typings.chartmogulNode.mod.Subscription.Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
    }
  }
}
