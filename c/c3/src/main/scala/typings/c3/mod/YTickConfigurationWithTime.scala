package typings.c3.mod

import typings.c3.anon.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YTickConfigurationWithTime extends YTickConfiguration {
  
  var time: js.UndefOr[Interval] = js.native
}
object YTickConfigurationWithTime {
  
  @scala.inline
  def apply(): YTickConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YTickConfigurationWithTime]
  }
  
  @scala.inline
  implicit class YTickConfigurationWithTimeOps[Self <: YTickConfigurationWithTime] (val x: Self) extends AnyVal {
    
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
    def setTime(value: Interval): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
