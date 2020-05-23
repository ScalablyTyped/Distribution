package typings.babelCodeFrame.mod

import typings.babelCodeFrame.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: js.UndefOr[Column] = js.undefined
  var start: Column
}

object SourceLocation {
  @scala.inline
  def apply(start: Column, end: Column = null): SourceLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
}

