package typings
package betterDashScrollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fn extends js.Object {
  var style: java.lang.String
  def fn(t: scala.Double): scala.Double
}

object Anon_Fn {
  @scala.inline
  def apply(fn: js.Function1[scala.Double, scala.Double], style: java.lang.String): Anon_Fn = {
    val __obj = js.Dynamic.literal(fn = fn, style = style)
  
    __obj.asInstanceOf[Anon_Fn]
  }
}

