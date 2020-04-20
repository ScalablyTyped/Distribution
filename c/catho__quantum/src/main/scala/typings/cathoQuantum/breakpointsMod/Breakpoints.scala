package typings.cathoQuantum.breakpointsMod

import typings.cathoQuantum.AnonColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoints extends js.Object {
  var large: AnonColumns
  var medium: AnonColumns
  var small: AnonColumns
  var xlarge: AnonColumns
  var xsmall: AnonColumns
}

object Breakpoints {
  @scala.inline
  def apply(
    large: AnonColumns,
    medium: AnonColumns,
    small: AnonColumns,
    xlarge: AnonColumns,
    xsmall: AnonColumns
  ): Breakpoints = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], xlarge = xlarge.asInstanceOf[js.Any], xsmall = xsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints]
  }
}

