package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.RGB_
import typings.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `69` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, RGB_] = js.native
  def raw(from: XYZ_): RGB_ = js.native
}

