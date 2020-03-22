package typings.colorConvert

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.CMYK_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon58 extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, ANSI256_] = js.native
  def raw(from: CMYK_): ANSI256_ = js.native
}

