package typings.cleaveJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cleave extends js.Object {
  def destroy(): Unit
  def getFormattedValue(): String
  def getISOFormatDate(): String
  def getRawValue(): String
  def setPhoneRegionCode(regionCode: String): Unit
  def setRawValue(value: String): Unit
}

object Cleave {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getFormattedValue: () => String,
    getISOFormatDate: () => String,
    getRawValue: () => String,
    setPhoneRegionCode: String => Unit,
    setRawValue: String => Unit
  ): Cleave = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getFormattedValue = js.Any.fromFunction0(getFormattedValue), getISOFormatDate = js.Any.fromFunction0(getISOFormatDate), getRawValue = js.Any.fromFunction0(getRawValue), setPhoneRegionCode = js.Any.fromFunction1(setPhoneRegionCode), setRawValue = js.Any.fromFunction1(setRawValue))
    __obj.asInstanceOf[Cleave]
  }
}

