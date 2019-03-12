package typings
package cleaveDotJsLib.cleaveDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cleave extends js.Object {
  def destroy(): scala.Unit
  def getFormattedValue(): java.lang.String
  def getISOFormatDate(): java.lang.String
  def getRawValue(): java.lang.String
  def setPhoneRegionCode(regionCode: java.lang.String): scala.Unit
  def setRawValue(value: java.lang.String): scala.Unit
}

object Cleave {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    getFormattedValue: () => java.lang.String,
    getISOFormatDate: () => java.lang.String,
    getRawValue: () => java.lang.String,
    setPhoneRegionCode: java.lang.String => scala.Unit,
    setRawValue: java.lang.String => scala.Unit
  ): Cleave = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getFormattedValue = js.Any.fromFunction0(getFormattedValue), getISOFormatDate = js.Any.fromFunction0(getISOFormatDate), getRawValue = js.Any.fromFunction0(getRawValue), setPhoneRegionCode = js.Any.fromFunction1(setPhoneRegionCode), setRawValue = js.Any.fromFunction1(setRawValue))
  
    __obj.asInstanceOf[Cleave]
  }
}

