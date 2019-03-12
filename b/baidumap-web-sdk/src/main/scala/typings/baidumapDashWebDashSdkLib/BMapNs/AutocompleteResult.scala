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
    getNumPois: () => scala.Double,
    getPoi: scala.Double => AutocompleteResultPoi,
    keyword: java.lang.String
  ): AutocompleteResult = {
    val __obj = js.Dynamic.literal(getNumPois = js.Any.fromFunction0(getNumPois), getPoi = js.Any.fromFunction1(getPoi), keyword = keyword)
  
    __obj.asInstanceOf[AutocompleteResult]
  }
}

