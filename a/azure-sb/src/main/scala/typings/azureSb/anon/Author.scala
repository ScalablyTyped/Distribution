package typings.azureSb.anon

import typings.azureSb.mod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author extends js.Object {
  var ContentRootElement: String
  var author: js.UndefOr[Name] = js.undefined
  var id: String
  var link: String
  var published: DateString
  var title: String
  var updated: DateString
}

object Author {
  @scala.inline
  def apply(
    ContentRootElement: String,
    id: String,
    link: String,
    published: DateString,
    title: String,
    updated: DateString,
    author: Name = null
  ): Author = {
    val __obj = js.Dynamic.literal(ContentRootElement = ContentRootElement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
}

