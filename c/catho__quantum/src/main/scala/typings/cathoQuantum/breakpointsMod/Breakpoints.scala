package typings.cathoQuantum.breakpointsMod

import typings.cathoQuantum.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoints extends js.Object {
  var large: Columns
  var medium: Columns
  var small: Columns
  var xlarge: Columns
  var xsmall: Columns
}

object Breakpoints {
  @scala.inline
  def apply(large: Columns, medium: Columns, small: Columns, xlarge: Columns, xsmall: Columns): Breakpoints = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], xlarge = xlarge.asInstanceOf[js.Any], xsmall = xsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints]
  }
}

