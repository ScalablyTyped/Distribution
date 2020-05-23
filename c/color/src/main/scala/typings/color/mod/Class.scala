package typings.color.mod

import typings.color.colorStrings.ansi16
import typings.color.colorStrings.ansi256
import typings.color.colorStrings.apple
import typings.color.colorStrings.cmyk
import typings.color.colorStrings.gray
import typings.color.colorStrings.hcg
import typings.color.colorStrings.hex
import typings.color.colorStrings.hsl
import typings.color.colorStrings.hsv
import typings.color.colorStrings.hwb
import typings.color.colorStrings.keyword
import typings.color.colorStrings.lab
import typings.color.colorStrings.lch
import typings.color.colorStrings.rgb
import typings.color.colorStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color", JSImport.Namespace)
@js.native
class Class[T /* <: ColorParam */] () extends Color[T] {
  def this(obj: T) = this()
  def this(
    obj: T,
    model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
  ) = this()
}

