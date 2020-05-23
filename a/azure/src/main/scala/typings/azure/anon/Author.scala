package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author extends js.Object {
  var author: Name
  var category: js.Any
  var content: js.Any
  var id: String
  var link: js.Any
  var title: js.Any
  var updated: String
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
}

