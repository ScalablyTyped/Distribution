package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.LCH_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `103` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, CMYK_] = js.native
  def raw(from: LCH_): CMYK_ = js.native
}

