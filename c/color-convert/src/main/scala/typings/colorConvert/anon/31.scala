package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HSV_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `31` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, ANSI256_] = js.native
  def raw(from: HSV_): ANSI256_ = js.native
}

