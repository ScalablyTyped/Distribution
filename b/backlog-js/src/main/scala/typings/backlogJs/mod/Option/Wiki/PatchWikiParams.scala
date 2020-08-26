package typings.backlogJs.mod.Option.Wiki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchWikiParams extends js.Object {
  var content: js.UndefOr[String] = js.native
  var mailNotify: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
}

object PatchWikiParams {
  @scala.inline
  def apply(): PatchWikiParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchWikiParams]
  }
  @scala.inline
  implicit class PatchWikiParamsOps[Self <: PatchWikiParams] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setMailNotify(value: Boolean): Self = this.set("mailNotify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailNotify: Self = this.set("mailNotify", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

