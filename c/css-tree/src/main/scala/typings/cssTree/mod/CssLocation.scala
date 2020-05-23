package typings.cssTree.mod

import typings.cssTree.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssLocation extends js.Object {
  var end: Column
  var source: String
  var start: Column
}

object CssLocation {
  @scala.inline
  def apply(end: Column, source: String, start: Column): CssLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssLocation]
  }
}

