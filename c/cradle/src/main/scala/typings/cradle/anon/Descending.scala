package typings.cradle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Descending extends js.Object {
  var descending: js.UndefOr[Boolean] = js.native
  var endkey: js.UndefOr[js.Any] = js.native
  var group: js.UndefOr[Boolean] = js.native
  var include_docs: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var reduce: js.UndefOr[Boolean] = js.native
  var startkey: js.UndefOr[js.Any] = js.native
}

object Descending {
  @scala.inline
  def apply(): Descending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descending]
  }
  @scala.inline
  implicit class DescendingOps[Self <: Descending] (val x: Self) extends AnyVal {
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
    def setDescending(value: Boolean): Self = this.set("descending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescending: Self = this.set("descending", js.undefined)
    @scala.inline
    def setEndkey(value: js.Any): Self = this.set("endkey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndkey: Self = this.set("endkey", js.undefined)
    @scala.inline
    def setGroup(value: Boolean): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setInclude_docs(value: Boolean): Self = this.set("include_docs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_docs: Self = this.set("include_docs", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setReduce(value: Boolean): Self = this.set("reduce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReduce: Self = this.set("reduce", js.undefined)
    @scala.inline
    def setStartkey(value: js.Any): Self = this.set("startkey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartkey: Self = this.set("startkey", js.undefined)
  }
  
}

