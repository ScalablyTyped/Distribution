package typings.cssDashTree.cssDashTreeMod

import typings.cssDashTree.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssLocation extends js.Object {
  var end: Anon_Column
  var source: String
  var start: Anon_Column
}

object CssLocation {
  @scala.inline
  def apply(end: Anon_Column, source: String, start: Anon_Column): CssLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CssLocation]
  }
}

