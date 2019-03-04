package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var end: scala.Double
  var loc: SourceLocation
  var start: scala.Double
  var value: java.lang.String
}

object Comment {
  @scala.inline
  def apply(end: scala.Double, loc: SourceLocation, start: scala.Double, value: java.lang.String): Comment = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
  
    __obj.asInstanceOf[Comment]
  }
}

