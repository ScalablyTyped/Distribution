package typings.colorDashString.colorDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-string", "to")
@js.native
object toNs extends js.Object {
  def hex(args: (Double | js.Array[Double])*): String = js.native
  def hsl(args: (Double | js.Array[Double])*): String = js.native
  def hwb(args: (Double | js.Array[Double])*): String = js.native
  def keyword(args: (Double | js.Array[Double])*): String = js.native
  def rgb(args: (Double | js.Array[Double])*): String = js.native
  @JSName("rgb")
  @js.native
  object rgbNs extends js.Object {
    def percent(args: (Double | js.Array[Double])*): String = js.native
  }
  
}

