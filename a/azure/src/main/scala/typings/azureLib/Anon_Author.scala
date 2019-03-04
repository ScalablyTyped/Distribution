package typings
package azureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  var author: Anon_Name
  var category: js.Any
  var content: js.Any
  var id: java.lang.String
  var link: js.Any
  var title: js.Any
  var updated: java.lang.String
}

object Anon_Author {
  @scala.inline
  def apply(
    author: Anon_Name,
    category: js.Any,
    content: js.Any,
    id: java.lang.String,
    link: js.Any,
    title: js.Any,
    updated: java.lang.String
  ): Anon_Author = {
    val __obj = js.Dynamic.literal(author = author, category = category, content = content, id = id, link = link, title = title, updated = updated)
  
    __obj.asInstanceOf[Anon_Author]
  }
}

