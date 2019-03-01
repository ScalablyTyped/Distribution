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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("night")(night)
    __obj.updateDynamic("remark")(remark)
    __obj.asInstanceOf[TaxiFare]
  }
}

