package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.anon.Points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Convertor")
@js.native
class Convertor ()
  extends typings.baidumapWebSdk.BMap.Convertor {
  /* CompleteClass */
  override def translate(
    points: js.Array[typings.baidumapWebSdk.BMap.Point],
    from: Double,
    to: Double,
    callback: js.Function1[/* result */ Points, Unit]
  ): Unit = js.native
}

