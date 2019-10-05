package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteResult extends js.Object {
  var keyword: String
  def getNumPois(): Double
  def getPoi(i: Double): AutocompleteResultPoi
}

object AutocompleteResult {
  @scala.inline
  def apply(getNumPois: () => Double, getPoi: Double => AutocompleteResultPoi, keyword: String): AutocompleteResult = {
    val __obj = js.Dynamic.literal(getNumPois = js.Any.fromFunction0(getNumPois), getPoi = js.Any.fromFunction1(getPoi), keyword = keyword)
  
    __obj.asInstanceOf[AutocompleteResult]
  }
}

