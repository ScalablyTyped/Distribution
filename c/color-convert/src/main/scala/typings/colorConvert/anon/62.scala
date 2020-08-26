package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `62` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, XYZ_] = js.native
  def raw(from: CMYK_): XYZ_ = js.native
}

