package typings.babelTypes.mod

import typings.babelTypes.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: AnonColumn
  var start: AnonColumn
}

object SourceLocation {
  @scala.inline
  def apply(end: AnonColumn, start: AnonColumn): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceLocation]
  }
}

