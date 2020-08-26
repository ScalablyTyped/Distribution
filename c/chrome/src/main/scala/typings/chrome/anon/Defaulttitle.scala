package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaulttitle extends js.Object {
  var default_title: js.UndefOr[String] = js.native
  var file_filters: js.UndefOr[js.Array[String]] = js.native
  var id: js.UndefOr[String] = js.native
}

object Defaulttitle {
  @scala.inline
  def apply(): Defaulttitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaulttitle]
  }
  @scala.inline
  implicit class DefaulttitleOps[Self <: Defaulttitle] (val x: Self) extends AnyVal {
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
    def setDefault_title(value: String): Self = this.set("default_title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_title: Self = this.set("default_title", js.undefined)
    @scala.inline
    def setFile_filtersVarargs(value: String*): Self = this.set("file_filters", js.Array(value :_*))
    @scala.inline
    def setFile_filters(value: js.Array[String]): Self = this.set("file_filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_filters: Self = this.set("file_filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

