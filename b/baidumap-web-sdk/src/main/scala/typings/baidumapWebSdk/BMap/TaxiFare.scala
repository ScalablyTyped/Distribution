package typings.baidumapWebSdk.BMap

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
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], night = night.asInstanceOf[js.Any], remark = remark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiFare]
  }
}

