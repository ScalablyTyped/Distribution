package typings.cssTree.mod

import typings.cssTree.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssLocation extends js.Object {
  var end: AnonColumn
  var source: String
  var start: AnonColumn
}

object CssLocation {
  @scala.inline
  def apply(end: AnonColumn, source: String, start: AnonColumn): CssLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CssLocation]
  }
}

