package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxiFare extends js.Object {
  var day: TaxiFareDetail
  var distance: scala.Double
  var night: TaxiFareDetail
  var remark: java.lang.String
}

object TaxiFare {
  @scala.inline
  def apply(day: TaxiFareDetail, distance: scala.Double, night: TaxiFareDetail, remark: java.lang.String): TaxiFare = {
    val __obj = js.Dynamic.literal(day = day, distance = distance, night = night, remark = remark)
  
    __obj.asInstanceOf[TaxiFare]
  }
}

