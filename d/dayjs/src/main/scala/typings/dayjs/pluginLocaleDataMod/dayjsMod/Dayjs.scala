package typings.dayjs.pluginLocaleDataMod.dayjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def localeData(): js.Any
}

object Dayjs {
  @scala.inline
  def apply(localeData: () => js.Any): Dayjs = {
    val __obj = js.Dynamic.literal(localeData = js.Any.fromFunction0(localeData))
  
    __obj.asInstanceOf[Dayjs]
  }
}

