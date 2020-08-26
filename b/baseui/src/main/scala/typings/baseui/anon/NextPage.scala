package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextPage extends js.Object {
  var nextPage: Double = js.native
  var prevPage: Double = js.native
}

object NextPage {
  @scala.inline
  def apply(nextPage: Double, prevPage: Double): NextPage = {
    val __obj = js.Dynamic.literal(nextPage = nextPage.asInstanceOf[js.Any], prevPage = prevPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPage]
  }
  @scala.inline
  implicit class NextPageOps[Self <: NextPage] (val x: Self) extends AnyVal {
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
    def setNextPage(value: Double): Self = this.set("nextPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevPage(value: Double): Self = this.set("prevPage", value.asInstanceOf[js.Any])
  }
  
}

