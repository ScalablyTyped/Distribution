package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxiFareDetail extends js.Object {
  var initialFare: Double
  var totalFare: Double
  var unitFare: Double
}

object TaxiFareDetail {
  @scala.inline
  def apply(initialFare: Double, totalFare: Double, unitFare: Double): TaxiFareDetail = {
    val __obj = js.Dynamic.literal(initialFare = initialFare, totalFare = totalFare, unitFare = unitFare)
  
    __obj.asInstanceOf[TaxiFareDetail]
  }
}

