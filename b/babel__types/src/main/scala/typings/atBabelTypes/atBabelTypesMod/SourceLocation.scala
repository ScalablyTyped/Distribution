package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: Anon_Column
  var start: Anon_Column
}

object SourceLocation {
  @scala.inline
  def apply(end: Anon_Column, start: Anon_Column): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[SourceLocation]
  }
}

