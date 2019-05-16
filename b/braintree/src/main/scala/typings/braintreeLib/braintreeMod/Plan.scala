package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Plan")
@js.native
class Plan () extends js.Object {
  var addOns: js.UndefOr[js.Array[AddOn]] = js.native
  var billingDayOfMonth: scala.Double = js.native
  var billingFrequency: scala.Double = js.native
  var createdAt: stdLib.Date = js.native
  var currenyIsoCode: java.lang.String = js.native
  var description: js.UndefOr[java.lang.String] = js.native
  var discounts: js.UndefOr[js.Array[Discount]] = js.native
  var id: java.lang.String = js.native
  var name: java.lang.String = js.native
  var numberOfBillingCycles: scala.Double = js.native
  var price: java.lang.String = js.native
  var trialDuration: js.UndefOr[scala.Double] = js.native
  var trialDurationUnit: js.UndefOr[java.lang.String] = js.native
  var trialPeriod: js.UndefOr[scala.Boolean] = js.native
  var updatedAt: stdLib.Date = js.native
}

