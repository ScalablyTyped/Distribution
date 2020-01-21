package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigPageGroup extends ConfigPageOrGroup {
  var pages: js.Array[ConfigPage]
  var title: String
}

object ConfigPageGroup {
  @scala.inline
  def apply(pages: js.Array[ConfigPage], title: String): ConfigPageGroup = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigPageGroup]
  }
}

