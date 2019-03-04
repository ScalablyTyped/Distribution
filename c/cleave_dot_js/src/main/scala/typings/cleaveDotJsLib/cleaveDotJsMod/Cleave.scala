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
    destroy: js.Function0[scala.Unit],
    getFormattedValue: js.Function0[java.lang.String],
    getISOFormatDate: js.Function0[java.lang.String],
    getRawValue: js.Function0[java.lang.String],
    setPhoneRegionCode: js.Function1[java.lang.String, scala.Unit],
    setRawValue: js.Function1[java.lang.String, scala.Unit]
  ): Cleave = {
    val __obj = js.Dynamic.literal(destroy = destroy, getFormattedValue = getFormattedValue, getISOFormatDate = getISOFormatDate, getRawValue = getRawValue, setPhoneRegionCode = setPhoneRegionCode, setRawValue = setRawValue)
  
    __obj.asInstanceOf[Cleave]
  }
}

