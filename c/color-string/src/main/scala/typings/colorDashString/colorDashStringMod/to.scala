package typings.colorDashString.colorDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-string", "to")
@js.native
object to extends js.Object {
  def hex(args: (Double | js.Array[Double])*): String = js.native
  def hsl(args: (Double | js.Array[Double])*): String = js.native
  def hwb(args: (Double | js.Array[Double])*): String = js.native
  def keyword(args: (Double | js.Array[Double])*): String = js.native
  @js.native
  object rgb extends js.Object {
    def apply(args: (Double | js.Array[Double])*): String = js.native
    def percent(args: (Double | js.Array[Double])*): String = js.native
  }
  
}

