package typings
package cluiLib.cluiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Gauge(
    value: scala.Double,
    maxValue: scala.Double,
    guageWidth: scala.Double,
    dangerZone: scala.Double,
    suffix: java.lang.String
  ): java.lang.String = js.native
  def Sparkline(values: js.Array[scala.Double], suffix: java.lang.String): java.lang.String = js.native
}

