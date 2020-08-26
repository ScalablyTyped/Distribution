package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HSV_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `39` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, ANSI16_] = js.native
  def raw(from: HSV_): ANSI16_ = js.native
}

