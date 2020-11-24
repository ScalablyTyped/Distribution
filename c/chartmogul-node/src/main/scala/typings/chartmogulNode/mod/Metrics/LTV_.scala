package typings.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LTV_ extends js.Object {
  
  var date: String = js.native
  
  var ltv: Double = js.native
}
object LTV_ {
  
  @scala.inline
  def apply(date: String, ltv: Double): LTV_ = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ltv = ltv.asInstanceOf[js.Any])
    __obj.asInstanceOf[LTV_]
  }
  
  @scala.inline
  implicit class LTV_Ops[Self <: LTV_] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtv(value: Double): Self = this.set("ltv", value.asInstanceOf[js.Any])
  }
}
