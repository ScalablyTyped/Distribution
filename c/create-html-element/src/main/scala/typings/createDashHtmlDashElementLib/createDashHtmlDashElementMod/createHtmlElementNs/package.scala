package typings
package createDashHtmlDashElementLib.createDashHtmlDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createHtmlElementNs {
  type Options[K] = OptionsWithTagName[K] with (XOR[HtmlOptions, TextOptions])
  type OptionsWithoutTagName = AttributesOptions with (XOR[HtmlOptions, TextOptions])
  type Without[T, U] = createDashHtmlDashElementLib.createDashHtmlDashElementLibStrings.Without with js.Any
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
}
