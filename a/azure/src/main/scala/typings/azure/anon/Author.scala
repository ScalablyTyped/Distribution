package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author extends js.Object {
  var author: Name = js.native
  var category: js.Any = js.native
  var content: js.Any = js.native
  var id: String = js.native
  var link: js.Any = js.native
  var title: js.Any = js.native
  var updated: String = js.native
}

object Author {
  @scala.inline
  def apply(
    author: Name,
    category: js.Any,
    content: js.Any,
    id: String,
    link: js.Any,
    title: js.Any,
    updated: String
  ): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
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
    def setAuthor(value: Name): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: js.Any): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: js.Any): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
  
}

