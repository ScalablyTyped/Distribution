package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `32` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, HWB_] = js.native
  def raw(from: HSV_): HWB_ = js.native
}

