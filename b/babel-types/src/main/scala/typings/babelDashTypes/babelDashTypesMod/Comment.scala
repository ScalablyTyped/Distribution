package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var end: Double
  var loc: SourceLocation
  var start: Double
  var value: String
}

object Comment {
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, value: String): Comment = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
  
    __obj.asInstanceOf[Comment]
  }
}

