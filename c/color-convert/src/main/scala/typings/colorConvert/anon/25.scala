package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HSL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `25` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, ANSI16_] = js.native
  def raw(from: HSL_): ANSI16_ = js.native
}

