package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigPageGroup extends ConfigPageOrGroup {
  var pages: js.Array[ConfigPage] = js.native
  var title: String = js.native
}

object ConfigPageGroup {
  @scala.inline
  def apply(pages: js.Array[ConfigPage], title: String): ConfigPageGroup = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigPageGroup]
  }
  @scala.inline
  implicit class ConfigPageGroupOps[Self <: ConfigPageGroup] (val x: Self) extends AnyVal {
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
    def setPagesVarargs(value: ConfigPage*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[ConfigPage]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

