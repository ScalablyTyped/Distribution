package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigPageGroup extends ConfigPageOrGroup {
  var pages: js.Array[ConfigPage]
  var title: java.lang.String
}

object ConfigPageGroup {
  @scala.inline
  def apply(pages: js.Array[ConfigPage], title: java.lang.String): ConfigPageGroup = {
    val __obj = js.Dynamic.literal(pages = pages, title = title)
  
    __obj.asInstanceOf[ConfigPageGroup]
  }
}

