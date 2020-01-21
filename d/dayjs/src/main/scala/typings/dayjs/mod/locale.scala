package typings.dayjs.mod

import typings.dayjs.ILocale
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dayjs", "locale")
@js.native
object locale extends js.Object {
  def apply(preset: String): String = js.native
  def apply(preset: String, `object`: Partial[ILocale]): String = js.native
  def apply(preset: String, `object`: Partial[ILocale], isLocal: Boolean): String = js.native
  def apply(preset: ILocale): String = js.native
  def apply(preset: ILocale, `object`: Partial[ILocale]): String = js.native
  def apply(preset: ILocale, `object`: Partial[ILocale], isLocal: Boolean): String = js.native
}

