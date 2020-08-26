package typings.casperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindByUrlNameTitle extends js.Object {
  var title: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var windowName: js.UndefOr[String] = js.native
}

object FindByUrlNameTitle {
  @scala.inline
  def apply(): FindByUrlNameTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindByUrlNameTitle]
  }
  @scala.inline
  implicit class FindByUrlNameTitleOps[Self <: FindByUrlNameTitle] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWindowName(value: String): Self = this.set("windowName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowName: Self = this.set("windowName", js.undefined)
  }
  
}

