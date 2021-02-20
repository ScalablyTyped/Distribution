package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "Plan")
@js.native
class Plan () extends StObject {
  
  var addOns: js.UndefOr[js.Array[AddOn]] = js.native
  
  var billingDayOfMonth: Double = js.native
  
  var billingFrequency: Double = js.native
  
  var createdAt: Date = js.native
  
  var currencyIsoCode: String = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var discounts: js.UndefOr[js.Array[Discount]] = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var numberOfBillingCycles: Double = js.native
  
  var price: String = js.native
  
  var trialDuration: js.UndefOr[Double] = js.native
  
  var trialDurationUnit: js.UndefOr[String] = js.native
  
  var trialPeriod: js.UndefOr[Boolean] = js.native
  
  var updatedAt: Date = js.native
}
