package typings.dayjs.pluginRelativeTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeTimeOptions extends js.Object {
  
  var rounding: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.native
  
  var thresholds: js.UndefOr[js.Array[RelativeTimeThreshold]] = js.native
}
object RelativeTimeOptions {
  
  @scala.inline
  def apply(): RelativeTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeOptions]
  }
  
  @scala.inline
  implicit class RelativeTimeOptionsOps[Self <: RelativeTimeOptions] (val x: Self) extends AnyVal {
    
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
    def setRounding(value: /* num */ Double => Double): Self = this.set("rounding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRounding: Self = this.set("rounding", js.undefined)
    
    @scala.inline
    def setThresholdsVarargs(value: RelativeTimeThreshold*): Self = this.set("thresholds", js.Array(value :_*))
    
    @scala.inline
    def setThresholds(value: js.Array[RelativeTimeThreshold]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
  }
}
