package typings.colorConvert

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon5 extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, CMYK_] = js.native
  def raw(from: RGB_): CMYK_ = js.native
}

