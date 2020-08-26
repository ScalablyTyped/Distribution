package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteResult extends js.Object {
  var keyword: String = js.native
  def getNumPois(): Double = js.native
  def getPoi(i: Double): AutocompleteResultPoi = js.native
}

object AutocompleteResult {
  @scala.inline
  def apply(getNumPois: () => Double, getPoi: Double => AutocompleteResultPoi, keyword: String): AutocompleteResult = {
    val __obj = js.Dynamic.literal(getNumPois = js.Any.fromFunction0(getNumPois), getPoi = js.Any.fromFunction1(getPoi), keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResult]
  }
  @scala.inline
  implicit class AutocompleteResultOps[Self <: AutocompleteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetNumPois(value: () => Double): Self = this.set("getNumPois", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPoi(value: Double => AutocompleteResultPoi): Self = this.set("getPoi", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
  }
  
}

