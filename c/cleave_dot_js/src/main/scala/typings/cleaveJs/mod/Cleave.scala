package typings.cleaveJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cleave extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getFormattedValue(): String = js.native
  
  def getISOFormatDate(): String = js.native
  
  def getRawValue(): String = js.native
  
  def setPhoneRegionCode(regionCode: String): Unit = js.native
  
  def setRawValue(value: String): Unit = js.native
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
  
  @scala.inline
  implicit class CleaveOps[Self <: Cleave] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormattedValue(value: () => String): Self = this.set("getFormattedValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetISOFormatDate(value: () => String): Self = this.set("getISOFormatDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawValue(value: () => String): Self = this.set("getRawValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPhoneRegionCode(value: String => Unit): Self = this.set("setPhoneRegionCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRawValue(value: String => Unit): Self = this.set("setRawValue", js.Any.fromFunction1(value))
  }
}
