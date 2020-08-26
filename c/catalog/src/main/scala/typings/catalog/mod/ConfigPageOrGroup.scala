package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.catalog.mod.ConfigPage
  - typings.catalog.mod.ConfigPageGroup
*/
trait ConfigPageOrGroup extends js.Object

object ConfigPageOrGroup {
  @scala.inline
  def ConfigPage(path: String, title: String): ConfigPageOrGroup = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigPageOrGroup]
  }
  @scala.inline
  def ConfigPageGroup(pages: js.Array[ConfigPage], title: String): ConfigPageOrGroup = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigPageOrGroup]
  }
}

