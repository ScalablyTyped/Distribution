package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxiFare extends js.Object {
  var day: TaxiFareDetail
  var distance: Double
  var night: TaxiFareDetail
  var remark: String
}

object TaxiFare {
  @scala.inline
  def apply(day: TaxiFareDetail, distance: Double, night: TaxiFareDetail, remark: String): TaxiFare = {
    val __obj = js.Dynamic.literal(day = day, distance = distance, night = night, remark = remark)
  
    __obj.asInstanceOf[TaxiFare]
  }
}

