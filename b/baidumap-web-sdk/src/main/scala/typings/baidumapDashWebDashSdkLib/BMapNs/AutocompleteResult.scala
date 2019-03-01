package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteResult extends js.Object {
  var keyword: java.lang.String
  def getNumPois(): scala.Double
  def getPoi(i: scala.Double): AutocompleteResultPoi
}

object AutocompleteResult {
  @scala.inline
  def apply(
    getNumPois: js.Function0[scala.Double],
    getPoi: js.Function1[scala.Double, AutocompleteResultPoi],
    keyword: java.lang.String
  ): AutocompleteResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getNumPois")(getNumPois)
    __obj.updateDynamic("getPoi")(getPoi)
    __obj.updateDynamic("keyword")(keyword)
    __obj.asInstanceOf[AutocompleteResult]
  }
}

