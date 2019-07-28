package typings.clui.cluiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Gauge(value: Double, maxValue: Double, guageWidth: Double, dangerZone: Double, suffix: String): String = js.native
  def Sparkline(values: js.Array[Double], suffix: String): String = js.native
}

