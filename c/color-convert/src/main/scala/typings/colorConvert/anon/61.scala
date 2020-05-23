package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.LCH_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `61` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, LCH_] = js.native
  def raw(from: CMYK_): LCH_ = js.native
}

