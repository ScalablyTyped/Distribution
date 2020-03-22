package typings.colorConvert

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon2 extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, ANSI16_] = js.native
  def raw(from: RGB_): ANSI16_ = js.native
}

