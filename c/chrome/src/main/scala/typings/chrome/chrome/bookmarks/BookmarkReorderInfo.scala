package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarkReorderInfo extends js.Object {
  var childIds: js.Array[String] = js.native
}

object BookmarkReorderInfo {
  @scala.inline
  def apply(childIds: js.Array[String]): BookmarkReorderInfo = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkReorderInfo]
  }
  @scala.inline
  implicit class BookmarkReorderInfoOps[Self <: BookmarkReorderInfo] (val x: Self) extends AnyVal {
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
    def setChildIdsVarargs(value: String*): Self = this.set("childIds", js.Array(value :_*))
    @scala.inline
    def setChildIds(value: js.Array[String]): Self = this.set("childIds", value.asInstanceOf[js.Any])
  }
  
}

