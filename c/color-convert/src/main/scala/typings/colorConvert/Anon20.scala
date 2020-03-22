package typings.colorConvert

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HSL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon20 extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, CMYK_] = js.native
  def raw(from: HSL_): CMYK_ = js.native
}

