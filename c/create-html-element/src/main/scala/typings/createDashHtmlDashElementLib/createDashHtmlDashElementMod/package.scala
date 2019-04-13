package typings
package createDashHtmlDashElementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createDashHtmlDashElementMod {
  type Options[K] = OptionsWithTagName[K] with (XOR[HtmlOptions, TextOptions])
  type OptionsWithoutTagName = AttributesOptions with (XOR[HtmlOptions, TextOptions])
  type Without[T, U] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, keyof U> ]:? never}
    */ createDashHtmlDashElementLib.createDashHtmlDashElementLibStrings.Without with js.Any
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
}
