package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.AnonPoints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Convertor")
@js.native
class Convertor () extends js.Object {
  def translate(
    points: js.Array[Point],
    from: Double,
    to: Double,
    callback: js.Function1[/* result */ AnonPoints, Unit]
  ): Unit = js.native
}

