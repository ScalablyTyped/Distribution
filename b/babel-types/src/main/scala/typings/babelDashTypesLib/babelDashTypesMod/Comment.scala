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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Comment]
  }
}

