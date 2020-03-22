package typings.colorConvert

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.CMYK_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon59 extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, ANSI16_] = js.native
  def raw(from: CMYK_): ANSI16_ = js.native
}

