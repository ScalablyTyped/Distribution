package typings.dayjs.pluginUtcMod.dayjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def isUTC(): Boolean
  def local(): Dayjs
  def utc(): Dayjs
  def utcOffset(offset: Double): Dayjs
}

object Dayjs {
  @scala.inline
  def apply(isUTC: () => Boolean, local: () => Dayjs, utc: () => Dayjs, utcOffset: Double => Dayjs): Dayjs = {
    val __obj = js.Dynamic.literal(isUTC = js.Any.fromFunction0(isUTC), local = js.Any.fromFunction0(local), utc = js.Any.fromFunction0(utc), utcOffset = js.Any.fromFunction1(utcOffset))
  
    __obj.asInstanceOf[Dayjs]
  }
}

