package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `202` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, CMYK_] = js.native
  def raw(from: GRAY_): CMYK_ = js.native
}

