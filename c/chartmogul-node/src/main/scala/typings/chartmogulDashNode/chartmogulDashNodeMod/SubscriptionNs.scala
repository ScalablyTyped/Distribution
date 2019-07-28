package typings.chartmogulDashNode.chartmogulDashNodeMod

import typings.chartmogulDashNode.chartmogulDashNodeMod.SubscriptionNs.CancelSubscriptionParams
import typings.chartmogulDashNode.chartmogulDashNodeMod.SubscriptionNs.Subscription
import typings.chartmogulDashNode.chartmogulDashNodeMod.SubscriptionNs.Subscriptions
import typings.chartmogulDashNode.commonMod.Cursor
import typings.chartmogulDashNode.commonMod.CursorParams
import typings.chartmogulDashNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Subscription")
@js.native
object SubscriptionNs extends js.Object {
  trait CancelSubscriptionParams extends js.Object {
    var cancellation_dates: js.UndefOr[Strings] = js.undefined
    var cancelled_at: js.UndefOr[String] = js.undefined
  }
  
  trait Subscription extends js.Object {
    var cancellation_dates: Strings
    var customer_uuid: String
    var data_source_uuid: String
    var external_id: String
    var plan_uuid: String
    var uuid: String
  }
  
  trait Subscriptions extends Cursor {
    var customer_uuid: js.UndefOr[String] = js.undefined
    var subscriptions: js.Array[Subscription]
  }
  
  def all(config: Config, uuid: String, data: CursorParams): js.Promise[Subscriptions] = js.native
  def cancel(config: Config, uuid: String, data: CancelSubscriptionParams): js.Promise[Subscription] = js.native
}

