package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Subscription")
@js.native
object SubscriptionNs extends js.Object {
  trait CancelSubscriptionParams extends js.Object {
    var cancellation_dates: js.UndefOr[chartmogulDashNodeLib.commonMod.Strings] = js.undefined
    var cancelled_at: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Subscription extends js.Object {
    var cancellation_dates: chartmogulDashNodeLib.commonMod.Strings
    var customer_uuid: java.lang.String
    var data_source_uuid: java.lang.String
    var external_id: java.lang.String
    var plan_uuid: java.lang.String
    var uuid: java.lang.String
  }
  
  trait Subscriptions
    extends chartmogulDashNodeLib.commonMod.Cursor {
    var customer_uuid: js.UndefOr[java.lang.String] = js.undefined
    var subscriptions: js.Array[Subscription]
  }
  
  def all(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: chartmogulDashNodeLib.commonMod.CursorParams
  ): js.Promise[Subscriptions] = js.native
  def cancel(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: CancelSubscriptionParams
  ): js.Promise[Subscription] = js.native
}

