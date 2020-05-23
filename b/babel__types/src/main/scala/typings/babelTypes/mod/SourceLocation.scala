package typings.babelTypes.mod

import typings.babelTypes.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: Column
  var start: Column
}

object SourceLocation {
  @scala.inline
  def apply(end: Column, start: Column): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
}

