package typings.colorConvert

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HEX_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon60 extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, HEX_] = js.native
  def raw(from: CMYK_): HEX_ = js.native
}

