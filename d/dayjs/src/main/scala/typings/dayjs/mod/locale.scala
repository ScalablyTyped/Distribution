package typings.dayjs.mod

import typings.dayjs.ILocale
import typings.dayjs.anon.PartialILocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dayjs", "locale")
@js.native
object locale extends js.Object {
  def apply(): String = js.native
  def apply(preset: String): String = js.native
  def apply(preset: String, `object`: PartialILocale): String = js.native
  def apply(preset: String, `object`: PartialILocale, isLocal: Boolean): String = js.native
  def apply(preset: ILocale): String = js.native
  def apply(preset: ILocale, `object`: PartialILocale): String = js.native
  def apply(preset: ILocale, `object`: PartialILocale, isLocal: Boolean): String = js.native
}

